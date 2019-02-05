package com.sarthak.TestNG;

import java.util.ArrayList;
import java.util.Iterator;

public class Letter {
	public ArrayList<String> getCons(ArrayList<String> name){
		ArrayList<String> newList = new ArrayList<String>();
		for(int i=0;i<name.size();i++) {
			String words = name.get(i);
			for(int j=0;j<words.length()-1;j++) {
				if(words.charAt(j)==words.charAt(j+1)) {
					newList.add(words);
					break;
				}
			}
		}
		return newList;
	}
}
