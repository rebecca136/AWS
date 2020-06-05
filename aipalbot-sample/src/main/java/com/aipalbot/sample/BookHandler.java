package com.aipalbot.sample;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class BookHandler implements  RequestHandler<BookRequest, BookResponse> {

	@Override
	public BookResponse handleRequest(BookRequest input, Context context) {
		
		List<Book> books = new ArrayList<>();
		Book b = new Book();
		b.setAuthor("Aipalbot");
		Book b1 = new Book();
		b1.setAuthor("Robot");
		books.add(b);
		books.add(b1);
		
		
		BookResponse response = new BookResponse();
		response.setStatusCode(200);
		response.setBody(books);
		
		return response;
		
		
	}

}
