package com.clipio.managers;

import com.clipio.dao.BookmarkDao;
import com.clipio.entities.Book;
import com.clipio.entities.Bookmark;
import com.clipio.entities.Movie;
import com.clipio.entities.User;
import com.clipio.entities.UserBookmark;
import com.clipio.entities.WebLink;

public class BookmarkManager {
	private static BookmarkManager instance = null;

	private BookmarkManager() {
	}

	private static BookmarkDao dao = new BookmarkDao();

	public static BookmarkManager getInstance() {
		if (instance == null) {
			instance = new BookmarkManager();
		}
		return instance;
	}

	public Movie createMovie(long id, String title, int releaseYear, String[] cast, String[] directors, String genre,
			double imdbRating) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		// movie.setProfileUrl(profileUrl);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setReleaseYear(releaseYear);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		return movie;
	}

	// createBook
	public Book createBook(long id, String title, String profileUrl, int publicationYear, String publisher,
			String[] authors, String genre, double amazonRating) {
		Book book = new Book();
		book.setAmazonRating(amazonRating);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setId(id);
		book.setProfileUrl(profileUrl);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setTitle(title);
		return book;

	}
	// createWebLink

	public WebLink createWebLink(long id, String title, String profileUrl, String url, String host) {
		WebLink weblink = new WebLink();
		weblink.setHost(host);
		weblink.setId(id);
		weblink.setProfileUrl(profileUrl);
		weblink.setTitle(title);
		weblink.setUrl(url);
		return weblink;

	}

	public Bookmark[][] getBookmarks() {
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		UserBookmark userBookmark = new UserBookmark();
		userBookmark.setUser(user);
		userBookmark.setBookmark(bookmark);
		dao.saveUserBookmark(userBookmark);
		
	}

}
