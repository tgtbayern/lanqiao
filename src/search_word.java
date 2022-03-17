import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class search_word {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char[] Array=scan.next().toCharArray();
        int[] num=new int[26];
        for(int i=0;i<Array.length;i++){
            switch (Array[i]){
                case 'a':
                    num[0]++;
                    break;
                case 'b':
                    num[1]++;
                    break;
                case 'c':
                    num[2]++;
                    break;
                case 'd':
                    num[3]++;
                    break;
                case 'e':
                    num[4]++;
                    break;
                case 'f':
                    num[5]++;
                    break;
                case 'g':
                    num[6]++;
                    break;
                case 'h':
                    num[7]++;
                    break;
                case 'i':
                    num[8]++;
                    break;
                case 'j':
                    num[9]++;
                    break;
                case 'k':
                    num[10]++;
                    break;
                case 'l':
                    num[11]++;
                    break;
                case 'm':
                    num[12]++;
                    break;
                case 'n':
                    num[13]++;
                    break;
                case 'o':
                    num[14]++;
                    break;
                case 'p':
                    num[15]++;
                    break;
                case 'q':
                    num[16]++;
                    break;
                case 'r':
                    num[17]++;
                    break;
                case 's':
                    num[18]++;
                    break;
                case 't':
                    num[19]++;
                    break;
                case 'u':
                    num[20]++;
                    break;
                case 'v':
                    num[21]++;
                    break;
                case 'w':
                    num[22]++;
                    break;
                case 'x':
                    num[23]++;
                    break;
                case 'y':
                    num[24]++;
                    break;
                case 'z':
                    num[25]++;
                    break;

            }
        }
        int result=num[0];
        int number=0;
        for(int i=0;i<num.length;i++){
            System.out.println("The " + i + " , " + num[i]);
            if(num[i]>result){
                result=num[i];
                number=i;
            }
        }
        System.out.println((char)(number+97));
        System.out.println(result);

    }
}
