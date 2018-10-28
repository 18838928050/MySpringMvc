/**
 * 
 */
package vo;

import java.io.Serializable;

/**
 @author： fu    @time：2018年10月27日 下午1:19:01 
 @说明： 一份耕耘，一份收获
**/
/*
 * Product 类实现了Serializable,其实例可以安全的将数据保存到HttpSession中
 */
public class Product implements Serializable {
	
	/*
	 * 产品id序列号，主键
	 */
	private long id;

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
	private float price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
}
