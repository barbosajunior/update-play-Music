
package Formularios;

import java.awt.Desktop;
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
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


public class FrmTeoria extends javax.swing.JInternalFrame {
    
    final String caminho = "C://MUSIC PLAY//TeoriaTeclado//";
    FileInputStream entrada;
    FileOutputStream saida;
    File arquivo;
    JFileChooser seleccionado = new JFileChooser();
    File arq;
    byte[] bytesImg;
    
    public FrmTeoria() {
        initComponents();
            try (Stream<Path> walk = Files.walk(Paths.get(caminho))) {
            List<String> result = walk.filter(Files::isRegularFile)
                    .map(x -> x.getFileName().toString()).collect(Collectors.toList());

            Object[][] dados = new Object[result.size()][1];

            for (int i = 0; i < result.size(); i++) {
                dados[i] = new Object[]{result.get(i).split("\\.")[0]};
            }

            DefaultTableModel table = new DefaultTableModel(dados, new String[]{"Arquivo Pdf"});
           tblArquivo.setModel(table);

        } catch (IOException e) {
            System.out.printf("Erro: %s", e.getMessage());
        }
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArquivo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        btnSair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSair.setForeground(java.awt.Color.red);
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tblArquivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tblArquivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblArquivo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblArquivo.setRowHeight(26);
        tblArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArquivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblArquivo);
        if (tblArquivo.getColumnModel().getColumnCount() > 0) {
            tblArquivo.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Arquivo Pdf :");

        txtArquivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtArquivo.setForeground(java.awt.Color.red);
        txtArquivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Pdfpeq.png"))); // NOI18N
        jLabel2.setText("Teoria Teclado - Arquivos PDF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(840, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)))
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(btnSair)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(3, 6, 1200, 573);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblArquivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArquivoMouseClicked
               // clicou na tabela
        int linha=tblArquivo.getSelectedRow();
        txtArquivo.setText(tblArquivo.getValueAt(linha,0).toString());
         try {
	File pdfFile = new File("C:\\Music Play\\teoriaTeclado\\"+txtArquivo.getText()+".pdf");
	if (pdfFile.exists()) {
		if (Desktop.isDesktopSupported()) {
			Desktop.getDesktop().open(pdfFile);
		} else {
			System.out.println("Awt Desktop não disponível");
		}
	} else {
		System.out.println("Arquivo Pdf  inexistente");
	}
	System.out.println("Done");
  } catch (Exception ex) {
    } 
         
    }//GEN-LAST:event_tblArquivoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblArquivo;
    private javax.swing.JButton txtArquivo;
    // End of variables declaration//GEN-END:variables
}
