package com.msb.business.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("testClient")
public interface TestClient {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test();
}
