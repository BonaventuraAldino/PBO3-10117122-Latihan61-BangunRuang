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
public class Kerucut implements BangunRuang{
    private double phi;
    private double jariJari;
    private double tinggi;

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

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return ((0.3333333333333333)*(phi)*(jariJari*jariJari)*(tinggi));
    }
}
