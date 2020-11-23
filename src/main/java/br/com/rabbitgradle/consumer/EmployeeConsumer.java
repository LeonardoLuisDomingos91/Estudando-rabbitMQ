package br.com.rabbitgradle.consumer;

import br.com.rabbitgradle.domain.Employee;
import br.com.rabbitgradle.exception.EmployeeRegistrationException;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConsumer {

    @StreamListener("input")
    public void listen(final Employee employee) {
        System.out.println("MSG: " + employee);

        if(employee.getLastName() == null) {
            throw new EmployeeRegistrationException("msg rejeitada");
        }
    }
}
