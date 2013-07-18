package com.example.singlelinkedlistday4;

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
		Node beforeNode = null;
		int index = node.getLastIndex();
		if (index >= 0) {
			beforeNode = list.get(index);
		}
		return beforeNode;
	}

	public Node after(Node node) {
		Node afterNode = null;
		int index = node.getNextIndex();
		if (index >= 0) {
			afterNode = list.get(index);
		}
		return afterNode;
	}

	public Node find(Node node) {
		Node findNode = null;
		for (Node n : list) {
			if ((n.getNextIndex() == node.getNextIndex()) && (n.getLastIndex() == node.getLastIndex())) {

			}
		}
		return null;
	}

}
