package com.company;

public class Tetap extends Karyawan{
    private double tuDas;

    public Tetap(String nama, double gaDas, double tuDas) {
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tunjangan Dasar = " + tuDas);
    }
}
