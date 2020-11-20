package br.com.rabbitgradle;

import br.com.rabbitgradle.channel.EmployeeChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({EmployeeChannel.class})
public class RabbitGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitGradleApplication.class, args);
	}

}
