package view;

import controller.ProdutoController;
import Entidades.Produto;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.List;

public class AvisosGerais extends javax.swing.JPanel {

    private ProdutoController produtoController;

    public AvisosGerais() {
        initComponents();
        produtoController = new ProdutoController();
        displayLowStockWarnings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(300, 400));
        setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>                        

    private void displayLowStockWarnings() {

        List<Produto> produtos = produtoController.readProdutos();
        this.setLayout(new GridLayout(0, 1, 10, 10));
        for (Produto produto : produtos) {
            if (produto.getQuantidade() < 10) {

                JPanel avisoPanel = new JPanel();
                avisoPanel.setLayout(new BoxLayout(avisoPanel, BoxLayout.Y_AXIS));
                avisoPanel.setBorder(new LineBorder(Color.RED, 2, true)); 
                avisoPanel.setBackground(new Color(255, 228, 225)); 
                avisoPanel.setAlignmentX(Component.LEFT_ALIGNMENT); 

                JLabel tituloLabel = new JLabel("Estoque Baixo");
                tituloLabel.setFont(new Font("Arial", Font.BOLD, 14));
                tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

    
                JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
                separator.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));
                JLabel produtoLabel = new JLabel("Produto: " + produto.getNome());
                produtoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel quantidadeLabel = new JLabel("Quantidade: " + produto.getQuantidade());
                quantidadeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);


                avisoPanel.add(Box.createVerticalStrut(5)); 
                avisoPanel.add(tituloLabel);
                avisoPanel.add(Box.createVerticalStrut(5)); 
                avisoPanel.add(separator); 
                avisoPanel.add(Box.createVerticalStrut(5));
                avisoPanel.add(produtoLabel);
                avisoPanel.add(quantidadeLabel);
                avisoPanel.add(Box.createVerticalStrut(5)); 

                this.add(avisoPanel);
            }
        }

        this.revalidate();
        this.repaint();
    }
                
}
