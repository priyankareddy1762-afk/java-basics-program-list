import java.util.*;
public class Check_pos_neg_zero{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       if(n>0){
        System.err.println("positive");
       }
       else if(n<0){
        System.out.println("negaitve");
       }
       else if(n==0){
        System.out.println("zero");
       }
       sc.close();
    }
}