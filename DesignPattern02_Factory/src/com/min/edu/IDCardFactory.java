package com.min.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO007
 * Factory의 기능인 카드를 생성하고 등록하는 기능
 *
 */
public class IDCardFactory extends Factory {

	private List<Product> owners = new ArrayList<>();
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registProduct(Product product) {
		owners.add(product);
	}

	public List<Product> getOwners() {
		return owners;
	}

	public void setOwners(List<Product> owners) {
		this.owners = owners;
	}

}
