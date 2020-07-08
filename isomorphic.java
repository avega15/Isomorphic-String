
import java.util.*; 


public class isomorphic{
	public static void main(String[] args) {
	
		//Just test cases. First one passes and second fails
		String first = "css";
		String second = "dll";
		
		System.out.println("Strings " + first + " and " + second);

		if(isIsomorphic(first, second) == true){
			System.out.println("are isomorphic");
		}else{
			System.out.println("are not isomorphic");
		}
		System.out.println();
		
		String third = "caa";
		String fourth = "poy";
		
		System.out.println("Strings " + third + " and " + fourth);

		if(isIsomorphic(third, fourth) == true){
			System.out.println("are isomorphic");
		}else{
			System.out.println("are not isomorphic");
		}
		
		
		
	}

	public static boolean isIsomorphic(String input1, String input2) {
		//We figure out if two strings are isomorphic by using a hashmap.
		//Keep count of each letter and check if both hashmaps are the same.
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		//Populates both hashmaps
		for(int i = 0; i < input1.length(); i++){
			if(map1.containsKey(input1.charAt(i))){
				map1.put(input1.charAt(i), map1.get(input1.charAt(i)) + 1);
			}else{
				map1.put(input1.charAt(i), 1);
			}
			
			if(map2.containsKey(input2.charAt(i))){
				map2.put(input2.charAt(i), map2.get(input2.charAt(i)) + 1);
			}else{
				map2.put(input2.charAt(i), 1);
			}
		}
		
		//Checks count of each item in hashmaps.
		//If there isn't a match then it is not isomorphic.
		for(int i = 0; i < input1.length(); i++){
			if(map1.get(input1.charAt(i)) != map2.get(input2.charAt(i))){
				return false;
			}
		}
		return true;
	}
}
