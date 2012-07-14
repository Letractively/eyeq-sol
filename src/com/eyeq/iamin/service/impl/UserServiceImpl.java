package com.eyeq.iamin.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.eyeq.iamin.model.Room;
import com.eyeq.iamin.model.User;
import com.eyeq.iamin.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {

	/**
	 * @see com.eyeq.iamin.service.UserService#createUser(com.eyeq.iamin.model.User)
	 */
	@Override
	public Serializable createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.UserService#updateUser(com.eyeq.iamin.model.User)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.UserService#deleteUser(com.eyeq.iamin.model.User)
	 */
	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.UserService#deleteUsers(java.util.List)
	 */
	@Override
	public void deleteUsers(List<User> users) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.UserService#getUserInfo(int)
	 */
	@Override
	public User getUserInfo(int userSeq) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.UserService#getUserJoinStudyRoom(com.eyeq.iamin.model.User,
	 *      int, int)
	 */
	@Override
	public List<Room> getUserJoinStudyRoom(User user, int startCount,
			int listCount) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.UserService#getUserModeratorsStudyRoom(com.eyeq.iamin.model.User,
	 *      int, int)
	 */
	@Override
	public List<Room> getUserModeratorsStudyRoom(User user, int startCount,
			int listCount) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.UserService#userJoinRequestStudyRoom(com.eyeq.iamin.model.User,
	 *      com.eyeq.iamin.model.Room)
	 */
	@Override
	public void userJoinRequestStudyRoom(User user, Room room) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.UserService#userJoinResponseStudyRoom(com.eyeq.iamin.model.User,
	 *      com.eyeq.iamin.model.Room)
	 */
	@Override
	public boolean userJoinResponseStudyRoom(User user, Room room) {
		// TODO Auto-generated method stub
		return false;
	}

}
