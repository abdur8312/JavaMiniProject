package com.abdur.products;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShowOptions {
	Integer book_ID;
	int quantity, ch2, choice1;
	Scanner sc = new Scanner(System.in);
	Map<Integer, ListProducts> mp = new HashMap<Integer, ListProducts>();
	public void add() {
		System.out.print("Enter how many products you want to add : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Enter Id : ");
			Integer bId = sc.nextInt();
			System.out.print("Enter BookName : ");
			String bName = sc.next();
			System.out.print("Enter Rate : ");
			Integer bRate = sc.nextInt();
			System.out.print("Enter Quantity : ");
			Integer bQuantity = sc.nextInt();
			ListProducts obj = new ListProducts(bName, bId, bRate, bQuantity);
			mp.put(bId, obj);
		}
	}
	
	public void show() {
		System.out.println("Id.No  Bookname Rate Quantity");
		for(int i : mp.keySet()) {
			System.out.println(mp.get(i).getbId() + "\t" + mp.get(i).getbName() + "\t" +
					mp.get(i).getbRate() + "\t" + mp.get(i).getbQuantity());
		}
	}
	
	public static int showOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add items");
		System.out.println("2.List the items");
		System.out.println("3.List the cart");
		System.out.println("4.Total amount");
		System.out.println("5.Exit");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void listItems() {
		choice1 = ShowOptions.showOptions();
		while(choice1 >= 1) {
			switch(choice1) {
			case 1:
				add();
				choice1 = ShowOptions.showOptions();
				break;
			case 2:
				show();
				System.out.print("Enter book ID : ");
				book_ID = sc.nextInt();
				System.out.print("Enter quantity : ");
				quantity = sc.nextInt();
				choice1 = check(book_ID, quantity);
				break;
			case 3:
				choice1 = check2(choice1, book_ID);
				break;
			case 4:
				choice1 = check3(choice1, book_ID);
				break;
			case 5:
				System.exit(1);
			}
		}	
	}
	
	public int check(Integer bId, int quantity) {
		Integer b_id = mp.get(bId).getbId();
		int q_b = mp.get(bId).getbQuantity();
		if(bId == b_id && quantity <= q_b) {
			choice1 = ShowOptions.showOptions();
		}
		else{
			System.out.println("you might've entered wrong details. Try again!");
		}
		return choice1;
	}
	
	public int check2(int choice1, Integer bId) {
		if(choice1 == 3 && mp.get(bId).getbName() == mp.get(book_ID).getbName()) {
			int total = quantity * mp.get(bId).getbRate();
			System.out.print("Total amount : " + total + "\n");
			System.out.print("Do you want to purchase(y/n) : ");
			String yOrn = sc.next();
			if(yOrn.equals("y")) {
				System.out.println("You successfully purchased");
				int remaining = mp.get(bId).getbQuantity() - quantity;
				mp.get(bId).setbQuantity(remaining);
				choice1 = ShowOptions.showOptions();
			}
			else {
				System.out.println("Purchase cancelled");
				choice1 = ShowOptions.showOptions();
			}
			return choice1;
		}
		return choice1;
	}
	
	public int check3(int choice1, Integer bId) {
		if(choice1 == 4) {
			int total = quantity * mp.get(bId).getbRate();
			System.out.print("Total amount : " + total + "\n");
			choice1 = ShowOptions.showOptions();
		}
		return choice1;
	}
}
