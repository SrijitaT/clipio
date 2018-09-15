package com.clipio.controllers;

import com.clipio.entities.Bookmark;
import com.clipio.entities.User;
import com.clipio.managers.BookmarkManager;

public class BookmarkController {
private static BookmarkController instance=new BookmarkController();
private BookmarkController() {}
public static BookmarkController getInstance() {
	return instance;
}
public void saveUserBookmark(User user, Bookmark bookmark) {
	// TODO Auto-generated method stub
	BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
}
}
