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
public class Dosen {
    String kodedosen;
    String nip;
    String status;
    String[] topikTA;
    
    public Dosen(){
        this.kodedosen = " ";
        this.nip = " ";
        this.status = " ";
    }
    
    public Dosen(String kodedosen, String nip, String status){
        this.kodedosen = kodedosen;
        this.nip = nip;
        this.status = status;
    }
    
    public void createKelompokTA(KelompokTA topikTA){
        
    }

    public String getKodedosen() {
        return kodedosen;
    }

    public String getNip() {
        return nip;
    }
    
    
}
