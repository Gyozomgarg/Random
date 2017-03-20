import java.util.*;

public class NewClass {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[4];
        int[] array2 = {1,2,3,4,5};
        int[][] array3 = new int[1][1];
        int[][] array4 = {{1,0,4,5},{1,0,4,5}};
        
        for(int i =0; i<array1.length;i++){
            System.out.printf("Please enter an integer value for [%d]:\n ", i);
            //System.out.println("Please Enter an integer value for"+"["+i+"]");
            array1[i] = input.nextInt();          
        }
        Arrays.sort(array1);
        System.out.println("The sorted array is" + Arrays.toString(array1));
        
        
    }
    
}