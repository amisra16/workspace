package com.practice.stringoperations;

import java.util.Arrays;

public class TestCandidate {

	public static void main(String[] args) {
		String str = "A boat is ailing";
	     String[] words = str.split(" ");
	     Arrays.sort(words);
	     
	     for(String word:words)
	      {
	          System.out.print(word+" ");
	      }

	}

}
