/**
 * 
 */
package com.example.singlelinkedlistday8;

import java.util.List;

/**
 * @author quynhlt
 * 
 */
public class SingleLinkedList {
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

	public Node get(int position) {
		return list.get(position);
	}

	public void insertAfter(Node node, Object object) {
		Node newNode = new Node();
		node.setValue(object);
		int before = node.getAfter() + 1 <= size() ? node.getAfter() + 1 : -1;
		int after = node.getAfter() - 1;
		node.setBefore(before);
		node.setAfter(after);
		list.add(node.getAfter(), newNode);
		for (int i = node.getAfter() + 1; i < size(); i++) {
			get(i).setAfter(get(i).getAfter() + 1);
			get(i).setBefore(get(i).getBefore() + 1);
		}
	}

}
