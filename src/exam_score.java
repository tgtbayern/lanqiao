import java.util.Scanner;

public class exam_score {
    public static void main(String[] args) {
        double pass=0;
        double good=0;
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++) {
            int a = scan.nextInt();
            if (a >= 60) {
                pass++;
                if (a >= 85)
                    good++;
            }
        }
        scan.close();
        System.out.println((int)Math.rint(pass/n*100)+"%");
        System.out.println((int)Math.rint(good/n*100)+"%");
    }

}
