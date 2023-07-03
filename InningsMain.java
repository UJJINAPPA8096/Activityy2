package com.Assignment2;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team name : ");
		String a = sc.next();
		System.out.println("Enter session :");
		String b = sc.next();
		System.out.println("Enter runs :");
		int c = sc.nextInt();
		
		Innings i = new Innings();
		i.setTeamname(a);
		i.setRuns(c);
		
		System.out.println("Match Details :-");
		System.out.println("----------------");
		System.out.println("Name    : "+i.getTeamname());
		System.out.println("Scorred : "+i.getRuns());
		int n=c;
		if(n<200) {
			System.out.println("Need more score");
		}
		else{
			System.out.println("Match Ended.");
		}
	}

}
