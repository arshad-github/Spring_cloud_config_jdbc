package payment.gateway.config.configclient.validation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("ValidationImpl")
public class ValidationImpl implements Validation {
    @Override
    public String validate() {
        return "Validation";
    }
}
