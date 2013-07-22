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
		List<Node> nodes = new ArrayList<Node>();
		SingleLinkedList list = new SingleLinkedList(nodes);
		assertFalse(list.getList().isEmpty());
		assertTrue(list.getList().size() > 0);
	}
}
