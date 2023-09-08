/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegocruz;

import javax.swing.JProgressBar;

/**
 *
 * @author dfcm9
 */
public class ThrSim extends Thread{
    
    private JProgressBar pisci;
    private boolean vive;

    public ThrSim(JProgressBar pisci) {
        this.pisci = pisci;
        vive = true;
    }


    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }
    
    
}
