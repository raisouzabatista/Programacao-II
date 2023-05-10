
import java.util.Scanner;
import java.util.ArrayList;

public class Inventario {

    private String item;
    private int quantidade;
    private Double preco;
    private int id;
    private int quantiadePrimaria;

    Scanner ler = new Scanner(System.in);

    public Inventario(String i, int q, Double p, int id) {
        this.item = i;
        this.quantidade = q;
        this.preco = p;
        this.id = id;
        this.quantiadePrimaria = quantidade; 

    }
    

    public int getQuantiadePrimaria() {
        return quantiadePrimaria;
    }


    public void setQuantiadePrimaria(int quantiadePrimaria) {
        this.quantiadePrimaria = quantiadePrimaria;
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Inventario() {
        // só pra definir o obj de ajuda
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean verId(ArrayList<Inventario> lista, int id) {
        Boolean teste = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                teste = true;
            }
        }
        return teste;
    }

}
