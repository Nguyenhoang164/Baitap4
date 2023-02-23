import java.util.Scanner;

public class Thtimgiatrinhonhattrongmang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1;
        System.out.print("Nhap do dai mang");
        int size = input.nextInt();
       array1 = new int[size];
        System.out.println("Nhap phan tu mang" + "\n");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Phan tu " + (i + 1) + " : ");
            array1[i] = input.nextInt();
        }
        int index = minValue(array1);
        System.out.print("Phan tu nho nhat trong mang la :" + array1[index]);
    }
    public static int minValue(int [] array1){
            int index = 0 ;
            for (int i = 0 ; i < array1.length ; i ++){
                if (array1[i] < array1[index]){
                    index = i;
                }
            }
            return index;
        }
    }

