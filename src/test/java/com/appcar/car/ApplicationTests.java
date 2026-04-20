package com.appcar.car;

import com.appcar.car.domain.Driver;
import com.appcar.car.domain.DriverRepository;
import com.appcar.car.interfaces.DriverAPI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void mockupNewUsers(){


		Driver driveTest = new Driver();
		long value  = 1;
		driveTest.setId(value);
		driveTest.setName("test");
		driveTest.setBirthDate(new Date());




	}

}
