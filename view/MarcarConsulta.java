/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Entidades.Animal;
import Entidades.Cliente;
import Entidades.Consulta;
import Entidades.Veterinario;
import controller.AnimalController;
import controller.ClienteController;
import controller.ConsultaController;
import controller.VeterinarioController;
import java.beans.PropertyChangeEvent;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class MarcarConsulta extends javax.swing.JFrame {

    private List<Veterinario> veterinarios;
    private Veterinario selectedVeterinario;
    private Animal selectedAnimal;
    private List<Animal> animais;
    private List<Cliente> clientes;
    private Cliente selectedCliente;
    private List<String> horariosDisponiveis;
    private String selectedHorario;
    private Date selectedData;
    
    
    public MarcarConsulta() {
        initComponents();
        carregarVeterinarios();
        carregarClientes();
        
        btnCalendario.getDayChooser().addPropertyChangeListener("day", (PropertyChangeEvent evt) -> {
            selectedData = btnCalendario.getDate();
            carregarHorarios();
        });

    }
    
    private void carregarVeterinarios() {
        VeterinarioController controller = new VeterinarioController();
        veterinarios = controller.listarVeterinarios(); 
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Veterinario veterinario : veterinarios) {
            model.addElement(veterinario.getNome());
        }

        dropBoxVeterinario.setModel(model);
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
    
private void carregarHorarios() {
    ConsultaController controller = new ConsultaController();
    Date dataSelecionada = btnCalendario.getDate();
    java.sql.Date sqlDate = new java.sql.Date(dataSelecionada.getTime());
    horariosDisponiveis = controller.consultaHorarios(selectedVeterinario.getId(), sqlDate);
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

    for (String horario : horariosDisponiveis) {
        model.addElement(horario);
    }
    dropBoxHorario.setModel(model);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalendario = new com.toedter.calendar.JCalendar();
        jLabel4 = new javax.swing.JLabel();
        dropBoxAnimal = new javax.swing.JComboBox<>();
        dropBoxVeterinario = new javax.swing.JComboBox<>();
        dropBoxHorario = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        inputDescricao = new javax.swing.JTextField();
        btnMarcarConsulta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dropBoxCliente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marcar Consulta");

        jLabel2.setText("Animal:");

        jLabel3.setText("Veterinario:");

        jLabel4.setText("Horario:");

        dropBoxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxAnimalActionPerformed(evt);
            }
        });

        dropBoxVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxVeterinarioActionPerformed(evt);
            }
        });

        dropBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxHorarioActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        inputDescricao.setText("Descricao do animal/problema.");
        inputDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDescricaoActionPerformed(evt);
            }
        });

        btnMarcarConsulta.setText("Marcar Consulta");
        btnMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarConsultaActionPerformed(evt);
            }
        });

        jLabel5.setText("Cliente:");

        dropBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        dropBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(dropBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(dropBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(dropBoxVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dropBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMarcarConsulta)
                                .addGap(127, 127, 127)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnMarcarConsulta)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dropBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dropBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dropBoxVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(btnCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dropBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDescricaoActionPerformed

    private void btnMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarConsultaActionPerformed

        Consulta consulta = new Consulta(selectedData,selectedHorario,inputDescricao.getText(),selectedVeterinario.getId(),selectedAnimal.getId());
        ConsultaController controller = new ConsultaController();
        int result = controller.marcaConsulta(consulta);
        if (result == 0){JOptionPane.showMessageDialog(this, "Consulta marcada com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE); this.dispose();}
        else{JOptionPane.showMessageDialog(this, "Não foi possivel marcar a consulta.", "Aviso", JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_btnMarcarConsultaActionPerformed

    private void dropBoxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxAnimalActionPerformed
        int selectedIndex = dropBoxAnimal.getSelectedIndex();
            if (selectedIndex >= 0) {
                selectedAnimal = animais.get(selectedIndex);
            }
    }//GEN-LAST:event_dropBoxAnimalActionPerformed

    private void dropBoxVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxVeterinarioActionPerformed
        int selectedIndex = dropBoxVeterinario.getSelectedIndex();
            if (selectedIndex >= 0) {
                selectedVeterinario = veterinarios.get(selectedIndex);
                carregarHorarios();
            }
    }//GEN-LAST:event_dropBoxVeterinarioActionPerformed

    private void dropBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxHorarioActionPerformed
        int selectedIndex = dropBoxHorario.getSelectedIndex();
            if (selectedIndex >= 0) {
                selectedHorario = horariosDisponiveis.get(selectedIndex);
            }
    }//GEN-LAST:event_dropBoxHorarioActionPerformed

    private void dropBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxClienteActionPerformed
        int selectedIndex = dropBoxCliente.getSelectedIndex();
            if (selectedIndex >= 0) {
                selectedCliente = clientes.get(selectedIndex);
                carregarAnimais(selectedCliente.getId());
            }
    }//GEN-LAST:event_dropBoxClienteActionPerformed

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
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar btnCalendario;
    private javax.swing.JButton btnMarcarConsulta;
    private javax.swing.JComboBox<String> dropBoxAnimal;
    private javax.swing.JComboBox<String> dropBoxCliente;
    private javax.swing.JComboBox<String> dropBoxHorario;
    private javax.swing.JComboBox<String> dropBoxVeterinario;
    private javax.swing.JTextField inputDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
