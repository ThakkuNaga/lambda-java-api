package com.example.lambda;

import java.util.Map;

public class GatewayResponse {

    private String body;
    private int statusCode;
    private Map<String, String> headers;
    private boolean isBase64Encoded;

    public GatewayResponse(String body, int statusCode, Map<String, String> headers, boolean isBase64Encoded) {
        this.body = body;
        this.statusCode = statusCode;
        this.headers = headers;
        this.isBase64Encoded = isBase64Encoded;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public void setBase64Encoded(boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }
}
