package com.zeroexception.hibernaterelationship.repository;

import com.zeroexception.hibernaterelationship.model.machine.MachineType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Viet Quoc Tran
 * on 4/15/18.
 * www.zeroexception.com
 */


public interface MachineTypeRepository extends JpaRepository<MachineType, String> {
}
