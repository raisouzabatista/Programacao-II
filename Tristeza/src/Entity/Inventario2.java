package Entity;


import java.util.List;
import java.util.Scanner;

import DAO.Inventario2DAO;

public class Inventario2 {

    private String item;
    private int quantidade;
    private Double preco;
    private int id;


    Scanner ler = new Scanner(System.in);

    public Inventario2(String i, int q, Double p) {
        this.item = i;
        this.quantidade = q;
        this.preco = p;
     


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

    public Inventario2() {
        // só pra definir o obj de ajuda
    }

    public int getId() {
        return id;
    }

    public void setIdInven(int id) {
        this.id = id;
    }

    public Boolean verId( int id) {
        List <Inventario2> lista = new Inventario2DAO().listarInventario(); 
        Boolean teste = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                teste = true;
            }
        }
        return teste;
    }

}
