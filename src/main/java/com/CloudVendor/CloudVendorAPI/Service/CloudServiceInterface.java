package com.CloudVendor.CloudVendorAPI.Service;

import com.CloudVendor.CloudVendorAPI.Model.CloudVendor;

import java.util.List;
import java.util.Optional;

public interface CloudServiceInterface {
    public String createVendor(CloudVendor cloudVendor);
    public String deleteVendor(int id);
    public List<CloudVendor> getAllVendor();
    public CloudVendor getById(int id);
    public String updateVendor(CloudVendor cloudVendor);

}
