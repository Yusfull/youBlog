/**
 * 
 */
package blog.medel;

import java.util.Date;

/**
 * @author khunga
 *
 */
public class Post {

	private Long id;
	private String title;
	private String body;
	private User author;
	private Date date = new Date();
	
	
	
	
	/**
	 * 
	 */
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param title
	 * @param body
	 * @param author
	 * @param date
	 */
	public Post(Long id, String title, String body, User author) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.author = author;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * @return the author
	 */
	public User getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(User author) {
		this.author = author;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", author=" + author + ", date=" + date + "]";
	}
	
	
	
	
}
