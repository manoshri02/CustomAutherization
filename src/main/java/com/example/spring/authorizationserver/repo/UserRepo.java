package com.example.spring.authorizationserver.repo;

import com.example.spring.authorizationserver.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
   // @Query(value = "SELECT fi.id as fiId, fi.op_id as opId, fi.fi_name as fiName FROM fi_details fi WHERE fi.id != -1", nativeQuery = true)
   Optional<Users> findByUserName(String username);
}
