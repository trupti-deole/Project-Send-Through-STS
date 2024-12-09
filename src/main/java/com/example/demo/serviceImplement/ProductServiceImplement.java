package com.example.demo.serviceImplement;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repositoryInter.ProductRepositoryInter;
import com.example.demo.serviceInter.ProductServiceInter;
@Service
public class ProductServiceImplement implements ProductServiceInter {
	@Autowired
	ProductRepositoryInter repository;
	@Override
	public void saveData(Product prod) {
		// TODO Auto-generated method stub
		repository.save(prod);
		
		
	}
	@Override
	public Product loginCheck(String puname, String pwd) {
		// TODO Auto-generated method stub
		Product prod=repository.findByPunameAndPwd(puname,pwd);
		return prod;
		
		
	}
	@Override
	public List<Product> getAllData() {
		List<Product> allData=(List<Product>) repository.findAll();
		return allData;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteData(int pid) {
		// TODO Auto-generated method stub
		repository.deleteById(pid);
		
	}
	@Override
	public Product updateData(int pid) {
		// TODO Auto-generated method stub
		Optional<Product> opt = repository.findById(pid);
		Product prod=opt.get();
		return prod;
	}
	
  	
	

}
 