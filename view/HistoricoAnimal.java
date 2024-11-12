/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Entidades.Animal;
import Entidades.Cliente;
import Entidades.Consulta;
import Entidades.Tratamento;
import controller.AnimalController;
import controller.ClienteController;
import controller.HistoricoController;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class HistoricoAnimal extends javax.swing.JFrame {
    
    private Animal selectedAnimal;
    private List<Animal> animais;
    private List<Cliente> clientes;
    private Cliente selectedCliente;


    public HistoricoAnimal() {
        initComponents();
        carregarClientes();
        showDados.setLineWrap(true);  // Habilita a quebra de linha automática
        showDados.setWrapStyleWord(true);
        
        arvoreDados.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
            treeNodeClicked(evt);
            }
        });
    }
    
    private void treeNodeClicked(javax.swing.event.TreeSelectionEvent evt) {
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) arvoreDados.getLastSelectedPathComponent();
        if (selectedNode != null) {
            Object nodeInfo = selectedNode.getUserObject();

            if (nodeInfo instanceof Consulta) {
                Consulta consulta = (Consulta) nodeInfo;
                String dados = "Data da Consulta: " + consulta.getData().toString() + "\n\n"
                        + "Horario: " + consulta.getHorario() + "\n\n" + "Relatorio: " + consulta.getRelatorio();
                showDados.setText(dados);
            }


            if (nodeInfo instanceof Tratamento) {
                Tratamento tratamento = (Tratamento) nodeInfo;
                String dados = "Nome do Tratamento: " + tratamento.getNome() + "\n\n"
                        + "Data de Inicio: " + tratamento.getDataInicio().toString() + "\n\n"
                        + "Data Final: " + tratamento.getDataFim().toString() + "\n\n"
                        + "Descrição Inicial: " + tratamento.getDescricaoInicio() + "\n\n"
                        + "Descrição Final: " + tratamento.getDescricaoFim() + "\n\n"
                        + "Status: " + (tratamento.getStatus() == 1 ? "Finalizado" : "Em andamento") + "\n\n";
                showDados.setText(dados);
            }
        }
    }
    
    private void carregarClientes() {
        ClienteController controler = new ClienteController();
        clientes = controler.listarClientes();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement(null);

        for (Cliente cliente : clientes) {
            model.addElement(cliente.getNome());
        }
        clientes.add(0, null);
        dropBoxCliente.setModel(model);
    }
    
    private void carregarAnimais(int cliente_id) {
        AnimalController controller = new AnimalController();
        animais = controller.listarAnimaisDeUmCliente(cliente_id); 
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Animal animal : animais) {
            model.addElement(animal.getNome());
        }
        dropBoxAnimal.setModel(model);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        arvoreDados = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        dropBoxCliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        dropBoxAnimal = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        showDados = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consultar Historico Animal");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Selecione o Animal");
        arvoreDados.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(arvoreDados);

        jLabel2.setText("Cliente:");

        dropBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dropBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Animal:");

        dropBoxAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dropBoxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxAnimalActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        showDados.setColumns(20);
        showDados.setRows(5);
        showDados.setMaximumSize(new java.awt.Dimension(68, 86));
        jScrollPane3.setViewportView(showDados);

        jLabel4.setText("Dados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(dropBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(159, 159, 159))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dropBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dropBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dropBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxClienteActionPerformed
        int selectedIndex = dropBoxCliente.getSelectedIndex();
        if (selectedIndex >= 0) {
            selectedCliente = clientes.get(selectedIndex);
            carregarAnimais(selectedCliente.getId());
        }
    }//GEN-LAST:event_dropBoxClienteActionPerformed

    private void dropBoxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxAnimalActionPerformed
        int selectedIndex = dropBoxAnimal.getSelectedIndex();
        HistoricoController controller = new HistoricoController();
        if (selectedIndex >= 0) {
            try {
                selectedAnimal = animais.get(selectedIndex);
                DefaultMutableTreeNode arvore = controller.getDados(selectedAnimal);
                arvoreDados.setModel(new javax.swing.tree.DefaultTreeModel(arvore));
            } catch (SQLException ex) {
                Logger.getLogger(HistoricoAnimal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_dropBoxAnimalActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistoricoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoricoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoricoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoricoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arvoreDados;
    private javax.swing.JComboBox<String> dropBoxAnimal;
    private javax.swing.JComboBox<String> dropBoxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea showDados;
    // End of variables declaration//GEN-END:variables
}
