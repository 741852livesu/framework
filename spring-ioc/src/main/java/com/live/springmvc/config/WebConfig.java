package com.live.springmvc.config;

import com.live.springmvc.resolver.CurrentUserNameHandlerMethodArgumentResolver;
import com.live.springmvc.resolver.PrincipalMethodArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Description:
 * @author: sulh
 * @date: 2021年07月15日 16:40
 * @version: 1.0
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new PrincipalMethodArgumentResolver());
        resolvers.add(new CurrentUserNameHandlerMethodArgumentResolver());
    }

}