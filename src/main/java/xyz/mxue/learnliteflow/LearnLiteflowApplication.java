package xyz.mxue.learnliteflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//把你定义的组件扫入Spring上下文中
public class LearnLiteflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnLiteflowApplication.class, args);
	}

}
