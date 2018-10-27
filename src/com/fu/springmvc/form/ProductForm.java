/**
 * 
 */
package com.fu.springmvc.form;

/**
 @author： fu    @time：2018年10月27日 下午1:17:08 
 @说明： 一份耕耘，一份收获
**/
public class ProductForm {
	/*
	 * 产品名称
	 */
	private String name;
	/*
	 * 产品描述
	 */
	private String description;
	/*
	 * 产品价格
	 */
	private String price;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductForm [name=" + name + ", description=" + description + ", price=" + price
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
