/**
 * 
 */
package com.example.singlelinkedlistday3.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.example.singlelinkedlistday3.Node;
import com.example.singlelinkedlistday3.SingleLinkedList;

/**
 * @author quynhlt
 * 
 */
public class SingleLinkedListTest extends TestCase {
	// 1
	public void testCreateNewLinkListWithEmptyList() {
		List<Node> nodes = new ArrayList<Node>();
		SingleLinkedList linkedList = new SingleLinkedList(nodes);
		assertTrue(linkedList.getList().isEmpty());
	}

	// 2
	public void testCreateNewLinkListWithObjectList() {
		List<Node> nodes = createNewNodes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertEquals(nodes, list.getList());
	}

	// 3
	public void testGetSizeOfLinkList() {
		List<Node> nodes = createNewNodes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertTrue(nodes.size() == list.size());
	}

	// 4
	public void testInsertAfterIndexN() {
		List<Node> nodes = createNewNodes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		int size = list.size();

		int n = 2;
		Node node = new Node();
		node.setValue("Node 1");
		node.setNextIndex(n + 1);

		list.insertAfter(node, n);
		assertTrue(size < list.size());
		Node nodeInsert = list.get(n);
		assertEquals(node.getValue(), nodeInsert.getValue());
		assertEquals(node.getNextIndex(), nodeInsert.getNextIndex());
		assertTrue(nodeInsert == node);
	}

	// 5
	public void testDeleteFromList() {
		List<Node> nodes = createNewNodes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		int size = list.size();
		int position = 2;
		Node node = list.get(position);
		list.delete(node);
		assertTrue(size > list.size());
		assertTrue(node != list.get(position));
	}

	// 6
	public void testGetFirstNodeFromList() {
		List<Node> nodes = createNewNodes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		int first = 0;
		Node expectedNode = list.get(first);
		Node actualNode = list.first();
		assertEquals(expectedNode, actualNode);
	}

	// 7
	public void testGetLastNodeFromList() {
		List<Node> nodes = createNewNodes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		int last = list.size() - 1;
		Node expectedNode = list.get(last);
		Node actualNode = list.last();
		assertEquals(expectedNode, actualNode);
	}

	// 8
	public void testGetBeforeNodeFromList() {
		List<Node> nodes = createNewNodes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		Node node = list.get(2);
		Node expectedNode = list.get(1);
		
		Node actualNode = list.before(node);
		assertEquals(expectedNode, actualNode);
	}

	private List<Node> createNewNodes() {
		List<Node> nodes = new ArrayList<Node>();
		int n = 5;
		for (int i = 0; i < n; i++) {
			Node node = new Node();
			node.setValue("new node lit" + i);
			if (i < n - 1) {
				node.setNextIndex(i + 1);
			}
			nodes.add(node);
		}
		return nodes;
	}
}
