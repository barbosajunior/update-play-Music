
package Formularios;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class FrmVisNotas extends javax.swing.JInternalFrame {
  final String caminho = "C://MUSIC PLAY//NotasTeclado//";
    FileInputStream entrada;
    FileOutputStream saida;
    File arquivo;
    JFileChooser seleccionado = new JFileChooser();
    File arq;
    byte[] bytesImg;
     
     
      public FrmVisNotas() {
         initComponents();
         
         try (Stream<Path> walk = Files.walk(Paths.get(caminho))) {
            List<String> result = walk.filter(Files::isRegularFile)
           .map(x -> x.getFileName().toString()).collect(Collectors.toList());
           Object[][] dados = new Object[result.size()][1];

            for (int i = 0; i < result.size(); i++) {
                dados[i] = new Object[]{result.get(i).split("\\.")[0]};
            }

            DefaultTableModel table = new DefaultTableModel(dados, new String[]{"Notas"});
            tblnotas.setModel(table);

        } catch (IOException e) {
            System.out.printf("Erro: %s", e.getMessage());
        }
      }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblfoto = new javax.swing.JLabel();
        Btnsair = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpnota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblnotas = new javax.swing.JTable();

        setVisible(true);

        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 5));

        Btnsair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Btnsair.setForeground(java.awt.Color.blue);
        Btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sai_Peq.png"))); // NOI18N
        Btnsair.setText("Sair");
        Btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsairActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/notas_duas.png"))); // NOI18N
        jLabel9.setText("Notas Cadastradas :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.blue);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/abrir_peq.png"))); // NOI18N
        jLabel6.setText(" Nota :");

        txtpnota.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txtpnota.setForeground(java.awt.Color.blue);
        txtpnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnotaActionPerformed(evt);
            }
        });
        txtpnota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpnotaKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("VISUALIZAR NOTAS TECLADO");

        tblnotas.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red));
        tblnotas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblnotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblnotas.setAutoscrolls(false);
        tblnotas.setRowHeight(26);
        tblnotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblnotas);
        if (tblnotas.getColumnModel().getColumnCount() > 0) {
            tblnotas.getColumnModel().getColumn(0).setResizable(false);
        }

        scrollPane1.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(366, 366, 366)
                        .addComponent(jLabel10)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(txtpnota, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(339, 339, 339))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Btnsair)
                                .addGap(49, 49, 49))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpnota, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(111, 111, 111)
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btnsair)
                .addGap(49, 49, 49))
        );

        setBounds(0, 0, 1584, 920);
    }// </editor-fold>//GEN-END:initComponents

    public String GuardarATexto(File arquivo, String contenido) {
        String resposta = null;
        try {
            saida = new FileOutputStream(arquivo);
            byte[] bytesTxt = contenido.getBytes();
            saida.write(bytesTxt);
            resposta = "Arquivo gravado !";
        } catch (Exception e) {

        }

        return resposta;
    }
    
    
    private void BtnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsairActionPerformed
        // Botão sair
        this.dispose();
    }//GEN-LAST:event_BtnsairActionPerformed

    private void tblnotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnotasMouseClicked
        // Cliquei na tabela       
        int linha = tblnotas.getSelectedRow();
        txtpnota.setText(tblnotas.getValueAt(linha, 0).toString());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C://MUSIC PLAY//NotasTeclado//"+txtpnota.getText()+ ".jpg").getImage().getScaledInstance(599,243,Image.SCALE_DEFAULT)); 
        lblfoto.setIcon(imageIcon);
 
    }//GEN-LAST:event_tblnotasMouseClicked

    private void txtpnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnotaActionPerformed
        // Não usado
    }//GEN-LAST:event_txtpnotaActionPerformed

    private void txtpnotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpnotaKeyReleased
        // TxtPesquisar uma nota / exibe a foto
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C://MUSIC PLAY//Notas/"+txtpnota.getText()+ ".jpg").getImage().getScaledInstance(599,243,Image.SCALE_DEFAULT));
        lblfoto.setIcon(imageIcon);
     
    }//GEN-LAST:event_txtpnotaKeyReleased
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnsair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfoto;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTable tblnotas;
    private javax.swing.JTextField txtpnota;
    // End of variables declaration//GEN-END:variables

}
