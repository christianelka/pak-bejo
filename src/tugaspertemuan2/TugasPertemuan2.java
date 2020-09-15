/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan2;

/**
 *
 * @author Christian Anelka
 */
public class TugasPertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Instansiasi -> Proses Membuat Obyek */

        /*Keramik A*/
        Keramik kA = new Keramik();
        kA.panjang = 30;
        kA.lebar = 30;
        kA.isi = 10;
        kA.harga = 54000;
        kA.hitungKeramik();
        kA.hitungTotalBox();
        kA.hitungHargaTotal();

        /*Keramik B*/
        Keramik kB = new Keramik();
        kB.panjang = 40;
        kB.lebar = 40;
        kB.isi = 5;
        kB.harga = 65000;
        kB.hitungKeramik();
        kB.hitungTotalBox();
        kB.hitungHargaTotal();
        
        /*Keramik C*/
        Keramik kC = new Keramik();
        kC.panjang = 30;
        kC.lebar = 40;
        kC.isi = 8;
        kC.harga = 60000;
        kC.hitungKeramik();
        kC.hitungTotalBox();
        kC.hitungHargaTotal();        
    }
    
}
