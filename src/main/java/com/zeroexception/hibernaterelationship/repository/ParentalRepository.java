package com.zeroexception.hibernaterelationship.repository;

import com.zeroexception.hibernaterelationship.model.entity.Parental;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Viet Quoc Tran
 * on 4/15/18.
 * www.zeroexception.com
 */




public interface ParentalRepository extends JpaRepository<Parental, Long> {
}
