package com.pbo;

public class Akatsuki {
    private String tujuan;
    private String costume;
    private String pemimpin;
    private String caraKerja;

    public String getTujuan() {
        return tujuan;
    }

    public String getCostume() {
        return costume;
    }

    public String getPemimpin() {
        return pemimpin;
    }

    public String getCaraKerja() {
        return caraKerja;
    }

    public Akatsuki(String tujuan, String costume, String pemimpin, String caraKerja) {
        this.tujuan = tujuan;
        this.costume = costume;
        this.pemimpin = pemimpin;
        this.caraKerja = caraKerja;
    }

    public void tampilAkatsuki(){
        System.out.println("===== Team Akatsuki =====");
        System.out.printf("Pemimpin\t: %s%n", pemimpin);
        System.out.printf("Tujuan\t\t: %s%n", tujuan);
        System.out.printf("Costume\t\t: %s%n", costume);
        System.out.printf("Cara Kerja\t: %s%n", caraKerja);
    }

}
