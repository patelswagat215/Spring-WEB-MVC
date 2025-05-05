package com.aithinkers.model;

import com.aithinkers.custom.validation.CourseCode;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName="";
	
	@NotNull(message="is required")	
	@Min(value=0,message="Must be greater than or equal to 0")
	@Max(value=10, message="Must be less than or equal to 10")
	private Integer freePass;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 characters/digits")
	private String postalCode;
	
	@CourseCode
	private String courseCode;

}
