package com.evy.core.aop;

import com.evy.core.exception.EvyException;
import com.evy.core.returns.ApiResult;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jonny
 * @Description:全局异常处理处理器
 * @date 2018/4/5下午2:18
 */
@ControllerAdvice("com.evy.controller") //此注解会切到到所有的@Controller注解，对Controller做增强
public class GlobalExceptionHandler {

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {}

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        //model.addAttribute("author", "Magical Sam");
    }

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ApiResult errorHandler(Exception ex) throws Exception {
        if(ex instanceof EvyException){
            return ApiResult.failWithException((EvyException)ex);
        }else  if (ex instanceof BindException){
            return ApiResult.failWithMessage(ex.getMessage().substring(ex.getMessage().lastIndexOf("[")));
        }
        else{
            ex.printStackTrace();
            return ApiResult.failWithMessage("未知异常");
        }
    }
}
