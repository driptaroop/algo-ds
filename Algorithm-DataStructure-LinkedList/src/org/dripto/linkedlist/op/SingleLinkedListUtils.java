package org.dripto.linkedlist.op;

import java.util.Random;

import org.dripto.linkedlist.nodes.SingleLinkedListNode;

public class SingleLinkedListUtils {
	
	public static SingleLinkedListNode generateRandomList(int size){
		Random random = new Random();
		int bound = 100;
		SingleLinkedListNode headNode = new SingleLinkedListNode(random.nextInt(bound));
		SingleLinkedListNode currentNode = headNode;
		for(int count = 1; count < size; count++){
			currentNode.nextNode = new SingleLinkedListNode(random.nextInt(bound));
			currentNode = currentNode.nextNode;
		}
		return headNode;
	}
	
	public static void printLinkedList(SingleLinkedListNode headNode){
		SingleLinkedListNode currentNode = headNode;
		while(null != currentNode){
			System.out.print("|" + currentNode.data /*+ "||" + currentNode.nextNode*/ + "| =>");
			currentNode = currentNode.nextNode;
		}
	}

}
