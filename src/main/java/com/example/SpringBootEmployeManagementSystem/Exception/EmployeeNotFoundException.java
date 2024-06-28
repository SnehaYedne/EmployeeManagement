
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)

package com.example.SpringBootEmployeManagementSystem.Exception;public class EmployeeNotFoundException {
   private static final long serialVersionID=5088656766912L;
    public  EmployeeNotFoundException(String message){
        super(message);
    }
}

   
