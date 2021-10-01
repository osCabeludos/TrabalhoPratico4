package view;

import javax.swing.table.DefaultTableModel;
import classes.*;
import java.util.*;
import javax.swing.JOptionPane;

public class VendaRevista extends javax.swing.JFrame {
    
    ArrayList<Cliente> clientes;
    ArrayList<Revista> revistas;
    DefaultTableModel dtmUsuarios;
    DefaultTableModel dtmRevistas;
    
    public VendaRevista(ArrayList<Cliente> cliente,ArrayList<Revista> revista) 
    {
        initComponents();
        this.clientes = cliente;
        this.revistas = revista;
        
        this.dtmUsuarios = (DefaultTableModel)tabelaUsuarios.getModel();  
        for(int a = 0; a < clientes.size();a++) 
        {
            Object dados [] = {this.clientes.get(a).getNome(),this.clientes.get(a).getLivrosComprados(),this.clientes.get(a).getRevistaComprados()};
            this.dtmUsuarios.addRow(dados);
        }
        this.dtmRevistas = (DefaultTableModel)tabelaRevistas.getModel();  
        for(int a = 0; a < revistas.size();a++) 
        {
            Object dados [] = {this.revistas.get(a).getTitulo(),this.revistas.get(a).getPreco(),this.revistas.get(a).getQuantidade()};
            this.dtmRevistas.addRow(dados);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRevistas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        quantidade = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGeneroLiterario = new javax.swing.JLabel();
        txtDataPublicacao = new javax.swing.JLabel();
        txtEditora = new javax.swing.JLabel();
        txtAnoEdicao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomeRevista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprar um livro");
        setResizable(false);

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Completo", "# de livros comprados", "# de revistas compradas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaUsuarios);

        jLabel1.setText("Selecione  um cliente :");

        jLabel2.setText("Selecione um livro :");

        tabelaRevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Valor", "Quantidade"
            }
        ));
        tabelaRevistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRevistasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRevistas);

        jLabel3.setText("Selecione a quantidade: ");

        quantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mais informações"));

        jLabel4.setText("Tipo de revista:");

        jLabel5.setText("Data de publicacao :");

        jLabel6.setText("Editora :");

        jLabel7.setText("Edicao :");

        txtGeneroLiterario.setText("N/A");

        txtDataPublicacao.setText("N/A");

        txtEditora.setText("N/A");

        txtAnoEdicao.setText("N/A");

        jLabel8.setText("Nome da revista: ");

        nomeRevista.setText("N/A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGeneroLiterario, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtDataPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtAnoEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(nomeRevista)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtGeneroLiterario)
                    .addComponent(txtEditora))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtDataPublicacao)
                    .addComponent(txtAnoEdicao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nomeRevista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int indiceUsuario = this.tabelaUsuarios.getSelectedRow();
        String nomeCompleto = this.tabelaUsuarios.getValueAt(indiceUsuario, 0).toString();
        
        for(int a = 0; a < this.clientes.size();a++) 
        {
            if(this.clientes.get(a).getNome().equals(nomeCompleto))
            {
                this.clientes.get(a).setRevistasCompradas(Integer.valueOf(quantidade.getValue().toString()));
            }
        }
        
        int indiceLivro = this.tabelaRevistas.getSelectedRow();
        String tituloLivro = this.tabelaRevistas.getValueAt(indiceLivro, 0).toString();
        
        for(int a = 0; a < this.revistas.size();a++) 
        {
            if(this.revistas.get(a).getTitulo().equals(tituloLivro))
            {
                int estoque = this.revistas.get(a).getQuantidade();
                int comprado = Integer.valueOf(quantidade.getValue().toString());
                if((estoque - comprado)  < 0)
                {
                    JOptionPane.showMessageDialog(null, "Insira uma quantidade adequada !!");
                }else
                {
                     this.revistas.get(a).setQuantidade(estoque - comprado);
                     this.dtmRevistas.setValueAt(this.revistas.get(a).getQuantidade(),indiceLivro,2);
                     this.dtmUsuarios.setValueAt(this.clientes.get(a).getRevistaComprados(),indiceUsuario,2);
                     
                     JOptionPane.showMessageDialog(null, nomeCompleto+ " comprou "+ comprado +" revistas :-D ");
                     this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaRevistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRevistasMouseClicked
        // TODO add your handling code here:
        int indiceLivro = this.tabelaRevistas.getSelectedRow();
        String tituloLivro = this.tabelaRevistas.getValueAt(indiceLivro, 0).toString();
        for(int a = 0; a < this.revistas.size();a++) 
        {
            if(this.revistas.get(a).getTitulo().equals(tituloLivro))
            {
                Revista l = this.revistas.get(a);
                nomeRevista.setText(l.getNome());
                txtGeneroLiterario.setText(l.getTipoDeRevista());
                txtDataPublicacao.setText(l.getDataDePublicacao());
                txtEditora.setText(l.getEditora());
                txtAnoEdicao.setText(String.valueOf(l.getEdicao()));
            }
        }
    }//GEN-LAST:event_tabelaRevistasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VendaRevista(new ArrayList<Cliente>(),new ArrayList<Revista>()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nomeRevista;
    private javax.swing.JSpinner quantidade;
    private javax.swing.JTable tabelaRevistas;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JLabel txtAnoEdicao;
    private javax.swing.JLabel txtDataPublicacao;
    private javax.swing.JLabel txtEditora;
    private javax.swing.JLabel txtGeneroLiterario;
    // End of variables declaration//GEN-END:variables
}
