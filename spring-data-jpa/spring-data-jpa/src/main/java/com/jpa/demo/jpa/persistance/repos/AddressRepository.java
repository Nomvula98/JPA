package com.jpa.demo.jpa.persistance.repos;

import com.jpa.demo.jpa.persistance.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
