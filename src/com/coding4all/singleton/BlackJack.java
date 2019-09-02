package com.coding4all.singleton;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;
public class BlackJack {
	
	String [] cards = {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	
	private LinkedList<String> cardsList = new LinkedList<String> (Arrays.asList(cards));
	
	static boolean firstThread = true;
	
	private static BlackJack firstInstance = null;
	
	private BlackJack(){}
		public static BlackJack getInstance() {
			
			if(firstInstance == null) {
				if(firstThread) {
					
					firstThread = false;
					
					Thread.currentThread();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				firstInstance = new BlackJack();
				
				Collections.shuffle(firstInstance.cardsList);
			}
			return firstInstance;
		}
		public LinkedList<String> getCardsList(){
			return firstInstance.cardsList;
		}
		
		public LinkedList<String> getCards (int howManyCards){
			
			LinkedList<String> cardstoDeal = new LinkedList<String>();
			
			for(int i = 1; i <= howManyCards; i++) {
				cardstoDeal.add(firstInstance.cardsList.remove(0));
			}
			
			return cardstoDeal;
		}
	

}
