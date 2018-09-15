package com.clipio.dao;

import com.clipio.db.DataStore;
import com.clipio.entities.Bookmark;
import com.clipio.entities.UserBookmark;

public class BookmarkDao {
public Bookmark[][] getBookmarks() {
	return DataStore.getBookmarks();
}

public void saveUserBookmark(UserBookmark userBookmark) {
	// TODO Auto-generated method stub
	DataStore.add(userBookmark);
}
}
//controllers->managers->dao