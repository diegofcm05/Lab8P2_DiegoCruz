/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Evento {
    
    String estilo;
    int distancia;
    double record;

    public Evento(String estilo, int distancia, double record) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.record = record;
    }

    public Evento() {
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Evento: "+estilo+"-"+distancia+"-"+record;
    }
    
    
    
}
