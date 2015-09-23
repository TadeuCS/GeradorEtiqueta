/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Etiqueta;
import Util.GeraRelatorios;
import Util.ImagemConfig;
import Util.PropertiesManager;
import Util.TableConfig;
import java.awt.Event;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
    List<Etiqueta> etiquetas;
    Connection con;
    Statement st;
    ResultSet rs;

    public Frm_Principal(String filial, String Usuario) {
        initComponents();
        setVisible(true);
        etiquetas = new ArrayList<>();
        props = new PropertiesManager();
        validaUsuarioLogado(Usuario);
        lb_filial.setText(filial);
        carregaProdutos();
        carregaLogo(props.ler("logo"));
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
        jLabel4 = new javax.swing.JLabel();
        cbx_tamanho = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_produtos1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_qtdeParcelas = new javax.swing.JTextField();
        txt_qtdeEtiquedas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_adicionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_filtro1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_qtde = new javax.swing.JLabel();
        btn_gerar = new javax.swing.JButton();
        lb_filial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerador de Etiqueta 2.0");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Preço 2", "Estoque"
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
        tb_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_produtosMousePressed(evt);
            }
        });
        tb_produtos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb_produtosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(0).setMinWidth(80);
            tb_produtos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_produtos.getColumnModel().getColumn(0).setMaxWidth(80);
            tb_produtos.getColumnModel().getColumn(2).setMinWidth(80);
            tb_produtos.getColumnModel().getColumn(2).setPreferredWidth(80);
            tb_produtos.getColumnModel().getColumn(2).setMaxWidth(80);
            tb_produtos.getColumnModel().getColumn(3).setMinWidth(80);
            tb_produtos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tb_produtos.getColumnModel().getColumn(3).setMaxWidth(80);
            tb_produtos.getColumnModel().getColumn(4).setMinWidth(70);
            tb_produtos.getColumnModel().getColumn(4).setPreferredWidth(70);
            tb_produtos.getColumnModel().getColumn(4).setMaxWidth(70);
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

        jLabel4.setText("Tamanho*:");

        cbx_tamanho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10.5 cm X 3.0 cm", "11.1 cm X 7.4 cm", "  9.6 cm X 8.2 cm", "  8.5 cm X 7.5 cm", "  8.0 cm X 4.0 cm", "  8.0 cm X 7.1 cm" }));
        cbx_tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tamanhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_tamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lb_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        tb_produtos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Preço 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos1.getTableHeader().setReorderingAllowed(false);
        tb_produtos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb_produtos1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb_produtos1);
        if (tb_produtos1.getColumnModel().getColumnCount() > 0) {
            tb_produtos1.getColumnModel().getColumn(0).setMinWidth(80);
            tb_produtos1.getColumnModel().getColumn(0).setPreferredWidth(80);
            tb_produtos1.getColumnModel().getColumn(0).setMaxWidth(80);
            tb_produtos1.getColumnModel().getColumn(2).setMinWidth(80);
            tb_produtos1.getColumnModel().getColumn(2).setPreferredWidth(80);
            tb_produtos1.getColumnModel().getColumn(2).setMaxWidth(80);
            tb_produtos1.getColumnModel().getColumn(3).setMinWidth(80);
            tb_produtos1.getColumnModel().getColumn(3).setPreferredWidth(80);
            tb_produtos1.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetros"));
        jPanel3.setToolTipText("");

        jLabel3.setText("Parcelas*:");

        txt_qtdeParcelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_qtdeParcelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_qtdeParcelasKeyPressed(evt);
            }
        });

        txt_qtdeEtiquedas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_qtdeEtiquedas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_qtdeEtiquedasKeyPressed(evt);
            }
        });

        jLabel2.setText("Quantidade*:");

        btn_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_qtdeParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_qtdeEtiquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btn_adicionar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_qtdeParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_qtdeEtiquedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_adicionar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Para remover alguma linha da tabela de impressão, basta selecionar a linha desejada e teclar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText(" DELETE.");

        txt_filtro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtro1KeyReleased(evt);
            }
        });

        jLabel7.setText("Filtro *:");

        jLabel8.setText("Quantidade:");

        lb_qtde.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_qtde.setForeground(new java.awt.Color(0, 102, 102));
        lb_qtde.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_qtde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_qtde)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        btn_gerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png"))); // NOI18N
        btn_gerar.setText("Gerar");
        btn_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarActionPerformed(evt);
            }
        });

        lb_filial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_filial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_gerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_filial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarActionPerformed
        gerarEtiqueta(cbx_tamanho.getSelectedIndex());
    }//GEN-LAST:event_btn_gerarActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        TableConfig.filtrar(tb_produtos, txt_filtro);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void lb_logoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_logoMousePressed
        buscaDiretorio();
    }//GEN-LAST:event_lb_logoMousePressed

    private void cbx_tamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tamanhoActionPerformed
        validaTamanho(cbx_tamanho.getSelectedIndex());
    }//GEN-LAST:event_cbx_tamanhoActionPerformed

    private void tb_produtosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_produtosKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            cbx_tamanho.requestFocus();
        }
    }//GEN-LAST:event_tb_produtosKeyPressed

    private void txt_qtdeParcelasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtdeParcelasKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            if (txt_qtdeParcelas.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Quantidade de Parcelas inválidas!");
            } else {
                txt_qtdeEtiquedas.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_qtdeParcelasKeyPressed

    private void txt_qtdeEtiquedasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtdeEtiquedasKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            if (txt_qtdeEtiquedas.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Quantidade de Etiquetas inválidas!");
            } else {
                btn_adicionar.doClick();
            }
        }
    }//GEN-LAST:event_txt_qtdeEtiquedasKeyPressed

    private void tb_produtos1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_produtos1KeyPressed
        if (evt.getKeyCode() == Event.DELETE) {
            if (tb_produtos1.getSelectedRowCount() == 1) {
                try {
                    etiquetas.remove(tb_produtos1.getSelectedRow());
                    TableConfig.getModel(tb_produtos1).removeRow(tb_produtos1.getSelectedRow());
                    lb_qtde.setText(tb_produtos1.getRowCount() + "");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover a linha selecionada!");
                } finally {
                    lb_qtde.setText(tb_produtos1.getRowCount() + "");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione apenas uma Linha para remover!");
            }
        }
    }//GEN-LAST:event_tb_produtos1KeyPressed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        if (tb_produtos.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 produto para gerar a etiqueta!");
        } else {
            addInList();
        }
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void tb_produtosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtosMousePressed
        if (tb_produtos.getSelectedRowCount() == 1) {
            txt_qtdeParcelas.requestFocus();
        }
    }//GEN-LAST:event_tb_produtosMousePressed

    private void txt_filtro1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtro1KeyReleased
        TableConfig.filtrar(tb_produtos1, txt_filtro1);
    }//GEN-LAST:event_txt_filtro1KeyReleased

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
            java.util.logging.Logger.getLogger(Frm_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_gerar;
    private javax.swing.JComboBox cbx_tamanho;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_filial;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_qtde;
    private javax.swing.JTable tb_produtos;
    private javax.swing.JTable tb_produtos1;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_filtro1;
    private javax.swing.JTextField txt_qtdeEtiquedas;
    private javax.swing.JTextField txt_qtdeParcelas;
    // End of variables declaration//GEN-END:variables

    private void carregaProdutos() {
        try {
            st = getConexao();
            rs = st.executeQuery("select\n"
                    + "p.CODPROD,p.DESCRICAO,p.PRECO,p.PRECO2,c.ESTOQUE\n"
                    + "from produto p\n"
                    + "inner join compprod c on p.codprod=c.codprod order by p.descricao,p.codprod");
            while (rs.next()) {
                int estoque = (int) Double.parseDouble(rs.getString("estoque"));
                String[] linha = new String[]{
                    rs.getString("codprod"),
                    rs.getString("descricao"),
                    NumberFormat.getCurrencyInstance().format(Double.parseDouble(rs.getString("preco"))),
                    NumberFormat.getCurrencyInstance().format(Double.parseDouble(rs.getString("preco2"))),
                    estoque + ""
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
        try {
            props = new PropertiesManager();
            if (tipo == 0) {
                //etiqueta do Supermercado Peg Pag
                if (geraRelatorios.imprimirByLista("Etiqueta 10.5x3.0.jasper", parameters, etiquetas) == false) {
                    geraRelatorios.imprimirByLista("src/Relatorios/Etiqueta 10.5x3.0.jasper", parameters, etiquetas);
                }
            } else {
                parameters.put("logo", props.ler("logo"));
                if (tipo == 1) {
                    //etiqueta da Casa Araujo 3 colunas
                    if (geraRelatorios.imprimirByLista("Etiqueta 11.1x7.4.jasper", parameters, etiquetas) == false) {
                        geraRelatorios.imprimirByLista("src/Relatorios/Etiqueta 11.1x7.4.jasper", parameters, etiquetas);
                    }
                } else {
                    if (tipo == 2) {
                        //etiqueta da Casa Araujo 2 colunas
                        if (geraRelatorios.imprimirByLista("Etiqueta 9.6x8.2.jasper", parameters, etiquetas) == false) {
                            geraRelatorios.imprimirByLista("src/Relatorios/Etiqueta 9.6x8.2.jasper", parameters, etiquetas);
                        }
                    } else {
                        if (tipo == 3) {
                            //etiqueta da Ayalla
                            if (geraRelatorios.imprimirByLista("Etiqueta 8.5x7.5.jasper", parameters, etiquetas) == false) {
                                geraRelatorios.imprimirByLista("src/Relatorios/Etiqueta 8.5x7.5.jasper", parameters, etiquetas);
                            }
                        } else {
                            if (tipo == 4) {
                                //etiqueta da Ludyelle 1 coluna
                                if (geraRelatorios.imprimirByLista("Etiqueta 8.0x4.0.jasper", parameters, etiquetas) == false) {
                                    geraRelatorios.imprimirByLista("src/Relatorios/Etiqueta 8.0x4.0.jasper", parameters, etiquetas);
                                }
                            } else {
                                //etiqueta da Ludyelle 2 coluna
                                if (tipo == 5) {
                                    if (geraRelatorios.imprimirByLista("Etiqueta 8.0x7.1.jasper", parameters, etiquetas) == false) {
                                        geraRelatorios.imprimirByLista("src/Relatorios/Etiqueta 8.0x7.1.jasper", parameters, etiquetas);
                                    }
                                }
                            }
                        }
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

    private Etiqueta getProduto() {
        Etiqueta etiqueta = new Etiqueta();
        double preco = Double.parseDouble(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 2).toString().replace("R$ ", "").replace(".", "").replace(",", "."));
        double preco2 = Double.parseDouble(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 3).toString().replace("R$ ", "").replace(".", "").replace(",", "."));
        double percentual = 100 - (preco * 100) / preco2;
        double diferenca = preco2 - preco;
        double parcela = preco2 / Integer.parseInt(txt_qtdeParcelas.getText());

        etiqueta.setDESCRICAO(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 1).toString());
        etiqueta.setNumParcelas(Integer.parseInt(txt_qtdeParcelas.getText()));
        etiqueta.setREFERENCIA(tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 0).toString());
        etiqueta.setPRECO(NumberFormat.getCurrencyInstance().format(preco));
        etiqueta.setPRECO2(NumberFormat.getCurrencyInstance().format(preco2));
        etiqueta.setPERCENT(percentual);
        etiqueta.setDIFERENCA(NumberFormat.getCurrencyInstance().format(diferenca));
        etiqueta.setPARCELA(NumberFormat.getCurrencyInstance().format(parcela));
        return etiqueta;
    }

    private void validaTamanho(int item) {
        if (item == 0) {
            txt_qtdeEtiquedas.setText("1");
            txt_qtdeEtiquedas.setEnabled(false);
            txt_qtdeParcelas.setText("0");
            txt_qtdeParcelas.setEnabled(false);
        } else {
            txt_qtdeEtiquedas.setText(null);
            txt_qtdeEtiquedas.setEnabled(true);
            txt_qtdeParcelas.setText(null);
            txt_qtdeParcelas.setEnabled(true);
            txt_qtdeParcelas.requestFocus();
        }
    }

    private void validaUsuarioLogado(String Usuario) {
        if (Usuario.equals("MESTRE") == true) {
            cbx_tamanho.setSelectedIndex(Integer.parseInt(props.ler("etiqueta")));
            cbx_tamanho.setEnabled(false);
        } else {
            cbx_tamanho.setEnabled(true);
        }
        validaTamanho(cbx_tamanho.getSelectedIndex());
    }

    public Statement getConexao() {
        try {
            props = new PropertiesManager();
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection(
                    "jdbc:firebirdsql://"
                    + props.ler("ip") + ":3050/"
                    + props.ler("diretorio"),
                    "SYSDBA",
                    "masterkey");
            st = con.createStatement();
            return st;
        } catch (Exception e) {
            return null;
        }
    }

    private void addInList() {
        try {
            String[] linha = new String[]{
                tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 0).toString(),
                tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 1).toString(),
                tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 2).toString(),
                tb_produtos.getValueAt(tb_produtos.getSelectedRow(), 3).toString()
            };
            for (int i = 0; i < Integer.parseInt(txt_qtdeEtiquedas.getText()); i++) {
                etiquetas.add(getProduto());
                TableConfig.getModel(tb_produtos1).addRow(linha);
            }
//            TableConfig.getModel(tb_produtos).removeRow(tb_produtos.getSelectedRow());
            limpaCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            lb_qtde.setText(tb_produtos1.getRowCount() + "");
        }
    }

    private void limpaCampos() {
        txt_qtdeParcelas.setText(null);
        txt_qtdeEtiquedas.setText(null);
        txt_qtdeParcelas.requestFocus();
    }
}
