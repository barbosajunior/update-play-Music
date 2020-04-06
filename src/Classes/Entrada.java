
package Classes;

public class Entrada {
    public boolean validarUsuario(String usuario,String senha){
        if (usuario.equals("barbosa") && senha.equals("123")){
            return true;
        } else { 
            return false;
          }
    }
}
