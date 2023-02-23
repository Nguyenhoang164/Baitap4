import java.util.Scanner;

public class THungdungchuyendoinhietdo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C;
        double F;
        System.out.print("List menu :" + "\n");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        int Luachon = input.nextInt();
        if (Luachon > 3) {
            System.out.print("Khong co ket qua ");
        } else {
            do {
                switch (Luachon) {
                    case 1: {
                        System.out.println(" Tien hanh chuyen doi don vi tu F sang C");
                        System.out.print(" Nhap du lieu  : ");
                        F = input.nextDouble();
                        System.out.print(ChuyendoiFsangC(F));
                    }
                    case 2: {
                        System.out.println(" Tien hanh chuyen doi don vi tu C sang F");
                        System.out.print(" Nhap du lieu  : ");
                        C = input.nextDouble();
                        System.out.print(ChuyendoiFsangC(C));
                    }
                }

            } while (Luachon != 0);

        }
    }
    public static double ChuyendoiCsangF(double C){
        double F = (9.0 / 5) * C + 32;
        return F ;
    }
    public static double ChuyendoiFsangC(double F){
        double C =  (5.0 / 9) * (F - 32);
        return C ;
    }
}
