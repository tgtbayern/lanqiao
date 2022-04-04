import java.util.LinkedList;
import java.util.Scanner;

public class buildHouse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pointNumber=scan.nextInt();
        int highest= scan.nextInt();
        int limitNumber=scan.nextInt();
        LinkedList leftLimit=new LinkedList();
        LinkedList rightLimit=new LinkedList();
        LinkedList highestLimit=new LinkedList();
        int[] lastHigh=new int[pointNumber];
        int sum=0;
        for(int n=0;n<lastHigh.length;n++){
            lastHigh[n]=highest;
        }

        for(int i=0;i<limitNumber;i++){
            leftLimit.add(scan.nextInt());
            rightLimit.add(scan.nextInt());
            highestLimit.add(scan.nextInt());
        }
        while(!leftLimit.isEmpty()){
            for(int k = (int) leftLimit.getFirst();k<=(int)rightLimit.getFirst();k++){
                if((int)highestLimit.getFirst()<=lastHigh[k-1]){
                    lastHigh[k-1]=(int)highestLimit.getFirst();
                }
            }
            leftLimit.removeFirst();
            rightLimit.removeFirst();
            highestLimit.removeFirst();
        }
        for(int a=0;a<lastHigh.length;a++){
            sum=sum+lastHigh[a]*lastHigh[a];
        }
        System.out.print(sum);
    }
}
