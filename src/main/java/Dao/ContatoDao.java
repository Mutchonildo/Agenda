
package Dao;

import BancoDeDados.CriaConexao;
import Logica.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public List<Contato>getLista(String nome) throws SQLException{
        String sql = "select * from contato where nome like?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1,nome);
        ResultSet rs = stmt.executeQuery();
        
        List<Contato> minhaLista = new ArrayList<Contato>();
        
        while(rs.next()){
            Contato c1 = new Contato();
            c1.setId(Long.valueOf(rs.getString("Id")));
            c1.setNome(rs.getString("nome"));
            c1.setData_nasc(rs.getString("data_nasci"));
            c1.setTel(rs.getString("tel"));
            c1.setEmail(rs.getString("email"));
            minhaLista.add(c1);
        }
        rs.close();
        stmt.close();
        return minhaLista;
        
    }
    
    public void altera(Contato c1) throws SQLException{
        String sql = "update cotato set nome=?, data_nasci=?, tel=?, email=?" + " where id=?";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        
        stmt.setString(1,c1.getNome());
        stmt.setString(2,c1.getData_nasc());
        stmt.setString(3,c1.getEmail());
        stmt.setString(4,c1.getTel());
        stmt.setLong(5,c1.getId());
        
        stmt.execute();
        stmt.close();
    }
    public void remove(Contato c1) throws SQLException{
        String sql = "delete from contatos where id =?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1,c1.getId());
        stmt.execute();
        stmt.close();
    }
}
