package com.eulbyvan.service;

import com.eulbyvan.model.Vendor;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

public interface IVendorService {
    List<Vendor> getVendors();
    Optional<Vendor> getVendorById(Long id);

    Vendor addVendor(Vendor vendor);
}
