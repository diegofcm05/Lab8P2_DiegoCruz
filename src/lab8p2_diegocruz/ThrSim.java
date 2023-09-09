/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegocruz;

import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author dfcm9
 */
public class ThrSim extends Thread{
    
    private Random rand = new Random();
    private JProgressBar pisci;
    private boolean avanzar;
    private boolean vive;

    public ThrSim(JProgressBar pisci) {
        this.pisci = pisci;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            pisci.setValue(pisci.getValue() + (1+rand.nextInt(7)));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
    
    
}
