package org.whyte.main.MessengerSQL_JAX_RS.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message 
{
	private int id;
	private String message;
	private String author;
	
	//Empty constructor needed if we are returning JSON or XML responses
	//Important for XML or JSON conversion
	//Message will be returned as an XML or JSON response, to do this the
	//Jersey framework needs to be able to create a new instance of my class
	//hence the empty constructor
	public Message()
	{
		
	}
	
	//Constructor
	public Message(int id, String message, String author)
	{
		this.id = id;
		this.message = message;
		this.author = author;
	}
	
	//Getters and Setters
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
}
