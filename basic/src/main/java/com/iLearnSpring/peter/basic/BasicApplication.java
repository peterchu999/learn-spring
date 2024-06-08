package com.iLearnSpring.peter.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicApplication {
	// what are the beans ? (@Component)
	// what are the beans dependencies ? (@Autowired)
	// Where to search beans ? (@SpringBootApplication)
		// spring automatically scan the main package and sub package of  @SpringBootApplication class
	public static void main(String[] args) {
		// Application Context would manage the beans
		ApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);
		BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);
		int result = bs.search(new int[] {1,2,3,4},0);
		System.out.println(result);


		// manual way
		Sort sortAlgo = new BubbleSortImpl();
		BinarySearchImpl bsm = new BinarySearchImpl(sortAlgo);
		int resultm = bs.search(new int[] {1,2,3,4},0);
		System.out.println(resultm);

	}

}
