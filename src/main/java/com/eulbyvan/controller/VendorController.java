package com.eulbyvan.controller;

import com.eulbyvan.model.Vendor;
import com.eulbyvan.service.IVendorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 09/12/2022
 */

@RestController
@RequestMapping("/api/vendors")
public class VendorController {
    private IVendorService vendorService;

    public VendorController(IVendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping
    public ResponseEntity<List<Vendor>> getVendors() {
        List<Vendor> vendors = vendorService.getVendors();

        return ResponseEntity.ok().body(vendors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Vendor>> getVendorById(@PathVariable("id") Long id) {
        Optional<Vendor> vendors = vendorService.getVendorById(id);

        return ResponseEntity.ok().body(vendors);
    }
}
