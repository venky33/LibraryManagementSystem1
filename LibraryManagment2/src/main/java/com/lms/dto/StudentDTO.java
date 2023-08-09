package com.lms.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
	private int id;
	@NotNull(message="Name can't be null")
	@NotBlank(message="Name can't be be empty")
	@Size(min=3,max=20)
	private String name;
	@NotNull(message="Name can't be null")
	private String address;
	@Pattern(regexp="\\d{10}",message="Invalid MobileNumber")
	private String mobileNumber;

}