package com.example.singlelinkedlistday3;

/**
 * 
 */

import java.util.List;

/**
 * @author quynhlt
 * 
 */
public class SingleLinkedList {
	private static final int FIRST = 0;
	private List<Node> list;

	public SingleLinkedList(List<Node> nodes) {
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

	public Node first() {
		return list.get(FIRST);
	}

	public Node last() {
		return list.get(size() - 1);
	}

	public Node get(int location) {
		return list.get(location);
	}

	public Node before(Node node) {
		
		return null;
	}

}
