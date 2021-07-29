package com.live.springmvc.resolver;

import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月26日 15:17
 * @version: 1.0
 */

public class PrincipalMethodArgumentResolver implements HandlerMethodArgumentResolver {


    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        Class<?> paramType = parameter.getParameterType();
        return parameter.getParameterType().isAssignableFrom(paramType);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, @Nullable ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, @Nullable WebDataBinderFactory binderFactory) throws Exception {

        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        if (request == null) {
            throw new IllegalStateException("Current request is not of type HttpServletRequest: " + webRequest);
        }

        Principal principal = request.getUserPrincipal();
        if (principal != null && !parameter.getParameterType().isInstance(principal)) {
            throw new IllegalStateException("Current user principal is not of type [" +
                    parameter.getParameterType().getName() + "]: " + principal);
        }

        return principal;
    }

}