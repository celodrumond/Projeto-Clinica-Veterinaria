/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class TelaInicial extends javax.swing.JPanel {

    public TelaInicial() {
        initComponents();
        atualizarTelaPrincipal();
    }
    
    public void atualizarTelaPrincipal() {
        carregarConsultaGeral();
        carregarAvisoGeral();
    }
    
    private void carregarConsultaGeral() {
        // Configura jPanel1 com BorderLayout e define o tamanho mínimo
        jPanel1.setLayout(new BorderLayout());
        jPanel1.setMinimumSize(new Dimension(350, 400));
        jPanel1.setPreferredSize(new Dimension(350, 400));
 
        ConsultasGerais consultaGeralPanel = new ConsultasGerais();
        consultaGeralPanel.setMinimumSize(new Dimension(350, 400));

        jPanel1.removeAll();
        jPanel1.add(consultaGeralPanel, BorderLayout.CENTER);

        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
        private void carregarAvisoGeral() {
        jPanel2.setLayout(new BorderLayout());
        jPanel2.setMinimumSize(new Dimension(350, 400));
        jPanel2.setPreferredSize(new Dimension(350, 400));
        
        AvisosGerais avisoGeralPanel = new AvisosGerais();
        avisoGeralPanel.setMinimumSize(new Dimension(350, 400));

        jPanel2.removeAll();
        jPanel2.add(avisoGeralPanel, BorderLayout.CENTER);
        

        jPanel2.revalidate();
        jPanel2.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnCadastrarCliente = new javax.swing.JButton();
        btnAlterarDadosCliente = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnCadastrarVeterinario = new javax.swing.JButton();
        btnAlterarDadosVeterinario = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnCadastrarAnimal = new javax.swing.JButton();
        btnConsultarDados = new javax.swing.JButton();
        btnAlterarDadosAnimal = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnMarcarConsulta = new javax.swing.JButton();
        btnVisualizarConsultas = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnIniciarTratamento = new javax.swing.JButton();
        btnFinalizarTratamento = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnCadastrarEspecie = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnCadastrarProduto = new javax.swing.JButton();
        btnInserirEstoque = new javax.swing.JButton();
        btnRetirarEstoque = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jLabel1.setText("Clinica Veterinria");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cantarell", 1, 18))); // NOI18N
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 0));

        jToolBar1.setBorder(null);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");
        jToolBar1.setAutoscrolls(true);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Clientes");
        jToolBar1.add(jLabel2);
        jToolBar1.add(jSeparator2);

        btnCadastrarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrarCliente.setText("Cadastrar Cliente");
        btnCadastrarCliente.setFocusable(false);
        btnCadastrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarCliente.setMaximumSize(new java.awt.Dimension(155, 25));
        btnCadastrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastrarCliente);

        btnAlterarDadosCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterarDadosCliente.setText("Alterar Dados");
        btnAlterarDadosCliente.setFocusable(false);
        btnAlterarDadosCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterarDadosCliente.setMaximumSize(new java.awt.Dimension(155, 25));
        btnAlterarDadosCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterarDadosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterarDadosCliente);
        jToolBar1.add(filler1);

        jLabel3.setText("Veterinarios");
        jToolBar1.add(jLabel3);
        jToolBar1.add(jSeparator3);

        btnCadastrarVeterinario.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrarVeterinario.setText("Cadastrar Veterinario");
        btnCadastrarVeterinario.setFocusable(false);
        btnCadastrarVeterinario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarVeterinario.setMaximumSize(new java.awt.Dimension(155, 25));
        btnCadastrarVeterinario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVeterinarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastrarVeterinario);

        btnAlterarDadosVeterinario.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterarDadosVeterinario.setText("Alterar Dados");
        btnAlterarDadosVeterinario.setFocusable(false);
        btnAlterarDadosVeterinario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterarDadosVeterinario.setMaximumSize(new java.awt.Dimension(155, 25));
        btnAlterarDadosVeterinario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterarDadosVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosVeterinarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterarDadosVeterinario);
        jToolBar1.add(filler2);

        jLabel6.setText("Animais");
        jToolBar1.add(jLabel6);
        jToolBar1.add(jSeparator6);

        btnCadastrarAnimal.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrarAnimal.setText("Cadastrar Animal");
        btnCadastrarAnimal.setFocusable(false);
        btnCadastrarAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarAnimal.setMaximumSize(new java.awt.Dimension(155, 25));
        btnCadastrarAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAnimalActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastrarAnimal);

        btnConsultarDados.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultarDados.setText("Consultar Dados");
        btnConsultarDados.setFocusable(false);
        btnConsultarDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarDados.setMaximumSize(new java.awt.Dimension(155, 25));
        btnConsultarDados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDadosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConsultarDados);

        btnAlterarDadosAnimal.setBackground(new java.awt.Color(204, 204, 204));
        btnAlterarDadosAnimal.setText("Alterar Dados");
        btnAlterarDadosAnimal.setFocusable(false);
        btnAlterarDadosAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterarDadosAnimal.setMaximumSize(new java.awt.Dimension(155, 25));
        btnAlterarDadosAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterarDadosAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosAnimalActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterarDadosAnimal);
        jToolBar1.add(filler4);

        jLabel4.setText("Consultas");
        jToolBar1.add(jLabel4);
        jToolBar1.add(jSeparator4);

        btnMarcarConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btnMarcarConsulta.setText("Marcar Consulta");
        btnMarcarConsulta.setFocusable(false);
        btnMarcarConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMarcarConsulta.setMaximumSize(new java.awt.Dimension(155, 25));
        btnMarcarConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarConsultaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnMarcarConsulta);

        btnVisualizarConsultas.setBackground(new java.awt.Color(204, 204, 204));
        btnVisualizarConsultas.setText("Visualizar Consultas");
        btnVisualizarConsultas.setFocusable(false);
        btnVisualizarConsultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVisualizarConsultas.setMaximumSize(new java.awt.Dimension(155, 25));
        btnVisualizarConsultas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVisualizarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarConsultasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVisualizarConsultas);
        jToolBar1.add(filler3);

        jLabel5.setText("Tratamentos");
        jToolBar1.add(jLabel5);
        jToolBar1.add(jSeparator5);

        btnIniciarTratamento.setBackground(new java.awt.Color(204, 204, 204));
        btnIniciarTratamento.setText("Iniciar Tratamento");
        btnIniciarTratamento.setFocusable(false);
        btnIniciarTratamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciarTratamento.setMaximumSize(new java.awt.Dimension(155, 25));
        btnIniciarTratamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIniciarTratamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarTratamentoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnIniciarTratamento);

        btnFinalizarTratamento.setBackground(new java.awt.Color(204, 204, 204));
        btnFinalizarTratamento.setText("Finalizar Tratamento");
        btnFinalizarTratamento.setFocusable(false);
        btnFinalizarTratamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFinalizarTratamento.setMaximumSize(new java.awt.Dimension(155, 25));
        btnFinalizarTratamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFinalizarTratamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarTratamentoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFinalizarTratamento);
        jToolBar1.add(filler5);

        jLabel7.setText("Especies");
        jToolBar1.add(jLabel7);
        jToolBar1.add(jSeparator7);

        btnCadastrarEspecie.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrarEspecie.setText("Cadastrar Especie");
        btnCadastrarEspecie.setFocusable(false);
        btnCadastrarEspecie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarEspecie.setMaximumSize(new java.awt.Dimension(155, 25));
        btnCadastrarEspecie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEspecieActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastrarEspecie);
        jToolBar1.add(filler6);

        jLabel8.setText("Produtos");
        jToolBar1.add(jLabel8);
        jToolBar1.add(jSeparator8);

        btnCadastrarProduto.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrarProduto.setText("Cadastrar Produto");
        btnCadastrarProduto.setFocusable(false);
        btnCadastrarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarProduto.setMaximumSize(new java.awt.Dimension(155, 25));
        btnCadastrarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastrarProduto);

        btnInserirEstoque.setBackground(new java.awt.Color(204, 204, 204));
        btnInserirEstoque.setText("Inserir Estoque");
        btnInserirEstoque.setFocusable(false);
        btnInserirEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInserirEstoque.setMaximumSize(new java.awt.Dimension(155, 25));
        btnInserirEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInserirEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirEstoqueActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInserirEstoque);

        btnRetirarEstoque.setBackground(new java.awt.Color(204, 204, 204));
        btnRetirarEstoque.setText("Retirada de Produto");
        btnRetirarEstoque.setFocusable(false);
        btnRetirarEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetirarEstoque.setMaximumSize(new java.awt.Dimension(155, 25));
        btnRetirarEstoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRetirarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarEstoqueActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRetirarEstoque);

        jScrollPane1.setViewportView(jToolBar1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultas do Dia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setMinimumSize(new java.awt.Dimension(320, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avisos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarDadosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosClienteActionPerformed
        AlterarCliente tela = new AlterarCliente();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.setVisible(true);
    }//GEN-LAST:event_btnAlterarDadosClienteActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        CadastroCliente cadastrarClienteForm = new CadastroCliente();
        cadastrarClienteForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastrarClienteForm.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        cadastrarClienteForm.pack();
        cadastrarClienteForm.setLocationRelativeTo(null);
        cadastrarClienteForm.setVisible(true);
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnCadastrarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVeterinarioActionPerformed
        CadastroVeterinario tela = new CadastroVeterinario();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarVeterinarioActionPerformed

    private void btnAlterarDadosVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosVeterinarioActionPerformed
        AlterarVeterinario tela = new AlterarVeterinario();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnAlterarDadosVeterinarioActionPerformed

    private void btnCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAnimalActionPerformed
        CadastroAnimal tela = new CadastroAnimal();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarAnimalActionPerformed

    private void btnConsultarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDadosActionPerformed
        HistoricoAnimal tela = new HistoricoAnimal();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnConsultarDadosActionPerformed

    private void btnAlterarDadosAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosAnimalActionPerformed
        AlterarAnimal tela = new AlterarAnimal();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnAlterarDadosAnimalActionPerformed

    private void btnMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarConsultaActionPerformed
        MarcarConsulta tela = new MarcarConsulta();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnMarcarConsultaActionPerformed

    private void btnVisualizarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizarConsultasActionPerformed

    private void btnIniciarTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarTratamentoActionPerformed
        CadastrarTratamento tela = new CadastrarTratamento();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnIniciarTratamentoActionPerformed

    private void btnFinalizarTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarTratamentoActionPerformed
        FinalizarTratamento tela = new FinalizarTratamento();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnFinalizarTratamentoActionPerformed

    private void btnCadastrarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEspecieActionPerformed
        CadastroEspecie tela = new CadastroEspecie();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarEspecieActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        CadastrarProduto tela = new CadastrarProduto();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnInserirEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirEstoqueActionPerformed
        InsercaoProdutos tela = new InsercaoProdutos();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnInserirEstoqueActionPerformed

    private void btnRetirarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarEstoqueActionPerformed
        RetiradaProdutos tela = new RetiradaProdutos();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                atualizarTelaPrincipal();
            }
        });
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_btnRetirarEstoqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDadosAnimal;
    private javax.swing.JButton btnAlterarDadosCliente;
    private javax.swing.JButton btnAlterarDadosVeterinario;
    private javax.swing.JButton btnCadastrarAnimal;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarEspecie;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnCadastrarVeterinario;
    private javax.swing.JButton btnConsultarDados;
    private javax.swing.JButton btnFinalizarTratamento;
    private javax.swing.JButton btnIniciarTratamento;
    private javax.swing.JButton btnInserirEstoque;
    private javax.swing.JButton btnMarcarConsulta;
    private javax.swing.JButton btnRetirarEstoque;
    private javax.swing.JButton btnVisualizarConsultas;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
