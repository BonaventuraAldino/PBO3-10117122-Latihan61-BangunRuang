/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan61.bangunruang;

/**
 *
 * @author Aldy Senda
 */
public class Bola implements BangunRuang{
    private double phi;
    private double jariJari;

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungVolume() {
        return (1.3333333333333333333*phi*jariJari*jariJari*jariJari); 
    }
    
    
}
