package com.company;

public class Kontrak extends Karyawan{
    private int waktu;

    public Kontrak(String nama, double gaDas, int waktu) {
        super(nama, gaDas);
        this.waktu = waktu;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Waktu = " +waktu);
    }
}
