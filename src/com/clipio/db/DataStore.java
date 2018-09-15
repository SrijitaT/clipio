package com.clipio.db;

import com.clipio.constants.Gender;
import com.clipio.constants.MovieGenre;
import com.clipio.constants.UserType;
import com.clipio.entities.Bookmark;
import com.clipio.entities.User;
import com.clipio.entities.UserBookmark;
import com.clipio.managers.BookmarkManager;
import com.clipio.managers.UserManager;

public class DataStore {
public static final int USER_BOOKMARK_LIMIT = 5;
public static final int BOOKMARK_COUNT_PER_TYPE = 5;
public static final int BOOKMARK_TYPE_COUNT = 3;
public static final int TOTAL_USER_COUNT = 5;
private static User[] users=new User[TOTAL_USER_COUNT];
public static User[] getUsers() {
	return users;
}

private static Bookmark[][] bookmarks=new Bookmark[BOOKMARK_TYPE_COUNT][BOOKMARK_COUNT_PER_TYPE];
public static Bookmark[][] getBookmarks() {
	return bookmarks;
}

private static UserBookmark[] userBookmarks=new UserBookmark[TOTAL_USER_COUNT*USER_BOOKMARK_LIMIT];
private static int bookmarkIndex=0;


public UserBookmark[] getUserBookmark() {
	return userBookmarks;
}



public static void loadData() {
	loadUsers();
	loadWebLinks();
	loadMovies();
	loadBooks();
}



private static void loadUsers() {
	users[0]=UserManager.getInstance().createUser(1000, "user0@gmail.com", "test", "John", "M", Gender.MALE, UserType.USER);
	users[1]=UserManager.getInstance().createUser(1001, "user1@gmail.com", "test", "Srijita", "Thakur", Gender.FEMALE, UserType.USER);
	users[2]=UserManager.getInstance().createUser(1002, "user2@gmail.com", "test", "Ankur", "S", Gender.MALE, UserType.EDITOR);
	users[3]=UserManager.getInstance().createUser(1003, "user3@gmail.com", "test", "Souvik", "Thakur", Gender.MALE, UserType.EDITOR);
	users[4]=UserManager.getInstance().createUser(1004, "user4@gmail.com", "test", "Keya", "Thakur", Gender.FEMALE, UserType.CHIEF_EDITOR);
}

private static void loadWebLinks() {
	bookmarks[0][0]=BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", 
			"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com", "unknown");
	bookmarks[0][1]=BookmarkManager.getInstance().createWebLink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", 
			"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "http://www.stackoverflow.com", "unknown");
	bookmarks[0][2]=BookmarkManager.getInstance().createWebLink(2002, "Interface vs Abstract Class", 
			"http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com", "unknown");
	bookmarks[0][3]=BookmarkManager.getInstance().createWebLink(2003, "NIO tutorial by Greg Travis", 
			"http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.edu", "unknown");
	bookmarks[0][4]=BookmarkManager.getInstance().createWebLink(2004, "Virtual Hosting and Tomcat", 
			"http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "http://tomcat.apache.org", "unknown");
}


private static void loadMovies() {
	// TODO Auto-generated method stub
	bookmarks[1][0]=BookmarkManager.getInstance().createMovie(3000,"Citizen Kane",1941,new String[] {"Orson Welles,Joseph Cotten"},new String[] {"Orson Welles"},MovieGenre.CLASSICS,8.5);
	bookmarks[1][1]=BookmarkManager.getInstance().createMovie(3001,"The Grapes of Wrath",1940,new String[] {"Henry Fonda,Jane Darwell"},new String[]{"John Ford"},MovieGenre.CLASSICS,8.2);
	bookmarks[1][2]=BookmarkManager.getInstance().createMovie(3002,"A Touch of Greatness",2004,new String[] {"Albert Cullum"},new String[] {"Leslie Sullivan"},MovieGenre.DOCUMENTARIES,7.3);
	bookmarks[1][3]=BookmarkManager.getInstance().createMovie(3003,"The Big Bang Theory",2007,new String[] {"Kaley Cuoco,Jim Parsons"},new String[] {"Chuck Lorre,Bill Prady"},MovieGenre.TV_SHOWS,8.7);
	bookmarks[1][3]=BookmarkManager.getInstance().createMovie(3004,"Ikiru",1952,new String[] {"Takashi Shimura,Minoru Chiaki"},	new String[] {"Akira Kurosawa"}	,MovieGenre.FOREIGN_MOVIES,8.4);
}

private static void loadBooks() {
	// TODO Auto-generated method stub
	bookmarks[2][0]=BookmarkManager.getInstance().createBook(4000,"Walden","",1854,"Wilder Publications",new String[] {"Henry David Thoreau"},"Philosophy",4.3);
	bookmarks[2][1]=BookmarkManager.getInstance().createBook(4001,"Self-Reliance and Other Essays","",1900,"Dover Publications",new String[] {"Henry David Thoreau"},"Philosophy",4.3);
	bookmarks[2][2]=BookmarkManager.getInstance().createBook(4002,"Light From Many Lamps","",1960,"Wilder Publications",new String[] {"Henry David Thoreau"},"Philosophy",4.3);
	bookmarks[2][3]=BookmarkManager.getInstance().createBook(4003,"Head First Design Patterns","",1944,"Wilder Publications",new String[] {"Henry David Thoreau"},"Philosophy",4.3);
	bookmarks[2][4]=BookmarkManager.getInstance().createBook(4004,"Effective Java Programming Language Guide","",1990,"Wilder Publications",new String[] {"Eric Freeman","Bert Bates","Kathy Sierra","Elisabeth Robson"},"Philosophy",4.3);
}



public static void add(UserBookmark userBookmark) {
	// TODO Auto-generated method stub
		userBookmarks[bookmarkIndex++]=userBookmark;
	
}
}
