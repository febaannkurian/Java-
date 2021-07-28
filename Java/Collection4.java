package com.ust.example;

import java.util.*;
public class Collection4 {
	
	public static void main(String[] args) {
		List list = Arrays.asList("one two three four five six one three four".split(" "));
		System.out.println("List :" +list);
		List sublist = Arrays.asList("three four".split(" "));
		System.out.println("SubList :" +sublist);
		System.out.println("indexOfSubList:" + Collections.indexOfSubList(list, sublist));
		System.out.println("lastIndexOfSublist: " +Collections.lastIndexOfSubList(list, sublist));
	}

}
