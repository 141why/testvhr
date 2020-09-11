package com.why.myvhr.exception;


/**
 *  Exception
 *      继承 运行期异常
 */
public class EmployeeException extends  RuntimeException{

    public EmployeeException(){
        super();
    }

    public EmployeeException(String message){
        super(message);
    }
}
