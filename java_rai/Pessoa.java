import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int id;
    private String endereco;

    public Pessoa(String nome, String endereco, int id) {
        this.nome = nome;
        this.endereco = endereco;
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

    public Boolean verIdPessoa(ArrayList<Pessoa> lista, int id) {
        Boolean teste = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                teste = true;
            }
        }
        return teste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
