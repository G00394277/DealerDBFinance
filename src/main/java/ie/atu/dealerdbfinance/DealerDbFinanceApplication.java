package ie.atu.dealerdbfinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient(name = "DealerDB", url = "http://localhost:8081")
public class DealerDbFinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealerDbFinanceApplication.class, args);
    }

}
