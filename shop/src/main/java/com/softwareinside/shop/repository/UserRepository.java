package com.softwareinside.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwareinside.shop.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
