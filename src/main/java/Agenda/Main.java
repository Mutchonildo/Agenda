package Agenda;

import Pessoa.Banco.Conectar;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Mutch
 */
public class Main {
    public static void main(String args[]) throws SQLException, ClassNotFoundException{
        Connection conectar = Conectar.getConectar();
        conectar.close();
        System.out.println("Desconectado do banco!");
    }
}
