package carshare.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="payment", contextId = "paymentCancel", url="${api.payment.url}")
public interface PaymentCancellationService {

    @RequestMapping(method= RequestMethod.POST, path="/paymentCancellations")
    public void paycancel(@RequestBody PaymentCancellation paymentCancellation);

}