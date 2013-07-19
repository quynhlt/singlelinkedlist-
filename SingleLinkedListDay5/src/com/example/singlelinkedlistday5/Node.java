package com.example.singlelinkedlistday5;
/**
 * 
 */


/**
 * @author quynhlt
 *
 */
public class Node {
	private Object value;
	private int nextIndex;
	private int lastIndex;
	
	/**
	 * @return the nextIndex
	 */
	public int getNextIndex() {
		return nextIndex;
	}
	/**
	 * @param nextIndex the nextIndex to set
	 */
	public void setNextIndex(int nextIndex) {
		this.nextIndex = nextIndex;
	}
	/**
	 * @return the lastIndex
	 */
	public int getLastIndex() {
		return lastIndex;
	}
	/**
	 * @param lastIndex the lastIndex to set
	 */
	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}
	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
