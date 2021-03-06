package br.com.blz.testjava.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Product {

    private Long sku;
    private String name;
    private Inventory inventory;
    private boolean isMarketable = false;

    public Product(Long sku, String name, Inventory inventory) {
        this.sku = sku;
        this.name = name;
        this.inventory = inventory;
    }
    
    public boolean getIsMarketable() {

    	this.isMarketable = this.getInventory().getQuantity() > 0L ;

    	return this.isMarketable;
	}

    
}
