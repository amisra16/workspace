package com.practice.sortingexample;

import java.util.*;

public class CircularKilling {

	public ArrayList<Integer> cleanBodies(ArrayList<Integer> battleField) {
		System.out.println("Before Cleaning " + battleField);
		
		Iterator<Integer> i = battleField.iterator();
		while (i.hasNext()) {
			if(i.next() == 0) 
				i.remove();
		}
		System.out.println("After Cleaning " + battleField);
		return battleField;
	}
	
	public ArrayList<Integer> setBattleField(int size) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int n = 1; n <= size; n++) {
			al.add(n);
		}
		System.out.println("Field Set " + al);
		return al;
	}

	public static void main(String args[]) {
		CircularKilling circularKilling = new CircularKilling();
		// create an array list
		ArrayList<Integer> battleField = circularKilling.setBattleField(1000);

		int roundOfKilling = 1;

		for (int k = 0; k < battleField.size(); k++) {
			if ((k + 1) % 2 == 0) {
				battleField.set(k, 0);
			}
			if (k + 1 == battleField.size()) {
				System.out.println("Round of killing " + roundOfKilling);
				roundOfKilling = roundOfKilling + 1;
				if (battleField.get(k) == 0) {
					k = 0;
					System.out.println("Killing Last member");
					battleField = circularKilling.cleanBodies(battleField);
					System.out.println("People alive " + battleField.size());
				} else {
					k = 0;
					System.out.println("Last Member Killing first member");
					battleField.set(k, 0);
					battleField = circularKilling.cleanBodies(battleField);
					System.out.println("People alive " + battleField.size());
				}
			}
		}
		System.out.println("Contents of al: " + battleField);
	}
}