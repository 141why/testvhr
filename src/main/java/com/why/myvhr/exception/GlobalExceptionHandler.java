package com.why.myvhr.exception;

import com.why.myvhr.util.ResultBean;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 异常处理与前端的数据交互
     *  分离开发：返回json
     */
    @ExceptionHandler(EmployeeException.class)
    public ResultBean<String> employeeHandler(HttpServletRequest request, HttpServletResponse response, Exception exception){
        response.setStatus(500);
        return ResultBean.error(500, "雇员模块操作失败");
    }

    @ExceptionHandler(UnknownAccountException.class)
    public ResultBean<String> unknownAccountHandler(HttpServletRequest request, HttpServletResponse response, Exception exception){
        response.setStatus(500);
        return ResultBean.error(500, "未知账户");
    }

    @ExceptionHandler(LockedAccountException.class)
    public ResultBean<String> lockedAccountHandler(HttpServletRequest request, HttpServletResponse response, Exception exception){
        response.setStatus(500);
        return ResultBean.error(500, "账户已经锁定");
    }

    @ExceptionHandler(ExcessiveAttemptsException.class)
    public ResultBean<String> excessiveAttemptsHandler(HttpServletRequest request, HttpServletResponse response, Exception exception){
        response.setStatus(500);
        return ResultBean.error(500, "账户或者密码错误次数过多，请明天再试");
    }
//
//    @ExceptionHandler(UnauthorizedException.class)
//    public ResultBean<String> unauthorizedHandler(HttpServletRequest request, HttpServletResponse response, Exception exception){
//        response.setStatus(500);
//        return ResultBean.error(500, "权限不足");
//    }

}
