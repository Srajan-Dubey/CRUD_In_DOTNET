package com.crudOp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Books 
{
	public Books()
	{
		super();
	}
	public Books(int bookid,String bookname,String author,int price)
	{
		super();
		this.bookid=bookid;
		this.bookname=bookname;
		this.author=author;
		this.price=price;
	}
	//defining book id as a primary key
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int bookid;
	@Column(name="book_name")
	private String bookname;
	@Column(name="author_name")
	private String author;
	@Column(name="price")
	private int price;
	public int getBookid()
	{
		return bookid;
	}
	public void setBookid(int bookid)
	{
		this.bookid=bookid;
	}
	public String getBookname()
	{
		return bookname;
	}
	public void setbookname(String bookname)
	{
		this.bookname=bookname;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public int getPrice(int price)
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
}
