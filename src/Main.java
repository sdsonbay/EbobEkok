import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        number2 = scanner.nextInt();

        enKucukOrtakKat(number1, number2);
        enBuyukOrtakBolen(number1, number2);
    }

    public static void enKucukOrtakKat(int number1, int number2){
        int ekok = Integer.max(number1, number2);
        while(true){
            if(ekok % number1 == 0 && ekok % number2 == 0){
                break;
            }
            else{
                ekok++;
            }
        }
        System.out.println("EKOK: " + ekok);
    }
    public static void enBuyukOrtakBolen(int number1, int number2){
        int ebob = Integer.min(number1, number2);
        while(true){
            if(number1 % ebob == 0 && number2 % ebob == 0){
                break;
            }else{
                ebob--;
            }
        }
        System.out.println("EBOB: " + ebob);
    }
}
