package jp.co.goodworld.model;

import jakarta.validation.constraints.NotEmpty;

public class MenuForm {

	// The Force.com JPA provider only supports annotating fields. Don't annotate
	// the getter and setter properties below.

	@NotEmpty
	private String No;
	@NotEmpty
	private String item;
	@NotEmpty
	private String itemName;

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
