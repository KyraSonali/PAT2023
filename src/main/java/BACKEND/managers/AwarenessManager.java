/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.managers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyra Balliram
 */
public class AwarenessManager {
    
    
       public void OpenWebsite(String url) {
        Process p;
        try {
            p = Runtime.getRuntime().exec("cmd /c start " + url);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex);
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
       
       
    
}
