package com.aithinkers.custom.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	public void initialize(CourseCode code) {
		coursePrefix = code.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theContext) {

	    if (theCode == null) {
	        return true;
	    }

	    return theCode.startsWith(coursePrefix);
	}


}
