/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoDAO;
import Model.Etiqueta;
import Model.Produto;
import Util.GeraRelatorios;
import Util.ImagemConfig;
import Util.PropertiesManager;
import Util.TableConfig;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_Principal extends javax.swing.JFrame {

    PropertiesManager props;
    ImagemConfig imagemConfig;

    public Frm_Principal() {
        initComponents();
        carregaProdutos();
        props = new PropertiesManager();
        carregaLogo(props.ler("logo"));
        carregaQuantidadesByEtiqueta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lb_logo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_qtdeParcelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbx_tamanho = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbx_qtdeEtiquetas = new javax.swing.JComboBox();
        btn_gerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerador de Etiqueta");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb_produtos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Referência", "Descrição", "Preço", "Preço 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(0).setMinWidth(80);
            tb_produtos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_produtos.getColumnModel().getColumn(0).setMaxWidth(80);
            tb_produtos.getColumnModel().getColumn(1).setMinWidth(120);
            tb_produtos.getColumnModel().getColumn(1).setPreferredWidth(120);
            tb_produtos.getColumnModel().getColumn(1).setMaxWidth(120);
            tb_produtos.getColumnModel().getColumn(3).setMinWidth(80);
            tb_produtos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tb_produtos.getColumnModel().getColumn(3).setMaxWidth(80);
            tb_produtos.getColumnModel().getColumn(4).setMinWidth(80);
            tb_produtos.getColumnModel().getColumn(4).setPreferredWidth(80);
            tb_produtos.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jLabel1.setText("Filtro *:");

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logo.setText("LOGO");
        lb_logo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_logoMousePressed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetros"));
        jPanel3.setToolTipText("");

        jLabel3.setText("Parcelas*:");

        txt_qtdeParcelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Tamanho*:");

        cbx_tamanho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10.5 cm X 3.0 cm", "11.1 cm X 7.4 cm", "10.6 cm X 9.4 cm", "  9.6 cm X 8.2 cm" }));
        cbx_tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tamanhoActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade*:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_tamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_qtdeParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_qtdeEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_qtdeParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbx_qtdeEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_gerar.setText("Gerar");
        btn_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_gerar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarActionPerformed
        if (tb_produtos.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 produto para gerar a etiqueta!");
        } else {
            gerarEtiqueta(cbx_tamanho.getSelectedIndex());
        }
    }//GEN-LAST:event_btn_gerarActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        TableConfig.filtrar(tb_produtos, txt_filtro);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void lb_logoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_logoMousePressed
        buscaDiretorio();
    }//GEN-LAST:event_lb_logoMousePressed

    private void cbx_tamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tamanhoActionPerformed
        carregaQuantidadesByEtiqueta();
    }//GEN-LAST:event_cbx_tamanhoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gerar;
    private javax.swing.JComboBox cbx_qtdeEtiquetas;
    private javax.swing.JComboBox cbx_tamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JTable tb_produtos;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_qtdeParcelas;
    // End of variables declaration//GEN-END:variables

    private void carregaProdutos() {
        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            for (Produto produto : produtoDAO.listar()) {
                String[] linha = new String[]{
                    produto.getCodprod(),
                    produto.getReferencia(),
                    produto.getDescricao(),
                    NumberFormat.getCurrencyInstance().format(produto.getPreco()),
                    NumberFormat.getCurrencyInstance().format(produto.getPreco2())
                };
                TableConfig.getModel(tb_produtos).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void gerarEtiqueta(int tipo) {
        Map parameters = new HashMap();
        GeraRelatorios geraRelatorios = new GeraRelatorios();
        String referencia = tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 1).toString();
        try {
            if (tipo == 0) {
                if (referencia.length() < 12) {
                    referencia = null;
                }
                parameters.put("codigo", tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 0).toString());
                parameters.put("referencia", referencia);
                InputStream is = null;
                geraRelatorios.imprimirRelatorioSQLNoRelatorio(parameters, "src/Relatorios/Etiqueta 10.5x3.0.jasper"); //IDE
            }
            if (tipo == 4) {
                if (lb_logo.getIcon() == null) {
                    JOptionPane.showMessageDialog(null, "Logo inválida!");
                } else {
                    if (txt_qtdeParcelas.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Quantidade de parcelas inválida!");
                        txt_qtdeParcelas.requestFocus();
                    } else {
                        for (int i = 0; i < Integer.parseInt(cbx_qtdeEtiquetas.getSelectedItem().toString()); i++) {
                        }
                        props = new PropertiesManager();
                        parameters.put("logo", props.ler("logo"));
                        geraRelatorios.imprimirByLista("src/Relatorios/Etiqueta 10.5x3.0.jasper", parameters,null);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar a etiqueta!\n" + e);
        }
    }

    private void buscaDiretorio() {
        JFileChooser fileChooser = new JFileChooser();
        props = new PropertiesManager();
        imagemConfig = new ImagemConfig();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) {
        } else {
            String file = fileChooser.getSelectedFile().getPath();
            props.altera("logo", file);
            carregaLogo(file);
        }
    }

    private void carregaLogo(String caminho) {
        try {
            lb_logo.setText("");
            imagemConfig = new ImagemConfig();
            imagemConfig.carregaImagem(lb_logo, caminho, lb_logo.getWidth());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a Logo!\n" + e);
        }
    }

    private void carregaQuantidadesByEtiqueta() {
        try {
            cbx_qtdeEtiquetas.removeAllItems();
            if (cbx_tamanho.getSelectedIndex() == 0) {
                cbx_qtdeEtiquetas.addItem("1");
                txt_qtdeParcelas.setEnabled(false);
            } else {
                txt_qtdeParcelas.setEnabled(true);
            }
            if (cbx_tamanho.getSelectedIndex() == 1) {
                cbx_qtdeEtiquetas.addItem("1");
                cbx_qtdeEtiquetas.addItem("2");
                cbx_qtdeEtiquetas.addItem("3");
            }
            if (cbx_tamanho.getSelectedIndex() == 2) {
                cbx_qtdeEtiquetas.addItem("1");
            }
            if (cbx_tamanho.getSelectedIndex() == 3) {
                cbx_qtdeEtiquetas.addItem("1");
                cbx_qtdeEtiquetas.addItem("2");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as quantidades!" + e.getMessage());
        }
    }

    private Etiqueta getProduto() {
        try {
            Etiqueta etiqueta = new Etiqueta();
            etiqueta.setREFERENCIA(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 1).toString());
            etiqueta.setPRECO(Double.parseDouble(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 3).toString()));
            etiqueta.setPRECO2(Double.parseDouble(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 4).toString()));
            double percentual = 100 - ((Double.parseDouble(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 3).toString())
                    * 100) / Double.parseDouble(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 4).toString()));
            etiqueta.setPERCENT(percentual);
            return etiqueta;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados do produto selecionado!" + e);
            return null;
        }
    }
}
