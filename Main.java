//Muhammad Mi'raj Rizky
//123200080
package tugas_123200080;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 
        int pengulangan=0;
        int pilih = 0;
        System.out.println("+===========================+"
                + "\n| PROGRAM KONVERSI SUHU AIR |"
                + "\n+===========================+"
                + "\nInput Data"
                + "\n----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        float celcius = 0;
        celcius = input.nextFloat();
        while(pengulangan != 3){
        System.out.println("\n\nMenu"
                + "\n----"
                + "\n1. Lihat Data Konversi"
                + "\n2. Edit Data Konversi"
                + "\n3. Exit");
        System.out.print("pilih\t: ");
        pilih = input.nextInt();
        switch(pilih){
            case 1 :
                Konversi knvs = new Konversi(celcius);
                String kondisiAir;
                System.out.println("Suhu Dalam Celcius\t: " + celcius);
                System.out.println("Suhu Dalam Fahrenhait\t: " + knvs.fahrenheit());
                System.out.println("Suhu Dalam Reamur\t: " + knvs.reamur());
                System.out.println("Suhu Dalam Kelvin\t: " + knvs.kelvin());
                if(celcius>=100){
                    kondisiAir = "Didih";
                }
                else if(celcius<=0){
                    kondisiAir = "Beku";
                }
                else{
                    kondisiAir = "Normal";
                }
                System.out.println("Kondisi Air " + kondisiAir);
                break;
            case 2 :
                System.out.println("Input Data"
                        + "----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                celcius = input.nextFloat();
                break;
            case 3 :
                pengulangan = 3;
                break;
        }
        }
    }
}
