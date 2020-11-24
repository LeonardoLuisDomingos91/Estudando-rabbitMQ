package br.com.rabbitgradle.exception;

public class EmployeeRegistrationException extends RuntimeException{

    public EmployeeRegistrationException(final String mensagem){
        super(mensagem);
    }
}
