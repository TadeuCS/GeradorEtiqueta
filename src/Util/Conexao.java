package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class Conexao {

    PropertiesManager prop;
    Connection con;
    Statement st;
    protected Query query;
    protected EntityManagerFactory emf;
    protected EntityManager em;

    public Conexao() {
        prop = new PropertiesManager();
        start();
    }

    private Map getParametros() {
        Map map = new HashMap();
        map.put("javax.persistence.jdbc.url", "jdbc:firebirdsql://" + prop.ler("ip") + ":3050/" + prop.ler("diretorio"));
        map.put("javax.persistence.jdbc.user", "SYSDBA");
        map.put("javax.persistence.jdbc.password", "masterkey");
        return map;
    }

    public Statement getConexao(String ip, String diretorio) {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection(
                    "jdbc:firebirdsql://" + ip + ":3050/" + diretorio,
                    "SYSDBA",
                    "masterkey");
            st = con.createStatement();
            return st;
        } catch (Exception e) {
            return null;
        }
    }

    private void start() {
        if (getConexao(prop.ler("ip"), prop.ler("diretorio")) != null) {
            emf = Persistence.createEntityManagerFactory("EtiquetaPU", getParametros());
            em = emf.createEntityManager();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados neste IP: " + prop.ler("ip"));
        }
    }
}
