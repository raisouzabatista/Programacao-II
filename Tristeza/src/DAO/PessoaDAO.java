package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Entity.Pessoa;
import Conexao.Conexao;

public class PessoaDAO {

 public void cadastrarPessoa(Pessoa pessoa){
        String sql = "INSERT INTO PESSOA (NOME, ENDERECO, ID) VALUES (?, ?, ?)" ;

PreparedStatement ps = null; 
try {
    
    ps = Conexao.getConexao().prepareStatement(sql);

ps.setString(1, pessoa.getNome());
ps.setString(2, pessoa.getEndereco());
ps.setInt(3, pessoa.getId());
ps.execute();
ps.close();


} catch (SQLException e) {
    e.printStackTrace();
    
} 


    }


     public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";

        try (Connection connection = Conexao.getConexao();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {


                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");

                
                Pessoa pessoa = new Pessoa();
                pessoa.setId(id);
                pessoa.setEndereco(endereco);
                pessoa.setNome(nome);
            

              pessoas.add(pessoa); 
              
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar inventário: " + e.getMessage());
        }

        return pessoas;
    }





   

}
