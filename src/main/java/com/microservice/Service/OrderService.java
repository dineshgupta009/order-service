package com.microservice.Service;

import com.microservice.Payload.Request.OrderRequest;
import com.microservice.Payload.Response.OrderResponse;

public interface OrderService {

    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long id);
}
