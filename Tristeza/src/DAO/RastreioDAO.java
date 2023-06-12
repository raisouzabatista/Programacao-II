package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Conexao.Conexao;
import Entity.Rastreio;

public class RastreioDAO {
    
    public void cadastrarRastreio(Rastreio rastreio){
        String sql3 = "INSERT INTO RASTREIO (IDRASTREIO, IDPESSOA, IDITEM, NOMEITEM, ENDERECO, PRECO, NOME, QUANTIDADE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

PreparedStatement rt = null; 
try {
    rt = Conexao.getConexao().prepareStatement(sql3);

rt.setInt(1, rastreio.getIdRastreio());
rt.setInt(2, rastreio.getIdPessoa());
rt.setInt(3, rastreio.getIdItem());
rt.setString(4, rastreio.getNomeItem());
rt.setString(5, rastreio.getEndereco());
rt.setDouble(6, rastreio.getPreco());
rt.setString(7, rastreio.getNome());
rt.setInt(8, rastreio.getQuantidade());

rt.execute();
rt.close();




} catch (SQLException e) {
    e.printStackTrace();
    
} 


    }



     public List<Rastreio> listarRastreio() {
        List<Rastreio> rastreios = new ArrayList<>();
        String sql = "SELECT * FROM rastreio";

        try  { 
        
            Connection connection = Conexao.getConexao();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {


                int idrastreio = resultSet.getInt("idrastreio");
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                int quantidade = resultSet.getInt("quantidade"); 
                Double preco = resultSet.getDouble("preco"); 
                int idpessoa = resultSet.getInt("idpessoa"); 
                int iditem = resultSet.getInt("iditem");
                String nomeitem = resultSet.getString("nomeitem");


                
                Rastreio rastreio = new Rastreio();
                rastreio.setIdItem(iditem);
                rastreio.setIdPessoa(idpessoa);
                rastreio.setIdRastreio(idrastreio);
                rastreio.setNomeItem(nomeitem);
                rastreio.setPreco(preco);
                rastreio.setQuantidade(quantidade);
                rastreio.setEndereco(endereco);
                rastreio.setNome(nome);
            

              rastreios.add(rastreio); 
                      
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar inventário: " + e.getMessage());
        }

        return rastreios;
    }

}
