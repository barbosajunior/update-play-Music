
package Classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
           
    public String nomServidor = "localhost";
    public String db = "musica";
    public String porta = "3306";
    public String user = "root";
    public String pass = "Ardedido13579";
    Connection conn = null;
    
    public Connection conectar() {
        try {
             String ruta ="jdbc:mysql://";
             String servidor=nomServidor+":"+porta+"/";
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection(ruta+servidor+db,user,pass);
             if(conn!= null){
                 System.out.println("Conexão ao DB Ok ! ! !");
             }else if(conn==null){
                 throw new SQLException();
             }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (ClassNotFoundException | NullPointerException e){
             JOptionPane.showMessageDialog(null,"Notas errada,error:"+e.getMessage());   
        }finally {
         return conn;        
       }  
   }
     public void desconectar(){
         conn = null;
         System.out.println("Desconecção ... Ok ! ! !");
     }
}

