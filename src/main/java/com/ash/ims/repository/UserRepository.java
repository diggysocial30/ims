package com.ash.ims.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ash.ims.model.vo.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
