package numbertoarray;
import java.util.Arrays;
import java.util.Scanner;

public class NumberToArray {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
        int number;
        int length = 0;
        System.out.print("Array Oluşturulacak Sayıyı giriniz: ");
        number = input.nextInt();
        int tmp = number;
        
        
        while(tmp != 0)
        {
            tmp = tmp / 10;
            length++;
        }
        int[] array = new int[length];   //Length Sayesinde Basamak Sorunu Yaşanmaz(Limit Yok)
 
        for(int i = 0; i < length; i++) {
          int temp = number % 10; 
          array[length - i - 1] = temp;  //Yerleştirme İşlemi Burada Gerçekleşiyor
          number = number / 10;
        }
        System.out.println("Yeni oluşturulan array: " + (Arrays.toString(array)));   //Stringi Arraye Çevirme
        
    }

}
