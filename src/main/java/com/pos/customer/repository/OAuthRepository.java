package com.pos.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.customer.entity.OAuth;

@Repository
public interface OAuthRepository extends JpaRepository<OAuth,Long> {

}
