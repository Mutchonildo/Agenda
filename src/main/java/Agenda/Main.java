package Agenda;

import BancoDeDados.CriaConexao;
import Dao.ContatoDao;
import Logica.Contato;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mutch
 */
public class Main {
    public static void main(String args[]) throws SQLException{
        
        Contato contato = new Contato();
        
        contato.setId(Long.valueOf(4));
        
        
        ContatoDao dao = new ContatoDao();
        dao.remove(contato);
        
        
        /*
        List<Contato> minhaLista = dao.getLista();
        
        for (Contato contato : minhaLista){
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Data de Nascimento : " + contato.getData_nasc());
        System.out.println("Telefone : " + contato.getTel());
        System.out.println("E-mail : " + contato.getEmail());
 */
    }
        //Teste
        /*Contato contato = new Contato();
        /*contato.setNome("Romildo");
        /contato.setData_nasc("07/11/1990");
        /contato.setEmail("pingapitu@gmail.com");        
        /contato.setTel("11977811787");
        //**
        ContatoDao dao = new ContatoDao();
        dao.adiciona(contato);
        System.out.println("Adicionado no banco!");
        //Connection conexao = CriaConexao.getConexao();
        //conexao.close();
        //System.out.println("Desconectado do banco!");
        */
    }

