/**
 * 
 */
package com.example.singlelinkedlistday6;

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
		// TODO Auto-generated method stub
		
	}

}
