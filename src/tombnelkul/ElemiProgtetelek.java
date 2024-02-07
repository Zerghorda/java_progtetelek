package tombnelkul;

import java.util.Scanner;

public class ElemiProgtetelek {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //"Összegzés tétel:

        int n = -1;
        while (n < 0) {
            System.out.print("N =");
            n = sc.nextInt();
        }

        int ossz = 0;
        for (int i = 0; i < n + 1; i++) {
            ossz += i;
        }

        System.out.printf("Az első %d db szám összege: %d\n", n, ossz);
        //Megszámlálás téteél:
        int db = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0) {
                db++;
            }
        }
        System.out.printf("kétjegyü párosak száma: %d\n", db);
        int vege = 0;
        db = 0;
        int min = 2147483647;
        int szam;
        System.out.println(vege + "-ra/re kilép");
        while ((szam = sc.nextInt()) != vege) {
            if (szam < min) {
                min = szam;

            }
            db++;
        }
        System.out.printf("%d számból a leggkissebb: %d\n", db, min);
    }

}
