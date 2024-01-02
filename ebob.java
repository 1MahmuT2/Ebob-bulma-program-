import java.util.Scanner;

public class ebob {

    public static int ebobBulma(int sayi1, int sayi2){

        int ebob=1;
        for(int i= 1; (i<sayi1)&&(i<sayi2);i++){
            if((sayi1%i==0)&&(sayi2%i==0)){
                ebob=i;
         
            }
            
        }
       return ebob;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ebob bulma programına hoşgeldiniz.");
        System.out.print("1.Sayı= ");
        int sayi1 = input.nextInt();
        System.out.print("2.Sayı= ");
        int sayi2= input.nextInt();

        System.out.println("2 Sayının ebobu = "+ebobBulma(sayi1, sayi2));

        
    }
}
