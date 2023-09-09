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
    private ThrSim x;
    private ThrSim y;
    private ThrSim z;
    private String est;
    private int dist;
    private double rec;
    private Nadador a;
    private Nadador b;
    private Nadador c;
    
    private boolean avanzar;
    private boolean vive;
    private boolean acabo;
    
    public Thrchecker(JProgressBar pbnad1, JProgressBar pbnad2, JProgressBar pbnad3, ThrSim x, ThrSim y, ThrSim z, String est, int dist, double rec, Nadador a, Nadador b, Nadador c) {
        this.pbnad1 = pbnad1;
        this.pbnad2 = pbnad2;
        this.pbnad3 = pbnad3;
        this.x =x;
        this.y =y;
        this.z =z;
        this.est = est;
        this.dist = dist;
        this.rec = rec;
        this.a = a;
        this.b = b;
        this.c = c;
        
        
        
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
                
                x.stop();
                y.stop();
                z.stop();
                
                JOptionPane.showMessageDialog(null,"Tenemos un ganador!");
                int valor = Math.max(pbnad1.getValue(), pbnad2.getValue());
                valor = Math.max(valor, pbnad2.getValue());
                if (valor == pbnad1.getValue()){
                    JOptionPane.showMessageDialog(null, "Evento:\nEstilo:"+est+"\nDistancia:"+dist+"\nRecord: "+rec+"\nGanador: "+a.getNombre());
                }
                else if (valor == pbnad2.getValue()){
                    JOptionPane.showMessageDialog(null, "Evento:\nEstilo:"+est+"\nDistancia:"+dist+"\nRecord: "+rec+"\nGanador: "+b.getNombre());
                }
                else if (valor == pbnad3.getValue()){
                    JOptionPane.showMessageDialog(null, "Evento:\nEstilo:"+est+"\nDistancia:"+dist+"\nRecord: "+rec+"\nGanador: "+c.getNombre());
                    
                }
                
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
