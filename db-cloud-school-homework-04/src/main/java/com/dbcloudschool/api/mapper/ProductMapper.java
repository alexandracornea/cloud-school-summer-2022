package com.dbcloudschool.api.mapper;

import com.dbcloudschool.api.dto.ProductDTO;
import com.dbcloudschool.api.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);
}
