package com.abdur.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowOptions {
	
	String book_name;
	int quantity, ch2, choice1;
	Scanner sc = new Scanner(System.in);
	//ListProducts ob1 = new ListProducts();
	//List<List> Li2d = new ArrayList<List>();
	List<ListProducts> li = new ArrayList<ListProducts>();
	public void add() {
		System.out.print("Enter how many products you want to add : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			//List<Object> li = new ArrayList<Object>();
			System.out.print("Enter Id : ");
			Integer bId = sc.nextInt();
			System.out.print("Enter BookName : ");
			String bName = sc.next();
			System.out.print("Enter Rate : ");
			Integer bRate = sc.nextInt();
			System.out.print("Enter Quantity : ");
			Integer bQuantity = sc.nextInt();
			ListProducts obj = new ListProducts(bName, bId, bRate, bQuantity);
			li.add(obj);
		}
	}
	
	public void show() {
		System.out.println("Id.No  Bookname Rate Quantity");
		for(int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getbId() + "\t" + li.get(i).getbName() + "\t" +
					li.get(i).getbRate() + "\t" + li.get(i).getbQuantity());
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
				System.out.print("Enter book name : ");
				book_name = sc.next();
				System.out.print("Enter quantity : ");
				quantity = sc.nextInt();
				choice1 = check(book_name, quantity);
				break;
			case 3:
				choice1 = check2(choice1);
				break;
			case 4:
				choice1 = check3(choice1);
				break;
			case 5:
				System.exit(1);
			}
		}	
	}
	
	public int check(String book_name, int quantity) {
		for(int i = 0; i < li.size(); i++) { // showing dead code
			String b_N = li.get(i).getbName();
			int q_b = li.get(i).getbQuantity();
			if(book_name.equals(b_N) && quantity <= q_b) {
				choice1 = ShowOptions.showOptions();
				return choice1;
			}
			else{
				System.out.println("you might've entered wrong details. Try again!");
				return choice1;
			}
		}
		return choice1;
	}
	
	public int check2(int choice1) {
		for(int i = 0; i < li.size(); i++) {
			if(choice1 == 3 && book_name.equals(li.get(i).getbName())) {
				int total = quantity * li.get(i).getbRate();
				System.out.print("Total amount : " + total + "\n");
				System.out.print("Do you want to purchase(y/n) : ");
				String yOrn = sc.next();
				if(yOrn.equals("y")) {
					System.out.println("You successfully purchased");
					int remaining = li.get(i).getbQuantity() - quantity;
					li.get(i).setbQuantity(remaining);
					choice1 = ShowOptions.showOptions();
				}
				else {
					System.out.println("Purchase cancelled");
					choice1 = ShowOptions.showOptions();
				}
				return choice1;
			}
		}
		
//		else if(choice1 == 2 && book_name.equals(ob1.getBk2())) {
//			int total = quantity * ob1.getRt_bk2();
//			System.out.print("Total amount : " + total + "\n");
//			System.out.print("Do you want to purchase(y/n) : ");
//			String yOrn = sc.next();
//			if(yOrn.equals("y")) {
//				System.out.println("You successfully purchased");
//				int remaining = ob1.getQty_bk2() - quantity;
//				ob1.setQty_bk2(remaining);
//				choice1 = ShowOptions.showOptions();
//			}
//			else {
//				System.out.println("Purchase cancelled");
//				choice1 = ShowOptions.showOptions();
//			}
//			return choice1;
//		}
		return choice1;
	}
	
	public int check3(int choice1) {
		for(int i = 0; i < li.size(); i++) {
			if(choice1 == 4 && book_name.equals(li.get(i).getbName())) {
				int total = quantity * li.get(i).getbRate();
				System.out.print("Total amount : " + total + "\n");
				choice1 = ShowOptions.showOptions();
				return choice1;
			}
//			else if(choice1 == 3 && book_name.equals(li.get(i).ge)) {
//				int total = quantity * ob1.getRt_bk2();
//				System.out.print("Total amount : " + total + "\n");
//				choice1 = ShowOptions.showOptions();
//				return choice1;
//			}
		}
		return choice1;
	}
	
}
