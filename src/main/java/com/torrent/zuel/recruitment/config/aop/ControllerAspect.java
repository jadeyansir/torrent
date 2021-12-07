package com.torrent.zuel.recruitment.config.aop;

import com.google.gson.Gson;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 控制器拦截器
 *
 * @author yan
 */
@Aspect
@Order(2)
@Component
public class ControllerAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private Gson gson = new Gson();

    /**
     * region log method execution time
     */
    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    public void logMethod() {
        // the pointcut expression
    }

    /**
     * 方法执行之前 执行该方法
     *
     * @param point 切点
     */
    @Before("logMethod()")
    public void doBefore(JoinPoint point) {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String queryString = request.getQueryString();
        logger.info("url: {}, method: {}, uri: {}, params: {}", url, method, uri, queryString);
        Object[] args = point.getArgs();
        for (Object arg : args) {
            String argStr = gson.toJson(arg);
            logger.info("arg: {}", argStr);
        }
    }

    /**
     * 方法执行之后 执行该方法
     *
     * @param pjp 切点
     * @return 放行结果
     * @throws Throwable 异常
     */
    @Around(value = "logMethod()")
    public Object doAfter(ProceedingJoinPoint pjp) throws Throwable {
        Long beginTime = System.currentTimeMillis();
        String signature = pjp.getSignature().toString();
        logger.info("{} beginTime: {}", signature, beginTime);
        Object retVal = pjp.proceed();
        logger.info("{} endTime: {}", signature, System.currentTimeMillis() - beginTime);
        return retVal;
    }


}