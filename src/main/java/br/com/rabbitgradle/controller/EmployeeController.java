package br.com.rabbitgradle.controller;

import br.com.rabbitgradle.channel.EmployeeChannel;
import br.com.rabbitgradle.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {


    private final EmployeeChannel employeeChannel;

    public EmployeeController(EmployeeChannel employeeChannel) {
        this.employeeChannel = employeeChannel;
    }

    @PostMapping("/output")
    public ResponseEntity<?> saveEmployee(@RequestBody final Employee employee){
        Message<Employee> messageEmployee = MessageBuilder
                .withPayload(employee)
                .build();
        employeeChannel.output().send(messageEmployee);

        return ResponseEntity.ok().build();
    }
}