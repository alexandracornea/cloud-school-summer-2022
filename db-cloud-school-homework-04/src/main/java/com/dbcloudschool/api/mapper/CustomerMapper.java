package com.dbcloudschool.api.mapper;

import com.dbcloudschool.api.dto.CustomerDTO;
import com.dbcloudschool.api.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {
    CustomerDTO toCustomerDTO(Customer customer);
}
