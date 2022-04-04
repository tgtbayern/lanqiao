public class doorPlate {
   public static void main(String args[]){
       StringBuilder str= new StringBuilder();
       int position=0;
       int result=0;
       for(int i=0;i<2021;i++){
           str.append(i);
       }
       while(position!=-1){
         position= str.toString().indexOf('2',position+1);
         result++;
       }
       System.out.println(result-1);
   }
}
