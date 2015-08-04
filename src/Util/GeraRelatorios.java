package Util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class GeraRelatorios {

    public String getDiretorio(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        return arquivo.getAbsolutePath();
    }

    public void imprimirRelatorioSQLNoRelatorio(Map parametros, String diretorio) {
        Connection conn = null;
        try {
            // Carrega conexão via JDBC
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            PropertiesManager prop= new PropertiesManager();
            conn = DriverManager.getConnection("jdbc:firebirdsql://"+prop.ler("ip")+":3050/"+prop.ler("diretorio"), "SYSDBA", "masterkey");
            // Preenche o relatório com os dados
            JasperPrint print = JasperFillManager.fillReport(diretorio, parametros, conn);

            // Exibe visualização dos dados
            JasperViewer.viewReport(print, false);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar a classe responsável pela geração do relatório!\n" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta no Banco de dados!\n" + ex.getMessage());
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório!\n" + ex.getMessage());
        }catch(NoResultException e){
            System.out.println("vazio");
        }finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o Banco de Dados.");
            }
        }
    }
}
