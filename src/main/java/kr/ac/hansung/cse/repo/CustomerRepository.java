package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ac.hansung.cse.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	List<Customer> findByLastName(String lastName);
	
}
