package view;

import Entidades.Animal;
import Entidades.Cliente;
import Entidades.Especie;
import controller.AnimalController;
import controller.ClienteController;
import controller.EspecieController;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class CadastroAnimal extends javax.swing.JFrame {

    private List<Cliente> clientes;
    private Cliente selectedCliente;
    private List<Especie> especies;
    private Especie selectedEspecie;
    private String sexo;
    
    public CadastroAnimal() {
        initComponents();
        carregarClientes();
        carregarEspecies();
    }
    
    private void carregarClientes() {
        ClienteController controler = new ClienteController();
        clientes = controler.listarClientes(); 
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Cliente cliente : clientes) {
            model.addElement(cliente.getNome());
        }
        dropBoxCliente.setModel(model);
    }
    
    private void carregarEspecies() {
        EspecieController controller = new EspecieController();
        especies = controller.listarEspecie();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Especie especie : especies) {
            model.addElement(especie.getNome());
        }
        dropBoxEspecie.setModel(model);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        inputNome2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputIdade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputPeso = new javax.swing.JTextField();
        inputSexoMacho = new javax.swing.JCheckBox();
        inputSexoFemea = new javax.swing.JCheckBox();
        dropBoxEspecie = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dropBoxCliente = new javax.swing.JComboBox<>();

        jLabel4.setText("Idade:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastrar Animal");

        jLabel2.setText("Nome:");

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Idade:");

        inputIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdadeActionPerformed(evt);
            }
        });

        jLabel5.setText("Peso:");

        inputPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPesoActionPerformed(evt);
            }
        });

        inputSexoMacho.setText("Macho");
        inputSexoMacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSexoMachoActionPerformed(evt);
            }
        });

        inputSexoFemea.setText("Femea");
        inputSexoFemea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSexoFemeaActionPerformed(evt);
            }
        });

        dropBoxEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxEspecieActionPerformed(evt);
            }
        });

        jLabel6.setText("Especie:");

        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente:");

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
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inputSexoMacho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputSexoFemea))
                                    .addComponent(inputPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(126, 126, 126))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropBoxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnCadastro)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSexoMacho)
                    .addComponent(inputSexoFemea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(dropBoxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnCadastro)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        AnimalController controller = new AnimalController();
        Animal animal = new Animal(0, inputNome.getText(), Integer.parseInt(inputIdade.getText()), sexo, Double.parseDouble(inputPeso.getText()),selectedEspecie);
        
        int result = controller.cadastrarAnimal(animal, selectedCliente, selectedEspecie);
        if (result == 0){
            JOptionPane.showMessageDialog(this, "Animal cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdadeActionPerformed

    private void inputPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPesoActionPerformed

    private void dropBoxEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxEspecieActionPerformed
        int selectedIndex = dropBoxEspecie.getSelectedIndex();
        if (selectedIndex >= 0) {
            selectedEspecie = especies.get(selectedIndex);
        }
        
    }//GEN-LAST:event_dropBoxEspecieActionPerformed

    private void dropBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropBoxClienteActionPerformed
        
        int selectedIndex = dropBoxCliente.getSelectedIndex();
        if (selectedIndex >= 0) {
            selectedCliente = clientes.get(selectedIndex);
        }
    }//GEN-LAST:event_dropBoxClienteActionPerformed

    private void inputSexoFemeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSexoFemeaActionPerformed
        if (inputSexoFemea.isSelected()) {
            sexo = "Femea";
        }
        else {
            sexo = "Nao Definido";
        }
    }//GEN-LAST:event_inputSexoFemeaActionPerformed

    private void inputSexoMachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSexoMachoActionPerformed
        if (inputSexoMacho.isSelected()) {
            sexo = "Macho";
        }
        else {
            sexo = "Nao Definido";
        }
    }//GEN-LAST:event_inputSexoMachoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JComboBox<String> dropBoxCliente;
    private javax.swing.JComboBox<String> dropBoxEspecie;
    private javax.swing.JTextField inputIdade;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNome2;
    private javax.swing.JTextField inputPeso;
    private javax.swing.JCheckBox inputSexoFemea;
    private javax.swing.JCheckBox inputSexoMacho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
