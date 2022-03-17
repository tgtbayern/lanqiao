import java.util.LinkedList;
import java.util.Scanner;

public class head_tail_same {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value= scan.nextInt();
        boolean flag=true;
        while(flag){
            int ans=0;
            value++;
            String key=String.valueOf(value);
            char[] key1=key.toCharArray();
            for(int i=0;i<4;i++){
                if(key1[i]==key1[7-i]){
                    ans++;
                }
                else
                    break;
            }
            if(ans==4){
                flag=false;
            }

        }
        System.out.println(value);

        scan.close();
    }
}
