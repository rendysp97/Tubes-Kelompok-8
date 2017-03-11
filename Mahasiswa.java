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
public class Mahasiswa {
    String nim;
    String kelas;
    String angkatan;
    String status;
    
    public Mahasiswa(){
        this.nim = " ";
        this.kelas = " ";
        this.angkatan = " ";
        this.status = " ";
    }
    
    public Mahasiswa(String nim, String kelas, String angkatan, String status){
        this.nim = nim;
        this.kelas = kelas;
        this.angkatan = angkatan;
        this.status = status;
        
    }
    
    public void createTA(){
        String judul;
    }

    public String getKelas() {
        return kelas;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
