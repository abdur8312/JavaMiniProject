package com.abdur.products;

import java.util.Scanner;

public class ShowOptions {
	
	String book_name;
	int quantity, ch2, choice1;
	Scanner sc = new Scanner(System.in);
	ListProducts ob1 = new ListProducts();
	public void add() {
//		String bk1 = "book1";
//		String bk2 = "book2";
//		int qty1 = 10;
//		int qty2 = 15;
//		int rt1 = 100;
//		int rt2 = 150;
		ob1.setBk1("book1");
		ob1.setBk2("book2");
		ob1.setQty_bk1(10);
		ob1.setQty_bk2(15);
		ob1.setRt_bk1(100);
		ob1.setRt_bk2(150);
	}
	
	public static int showOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.List the items");
		System.out.println("2.List the cart");
		System.out.println("3.Total amount");
		System.out.println("4.Exit");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void listItems() {
		add();
		choice1 = ShowOptions.showOptions();
		while(choice1 >=1 && choice1 < 4) {
			switch(choice1) {
			case 1:
				ob1.show();
				System.out.print("Enter book name : ");
				book_name = sc.next();
				System.out.print("Enter quantity : ");
				quantity = sc.nextInt();
				choice1 = check(book_name, quantity);
				break;
			case 2:
				choice1 = check2(choice1);
				break;
			case 3:
				choice1 = check3(choice1);
				break;
			case 4:
				System.exit(1);
			}
		}	
	}
	
	public int check(String book_name, int quantity) {
		if(book_name.equals(ob1.getBk1()) && quantity <= ob1.getQty_bk1()) {
			choice1 = ShowOptions.showOptions();
			return choice1;
		}
		else if(book_name.equals(ob1.getBk2()) && quantity <= ob1.getQty_bk2()) {
			choice1 = ShowOptions.showOptions();
			return choice1;
		}
		else{
			System.out.println("you might've entered wrong details. Try again!");
			return choice1;
		}
	}
	
	public int check2(int choice1) {
		if(choice1 == 2 && book_name.equals(ob1.getBk1())) {
			int total = quantity * ob1.getRt_bk1();
			System.out.print("Total amount : " + total + "\n");
			System.out.print("Do you want to purchase(y/n) : ");
			String yOrn = sc.next();
			if(yOrn.equals("y")) {
				System.out.println("You successfully purchased");
				int remaining = ob1.getQty_bk1() - quantity;
				ob1.setQty_bk1(remaining);
				choice1 = ShowOptions.showOptions();
			}
			else {
				System.out.println("Purchase cancelled");
				choice1 = ShowOptions.showOptions();
			}
			return choice1;
		}
		else if(choice1 == 2 && book_name.equals(ob1.getBk2())) {
			int total = quantity * ob1.getRt_bk2();
			System.out.print("Total amount : " + total + "\n");
			System.out.print("Do you want to purchase(y/n) : ");
			String yOrn = sc.next();
			if(yOrn.equals("y")) {
				System.out.println("You successfully purchased");
				int remaining = ob1.getQty_bk2() - quantity;
				ob1.setQty_bk2(remaining);
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
	
	public int check3(int choice1) {
		if(choice1 == 3 && book_name.equals(ob1.getBk1())) {
			int total = quantity * ob1.getRt_bk1();
			System.out.print("Total amount : " + total + "\n");
			choice1 = ShowOptions.showOptions();
			return choice1;
		}
		else if(choice1 == 3 && book_name.equals(ob1.getBk2())) {
			int total = quantity * ob1.getRt_bk2();
			System.out.print("Total amount : " + total + "\n");
			choice1 = ShowOptions.showOptions();
			return choice1;
		}
		return choice1;
	}
	
}
