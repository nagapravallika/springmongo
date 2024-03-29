package com.df.springmongo.amodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "Book")
public class Book  
{
	@Id
	private String _id;
	private int id;
	private String bookName;
	private String authorName;
	
	

}
