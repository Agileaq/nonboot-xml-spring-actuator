package personal.arc.nonboot.xml.metrics.example.controller;

import com.codahale.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arc on 9/12/2016.
 */
@RestController
@RequestMapping("yeah/metrics")
public class HelloMetricsController {
    @Timed
    @RequestMapping("say")
    public String sayMetrics() {
        return "Hello Metrics!";
    }

}
