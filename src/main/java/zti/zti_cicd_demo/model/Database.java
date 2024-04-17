package zti.zti_cicd_demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean(name = "databaseBean")
@RequestScoped
public class Database {
    private Connection dbConnection = null;
    private PreparedStatement preparedStatement = null;

    public Database() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        String url= "jdbc:postgresql://cornelius.db.elephantsql.com:5432/sohgnjeg";
        String username = "sohgnjeg";
        String password = "4xA5XGSFSW35q5EmXPZdujCp9abDlj5e";
        try {
            dbConnection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveOrder(Order order) {
        String query = "INSERT INTO orders (customerEmail, productName, quantity) VALUES (?, ?, ?)";

        try {
            preparedStatement = dbConnection.prepareStatement(query);
            preparedStatement.setString(1, order.getCustomerEmail());
            preparedStatement.setString(2, order.getProductName());
            preparedStatement.setInt(3, order.getQuantity());

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}