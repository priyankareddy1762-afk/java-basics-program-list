import java.util.*;
public class Second_largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int secondlargest=-1;
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);
        
        sc.close();

    }
}