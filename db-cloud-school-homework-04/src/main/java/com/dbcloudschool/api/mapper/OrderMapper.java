package com.dbcloudschool.api.mapper;

import com.dbcloudschool.api.dto.OrderDTO;
import com.dbcloudschool.api.entities.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {
    OrderDTO toOrderDTO(Orders order);
}
