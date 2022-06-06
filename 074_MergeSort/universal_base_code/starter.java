import pkg.*;
import java.util.*;


class starter {

	
	
	public static void mergeSort(int [] A, int first, int last){
	if(A.length()<2){
			return;
		}
		int mid = first+ (last-1)/2;
		mergeSort(A, first, mid);
		mergeSort(A, mid, last);
		sort(A, first, mid, last);
	}
	
	public static int sort(int [] A, int first, int mid, int last){
	
	for(int x = 0; (last-first)>x; x++){
		for(){
			
		}
	}
	}
	
	public static void main(String args[]) {
		
		
	}
}
