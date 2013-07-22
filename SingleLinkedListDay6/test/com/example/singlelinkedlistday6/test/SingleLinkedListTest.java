/**
 * 
 */
package com.example.singlelinkedlistday6.test;

import java.util.ArrayList;
import java.util.List;

import com.example.singlelinkedlistday6.Node;
import com.example.singlelinkedlistday6.SingleLinkedList;

import junit.framework.TestCase;

/**
 * @author quynhlt
 * 
 */
public class SingleLinkedListTest extends TestCase {
	public void testCreateWithEmptyList() {
		List<Node> nodes = new ArrayList<Node>();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertTrue(list.getList().isEmpty());
	}

	public void testCreateWithObjectList() {
		List<Node> nodes = createNodes();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertFalse(list.getList().isEmpty());
		assertTrue(list.getList().size() > 0);
	}

	private List<Node> createNodes() {
		List<Node> nodes = new ArrayList<Node>();
		int nodeSize = 5;
		for (int i = 0; i < nodeSize; i++) {
			Node node = new Node();
			node.setValue("Node " + i);
			int before = i > 0 ? i - 1 : -1;
			int after = i < nodeSize ? i + 1 : -1;
			node.setBefore(before);
			node.setAfter(after);
			nodes.add(node);
		}
		return nodes;
	}
}
