package belajar.spring.monitoring;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
// custom health bisa dibuat dengan cara berikut
// nama pada monitoring akan tampil my sebagai contoh dan HealthIndicator kan diabaikan
public class MyHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.status(Status.UP);
        builder.withDetail("OKE", "Mantap");
        builder.withDetail("OKE", "Mantap");
        builder.withDetail("OKE", "Mantap");
        builder.withDetail("OKE", "Mantap");
    }
}
