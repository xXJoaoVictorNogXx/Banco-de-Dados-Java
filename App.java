import DAO.usuarioDAO;
import entity.usuario;

public class App {
    public static void main(String[] args) throws Exception {

        usuario u = new usuario();
        u.setNome("João Victor");
        u.setLogin("João");
        u.setSenha("1234");
        u.setEmail("Joaovictorfcantanheden@gmail.com");

        new usuarioDAO().cadastrarUsuario(u);

        System.out.println("Usuario - " + u.getCodigo());


    }
}
