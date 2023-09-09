/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegocruz;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author dfcm9
 */
public class Thrchecker extends Thread{
    
    private JProgressBar pbnad1;
    private JProgressBar pbnad2;
    private JProgressBar pbnad3;
    private boolean avanzar;
    private boolean vive;
    private boolean acabo;
    
    public Thrchecker(JProgressBar pbnad1, JProgressBar pbnad2, JProgressBar pbnad3) {
        this.pbnad1 = pbnad1;
        this.pbnad2 = pbnad2;
        this.pbnad3 = pbnad3;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getPbnad1() {
        return pbnad1;
    }

    public void setPbnad1(JProgressBar pbnad1) {
        this.pbnad1 = pbnad1;
    }

    public JProgressBar getPbnad2() {
        return pbnad2;
    }

    public void setPbnad2(JProgressBar pbnad2) {
        this.pbnad2 = pbnad2;
    }

    public JProgressBar getPbnad3() {
        return pbnad3;
    }

    public void setPbnad3(JProgressBar pbnad3) {
        this.pbnad3 = pbnad3;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAcabo() {
        return acabo;
    }

    public void setAcabo(boolean acabo) {
        this.acabo = acabo;
    }
    
    
    

    @Override
    public void run() {
        while (vive) {
            if ( pbnad1.getValue() == 100 || pbnad2.getValue() == 100 || pbnad3.getValue() == 100){
                acabo = true;
                JOptionPane.showMessageDialog(null,"Tenemos un ganador!");
                vive = false;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
    
}
