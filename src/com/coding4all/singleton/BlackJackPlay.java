package com.coding4all.singleton;

import java.util.*;

public class BlackJackPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackJack newInstance = BlackJack.getInstance();
		
		System.out.println("Instance ID 1: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getCardsList());
		
		LinkedList<String> p1 = newInstance.getCards(2);
		
		System.out.println(newInstance.getCardsList());
		
		System.out.println("Player 1 hand: " + p1);
		
		BlackJack instanceTwo = BlackJack.getInstance();
		System.out.println("Instance ID 2: " + System.identityHashCode(instanceTwo));
		System.out.println(newInstance.getCardsList());
		LinkedList<String> p2 = newInstance.getCards(2);
		System.out.println(newInstance.getCardsList());
		
		System.out.println("Player 2 hand: " + p2);
	}

}
