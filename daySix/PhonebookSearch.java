package com.Daily.Task4;

import java.util.HashMap;
import java.util.Map;

public class PhonebookSearch {
public void searchByName(Map<String,String> dir, String name) {
	String a = dir.get(name);
	if(null!=a) {
		System.out.println("Name: "+name+" Phone: "+ a);
	}
	else {
		System.out.println("Not found");
	}
}
public void searchByPhone(Map<String,String> dir, String phone) {
	for(Map.Entry<String,String> entry : dir.entrySet()) {
		if (entry.getValue().equals(phone)){
			System.err.println("Name: "+entry.getKey()+ " Value: "+ phone);
			return;
		}
		
	}
	System.out.println("Not found");
	
}
public static void main(String[] args) {
	Map<String,String> phone = new HashMap<>();
	phone.put("Neilalohithan", "9841741858");
	phone.put("Dhuvaraka", "9880098369");
	phone.put("Skibidi", "1234123423");
	String name = "Skibidi";
	String name2 = "Kirthi";
	String number = "9841741858";
	String number2 = "1234567890";
	PhonebookSearch pb = new PhonebookSearch();
	pb.searchByName(phone,name);
	pb.searchByName(phone,name2);
	pb.searchByPhone(phone, number);
	pb.searchByPhone(phone, number2);
	
}
}
