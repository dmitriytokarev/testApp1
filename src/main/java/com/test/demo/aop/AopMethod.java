package com.test.demo.aop;


import lombok.Data;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Aspect
@Data
public class AopMethod {
    StringToPdf stringToPdf;
    AopMethod (StringToPdf stringToPdf){
        this.stringToPdf = stringToPdf;
    }

        @Pointcut("@annotation(AopAnnotation)")
        public void callAtMyServicePublic() {
        }

        @Before("callAtMyServicePublic()")     // нужно повесить на анотацию
        public void saveString(JoinPoint jp) {
            System.out.println(jp.getArgs());
            System.out.println(jp.getSignature().getName());
            List ss = Arrays.stream(jp.getArgs()).collect(Collectors.toList());

            System.out.println(ss);

            System.out.println(jp.getSignature().getClass().isArray());


            System.out.println("before");

            for(Object name : ss){
                System.out.println(name);
            }
            System.out.println(ss.get(0).toString());
            stringToPdf.converter(ss.get(0).toString());
        }

    }
