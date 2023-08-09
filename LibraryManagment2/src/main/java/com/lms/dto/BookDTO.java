package com.lms.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Builder
@NoArgsConstructor
public class BookDTO {

	private int id;
	
	//@NotBlank(message="Empty Not Allowed")
	@NotBlank(message = "Name Of the Book Is Not Null")
	@Size(min = 3, max = 10, message = "Name must be within 3-10 characters")
	private String bookName;
	
	@NotBlank(message = "Empty Not Allowed")
	private String publisher;
	
	@NotBlank(message = "Empty Not Allowed")
	private String author;
	
}
