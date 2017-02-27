package logicalQuestions;

import java.util.Arrays;

public class AnagramTest {


	public static void checkAnagram(String word,String anagram){
		
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagam= anagram.toCharArray();
		
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagam);
		
		System.out.println(charFromWord);
		System.out.println(charFromAnagam);
		if(Arrays.equals(charFromWord,charFromAnagam)){
			System.out.println("anagram");
		}else{
			System.out.println("not anagram");
		}
		
	}
	
	
	public static void main(String[] args){
		AnagramTest.checkAnagram("rajan", "anjra");
	}
	
	
}

