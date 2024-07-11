package com.client;
import com.serviceimpl.*;
import java.util.*;
public class Test {

	public static void main(String[] args)  {
		Data d = new Data();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
		System.out.println("Enter your Choice\n1.Create Table\n2.Insert Data\n3.Update Data\n4.View Sigle Data\n5.View All Data\n6.Delete Singal Data\n7.Delete All Data\n8.Delete Table\n9 exit");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		{
		try {
			d.createTable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		break;
		case 2:
		{
		try {
			d.insertData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		break;
		case 3:
		{
		try {
			d.updateData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		break;
		case 4:
		{
		try {
			d.viewSingleData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		break;
		case 5:
		{

		try {
			d.viewAllData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		break;
		case 6:
		{
		try {
			d.deleteSingleData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		break;
		case 7:
		{
		try {
			d.deleteAllData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		break;
		case 8:
		{
		try {
			d.deleteTable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		}
		break;
	
		case 9:
		{
			System.out.println("no choice is provided");
			return;
		}
		
		}

		

	}

	}
}

