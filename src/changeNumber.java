
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class changeNumber {
    public static void main (String[] args){
        boolean flag=true;
        int[] function=new int[9];
        Scanner scan = new Scanner(System.in);
        String temp=scan.next();
        char[] temp2=temp.toCharArray();
        Character[] temp3=new Character[temp2.length];
        for(int k=0;k<temp2.length;k++){
            temp3[k]=temp2[k];
        }
        int[] input=new int[temp3.length];
        for(int k=0;k<temp3.length;k++){
            input[k]=getNumericValue((int)temp3[k]);
        }
        for(int b=0;b<9;b++){
            function[b]=scan.nextInt();
        }
        for(int n=0;n<input.length;n++){
            if(function[input[n]-1]>input[n]){
                input[n]=function[input[n]-1];
                flag=false;
            }else if(function[input[n]-1]<input[n]&&!flag)
                break;
            else if(function[input[n]-1]==input[n]&&!flag){
                input[n]=function[input[n]-1];
                flag=false;
            }else if(function[input[n]-1]==input[n]&&flag){
                flag=true;
            }
        }
        for(int c=0;c<input.length;c++){
            System.out.print(input[c]);
        }
    }
}
