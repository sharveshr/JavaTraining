package com.Daily.Task4;

import java.util.ArrayList;
import java.util.List;

public class RemoveRange {
public static void main(String[] args) {
	List<String> stringAL = new ArrayList<>();
	stringAL.add("hello");
	stringAL.add("my");
	stringAL.add("name");
	stringAL.add("is");
	stringAL.add("sharvesh");
	int start = 1;
	int end = 2;
	for(int i=start;i<=end;i++) {
		stringAL.remove(i);
	}
	for(String a : stringAL) {
		System.out.print(a+ " ");
	}
}
}
