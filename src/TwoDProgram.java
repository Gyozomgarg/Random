import java.util.*;

public class TwoDProgram {
	public static void main(String[] args){
		int rows1, columns1, rows2, columns2;
		Scanner input = new Scanner(System.in);
		int userSelect;
		
		do{
		System.out.println("Please enter a positive number of rows for Matrix 1");
		rows1 = input.nextInt();
		} while (rows1 <0);
		
		do{
		System.out.println("Please enter a positive number of columns for Matrix 1");
		columns1 = input.nextInt();
		} while (columns1 <0);

		do{
		System.out.println("Please enter a positive number of rows for Matrix 2");
		rows2 = input.nextInt();
		} while (rows2 <0);
		
		do{
		System.out.println("Please enter a positive number of columns for Matrix 2");
		columns2 = input.nextInt();
		} while (columns2 <0);
				
		if (rows1 != rows2 || columns1 != columns2){
			System.out.println("# of rows and columns need to be equal for both Matrices");
			System.exit(0);
		}
		
		double[][] matrix1 = new double [rows1][columns1];
		double[][] matrix2 = new double [rows2][columns2];
		
		for(int i =0; i<matrix1.length;i++){
			for(int j=0; j<matrix1[0].length;j++){
				System.out.println("Please enter a value for matrix1["+i+"] ["+j+"]"); 
				matrix1[i][j]=input.nextDouble();
			}
		}
		
		for(int i =0; i<matrix2.length;i++){
			for(int j=0; j<matrix2[0].length;j++){
				System.out.println("Please enter a value for matrix2["+i+"] ["+j+"]"); 
				matrix2[i][j]=input.nextDouble();
			}
		}		
		
		do{
			System.out.println("Please enter 1 for Addition, 2 for Subtraction, 3 for multiplication, or 4 to quit.");
			userSelect = input.nextInt();
			if(userSelect == 1){
				System.out.println("Resulting Array: ");
				for(int i = 0; i<matrix1.length; i++){
					for(int j = 0; j<matrix1[0].length; j++){
						System.out.print(matrix1[i][j]+matrix2[i][j] + " ");
					}
				System.out.println("");
				}
			}
			if(userSelect == 2){
				System.out.println("Resulting Array: ");
				for(int i = 0; i<matrix1.length; i++){
					for(int j = 0; j<matrix1[0].length; j++){
						System.out.print(matrix1[i][j]-matrix2[i][j] + " ");
					}
				System.out.println("");
				}	
			}
			if(userSelect == 3){
				System.out.println("Resulting Array: ");
				for(int i = 0; i<matrix1.length; i++){
					for(int j = 0; j<matrix1[0].length; j++){
						System.out.print(matrix1[i][j]*matrix2[i][j] + " ");
					}
				System.out.println("");
				}					
			}
			if (userSelect != 1  && userSelect != 2 && userSelect != 3 && userSelect !=4){
				System.out.println("Please try again");
				continue;
			}
		
		
		}while (userSelect != 4);
		
		System.out.println("The program will now terminate");
		input.close();
		System.exit(0);	
	}//end main
}//end class
