package Formularios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmVisMusicas extends javax.swing.JInternalFrame {
    final String caminho = "C://MUSIC PLAY//MusicasTeclado//";
    FileInputStream entrada;
    FileOutputStream saida;
    File arquivo;
    JFileChooser seleccionado = new JFileChooser();
    File arq;
    byte[] bytesImg;

    public FrmVisMusicas() {
        initComponents();
        btntocar.setVisible(false);

        try (Stream<Path> walk = Files.walk(Paths.get(caminho))) {
            List<String> result = walk.filter(Files::isRegularFile)
                    .map(x -> x.getFileName().toString()).collect(Collectors.toList());

            Object[][] dados = new Object[result.size()][1];

            for (int i = 0; i < result.size(); i++) {
                dados[i] = new Object[]{result.get(i).split("\\.")[0]};
            }

            DefaultTableModel table = new DefaultTableModel(dados, new String[]{"Música"});
            tblmusicas.setModel(table);

        } catch (IOException e) {
            System.out.printf("Erro: %s", e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpesquisa = new javax.swing.JLabel();
        Btnsair = new javax.swing.JButton();
        lblmusicacadastrada = new javax.swing.JLabel();
        txtpmusica = new javax.swing.JTextField();
        btntocar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btngravar = new javax.swing.JButton();
        scrollPane2 = new java.awt.ScrollPane();
        tblmusicas = new javax.swing.JTable();
        jButtonconverter = new javax.swing.JButton();
        jTextFieldAtual = new javax.swing.JTextField();
        jTextFieldtroca = new javax.swing.JTextField();

        lblpesquisa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblpesquisa.setForeground(java.awt.Color.blue);
        lblpesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/abrir_peq.png"))); // NOI18N
        lblpesquisa.setText(" Música :");

        Btnsair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Btnsair.setForeground(java.awt.Color.red);
        Btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Sai_Peq.png"))); // NOI18N
        Btnsair.setText("Sair");
        Btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsairActionPerformed(evt);
            }
        });

        lblmusicacadastrada.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblmusicacadastrada.setForeground(java.awt.Color.blue);
        lblmusicacadastrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/dj_peq.png"))); // NOI18N
        lblmusicacadastrada.setText("Músicas Cadastradas :");

        txtpmusica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtpmusica.setForeground(java.awt.Color.blue);
        txtpmusica.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpmusica.setAutoscrolls(false);
        txtpmusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpmusicaActionPerformed(evt);
            }
        });
        txtpmusica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpmusicaKeyReleased(evt);
            }
        });

        btntocar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btntocar.setForeground(java.awt.Color.blue);
        btntocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/dj_peq.png"))); // NOI18N
        btntocar.setText("Rodar Musica");
        btntocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntocarActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtarea.setRows(5);
        txtarea.setAutoscrolls(false);
        txtarea.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        jScrollPane1.setViewportView(txtarea);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Vis_Musica.png"))); // NOI18N
        jLabel1.setText("Musica :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("VISUALIZAR MÚSICAS TECLADO");

        btngravar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btngravar.setForeground(java.awt.Color.red);
        btngravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/cadastro.png"))); // NOI18N
        btngravar.setText("Gravar");
        btngravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngravarActionPerformed(evt);
            }
        });

        tblmusicas.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.red, 2));
        tblmusicas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblmusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblmusicas.setAutoscrolls(false);
        tblmusicas.setRowHeight(26);
        tblmusicas.setShowVerticalLines(false);
        tblmusicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmusicasMouseClicked(evt);
            }
        });
        scrollPane2.add(tblmusicas);

        jButtonconverter.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonconverter.setForeground(new java.awt.Color(250, 30, 20));
        jButtonconverter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Nota.png"))); // NOI18N
        jButtonconverter.setText("Novo Tom");
        jButtonconverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonconverterActionPerformed(evt);
            }
        });

        jTextFieldAtual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextFieldAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAtualActionPerformed(evt);
            }
        });

        jTextFieldtroca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldtroca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextFieldtroca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtrocaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblpesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpmusica))
                    .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmusicacadastrada, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 627, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldtroca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonconverter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btngravar)
                        .addGap(18, 18, 18)
                        .addComponent(btntocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btnsair)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(438, 438, 438))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmusicacadastrada)
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldAtual, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btngravar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonconverter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldtroca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btntocar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1200, 573);
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

        this.dispose();
         
    }//GEN-LAST:event_BtnsairActionPerformed

    private void btntocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntocarActionPerformed
        FrmMusicaPlay musicaplay = new FrmMusicaPlay();
        FrmMenu.jDesktopPane1.add(musicaplay);
        musicaplay.setVisible(true);
     
    }//GEN-LAST:event_btntocarActionPerformed

    private void BtnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnpesquisarActionPerformed
    }//GEN-LAST:event_BtnpesquisarActionPerformed

    private void tblmusicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmusicasMouseClicked
        txtarea.setText("");
        btntocar.setVisible(true);
        int linha = tblmusicas.getSelectedRow();
        txtpmusica.setText(tblmusicas.getValueAt(linha, 0).toString());
        File arquivo1 = new File(caminho + txtpmusica.getText() + ".txt");
        try {
            BufferedReader ler = new BufferedReader(new FileReader(arquivo1));
            String lin = ler.readLine();
            while (lin != null) {
                txtarea.append(lin + "\n");
                lin = ler.readLine();
            }
        } catch (Exception e) {
            System.out.println("erroo na leitura " + e.getMessage());
        }
         txtarea.setCaretPosition(0);
    }//GEN-LAST:event_tblmusicasMouseClicked
    private void txtpmusicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpmusicaKeyReleased
    }//GEN-LAST:event_txtpmusicaKeyReleased

    private void txtpmusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpmusicaActionPerformed
    }//GEN-LAST:event_txtpmusicaActionPerformed

    private void btngravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngravarActionPerformed
        //Botão gravar
        if (seleccionado.showDialog(null, "Guardar texto") == JFileChooser.APPROVE_OPTION) {
            arq = seleccionado.getSelectedFile();
            if (arq.getName().endsWith("txt")) {
                String contenido = txtarea.getText();
                String resposta = GuardarATexto(arq, contenido);
                if (resposta != null) {
                    JOptionPane.showMessageDialog(null, resposta);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao gravar texto !");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O texto deve ser gravado em formato textot");
            }
        }

    }//GEN-LAST:event_btngravarActionPerformed

    private void jTextFieldAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAtualActionPerformed

    private void jTextFieldtrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtrocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtrocaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnsair;
    private javax.swing.JButton btngravar;
    private javax.swing.JButton btntocar;
    private javax.swing.JButton jButtonconverter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAtual;
    private javax.swing.JTextField jTextFieldtroca;
    private javax.swing.JLabel lblmusicacadastrada;
    private javax.swing.JLabel lblpesquisa;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JTable tblmusicas;
    private javax.swing.JTextArea txtarea;
    public static javax.swing.JTextField txtpmusica;
    // End of variables declaration//GEN-END:variables
}
