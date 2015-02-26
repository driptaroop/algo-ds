package org.dripto.linkedlist.nodes;

public class SingleLinkedListNode {
	
	public int data;
	public SingleLinkedListNode nextNode;
	
	public SingleLinkedListNode(int data){
		this.data = data;
	}

	@Override
	public String toString() {
		return Integer.toHexString(hashCode());
	}
	
}