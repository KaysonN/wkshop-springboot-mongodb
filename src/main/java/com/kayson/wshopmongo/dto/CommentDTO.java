package com.kayson.wshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

	// numero de versão
	private static final long serialVersionUID = 1L;

	// atributos
	private String textComment;
	private Date date;
	private AuthorDTO author;

	// construtores
	public CommentDTO() {

	}

	public CommentDTO(String textComment, Date date, AuthorDTO author) {
		super();
		this.textComment = textComment;
		this.date = date;
		this.author = author;
	}

	public String getTextComment() {
		return textComment;
	}

	// getters e setters
	public void setTextComment(String textComment) {
		this.textComment = textComment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

}
