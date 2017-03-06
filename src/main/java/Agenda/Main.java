package Agenda;

import Pessoa.Banco.CriaConexao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Mutch
 */
public class Main {
    public static void main(String args[]) throws SQLException, ClassNotFoundException{
        Connection conexao = CriaConexao.getConexao();
        conexao.close();
        System.out.println("Desconectado do banco!");
    }
}
