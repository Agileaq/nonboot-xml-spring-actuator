package personal.arc.nonboot.xml.metrics.example.custom;

import com.codahale.metrics.health.HealthCheck;
import org.springframework.stereotype.Component;

/**
 * Created by Arc on 10/10/2016.
 */
@Component
public class DBHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
