/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Entidades.Animal;
import Entidades.Consulta;
import Entidades.Veterinario;
import controller.ConsultaController;
import controller.VeterinarioController;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author marcelo
 */
public class ConsultasGerais extends javax.swing.JPanel {

    private List<Veterinario> veterinarios;
    private Veterinario selectedVeterinario;
    private Consulta ultimaConsultaSelecionada;
    
    public ConsultasGerais() {
        initComponents();
        carregarVeterinarios();
    }
    
    private void exibirArvoreConsultas() {
        if (selectedVeterinario != null && jDateChooser1.getDate() != null) {
            ConsultaController consultaController = new ConsultaController();
            DefaultMutableTreeNode raiz = consultaController.visualizaConsultas(
                new java.sql.Date(jDateChooser1.getDate().getTime()), 
                selectedVeterinario
            );

            if (raiz != null) {
                jTree1.setModel(new javax.swing.tree.DefaultTreeModel(raiz));
                jTree1.addTreeSelectionListener(e -> {
                    DefaultMutableTreeNode selectedNode = 
                        (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

                    if (selectedNode != null) {
                        Object userObject = selectedNode.getUserObject();

                        if (userObject instanceof String) {
                            ultimaConsultaSelecionada = consultaController.getConsulta(selectedNode);
                            inputDetalhes.setText("");
                        } 
                        else if (userObject instanceof Animal) {
                            Animal animal = (Animal) userObject;
                            exibirDetalhesAnimal(animal);
                        } else {
                            inputDetalhes.setText("");
                        }
                    }
                });
            } else {
                jTree1.setModel(null);
            }
        }
    }

private void exibirDetalhesAnimal(Animal animal) {
    String detalhes = "<html><body>" +
                      "<b>Nome:</b> " + animal.getNome() + "<br>" +
                      "<b>Idade:</b> " + animal.getIdade() + "<br>" +
                      "<b>Peso:</b> " + animal.getPeso() + "<br>" +
                      "<b>Sexo:</b> " + animal.getSexo() + "<br>";

    if (ultimaConsultaSelecionada != null) {
        detalhes += "<b>Descrição da Consulta:</b> " + ultimaConsultaSelecionada.getRelatorio() + "<br>";
    }

    detalhes += "</body></html>";
    inputDetalhes.setContentType("text/html");
    inputDetalhes.setText(detalhes);
}


    private void carregarVeterinarios() {
           VeterinarioController controller = new VeterinarioController();
           veterinarios = controller.listarVeterinarios(); 
           DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

           for (Veterinario veterinario : veterinarios) {
               model.addElement(veterinario.getNome());
           }

           dropBoxVeterinarios.setModel(model);
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dropBoxVeterinarios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputDetalhes = new javax.swing.JTextPane();
        btnVerificar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Consultas");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        jLabel1.setText("Data:");

        dropBoxVeterinarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxVeterinariosActionPerformed(evt);
            }
        });

        jLabel2.setText("Veterinario");

        inputDetalhes.setEditable(false);
        inputDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane3.setViewportView(inputDetalhes);

        btnVerificar.setBackground(new java.awt.Color(102, 255, 102));
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropBoxVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropBoxVeterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dropBoxVeterinariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxVeterinariosActionPerformed

        int selectedIndex = dropBoxVeterinarios.getSelectedIndex();
        if (selectedIndex >= 0) {
            selectedVeterinario = veterinarios.get(selectedIndex);
        }
    }//GEN-LAST:event_dropBoxVeterinariosActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        exibirArvoreConsultas();
    }//GEN-LAST:event_btnVerificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> dropBoxVeterinarios;
    private javax.swing.JTextPane inputDetalhes;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
