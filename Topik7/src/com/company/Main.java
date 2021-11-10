package com.company;

public class Main {

    public static void main(String[] args) {
        //obj departemen
	Departemen dpr = new Departemen("Logistik");

	//obj karyawana tetap
	Karyawan kry1 = new Tetap("Tina", 5000000, 3000000);
	Karyawan kry2 = new Tetap("Toni", 4500000, 3000000);

	//obj karyawan kontrak
	Karyawan kry3 = new Kontrak("Marni", 4000000, 180);
	Karyawan kry4 = new Kontrak("Mirna", 3500000, 150);

	//hgn dgn depaetemen
	dpr.addKaryawan(kry1);
	dpr.addKaryawan(kry2);
	dpr.addKaryawan(kry3);
	dpr.addKaryawan(kry4);

        System.out.println("Karyawan Tetap");
        dpr.displayTetap();

        System.out.println();
        System.out.println("Karyawan Kontrak");
        dpr.displayKontrak();

        System.out.println();
        System.out.println("Karyawan Keseluruhan");
        dpr.displayAll();
    }
}
