package org.whyte.main.MessengerSQL_JAX_RS.resource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.whyte.main.MessengerSQL_JAX_RS.data.Database;
import org.whyte.main.MessengerSQL_JAX_RS.model.Message;

@Path("messages")
public class Messages 
{
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getAllMessages() 
    {
		Database db = new Database();
		ResultSet results;
		
		List<Message> msgList = new ArrayList<Message>();
		results = db.getResults("SELECT ID, Message, Author FROM messages");
		
		try 
		{
			while(results.next())
			{
				Message msg = new Message(Integer.parseInt(results.getString(1)), results.getString(2),
										results.getString(3));
				
				msgList.add(msg);
			}
		} 
		catch(SQLException e) 
		{
			System.out.println("Cant loop");
		}
		
		return msgList;
    }
}
