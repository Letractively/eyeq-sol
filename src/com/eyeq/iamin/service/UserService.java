package com.eyeq.iamin.service;

import java.io.Serializable;
import java.util.List;

import com.eyeq.iamin.model.Room;
import com.eyeq.iamin.model.User;

public interface UserService {

	/**
	 * @param user
	 */
	Serializable createUser(User user);

	/**
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * @param user
	 */
	void deleteUser(User user);

	/**
	 * @param users
	 */
	void deleteUsers(List<User> users);

	/**
	 * @param userSeq
	 * @return
	 */
	User getUserInfo(int userSeq);

	/**
	 * 유저가 참여한 룸 목록
	 * 
	 * @param user
	 * @param listCount
	 * @return
	 */
	List<Room> getUserJoinStudyRoom(User user, int startCount, int listCount);

	/**
	 * 유저가 룸장으로 생성한 룸 목록
	 * 
	 * @param user
	 * @param startCount
	 * @param listCount
	 * @return
	 */
	List<Room> getUserModeratorsStudyRoom(User user, int startCount,
			int listCount);

	/**
	 * 유저가 스터디 그룹에 참여 요청
	 * 
	 * @param user
	 * @param room
	 * @return
	 */
	void userJoinRequestStudyRoom(User user, Room room);

	/**
	 * 룸 주인인 유저가 승인해줄것인지 응답함.
	 * 
	 * @param user
	 * @param room
	 * @return
	 */
	boolean userJoinResponseStudyRoom(User user, Room room);
}
