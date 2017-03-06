
package Dao;

import BancoDeDados.CriaConexao;
import Logica.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mutch
 */
public class ContatoDao {
    
    private Connection conexao;
    
    public ContatoDao() throws SQLException{
        this.conexao = CriaConexao.getConexao();
        
    }
    public void adiciona(Contato c1) throws SQLException{
        String sql = "insert into contato(nome, dataNasc, tel, email)" + "values(?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,c1.getNome());
        stmt.setString(2,c1.getData_nasc());
        stmt.setString(3,c1.getEmail());
        stmt.setString(4,c1.getTel());
        
        stmt.execute();
        stmt.close();
    }
}
