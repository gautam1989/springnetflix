package eurekaClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="another-java-service")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
