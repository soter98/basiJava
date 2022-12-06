package Esercizi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DB_ES {

    private Connection conn;
    private Statement st;
    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basijava","root","");
            st = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean aggPren(int orainizio, int minutiinizio, int orafine, int minutifine, String idcliente){
        String msg;

        try {
            st.executeUpdate("INSERT INTO campo VALUES (null, '"+orainizio+ ":" +minutiinizio+"', '"+orafine+ ":" +minutifine+ "', '"+idcliente+"')");
            msg = "Squadra inserita con successo";
        } catch (SQLException e) {
            msg = "Errore nell'inserimento";
            throw new RuntimeException(e);
        }

        return true;

    }


    public boolean remPren(String orarioinizio, String orariofine, String idcliente){
        String msg;
        try {
            String query = "DELETE FROM campo where orarioInizio = '"+orarioinizio+"' , orarioFine = '"+orariofine+"' , idcliente = '"+idcliente+"'";
            st.executeUpdate(query);
            msg = "Prenotazione annullata con successo";
        } catch (SQLException e) {
            msg = "Errore nell'eliminazione";
            throw new RuntimeException(e);
        }

        return true;

    }


}
