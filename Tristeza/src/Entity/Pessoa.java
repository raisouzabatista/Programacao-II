package Entity;

import java.util.List;

import DAO.PessoaDAO;

public class Pessoa {

    private int id; 
    private String nome; 
    private String endereco;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


   public Pessoa() {
        // so pra definir objs de ajuda
    }

    public Boolean verIdPessoa(int id) {

List <Pessoa> lista = new PessoaDAO().listarPessoas(); 

        Boolean teste = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                teste = true;
            }
        }
        return teste;
    }
 public Pessoa(String nome, String endereco) {

        this.nome = nome;
        this.endereco = endereco;
  
    }

    

}
