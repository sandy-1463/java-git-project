package practicejava;

import java.util.HashMap;
import java.util.Set;
//charcter
public class CharactersInString {

	public static void main(String[] args) {
		String s="sandeep";
		char[] chars=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<>();
		for(Character ch:chars) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		for(Character key:hm.keySet()) {
			System.out.println(key+ "  "+hm.get(key));
		}
		
	}

}
