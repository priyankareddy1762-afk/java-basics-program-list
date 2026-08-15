 import java.util.*;
public class Remove_duplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
         int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
         
        }
         System.out.println(i+1); 
        sc.close();

    }
} 
    

