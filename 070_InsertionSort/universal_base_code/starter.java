import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
InsertionSort(arr1);			//Create this method
		System.out.println();
		System.out.println();	
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*10)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void InsertionSort(ArrayList<Integer> arr){
	int inner;
	int outer;
	int key;
	for(outer = 0; outer<arr.size(); outer++){
	key =arr.get(outer);
	inner = outer-1;
	while(inner >=0&&arr.get(inner)>key){
		arr.set(inner+1,arr.get(inner));
		inner = inner-1;
	}
	arr.set(inner+1,key);
	}
		
	}
		
	}