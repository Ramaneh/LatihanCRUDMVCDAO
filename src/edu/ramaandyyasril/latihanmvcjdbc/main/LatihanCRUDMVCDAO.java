 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ramaandyyasril.latihanmvcjdbc.main;

import edu.ramaandyyasril.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.ramaandyyasril.latihanmvcjdbc.entity.Pelanggan;
import edu.ramaandyyasril.latihanmvcjdbc.error.PelangganException;
import edu.ramaandyyasril.latihanmvcjdbc.service.PelangganDao;
import edu.ramaandyyasril.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS X
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
     
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        });
        
    }
    
}
