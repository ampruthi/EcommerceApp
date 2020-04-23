package com.example.ecommerce.service;

import com.example.ecommerce.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface BrandRepository extends Repository<Brand, Long> {

}