package com.example.demo.repositoryInter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Product;
@Repository
public interface ProductRepositoryInter extends CrudRepository<Product,Integer> {

	public Product findByPunameAndPwd(String puname, String pwd);
	//public Employee findByUnameAndPass(String uname,String pass);

	

}
