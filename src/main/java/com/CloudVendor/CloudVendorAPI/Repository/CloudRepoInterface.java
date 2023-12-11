package com.CloudVendor.CloudVendorAPI.Repository;

import com.CloudVendor.CloudVendorAPI.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudRepoInterface extends JpaRepository<CloudVendor,Integer> {
}
