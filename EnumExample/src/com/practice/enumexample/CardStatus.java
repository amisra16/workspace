/**
 * 
 */
package com.practice.enumexample;

/**
 * @author awmishra
 *
 */
public enum CardStatus {
	A("APPROVED"),
	D("DECLINED"),
	P("PENDING"),
	C("CANCELLED"),
	;

	private String status;

	private CardStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
