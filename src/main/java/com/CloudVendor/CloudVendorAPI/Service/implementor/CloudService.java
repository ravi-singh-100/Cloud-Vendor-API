package com.CloudVendor.CloudVendorAPI.Service.implementor;

import com.CloudVendor.CloudVendorAPI.Model.CloudVendor;
import com.CloudVendor.CloudVendorAPI.Repository.CloudRepoInterface;
import com.CloudVendor.CloudVendorAPI.Service.CloudServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CloudService implements CloudServiceInterface {
    @Autowired
    CloudRepoInterface cloudRepoInterface;
    @Override
    public String createVendor(CloudVendor cloudVendor) {
        cloudRepoInterface.save(cloudVendor);
        return "Succes";
    }

    @Override
    public String deleteVendor(int id) {
   cloudRepoInterface.deleteById(id);
   return "Success";
    }

    @Override
    public List<CloudVendor> getAllVendor() {
        return cloudRepoInterface.findAll();
    }

    @Override
    public CloudVendor getById(int id) {
//        Optional<CloudVendor> optional=cloudRepoInterface.findById(id);
//        if(optional.isPresent()) return optional.get();
//        return null;
        System.out.println("DSBSHBKBSKBSDS");
        System.out.println(cloudRepoInterface.findById(id));
        return cloudRepoInterface.findById(id).get();
    }

    @Override
    public String updateVendor(CloudVendor cloudVendor) {
       cloudRepoInterface.save(cloudVendor);
       return "Success";
    }
}
