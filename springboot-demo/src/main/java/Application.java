package src.main.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hs on 2017/4/27.
 */

@SpringBootApplication
@RestController
public class Application {



    @RequestMapping("/")
    public String test(){
        return "hello world 我是欢欢 来不来";
    }

    @RequestMapping("/hello")
    public  String hello(){

        return "你好 spring boot";
    }

    @RequestMapping("/huijia")
    public String huijia(){
        return "晚上就回家了，好开心";
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
