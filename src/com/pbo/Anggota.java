package com.pbo;

public class Anggota {
    private String nama;
    private String asal;
    private String senjata;
    private String kemampuan;
    private String cincin;
    private String partner;
    private String status;

    public Anggota(String nama, String asal, String senjata, String kemampuan, String cincin, String partner, String status) {
        this.nama = nama;
        this.asal = asal;
        this.senjata = senjata;
        this.kemampuan = kemampuan;
        this.cincin = cincin;
        this.partner = partner;
        this.status = status;
    }

    public void tampilAnggota(){
        System.out.printf("Nama\t\t\t: %s%n", nama);
        System.out.printf("Asal\t\t\t: %s%n", asal);
        System.out.printf("Senjata\t\t\t: %s%n", senjata);
        System.out.printf("Kemampuan\t\t: %s%n", kemampuan);
        System.out.printf("Cincin\t\t\t: %s%n", cincin);
        System.out.printf("Partner\t\t\t: %s%n", partner);
        System.out.printf("Status\t\t\t: %s%n%n", status);
    }
}
