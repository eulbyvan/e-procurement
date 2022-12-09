package com.eulbyvan.repo;

import com.eulbyvan.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

public interface IVendorRepo extends JpaRepository<Vendor, Long> {
}
