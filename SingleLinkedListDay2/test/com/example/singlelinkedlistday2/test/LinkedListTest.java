/**
 * 
 */
package com.example.singlelinkedlistday2.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.example.singlelinkedlistday2.LinkedList;
import com.example.singlelinkedlistday2.Node;

/**
 * @author quynhlt
 * 
 */
public class LinkedListTest extends TestCase {

	// 1
	public void testCreateNewLinkListWithEmptyList() {
		List<Node> nodes = new ArrayList<Node>();
		LinkedList linkedList = new LinkedList(nodes);
		assertTrue(linkedList.getList().isEmpty());
	}

	// 2
	public void testCreateNewLinkListWithObjectList() {
		List<Node> nodes = createNewNodes();
		LinkedList list = new LinkedList(nodes);
		assertEquals(nodes, list.getList());
	}

	// 3
	public void testGetSizeOfLinkList() {
		List<Node> nodes = createNewNodes();
		LinkedList list = new LinkedList(nodes);
		assertTrue(nodes.size() == list.size());
	}

	// 4
	public void testInsertAfterIndexN() {
		List<Node> nodes = createNewNodes();
		LinkedList list = new LinkedList(nodes);
		int size = list.size();

		int n = 2;
		Node node = new Node();
		node.setValue("Node 1");
		node.setNextIndex(n + 1);

		list.insertAfter(node, n);
		assertTrue(size < list.size());
		Node nodeInsert = list.getList().get(n);
		assertEquals(node.getValue(), nodeInsert.getValue());
		assertEquals(node.getNextIndex(), nodeInsert.getNextIndex());
		assertTrue(nodeInsert == node);
	}

	// 5
	public void testDeleteFromList() {
		List<Node> nodes = createNewNodes();
		LinkedList list = new LinkedList(nodes);
		int size = list.size();
		int position = 2;
		Node node = list.getList().get(position);
		list.delete(node);
		assertTrue(size > list.size());
		assertTrue(node != list.getList().get(position));
	}

	private List<Node> createNewNodes() {
		List<Node> nodes = new ArrayList<Node>();
		int n = 4;
		for (int i = 0; i < n; i++) {
			Node node = new Node();
			node.setValue("new node " + i);
			if (i < n - 1) {
				node.setNextIndex(i + 1);
			}
			nodes.add(node);
		}
		return nodes;
	}
}
