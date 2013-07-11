/**
 * 
 */
package com.example.singlelinkedlistday1;

import java.util.List;

/**
 * @author quynhlt
 * 
 */
public class SingleLinkedList {
	private List<Node> lists;

	public SingleLinkedList(List<Node> nodes) {
		this.lists = nodes;
	}

	/**
	 * @return the lists
	 */
	public List<Node> getLists() {
		return lists;
	}

	/**
	 * @param lists
	 *            the lists to set
	 */
	public void setLists(List<Node> lists) {
		this.lists = lists;
	}

	public int size() {
		return lists.size();
	}

	public void insertAfter(Node node, int n) {
		lists.add(n, node);
	}

}
