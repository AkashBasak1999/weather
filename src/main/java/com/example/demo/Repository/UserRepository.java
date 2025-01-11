package com.example.demo.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;

@Service
public interface UserRepository extends CrudRepository<User,Integer>{
	@Query("select n from User n where n.email=:email")
	User getUserByUserName(@Param("email") String email);

	@Query("select n from User n where n.apikey=:key")
	User findByApikey(@Param("key") Integer key);
}
