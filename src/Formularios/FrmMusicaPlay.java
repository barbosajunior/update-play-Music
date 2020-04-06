package Formularios;

import Classes.Sonumeros;
import static Formularios.FrmVisMusicas.txtpmusica;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;

class Cifra {

    final int numeroDaLinha;
    final String name;
    final int inicio;
    final int fim;

    Cifra(String name, int inicio, int fim, int numeroDaLinha) {
        this.name = name;
        this.inicio = inicio;
        this.fim = fim;
        this.numeroDaLinha = numeroDaLinha;
    }
}

public class FrmMusicaPlay extends javax.swing.JInternalFrame {
    
    String caminhoDasMusicas = "C:\\MUSIC PLAY\\MusicasTeclado\\"; 
    String caminhoDasNotas = "C:\\MUSIC PLAY\\NotasTeclado\\"; 
    String flag;
    int cont =800;
    int totalLin=0;
    boolean clicado;
    Pattern p = Pattern.compile("[ABCDEFGabcdefgMm()0123456789/_dim#b°º+]+");
    List<Cifra> cifras = new ArrayList<>();
    int current = 0;
    Cifra c;
    private Object e;
    
    public FrmMusicaPlay() {
        initComponents();
         final JTextField ftf = txttempo;     // coloca um setfocus no JTextField (txttempo)
         javax.swing.SwingUtilities.invokeLater(ftf::requestFocusInWindow);
         txttempo.setDocument(new Sonumeros());
         try {
           List<String> lines = new ArrayList<>();
           BufferedReader ler = new BufferedReader(new InputStreamReader(
           new FileInputStream(caminhoDasMusicas + txtpmusica.getText() + ".txt"), "UTF-8"));
           String lin = ler.readLine();
           int offset = 0;
            int line = 0;
            int i = 0;
            while (lin != null) {
                lines.add(lin);
                if (line % 2 == 0) {
                    Matcher m = p.matcher(lin);
                    while (m.find()) {
                        cifras.add(new Cifra(m.group(), m.start() + offset, m.end() + offset , line));
                    }
                }

                offset += lin.length() + 1;
                i++;
                line++;
                lin = ler.readLine();
                totalLin ++;
               }
            txtareamus.setText(String.join("\n", lines));
         } catch (Exception e) {
            System.out.println("erroo na leitura: " + e.getMessage());
        }
         txtareamus.setCaretPosition(0);
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btnsair = new javax.swing.JButton();
        btniniciar = new javax.swing.JButton();
        lblnota = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtposicao = new javax.swing.JTextField();
        txttempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareamus = new javax.swing.JTextPane();
        bt_ouvirmusica = new javax.swing.JButton();

        Btnsair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Btnsair.setForeground(java.awt.Color.red);
        Btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sai_Peq.png"))); // NOI18N
        Btnsair.setText("Sair");
        Btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsairActionPerformed(evt);
            }
        });

        btniniciar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btniniciar.setForeground(java.awt.Color.blue);
        btniniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Nota.png"))); // NOI18N
        btniniciar.setText("Iniciar");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        lblnota.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setText("Nota :");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("TOCAR  MÚSICAS TECLADO");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/dj_peq.png"))); // NOI18N
        jLabel2.setText("Música :");

        txtposicao.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtposicao.setForeground(java.awt.Color.red);

        txttempo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Tempo da Música (Seg)");

        txtareamus.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        txtareamus.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtareamus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtareamusMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtareamusMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtareamus);

        bt_ouvirmusica.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        bt_ouvirmusica.setForeground(java.awt.Color.blue);
        bt_ouvirmusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/musica.png"))); // NOI18N
        bt_ouvirmusica.setText("Ouvir Musica");
        bt_ouvirmusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ouvirmusicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(510, 510, 510)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(249, 249, 249)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(185, 185, 185))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Btnsair)
                                .addComponent(lblnota, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bt_ouvirmusica)
                                    .addGap(5, 5, 5))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txttempo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)))
                        .addGap(210, 210, 210))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(lblnota, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttempo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(bt_ouvirmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Btnsair)
                        .addGap(29, 29, 29))))
        );

        setBounds(3, 0, 1586, 900);
    }// </editor-fold>//GEN-END:initComponents
   
    private void BtnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsairActionPerformed
        // executor.shutdownNow();
         this.dispose();    
    }//GEN-LAST:event_BtnsairActionPerformed
    boolean isRunning = false;
    ScheduledThreadPoolExecutor executor;
   
    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        System.out.println(totalLin);      
        if (isRunning) {
            executor.shutdown();
            isRunning = false;
        }
        executor = new ScheduledThreadPoolExecutor(1);
        isRunning = true;
        executor.scheduleAtFixedRate(() -> {
        c = cifras.get(current);
         try {
                txtareamus.getHighlighter().removeAllHighlights();
                txtareamus.getHighlighter().addHighlight(c.inicio, c.fim,
                new DefaultHighlighter.DefaultHighlightPainter(Color.cyan));
            } catch (BadLocationException ex) {
                Logger.getLogger(FrmMusicaPlay.class.getName()).log(Level.SEVERE, null, ex);
            }
           String nova = c.name.replace("/", "_");
           switch (nova){
                case "10":
                    nova = "Mi";
                    break;
                case "11":
                    nova = "Fa";
                    break;    
                case "12":
                    nova = "Fa#";
                    break;
                case "13":
                    nova = "Sol";
                    break;    
                case "14":
                    nova = "Sol#";
                    break;
                case "15":
                    nova = "La";
                    break;
                case "16":
                    nova = "La#";
                    break; 
                case "20":
                    nova = "Si";
                    break;
                case "21":
                    nova = "Do";
                    break;    
                case "22":
                    nova = "Do#";
                    break;
                case "23":
                    nova = "Re";
                    break;    
                case "24":
                    nova = "Rel#";
                    break;
                case "25":
                    nova = "Mi";
                    break;
                case "26":
                    nova = "Fa";
                    break; 
                case "30":
                    nova = "Sol";
                    break;
                case "31":
                    nova = "Sol#";
                    break;    
                case "32":
                    nova = "La";
                    break;
                case "33":
                    nova = "La#";
                    break;    
                case "34":
                    nova = "Si";
                    break;
                case "35":
                    nova = "Do";
                    break;
                case "36":
                    nova = "Do#";
                    break;  
                case "40":
                    nova = "Re";
                    break;
                case "41":
                    nova = "Re#";
                    break;    
                case "42":
                    nova = "Mi";
                    break;
                case "43":
                    nova = "Fa";
                    break;    
                case "44":
                    nova = "Fa#";
                    break;
                case "45":
                    nova = "Sol";
                    break;
                case "46":
                    nova = "Sol#";
                    break;      
                    
                case "50":
                    nova = "La";
                    break;
                case "51":
                    nova = "La#";
                    break;    
                case "52":
                    nova = "Si";
                    break;
                case "53":
                    nova = "Do";
                    break;    
                case "54":
                    nova = "Dol#";
                    break;
                case "55":
                    nova = "Re";
                    break;
                case "56":
                    nova = "Re#";
                    break; 
              
                case "60":
                    nova = "Mi";
                    break;
                case "61":
                    nova = "Fa";
                    break;    
                case "62":
                    nova = "Fa#";
                    break;
                case "63":
                    nova = "Sol";
                    break;    
                case "64":
                    nova = "Sol#";
                    break;
                case "65":
                    nova = "La";
                    break;
                case "66":
                    nova = "La#";
                    break;  
          }
            txtposicao.setText(nova);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(caminhoDasNotas + txtposicao.getText() + ".jpg").getImage().getScaledInstance(599, 243, Image.SCALE_DEFAULT));
            lblnota.setIcon(imageIcon);
             current++; 
             int tam=0;
             tam = txtareamus.getText().length();
             //Aqui começo a descer com a Barra de Rolagem 1° depois da linha 27, depois 53 e etc...
             switch (c.numeroDaLinha){
                case 20:
                       if (totalLin >20 && totalLin<40) {
                            txtareamus.setCaretPosition(tam);
                       } else if  (totalLin >40 && totalLin<60){  
                             txtareamus.setCaretPosition(cont);
                              cont = cont + 200;
                       } else if  (totalLin >60 && totalLin<80){  
                              txtareamus.setCaretPosition(cont);
                              cont = cont + 200;
                       } else if  (totalLin >80 && totalLin<100){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >100 && totalLin<120){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >120 && totalLin<140){
                              txtareamus.setCaretPosition(cont);
                       } else if  (totalLin >140 && totalLin<160){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >160 && totalLin<180){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200; 
                        } else if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                        }
                    break;
               case 40:
                        if  (totalLin >40 && totalLin<60){  
                             txtareamus.setCaretPosition(tam);
                        } else if  (totalLin >60 && totalLin<80){  
                              txtareamus.setCaretPosition(cont);
                              cont = cont + 200;
                       } else if  (totalLin >80 && totalLin<100){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >100 && totalLin<120){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >120 && totalLin<140){
                              txtareamus.setCaretPosition(cont);
                       } else if  (totalLin >140 && totalLin<160){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >160 && totalLin<180){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200; 
                        } else if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                       }
                    break;
               case 60:
                        if  (totalLin >60 && totalLin<80){  
                              txtareamus.setCaretPosition(tam);
                        } else if  (totalLin >80 && totalLin<100){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >100 && totalLin<120){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >120 && totalLin<140){
                              txtareamus.setCaretPosition(cont);
                       } else if  (totalLin >140 && totalLin<160){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >160 && totalLin<180){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200; 
                        } else if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                        }
                   
                    break; 
               case 80:
                       if  (totalLin >80 && totalLin<100){
                              txtareamus.setCaretPosition(tam); 
                       } else if  (totalLin >100 && totalLin<120){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >120 && totalLin<140){
                              txtareamus.setCaretPosition(cont);
                       } else if  (totalLin >140 && totalLin<160){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >160 && totalLin<180){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200; 
                        } else if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                       }
                    break;
                case 100:
                       if  (totalLin >100 && totalLin<120){
                              txtareamus.setCaretPosition(tam); 
                       } else if  (totalLin >120 && totalLin<140){
                              txtareamus.setCaretPosition(cont);
                       } else if  (totalLin >140 && totalLin<160){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >160 && totalLin<180){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200; 
                        } else if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                        }
                    break; 
                 case 120:
                       if  (totalLin >120 && totalLin<140){
                              txtareamus.setCaretPosition(tam);
                       } else if  (totalLin >140 && totalLin<160){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200;
                       } else if  (totalLin >160 && totalLin<180){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200; 
                        } else if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                        }
                    break; 
                 case 140:
                        if  (totalLin >140 && totalLin<160){
                              txtareamus.setCaretPosition(tam); 
                         } else if  (totalLin >160 && totalLin<180){
                              txtareamus.setCaretPosition(cont); 
                              cont = cont + 200; 
                        } else if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                        }
                    break;  
                 case 160:
                        if  (totalLin >160 && totalLin<180){
                              txtareamus.setCaretPosition(tam); 
                              cont = cont + 200; 
                        } else if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                        }
                    break;  
                case 180:
                        if  (totalLin >180 && totalLin<200){
                              txtareamus.setCaretPosition(tam); 
                        }
                    break;  
               case 200:
                        if  (totalLin >200 && totalLin<220){
                              txtareamus.setCaretPosition(tam); 
                        }
                    break;      
        
              }
          }, 0, Integer.parseInt(txttempo.getText()), TimeUnit.SECONDS);
           String selecionado = txtareamus.getSelectedText(); 

    }//GEN-LAST:event_btniniciarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //não usado
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtareamusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtareamusMousePressed
        String selecionado = txtareamus.getSelectedText();
        txtposicao.setText(selecionado);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C://MUSIC PLAY//NotasTeclado//"+ txtposicao.getText()+ ".jpg").getImage().getScaledInstance(599,243,Image.SCALE_DEFAULT));
        lblnota.setIcon(imageIcon);

    }//GEN-LAST:event_txtareamusMousePressed

    private void txtareamusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtareamusMouseEntered
        //não usado
    }//GEN-LAST:event_txtareamusMouseEntered

    private void bt_ouvirmusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ouvirmusicaActionPerformed
        try {
            // TODO add your handling code here:
           Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\Winamp\\winamp.exe\"winamp");
        } catch (IOException ex) {
            Logger.getLogger(FrmMusicaPlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_ouvirmusicaActionPerformed
              
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnsair;
    private javax.swing.JButton bt_ouvirmusica;
    private javax.swing.JButton btniniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblnota;
    private javax.swing.JTextPane txtareamus;
    private javax.swing.JTextField txtposicao;
    public javax.swing.JTextField txttempo;
    // End of variables declaration//GEN-END:variables
      
}
