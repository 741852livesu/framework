package com.live;

import com.live.config.BaseConfigration;
import com.live.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(BaseConfigration.class);
        Logger log = LoggerFactory.getLogger(BaseConfigration.class);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BaseConfigration.class);
        Student student = applicationContext.getBean(Student.class);
        log.info("获取的student..."+student.getName());
    }

}
