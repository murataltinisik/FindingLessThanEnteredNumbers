import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int n;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Bir Sayı Giriniz: ");
        n = sc.nextInt();

        // RESULT
        if(n > 0){
            for(int i=1; i<=n; i*=4){
                System.out.println("4'ün Katları: " + i);
            }

            System.out.println("-------------------------------");

            for(int j=1; j<=n; j*=5){
                System.out.println("5'in Katları: " + j);
            }
        }else{
            System.err.println("Girilen Sayı 0'dan Büyük Olmalıdır!!!");
        }

    }
}
