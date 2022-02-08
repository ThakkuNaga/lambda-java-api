package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Collections;

public class LambdaJavaAPI implements RequestHandler<Object, GatewayResponse> {

    @Override
    public GatewayResponse handleRequest(Object object, Context context) {

        String message = "Hello from Lambda java API....";
        System.out.println(message);

        GatewayResponse response = new GatewayResponse(

                message,
                200,
                Collections.singletonMap("Company", "Nagasoft"),
                false
        );

        return response;
    }
}
