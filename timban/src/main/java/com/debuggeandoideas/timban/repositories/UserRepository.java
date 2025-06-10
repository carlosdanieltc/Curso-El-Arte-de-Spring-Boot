package com.debuggeandoideas.timban.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debuggeandoideas.timban.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
