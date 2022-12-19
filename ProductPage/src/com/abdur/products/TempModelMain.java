package com.abdur.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TempModelMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TempModel> li = new ArrayList<TempModel>();
		
		for(int i = 0; i < 5; i++) {
			Integer id = sc.nextInt();
			String bookName = sc.next();
			Integer rate = sc.nextInt();
			Integer quant = sc.nextInt();
			TempModel ob = new TempModel(id, bookName, rate, quant);
			li.add(ob);
		}
		System.out.println(li.get(0).getBookName());
		System.out.println(li.get(1).getBookName());
		System.out.println(li.get(2).getBookName());
		System.out.println(li.get(3).getBookName());
		System.out.println(li.get(4).getBookName());
		
	}
}
