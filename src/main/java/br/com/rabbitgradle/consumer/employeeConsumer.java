package br.com.rabbitgradle.consumer;

import br.com.rabbitgradle.domain.Employee;
import br.com.rabbitgradle.exception.FuncionarioCadastroException;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class employeeConsumer {

    @StreamListener("input")
    final public void listen(Employee employee) throws Exception {
        System.out.println("MSG: " + employee);

        if(employee.getLastName().isEmpty()) {
            throw new FuncionarioCadastroException("msg rejeitada");
        }
    }
}
