package com.aithinkers.custom.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//Define default course code
	public String value() default "LUV";
	
	//Define default error message
	public String message() default "Must starts with LUV";
	
	//Define default groupes
	public Class <?>[] groups() default {};
	
	//Define default payloads
	public Class <? extends Payload>[] payload() default {};


}
