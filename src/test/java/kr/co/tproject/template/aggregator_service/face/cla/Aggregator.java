package kr.co.tproject.template.aggregator_service.face.cla;

import java.util.Objects;

import kr.co.tproject.template.aggregator_service.face.ProductInformationClient;
import kr.co.tproject.template.aggregator_service.face.ProductInventoryClient;

/**
 * 
 * @author newzen
 *  애그리게이터는 다양한 마이크로 서비스에 대한 호출을 집계하고, 데이터를 수집하고, 추가로 게시합니다.
 * 	REST 끝점 아래에 있습니다.
 */


public class Aggregator {
	
	ProductInformationClient informationClient;
	
	ProductInventoryClient inventoryClient;
	
	public void Aggregator() {
		
	}
	
	public Product getProduct() {
		Product product = new Product();
		String productTitle = informationClient.getProductTitle();
		int productInventory = inventoryClient.getProductInventories();
		
		product.setTitle(Objects.requireNonNullElse(productTitle, "Error: Fetching Product Title Failed"));
		product.setProductInventories(Objects.requireNonNullElse(productInventory, -1));
		
		return product;
	}
}
