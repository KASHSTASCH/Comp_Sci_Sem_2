import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public void 3mergeSort(int [] A, int []B, int [] C){
	int a = 0;
	int b = 0;
for(int x = 0; (A.length()+B.length()>x; x++){
	if(A[a]>B[b]){
	C[x] = B[b];
	b++;
	} else if(A[a]<B[b]){
	C[x] = A[a];
	a++;
	}
}

	}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public void mergeSort(int [] A, int first, int last){
	int[] A1 = new int[A.length()/2];
	int[] A2 = new int[A.length()-A.length()/2];
	int temp;
	for(int x = 0; x<A.length()/2; x++){
		if(x<A.length()/2){
		A[x] =A1[x];
		}else{
			A[x] = A2[x];
		}
	}
	for(x=0; x<A1.length()/2;x++){
		for(int y = 0; y<A1.length()/2-x; y++){
		if(A1[y]>A1[y+1]){
			A1[y] = temp;
			A1[y] = A1[y+1];
			A1[y+1] = A1[y];
		}	
		}
	}	
	for(x=0; x<A2.length()-A2.length()/2;x++){
		for(int y = 0; y<A2.length()-A2.length()/2-x; y++){
		if(A2[y]>A2[y+1]){
			A2[y] = temp;
			A2[y] =A2[y+1];
			A2[y+1] = A2[y];
		}	
		}
	}
	
	
	}
	

	public static void main(String args[]) {

		
	}
	
}
