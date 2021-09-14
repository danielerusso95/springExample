package it.softwareinside.classibean;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import org.junit.jupiter.api.Test;

import it.softwareinside.classibean.model.User;

class test {

	@Test
	void test() {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		User user = new User();
		user.setName("aldo");
		user.setAge(17);
		user.setWorking(true);
		user.setEmail("ciaociao");
		Set<ConstraintViolation<User>> violations = validator.validate(user);
		for (ConstraintViolation<User> constraintViolation : violations) {
			System.out.println(constraintViolation.getInvalidValue());
			System.out.println(constraintViolation.getMessage());
		}		
		assertTrue(user.getAge()==17);
	}

}
