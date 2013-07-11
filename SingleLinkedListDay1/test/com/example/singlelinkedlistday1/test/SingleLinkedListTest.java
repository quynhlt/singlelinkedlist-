/**
 * 
 */
package com.example.singlelinkedlistday1.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.example.singlelinkedlistday1.Node;
import com.example.singlelinkedlistday1.SingleLinkedList;

/**
 * @author quynhlt
 * 
 */
public class SingleLinkedListTest extends TestCase {
	// 1
	public void testCreateNewLinkListWithEmptyList() {
		List<Node> nodes = new ArrayList<Node>();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertTrue(list.getLists().isEmpty());
	}

	// 2
	public void testCreateNewLinkListWithObjectList() {
		List<Node> nodes = createNotes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertEquals(nodes, list.getLists());
	}

	// 3
	public void testGetSizeOfLinkList() {
		List<Node> nodes = createNotes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertTrue(nodes.size() == list.size());
	}

	// 3
	public void testInsertAfterIndexN() {
		List<Node> nodes = createNotes();
		SingleLinkedList list = new SingleLinkedList(nodes);

		int n = 3;
		Node node = new Node();
		node.setValue("value 1");
		node.setNextIndex(n + 1);
		
		list.insertAfter(node, n);
	}

	private List<Node> createNotes() {
		List<Node> nodes = new ArrayList<Node>();
		int n = 5;
		for (int i = 0; i < n; i++) {
			Node node = new Node();
			node.setValue("value " + i);
			if (i < n - 1) {
				node.setNextIndex(i + 1);
			}
			nodes.add(node);
		}
		return nodes;
	}
}
