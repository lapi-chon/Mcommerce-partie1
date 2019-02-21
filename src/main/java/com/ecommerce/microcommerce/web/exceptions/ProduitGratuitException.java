package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class ProduitGratuitException extends Exception{

	private static final long serialVersionUID = -190178348184495549L;

	public ProduitGratuitException(String s) {
		super(s);
	}
}
