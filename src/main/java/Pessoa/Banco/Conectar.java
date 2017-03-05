package Pessoa.Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mutch
 */
public class Conectar {
    public static Connection getConectar() throws SQLException, ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando ao banco");
            return DriverManager.getConnection("jdbc:mysql://localhost/agendamy","root","3630");
        }catch (ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    }
}
