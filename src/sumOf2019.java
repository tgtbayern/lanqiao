import java.util.Scanner;

public class sumOf2019 {
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n= scan.nextInt();
    int k=0;
    int result=0;
    for(int i=0;i<=n;i++) {
        String str=String.valueOf(i);
        if(str.contains("2")||str.contains("0")||str.contains("1")||str.contains("9")) {
            result+=i;
            }
        }
    System.out.println(result);
    }
}
