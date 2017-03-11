/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author AXIOO NEON HNM SE
 */
public class Orang {
    String nama;
    String jeniskelamin;
    int umur;
    
    public Orang(){
        this.nama = " ";
        this.jeniskelamin = " ";
        this.umur = 0;
    }
    
    public Orang(String nama, String jeniskelamin, int umur){
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public int getUmur() {
        return umur;
    }
    
    
}
