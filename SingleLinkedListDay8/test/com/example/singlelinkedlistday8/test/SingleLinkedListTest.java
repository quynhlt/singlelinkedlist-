/**
 * 
 */
package com.example.singlelinkedlistday8.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.example.singlelinkedlistday8.Node;
import com.example.singlelinkedlistday8.SingleLinkedList;

/**
 * @author quynhlt
 * 
 */
public class SingleLinkedListTest extends TestCase {
	// 1
	public void testCanCreateSingleLinkedWithEmptyList() {
		List<Node> nodes = new ArrayList<Node>();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertTrue(list.getList().isEmpty());
	}

	// 2
	public void testCanCreateSingleLinkedWithObjectList() {
		int nodeSize = 6;
		List<Node> nodes = createNodes(nodeSize);
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertFalse(list.getList().isEmpty());
		assertTrue(list.size() > 0);
	}

	// 3
	public void testCanGetSizeOfList() {
		int actualSize = 6;
		List<Node> nodes = createNodes(actualSize);
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertTrue(actualSize == list.size());
	}

	// 4
	public void testCanAddNewObjectToAfterNodeNOfList() {
		int nodeSize = 6;
		List<Node> nodes = createNodes(nodeSize);
		SingleLinkedList list = new SingleLinkedList(nodes);
		int position = 2;
		Object object = "Object to add";
		Node node = list.get(position);
		list.insertAfter(node, object);

		Node actualNode = list.get(position + 1);
		assertTrue(nodeSize < list.size());
		assertEquals(object, actualNode.getValue());
	}

	private List<Node> createNodes(int n) {
		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < n; i++) {
			Node node = new Node();
			node.setValue("Value " + i);
			int before = i > 0 ? i - 1 : -1;
			int after = i < n ? i + 1 : -1;
			node.setBefore(before);
			node.setAfter(after);
			nodes.add(node);
		}
		return nodes;
	}
}
