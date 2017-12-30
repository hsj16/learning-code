package com.hsj.cloud.cloudconsumeruser.repository;

import com.hsj.cloud.cloudconsumeruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
