package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.conexao;
import entity.usuario;

public class usuarioDAO {
    


    public void cadastrarUsuario(usuario usuario){

        String sql = "Insert Into Usuario (Nome, Login, Senha, Email) Values (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            System.out.println("erro chegou");
            
            ps = conexao.getconexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
        
            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            System.out.println("erro -" + e);
            e.printStackTrace();
        }
    
    }
}
