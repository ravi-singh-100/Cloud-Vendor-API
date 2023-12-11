package com.CloudVendor.CloudVendorAPI.Controller;

import com.CloudVendor.CloudVendorAPI.Model.CloudVendor;
import com.CloudVendor.CloudVendorAPI.Service.implementor.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class CloudController{
@Autowired
CloudService cloudService;
    @RequestMapping(name= "/cloudVendor")
    @GetMapping(value = "/getAll")
    public List<CloudVendor> getAll(){
        return cloudService.getAllVendor();
    }
    @GetMapping(value = "/get")
    public CloudVendor get(@RequestParam("id") int id){
        return cloudService.getById(id);
    }
    @PostMapping(value = "/createVendor")
    public String createVendor(@RequestBody CloudVendor cloudVendor){
return cloudService.createVendor(cloudVendor);
    }
    @PatchMapping (value = "/updateVendor")
    public String updateVendor(@RequestBody CloudVendor cloudVendor){
return cloudService.updateVendor(cloudVendor);
    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteVendor(@PathVariable("id") int id){
return  cloudService.deleteVendor(id);
    }
}
