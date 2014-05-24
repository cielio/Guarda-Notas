/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cielio.guardanotas.visualizacao;

import br.com.cielio.guardanotas.controle.ControladorNota;
import br.com.cielio.guardanotas.modelo.Nota;
import java.util.Date;
import java.util.Vector;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author kohoutek
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        listarNotas();
        //Adiciona o evento ao jTextFieldBusca para manipula o campo busca
        addEventoTextChange();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPaneJListTitulo = new javax.swing.JScrollPane();
        jListTitulo = new javax.swing.JList();
        jScrollPaneJTextPane = new javax.swing.JScrollPane();
        jTextPaneConteudo = new javax.swing.JTextPane();
        jTextFieldTitulo = new javax.swing.JTextField();
        jButtonAdiciona = new javax.swing.JButton();
        jButtonDeleta = new javax.swing.JButton();
        jButtonSalva = new javax.swing.JButton();
        jTextFieldBusca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guarda Notas");

        jScrollPaneJListTitulo.setMaximumSize(new java.awt.Dimension(500, 600));
        jScrollPaneJListTitulo.setMinimumSize(new java.awt.Dimension(50, 400));
        jScrollPaneJListTitulo.setPreferredSize(new java.awt.Dimension(200, 600));

        jListTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListTitulo.setAutoscrolls(false);
        jListTitulo.setMaximumSize(new java.awt.Dimension(3000, 30000));
        jListTitulo.setMinimumSize(new java.awt.Dimension(100, 100));
        jListTitulo.setPreferredSize(new java.awt.Dimension(150, 10));
        jListTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListTituloMouseClicked(evt);
            }
        });
        jScrollPaneJListTitulo.setViewportView(jListTitulo);

        jSplitPane1.setLeftComponent(jScrollPaneJListTitulo);

        jTextPaneConteudo.setPreferredSize(new java.awt.Dimension(6, 400));
        jScrollPaneJTextPane.setViewportView(jTextPaneConteudo);

        jSplitPane1.setRightComponent(jScrollPaneJTextPane);

        jButtonAdiciona.setText("Adicionar");
        jButtonAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionaActionPerformed(evt);
            }
        });

        jButtonDeleta.setText("Deletar");
        jButtonDeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletaActionPerformed(evt);
            }
        });

        jButtonSalva.setText("Salvar");
        jButtonSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAdiciona)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonDeleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalva)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdiciona)
                    .addComponent(jButtonDeleta)
                    .addComponent(jButtonSalva)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionaActionPerformed
        adicionarNota();
    }//GEN-LAST:event_jButtonAdicionaActionPerformed

    private void jListTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTituloMouseClicked
        getItemSelecionado();
    }//GEN-LAST:event_jListTituloMouseClicked

    private void jButtonDeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletaActionPerformed
        excluirItemSelecionado();
    }//GEN-LAST:event_jButtonDeletaActionPerformed

    private void jButtonSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvaActionPerformed
        atualizarItemSelecionado();
    }//GEN-LAST:event_jButtonSalvaActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdiciona;
    private javax.swing.JButton jButtonDeleta;
    private javax.swing.JButton jButtonSalva;
    private javax.swing.JList jListTitulo;
    private javax.swing.JScrollPane jScrollPaneJListTitulo;
    private javax.swing.JScrollPane jScrollPaneJTextPane;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextPane jTextPaneConteudo;
    // End of variables declaration//GEN-END:variables

    public final void listarNotas() {
        ControladorNota controladorNota = new ControladorNota();

        jListTitulo.setListData(new Vector(controladorNota.listar()));

        jListTitulo.setPreferredSize(new java.awt.Dimension(150, (controladorNota.listar().size() * 21)));
    }

    public final void listarNotas(String str) {
        ControladorNota controladorNota = new ControladorNota();

        jListTitulo.setListData(new Vector(controladorNota.listar(str)));

        jListTitulo.setPreferredSize(new java.awt.Dimension(150, (controladorNota.listar().size() * 21)));
    }

    public final void addEventoTextChange() {
        
        // Listen for changes in the text
        jTextFieldBusca.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                // text was changed
                listarNotas(jTextFieldBusca.getText());
            }

            public void removeUpdate(DocumentEvent e) {
                // text was deleted
                listarNotas(jTextFieldBusca.getText());
            }

            public void insertUpdate(DocumentEvent e) {
                // text was inserted
                listarNotas(jTextFieldBusca.getText());
            }
        });
    }

    public void adicionarNota() {
        ControladorNota controladorNota = new ControladorNota();

        Nota nota = new Nota();

        Date date = new Date();
        date.getTime();

        nota.setTitulo(jTextFieldTitulo.getText());
        nota.setConteudo(jTextPaneConteudo.getText());
        nota.setData(date);

        controladorNota.adicionar(nota);

        jTextFieldTitulo.setText("");

        listarNotas();
    }

    public final void getItemSelecionado() {

        if (jListTitulo.getSelectedIndex() > -1) {
            Nota nota;

            nota = (Nota) jListTitulo.getSelectedValue();
            jTextPaneConteudo.setText(String.valueOf(nota.getConteudo()));
        }
    }

    public final void excluirItemSelecionado() {

        if (jListTitulo.getSelectedIndex() > -1) {
            ControladorNota controladorNota = new ControladorNota();

            Nota nota = (Nota) jListTitulo.getSelectedValue();

            controladorNota.excluir(nota.getId());

            listarNotas();

            jTextPaneConteudo.setText("");
        }
    }

    public final void atualizarItemSelecionado() {

        if (jListTitulo.getSelectedIndex() > -1) {
            ControladorNota controladorNota = new ControladorNota();

            Nota nota = (Nota) jListTitulo.getSelectedValue();

            nota.setConteudo(jTextPaneConteudo.getText());
            controladorNota.atualizar(nota);

            listarNotas();

            jTextPaneConteudo.setText("");
        }
    }
}
