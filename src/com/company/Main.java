package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uch burchtuktun uzundugun, biyiktigin jana shirinasyn beriniz:");
        Triangle triangle = new Triangle();
        triangle.a = scanner.nextDouble();
        triangle.b = scanner.nextDouble();
        triangle.c = scanner.nextDouble();
        triangle.getarea();


        

//       Phone telefon = new Phone();
 //      telefondun aty = "Iphone"
//       telefon.pamyat = 128;
//       System.out.println("telefondun aty: "+telefon.model +"\ntelefon baasy: "+ telefon.baasy+ " \ntelefon pamyaty: "+telefon.pamyat);
//       Java3 java =  new Java3();
//        Cat myshyk = new Cat();
//        Kompiuter komp = new Kompiuter();
//        komp.model = "Asus";
//        komp.operPamyat = 8;
//        komp.ekranRazmer = 14;
//        System.out.println("komptun aty: "+komp.model +"\nkomptun pamyaty: "+ komp.operPamyat+ " \nekran razmeri: "+komp.ekranRazmer);



    }
}
