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
public class Keramik {
    /* Membuat Atribut */
    int luas = 1000000, panjang, lebar, isi, harga;
    
    /* Membuat Method*/
    void hitungKeramik(){
        int Keramik;
        Keramik = (this.luas / (this.panjang * this.lebar));
        System.out.println("Jumlah Keramik Yang Dibutuhkan: " + Keramik + " buah");
    }
    
    void hitungTotalBox(){
        int totalBox;
        totalBox = (this.luas / (this.panjang * this.lebar)) / this.isi;
        System.out.println("Jumlah Box Yang Dibutuhkan: " + totalBox + " box");
    }
    
    void hitungHargaTotal(){
        int hargaTotal;
        hargaTotal = ((this.luas / (this.panjang * this.lebar)) / this.isi) * this.harga;
        System.out.println("Total Harga: Rp " + hargaTotal);
    }
}
