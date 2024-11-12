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

public class AlterarAnimal extends javax.swing.JFrame {

    private List<Cliente> clientes;
    private Cliente selectedCliente;
    private List<Especie> especies;
    private Especie selectedEspecie;
    private String sexo;
    private Animal selectedAnimal;
    private List<Animal> animais;
    
    
    public AlterarAnimal() {
        initComponents();
        carregarClientes();
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
    
     private void carregarAnimais(int cliente_id) {
        AnimalController controller = new AnimalController();
        animais = controller.listarAnimaisDeUmCliente(cliente_id); 
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (Animal animal : animais) {
            model.addElement(animal.getNome());
        }
        dropBoxAnimal.setModel(model);
    }
     
     private void atualizaAnimal(){
     selectedAnimal.setNome(inputNome.getText());
     selectedAnimal.setIdade(Integer.parseInt(inputIdade.getText()));
     selectedAnimal.setPeso(Double.parseDouble(inputPeso.getText()));
     selectedAnimal.setEspecie(selectedEspecie);
     selectedAnimal.setSexo(sexo);  
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dropBoxCliente = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputIdade = new javax.swing.JTextField();
        inputPeso = new javax.swing.JTextField();
        dropBoxEspecie = new javax.swing.JComboBox<>();
        btnAlterar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dropBoxAnimal = new javax.swing.JComboBox<>();
        inputBoxMacho = new javax.swing.JCheckBox();
        inputBoxFemea = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alterar Animal");

        dropBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxClienteActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Nome:");

        jLabel3.setText("Idade:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Peso:");

        jLabel6.setText("Especie:");

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        inputIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdadeActionPerformed(evt);
            }
        });

        inputPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPesoActionPerformed(evt);
            }
        });

        dropBoxEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxEspecieActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar Dados");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel7.setText("Selecione o Dono");

        jLabel8.setText("Selecione o Animal");

        dropBoxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropBoxAnimalActionPerformed(evt);
            }
        });

        inputBoxMacho.setText("Macho");
        inputBoxMacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBoxMachoActionPerformed(evt);
            }
        });

        inputBoxFemea.setText("Femea");
        inputBoxFemea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBoxFemeaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(dropBoxAnimal, 0, 172, Short.MAX_VALUE)
                    .addComponent(dropBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(inputBoxMacho)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputBoxFemea)
                                    .addGap(22, 22, 22))
                                .addComponent(inputNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropBoxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnAlterar))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inputIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputBoxMacho)
                            .addComponent(inputBoxFemea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dropBoxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(btnAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
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
            if (selectedIndex >= 0) {
                inputBoxMacho.setSelected(false);
                inputBoxFemea.setSelected(false);
                selectedAnimal = animais.get(selectedIndex);
                inputNome.setText(selectedAnimal.getNome());
                inputPeso.setText(String.valueOf(selectedAnimal.getPeso()));
                inputIdade.setText(String.valueOf(selectedAnimal.getIdade()));
                if ("Macho".equals(selectedAnimal.getSexo())){
                    inputBoxMacho.setSelected(true);
                }else{inputBoxFemea.setSelected(true);}
                carregarEspecies();
                dropBoxEspecie.setSelectedItem(selectedAnimal.getEspecie().getNome());
            }
    }//GEN-LAST:event_dropBoxAnimalActionPerformed

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

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AnimalController controller = new AnimalController();
        atualizaAnimal();
        int result = controller.alterarAnimal(selectedEspecie, selectedCliente, selectedAnimal);
        if (result == 1){JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);this.dispose();}
        else{JOptionPane.showMessageDialog(this, "Ocorreu um erro!", "Aviso", JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void inputBoxMachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBoxMachoActionPerformed
        if (inputBoxMacho.isSelected()) {
            sexo = "Macho";
        }
        else {
            sexo = "Nao Definido";
        } 
    }//GEN-LAST:event_inputBoxMachoActionPerformed

    private void inputBoxFemeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBoxFemeaActionPerformed
        if (inputBoxFemea.isSelected()) {
            sexo = "Femea";
        }
        else {
            sexo = "Nao Definido";
        }  
    }//GEN-LAST:event_inputBoxFemeaActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JComboBox<String> dropBoxAnimal;
    private javax.swing.JComboBox<String> dropBoxCliente;
    private javax.swing.JComboBox<String> dropBoxEspecie;
    private javax.swing.JCheckBox inputBoxFemea;
    private javax.swing.JCheckBox inputBoxMacho;
    private javax.swing.JTextField inputIdade;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
