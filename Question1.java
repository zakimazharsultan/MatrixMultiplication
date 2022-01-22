/*
Name : Zaki Bin Mazhar Sultan
Reg # : SP21-BCS-098
Class Assignment 03
Question 1 : Multiplication of 2 Matrices
*/

import java.util.Scanner;

public class Question1{
		static Scanner obj = new Scanner(System.in);
	public static void main(String[] args){
		// getting inputs for rows and columns of two matrices
		System.out.print("Enter number of rows of first matrix: ");
		int r1 = obj.nextInt();
		System.out.print("Enter number of columns of first matrix: ");
		int c1 = obj.nextInt();
		System.out.print("Enter number of rows of second matrix: ");
		int r2 = obj.nextInt();
		System.out.print("Enter number of coumns of second matrix: ");
		int c2 = obj.nextInt();

		System.out.println();  // for one line space

		// declaring matrices
		int[][] matrix1 = new int[r1][c1]; 
		int[][] matrix2 = new int[r2][c2];

		// initializing using method
		System.out.println("First Matrix");
		int[][] m1 = getInput(matrix1);
		System.out.println("Second Matrix");
		int[][] m2 = getInput(matrix2);

		// printing both matrices
		System.out.println("First Matrix");
		printMatrix(m1);
		System.out.println("Second Matrix");
		printMatrix(m2);

		System.out.println();

		// checking if matrices can multiply and printing msg accordingly
		if(c1==r2){
			System.out.println("The matrices will multiply");
			int[][] newMatrix = new int[r1][c2];           // if matrices can multiply a new matrix is created 
			int[][] m3 = multiplication(m1,m2,newMatrix);   // using method to get result
			System.out.println("The resulted matrix");      // printing resulted matrix
			printMatrix(m3); 
		}
		else
			System.out.println("Sorry... The matrices cannot multiply");

	}

// this method is used for getting input for matrix from user
	public static int[][] getInput(int[][] matrix){
		
		for(int i=0 ; i<matrix.length ; i++){
			for(int j=0 ; j<matrix[i].length ; j++){
				System.out.print("Enter number at row "+i+" column "+j+ " : ");
				matrix[i][j] = obj.nextInt();
			}
			System.out.println();
		}
		return matrix;

	}

// this method is used for printing a matrix
	public static void printMatrix(int[][] matrix){

		for(int i=0 ; i<matrix.length ;i++){
			for(int j=0 ; j<matrix[i].length ; j++)
				System.out.print(matrix[i][j] + "  ");

			System.out.println();
		}	
	}

// this method will multiply both matrices
	public static int[][] multiplication(int[][] matrix1, int[][] matrix2, int[][] matrix3){
		int sum=0;
		for(int i=0 ; i<matrix3.length ; i++){
			for(int j=0 ; j< matrix3[i].length ; j++){
				sum = 0;
				for(int k=0 ; k<matrix1[i].length ; k++){
					sum +=  (matrix1[i][k] * matrix2[k][j]);
				}

				matrix3[i][j] = sum;
			}
			System.out.println();
		}

		return matrix3;
	}	
}