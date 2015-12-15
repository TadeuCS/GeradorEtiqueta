/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FiliaisDAO;
import Util.Conexao;
import Util.ImagemConfig;
import Util.Mascaras;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import Util.PropertiesManager;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DriverManager;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_Conexao extends javax.swing.JFrame {

    static Frm_Principal p;
    static Statement st;
    static Connection con;
    PrintWriter pw;
    ImagemConfig imagemConfig;
    PropertiesManager props;
    Conexao conexao;
    String diretorio;

    public Frm_Conexao() {
        initComponents();
        setVisible(true);
        carregaDados();
        cbx_tamanho.setSelectedIndex(Integer.parseInt(props.ler("etiqueta")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_ip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_banco = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        btn_testar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbx_tamanho = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txt_cnpj = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lb_logo = new javax.swing.JLabel();
        btn_testar1 = new javax.swing.JButton();
        btn_gravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração de Conexão");

        pnl_fundo.setBorder(javax.swing.BorderFactory.createTitledBorder("Conexão com Banco de dados"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Servidor*:");

        txt_ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Banco *:");

        btn_buscar.setText("...");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        status.setForeground(new java.awt.Color(0, 51, 153));
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_testar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/executar.png"))); // NOI18N
        btn_testar.setText("Testar");
        btn_testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_banco))
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_testar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btn_testar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetros"));

        cbx_tamanho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10.5 cm X 3.0 cm", "11.1 cm X 7.4 cm", "  9.6 cm X 8.2 cm", "  8.5 cm X 7.5 cm", "  8.0 cm X 4.0 cm", "  8.0 cm X 7.0 cm", "  6.5 cm X 2.5 cm" }));
        cbx_tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tamanhoActionPerformed(evt);
            }
        });

        jLabel1.setText("Etiqueta:");

        try {
            txt_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("CNPJ*:");

        lb_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logo.setText("LOGO");
        lb_logo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lb_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_logoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(lb_logo);

        btn_testar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carregar.png"))); // NOI18N
        btn_testar1.setText("Carregar");
        btn_testar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_testar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_testar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbx_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btn_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_fundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btn_gravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testarActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_testarActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        gravaDadosConexao();
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscaImagem();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_testar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testar1ActionPerformed
        carregarCNPJ();
    }//GEN-LAST:event_btn_testar1ActionPerformed

    private void cbx_tamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tamanhoActionPerformed
    }//GEN-LAST:event_cbx_tamanhoActionPerformed

    private void lb_logoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_logoMousePressed
        buscaDiretorio();
    }//GEN-LAST:event_lb_logoMousePressed

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
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Conexao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_testar;
    private javax.swing.JButton btn_testar1;
    private javax.swing.JComboBox cbx_tamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JLabel status;
    private javax.swing.JTextField txt_banco;
    private javax.swing.JFormattedTextField txt_cnpj;
    private javax.swing.JTextField txt_ip;
    // End of variables declaration//GEN-END:variables

    private void carregaDados() {
        props = new PropertiesManager();
        txt_banco.setText(props.ler("diretorio"));
        txt_ip.setText(props.ler("ip"));
        txt_cnpj.setText(props.ler("cnpj"));
        cbx_tamanho.setSelectedIndex(Integer.parseInt(props.ler("etiqueta")));
        carregaLogo(props.ler("logo"));
    }

    private void validaCampos() {
        props = new PropertiesManager();
        if (txt_ip.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "IP inválido!");
            txt_ip.requestFocus();
        } else {
            if (txt_banco.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Banco inválido!");
                txt_banco.requestFocus();
            } else {
                if (txt_cnpj.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "CNPJ inválido!");
                    txt_cnpj.requestFocus();
                } else {
                    if (testaConexao(txt_ip.getText(), txt_banco.getText(), "SYSDBA", "masterkey") != null) {
                        status.setText("Conexão bem Sucedida!");
                    } else {
                        status.setText("Sem Conexão!");
                        JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!");
                    }
                }
            }
        }
    }

    private void gravaDadosConexao() {
        if (testaConexao(txt_ip.getText(), txt_banco.getText(), "SYSDBA", "masterkey") != null) {
            try {
                props = new PropertiesManager();
                props.altera("ip", txt_ip.getText());
                props.altera("diretorio", txt_banco.getText());
                props.altera("etiqueta", cbx_tamanho.getSelectedIndex() + "");
                if (!txt_cnpj.getText().replace(".", "").replace("/", "").replace("-", "").trim().isEmpty()) {
                    props.altera("cnpj", txt_cnpj.getText());
                }
                JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar os dados de conexão!\n" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Antes de gravar você precisa conseguir estabelecer conexão com o banco de dados!");
        }

    }

    private Statement testaConexao(String ip, String banco, String usuario, String senha) {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection(
                    "jdbc:firebirdsql://"
                    + ip + ":3050/" + banco,
                    usuario,
                    senha);
            st = con.createStatement();
            return st;
        } catch (Exception e) {
            return null;
        }
    }

    private void buscaImagem() {
        JFileChooser c = new JFileChooser();
        c.showOpenDialog(this);//abre o arquivo  
        File file = c.getSelectedFile();//abre o arquivo selecionado  
        Path path = Paths.get(file.getAbsolutePath());
        diretorio = path.toString();
        if (diretorio.endsWith(".FB")) {
            txt_banco.setText(diretorio.replace("\\", "/"));
        } else {
            JOptionPane.showMessageDialog(this, "Extenção do arquivo selecionado inválido!\n ");
        }
    }

    private void carregarCNPJ() {
        try {
            FiliaisDAO filiaisDAO = new FiliaisDAO();
            Mascaras.setMascaraCPF(txt_cnpj, filiaisDAO.getFirst().getCgc());
            txt_cnpj.setText(filiaisDAO.getFirst().getCgc());
            JOptionPane.showMessageDialog(null, "CNPJ localizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o CNPJ!");
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

}
