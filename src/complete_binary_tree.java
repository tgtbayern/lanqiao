import java.util.Scanner;

public class complete_binary_tree {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int input1=scan.nextInt();
        double n=0;
        while(input1>Math.pow(2,n)-1)
            n++;
        int[] i=new int[(int)n];
        for(int a=0;a+1<=n;a++){
            if(a+1!=n)
                i[a]= (int) Math.pow(2, a+1)-1;
            else if(a+1==n){
                i[a]=input1;
            }
        }
        int c=0;
        long[] answer=new long[(int)n];
        for(int b=0;b<input1;b++){
            int input2=scan.nextInt();
            if(b<i[c]){
                answer[c]+=input2;
            }
            else{
                answer[c+1]+=input2;
                c++;
            }
        }
        int result=answer.length-1;
        long max=answer[answer.length-1];
        for(int e=answer.length;e>1;e--){
            if(max<= answer[e-1]){
                result=e-1;
                max=answer[e-1];
            }
        }
        System.out.println(result+1);
    }
}
