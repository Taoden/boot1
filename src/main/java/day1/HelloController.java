package day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//相当于声明Controller - 提共restful 风格
@EnableAutoConfiguration
//自动配置，不需要写spring的配置文件

class HelloController{

	 @RequestMapping("/hello")//映射路径
	 @ResponseBody//响应体
	 public String hello() {
		 return "Hello World";
	 }

	 public static void main(String[] args) {
		 //启动程序
		 SpringApplication.run(HelloController.class, args);
	 }

 }
