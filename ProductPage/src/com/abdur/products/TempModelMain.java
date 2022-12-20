package com.abdur.products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//DO NOT CONSIDER THIS CLASS. ONLY THE Items.java, ProductsModel.java and ShowOptions.java
//are the main classes

public class TempModelMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TempModel> li = new ArrayList<TempModel>();
		Map<Integer, TempModel> mp = new HashMap<Integer, TempModel>();
		
		for(int i = 0; i < 3; i++) {
			Integer id = sc.nextInt();
			String bookName = sc.next();
			Integer rate = sc.nextInt();
			Integer quant = sc.nextInt();
			TempModel ob = new TempModel(id, bookName, rate, quant);
			mp.put(id, ob);
			System.out.println(mp.get(id).getBookName());
		}
		
		
	}
}
