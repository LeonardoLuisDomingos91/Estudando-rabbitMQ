package br.com.rabbitgradle.consumer;

import br.com.rabbitgradle.domain.Employee;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class employeeConsumer {

    @StreamListener("input")
    public void listen(Employee employee) {
        System.out.println("consumiu " + employee);
    }
}
