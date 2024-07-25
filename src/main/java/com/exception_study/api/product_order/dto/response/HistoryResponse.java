package com.exception_study.api.product_order.dto.response;


import com.exception_study.api.product_order.dto.ProductOrderDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class HistoryResponse {
    private List<ProductOrderDto> buy_history;
    private List<ProductOrderDto> reserve_history;


    public static HistoryResponse of(List<ProductOrderDto> buy_history, List<ProductOrderDto> reserve_history){
        return new HistoryResponse(buy_history,reserve_history);
    }
}
