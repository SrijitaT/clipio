import com.clipio.db.DataStore;
import com.clipio.entities.Bookmark;
import com.clipio.entities.User;
import com.clipio.managers.BookmarkManager;
import com.clipio.managers.UserManager;

public class Launch {
	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		System.out.println("1. Loading data...");
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		System.out.println("Printing User data....");
		printUserData();
		System.out.println("Printing Bookmark data....");
		printBookmarkData();

	}

	private static void printBookmarkData() {
		// TODO Auto-generated method stub
		
		  for (Bookmark[] bookmarkList : bookmarks) { 
			  for (Bookmark bookmark : bookmarkList)
			  {
				  System.out.println(bookmark);
			  }
			}	
	}

	private static void printUserData() {
		// TODO Auto-generated method stub
		for (User user : users) {
			System.out.println(user);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadData();
		startBookmarking();
	}

	private static void startBookmarking() {
		// TODO Auto-generated method stub
		System.out.println("2. Bookmarking ....");
		for (User user : users) {
			View.bookmark(user, bookmarks);
		}
	}

}
