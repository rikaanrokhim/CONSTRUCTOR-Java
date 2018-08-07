 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
class Bus {
//    deklarasi
    public String nama, warna, jenis, spek;
    public Integer berat, tinggi;
    
//    constructor
    public Bus() {
        
    }
    public Bus(String spek) {
        this.spek = spek;
    }
    public Bus(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
    public Bus(String nama, String jenis, String warna) {
        this.nama = nama;
        this.warna = warna;
        this.jenis = jenis;
    }
    public Bus(Integer berat, Integer tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }
    public Bus(String nama, String warna, String jenis, Integer berat, Integer tinggi) {
        this.nama =  nama;
        this.warna = warna;
        this.jenis = jenis;
        this.berat = berat;
        this.tinggi =  tinggi;
    }
//    setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setBerat(Integer berat) {
        this.berat = berat;
    }
    public void setTinggi(Integer tinggi) {
        this.tinggi = tinggi;
    }
    public void setSpek(String spek) {
        this.spek = spek;
    }
    
//    getter
    public String getNama() {
        return nama;
    }
    public String getSpek() {
        return spek;
    }
    public String getWarna() {
        return warna;
    }
    public String getJenis() {
        return jenis;
    }
    public Integer getBerat() {
        return berat;
    }
    public Integer getTinggi() {
        return tinggi;
    }
    
//    method tambahan
    public void bergerak() {
        System.out.println("Bus yang bernama " + nama + "bisa bergerak maju dan mundur");
    }
}
