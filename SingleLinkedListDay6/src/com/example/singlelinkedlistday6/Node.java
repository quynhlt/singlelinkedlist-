/**
 * 
 */
package com.example.singlelinkedlistday6;

/**
 * @author quynhlt
 *
 */
public class Node {
	private Object value;
	private int after;
	private int before;
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
	/**
	 * @return the after
	 */
	public int getAfter() {
		return after;
	}
	/**
	 * @param after the after to set
	 */
	public void setAfter(int after) {
		this.after = after;
	}
	/**
	 * @return the before
	 */
	public int getBefore() {
		return before;
	}
	/**
	 * @param before the before to set
	 */
	public void setBefore(int before) {
		this.before = before;
	}
	
}
