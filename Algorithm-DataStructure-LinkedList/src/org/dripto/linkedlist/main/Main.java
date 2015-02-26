package org.dripto.linkedlist.main;

import org.dripto.linkedlist.nodes.SingleLinkedListNode;
import org.dripto.linkedlist.op.SingleLinkedListUtils;

public class Main {
	public static void main(String[] args) {
		SingleLinkedListNode singleNode = SingleLinkedListUtils.generateRandomList(10);
		SingleLinkedListUtils.printLinkedList(singleNode);
	}
}
