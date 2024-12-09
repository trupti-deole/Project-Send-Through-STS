package com.example.demo.serviceInter;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductServiceInter {

	public void saveData(Product prod);

	public Product loginCheck(String puname, String pwd);

	public List<Product> getAllData();

	public void deleteData(int pid);

	public Product updateData(int pid);

	

}
