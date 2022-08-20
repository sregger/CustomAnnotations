package ie.gannons;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class TraceableAspect {

    @Around("@annotation(Traceable)")
    public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("Calling Annotation Aspect");

//        System.out.println("Input :\n" + joinPoint.getArgs()[0]);
//
//        HttpServletRequest servletRequest = (HttpServletRequest) joinPoint.getArgs()[1];
//
//        System.out.println(servletRequest.getRemoteAddr());

        Object result = joinPoint.proceed();

        System.out.println(result);

        return result;
    }

}
