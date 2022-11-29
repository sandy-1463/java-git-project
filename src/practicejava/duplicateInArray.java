package practicejava;

import java.util.ArrayList;

public class duplicateInArray {
	//this is duplicate
	public static void main(String[] args) {
		String[] s= {"java","python","java"};
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<s.length; i++) {
			int k=0;
			if(!al.contains(s[i])) {
				al.add(s[i]);
				k++;
				for(int j=i+1;j<s.length;j++) {
					if(s[i]==s[j]) {
						k++;
					}
					
				}
				if(k>1) 
				System.out.println(s[i]+" "+k+"  "+"times");
				else
					System.out.println(s[i]+" "+k+"  "+"time");
			}
			
			//second commit
		}
		
		
	}

}
