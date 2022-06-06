import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*100));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void removeDup (ArrayList<Integer> arr){
		System.out.println();
			System.out.println("the");
				System.out.println("poop");
	for(int x = 0; arr.size()>x; x++){
		for(int penis=0; x>penis; penis++){
		if(arr.get(penis)==arr.get(x)){
			arr.remove(penis);
		}
	
	}

	}
	}
	
	}

