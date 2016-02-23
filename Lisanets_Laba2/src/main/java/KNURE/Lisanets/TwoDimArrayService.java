package KNURE.Lisanets;

import java.util.Arrays;

public class TwoDimArrayService {

	public static void main(String args[]){
		
		TwoDimArrayService twoDimArrayService = new TwoDimArrayService();
		int[][] matrix = new int[8][8];
		twoDimArrayService.fillArray(matrix);
		twoDimArrayService.demoArray(matrix);
		
	}
	
	public void fillArray(int[][] array){
	   int num ;
		for (int i = 0; i < array.length; i++){
			for (int k = 0; k < array[0].length; k++){
			if ((isEven(i) && isEven(k)) || (!isEven(i) && !isEven(k)) ){
				num = 1;
			}else {
				num = 0;
			}
				array[i][k] = num;
			}
		}
	}
	
	public void demoArray(int[][] array){
		for (int i = 0; i < array.length; i++){
			for (int k = 0; k < array[0].length; k++){
				System.out.print(array[i][k] + " "); 
			}
		  System.out.println();
		
		}
		
	}
	
	private boolean isEven(int num){
		if (num % 2 == 0){
			return true;
		}else{
		   return false;
		}
	}
	
}
