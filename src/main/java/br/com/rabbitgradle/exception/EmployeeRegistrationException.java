package br.com.rabbitgradle.exception;

public class EmployeeRegistrationException extends RuntimeException{

    public EmployeeRegistrationException(String mensagem){
        super(mensagem);
    }
}
