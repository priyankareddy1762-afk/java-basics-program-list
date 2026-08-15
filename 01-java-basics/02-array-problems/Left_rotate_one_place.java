import java.util.*;
public class Left_rotate_one_place {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
         int temp=arr[0];
         for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
         }
         arr[n-1]=temp;
         for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
         }
        sc.close();

    }
    
}
