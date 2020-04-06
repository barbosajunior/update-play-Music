package Classes;
import java.util.Date;

public class Data
{
   String mes, dia, ano, diasemana;
   
   public void LeData()
   {  
     Date data = new Date();
     //mes= ""+data.getMonth();   // 0 a 11
     dia=""+data.getDate();
     ano=""+(1900 + data.getYear());
     //diaSemana=""+data.getDay();
     
     switch(data.getDay())
     {
         case 0: diasemana ="Domingo";break;
           case 1: diasemana ="Segunda";break;
             case 2: diasemana ="Terça";break;
                 case 3: diasemana ="Quarta";break;
                     case 4: diasemana ="Quinta";break;
                         case 5: diasemana ="Sexta";break;
                             case 6: diasemana ="Sábado";break;
     }   
     
     switch(data.getMonth())
     {  
         case 0 : mes="Janeiro";break ;
         case 1 : mes="Fevereiro";break ;
             case 2 : mes="Março";break ;
                 case 3 : mes="Abril";break ;
                     case 4 : mes="Maio";break ;
                         case 5 : mes="Junho";break ;
                             case 6 : mes="Julho";break ;
                                 case 7 : mes="Agosto";break ;
                                     case 8 : mes="Setembro";break ;
                                         case 9 : mes="Outubro";break ;
                                             case 10 : mes="Novembro";break ;
                                                 case 11 : mes="Dezembro";break ;
     } 
   }

    public void Ledata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}