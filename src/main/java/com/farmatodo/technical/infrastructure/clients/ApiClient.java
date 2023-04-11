package com.farmatodo.technical.infrastructure.clients;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ApiClient {

    private final HttpClient httpClient;

    public ApiClient() {
        this.httpClient = HttpClientBuilder.create().build();
    }

    public String get(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpEntity entity = httpResponse.getEntity();
        return EntityUtils.toString(entity);
    }

    public String post(String url, String requestBody, ContentType contentType) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(requestBody, contentType));
        HttpResponse httpResponse = httpClient.execute(httpPost);
        HttpEntity entity = httpResponse.getEntity();
        return EntityUtils.toString(entity);
    }

    public String put(String url, String requestBody, ContentType contentType) throws IOException {
        HttpPut httpPut = new HttpPut(url);
        httpPut.setEntity(new StringEntity(requestBody, contentType));
        HttpResponse httpResponse = httpClient.execute(httpPut);
        HttpEntity entity = httpResponse.getEntity();
        return EntityUtils.toString(entity);
    }

    public String delete(String url) throws IOException {
        HttpDelete httpDelete = new HttpDelete(url);
        HttpResponse httpResponse = httpClient.execute(httpDelete);
        HttpEntity entity = httpResponse.getEntity();
        return EntityUtils.toString(entity);
    }
}
