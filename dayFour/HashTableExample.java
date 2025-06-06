package com.Training.dayFour;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> hash = new Hashtable<String,String>();
		hash.put("AṢ", "Car");
		hash.put("2", "Auto");
		hash.put("Z", "CarCB");
		hash.put("4", "Saxophone");
		
		//for(String s: hash.return());//
		//for(String s: hash.values());
		//for(String s: hash.keys()); ????????????
		
		//try using iterator of Map.Entry
		for(Map.Entry<String, String> map : hash.entrySet()) {
			String key = map.getKey();
			String value = map.getValue();
			System.out.println(key + ":" + value);
		}
	}

}
