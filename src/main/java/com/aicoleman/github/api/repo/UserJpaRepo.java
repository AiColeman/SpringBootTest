package com.aicoleman.github.api.repo;

import com.aicoleman.github.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User, Long> {}
