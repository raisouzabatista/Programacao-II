package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import Entity.Inventario2;

public class Inventario2DAO {


public void cadastrarInventario(Inventario2 inventario) {
        String sql = "INSERT INTO INVENTARIO2 (ITEM, QUANTIDADE, PRECO, ID) VALUES (?, ?, ?, ?)";

        try (PreparedStatement in = Conexao.getConexao().prepareStatement(sql)) {
            in.setString(1, inventario.getItem());
            in.setInt(2, inventario.getQuantidade());
            in.setDouble(3, inventario.getPreco());
            in.setInt(4, inventario.getId());

            in.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Inventario2> listarInventario() {
        List<Inventario2> inventario = new ArrayList<>();
        String sql = "SELECT * FROM inventario2";

        try (Connection connection = Conexao.getConexao();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String item = resultSet.getString("item");
                int quantidade = resultSet.getInt("quantidade");
                double preco = resultSet.getDouble("preco");

                Inventario2 inventario2 = new Inventario2();
                inventario2.setIdInven(id);
                inventario2.setItem(item);
                inventario2.setQuantidade(quantidade);
                inventario2.setPreco(preco);

                inventario.add(inventario2);

                
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar inventário: " + e.getMessage());
        }

        return inventario;
    }

    
    
}
