package com.exception_study.api.product.dto.response;

import com.exception_study.api.product.dto.ProductDto;
import com.exception_study.api.product_order.dto.ProductOrderDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class DetailsWithHistoryResponse {
    private ProductDto product;
    private List<ProductOrderDto> history;


    public static DetailsWithHistoryResponse of(ProductDto product, List<ProductOrderDto> history){
        return new DetailsWithHistoryResponse(product,history);
    }
}
