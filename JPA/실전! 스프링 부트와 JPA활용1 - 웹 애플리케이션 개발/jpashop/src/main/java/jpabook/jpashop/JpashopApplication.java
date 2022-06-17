package jpabook.jpashop;

import jpabook.jpashop.etc.LombokTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		// lombok 테스트
		// 자동변수 만들기 => command+option+v
		LombokTest lombokTest = new LombokTest();
		lombokTest.setData("lombok테스트");
		String lombokTestData = lombokTest.getData();


		SpringApplication.run(JpashopApplication.class, args);
	}

}
