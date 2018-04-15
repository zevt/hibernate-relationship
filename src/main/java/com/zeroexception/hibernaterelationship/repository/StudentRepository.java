package com.zeroexception.hibernaterelationship.repository;

import com.zeroexception.hibernaterelationship.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Viet Quoc Tran vt
 * on 4/14/18.
 * www.zeroexception.com
 */



public interface StudentRepository  extends JpaRepository<Student, Long> {
}
