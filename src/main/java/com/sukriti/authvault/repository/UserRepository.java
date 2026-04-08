package com.sukriti.authvault.repository;

import com.sukriti.authvault.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
