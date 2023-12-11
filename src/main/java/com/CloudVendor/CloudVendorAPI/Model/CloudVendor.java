package com.CloudVendor.CloudVendorAPI.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class CloudVendor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cloudId;
@NotNull
    private String name;
@NotNull
    private String phoneNumber;
@NotNull
    private String address;
}
