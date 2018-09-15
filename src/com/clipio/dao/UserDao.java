package com.clipio.dao;

import com.clipio.db.DataStore;
import com.clipio.entities.User;

public class UserDao {
public User[] getUsers() {
	return DataStore.getUsers();
}
}
