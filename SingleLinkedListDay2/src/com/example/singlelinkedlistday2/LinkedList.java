/**
 * 
 */
package com.example.singlelinkedlistday2;

import java.util.List;

/**
 * @author quynhlt
 * 
 */
public class LinkedList {
	private List<Node> list;

	public LinkedList(List<Node> nodes) {
		this.list = nodes;
	}

	/**
	 * @return the lists
	 */
	public List<Node> getList() {
		return list;
	}

	public int size() {
		return list.size();
	}

	public void insertAfter(Node node, int n) {
		list.add(n, node);
	}

	public void delete(Node n) {
		for (Node node : list) {
			if (node.getNextIndex() == n.getNextIndex()) {
				list.remove(node);
				break;
			}
		}
	}

}
