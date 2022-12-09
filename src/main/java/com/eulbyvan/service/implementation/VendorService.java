package com.eulbyvan.service.implementation;

import com.eulbyvan.model.Vendor;
import com.eulbyvan.repo.IVendorRepo;
import com.eulbyvan.service.IVendorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class VendorService implements IVendorService {
    private final IVendorRepo vendorRepo;

    @Override
    public List<Vendor> getVendors() {
        log.info("fetching all vendors ...");
        return vendorRepo.findAll();
    }

    @Override
    public Optional<Vendor> getVendorById(Long id) {
        return vendorRepo.findById(id);
    }

    @Override
    public Vendor addVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }
}
