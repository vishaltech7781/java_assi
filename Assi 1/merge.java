import java.util.*;

public class merge{

    public static void merged(int[] arr1, int[] arr2, int[] c, int a, int b){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < a && j < b){
            if(arr1[i] < arr2[j]){
                c[k] = arr1[i];
                i++;
                k++;
            }
            else{
                c[k] = arr2[j];
                j++;
                k++;                
            }
        }

        while(i < a){
            c[k] = arr1[i];
            i++;
            k++;
        }

        while(j < b){
            c[k] = arr2[j];
            j++;
            k++;
        }




    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of arr1 : ");
        int a = scan.nextInt();
        int[] arr1 = new int[a];

        System.out.println("Enter the size of arr2 : ");
        int b = scan.nextInt();
        int[] arr2 = new int[b];

        int total = a+b;
        int[] c = new int[total];

        System.out.println("Enter elements for array 1 : ");
        for(int i = 0 ; i < a; i++){
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter elements for array 2 : ");
        for(int j = 0; j < b; j++){
            arr2[j] = scan.nextInt();
        }

        merged(arr1, arr2, c, a, b);

        System.out.print("Sorted array is : [ ");
        for(int i = 0; i < total ; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println("]");
    }
}