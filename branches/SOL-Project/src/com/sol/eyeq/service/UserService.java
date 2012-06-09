package com.sol.eyeq.service;

import java.util.List;

import com.sol.eyeq.model.domain.Room;
import com.sol.eyeq.model.domain.User;

public interface UserService {

	/**
	 * @param user
	 */
	void createUser(User user);

	/**
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * @param user
	 */
	void deleteUser(int userSeq);
	
	/**
	 * @param user
	 */
	void mergeUpdateUser(User user);

	/**
	 * @param users
	 */
	void deleteUsers(List<Integer> userSeq);

	/**
	 * @param userSeq
	 * @return
	 */
	User showUserInfo(int userSeq);

	/**
	 * 유저가 참여한 룸 목록
	 * 
	 * @param user
	 * @param listCount
	 * @return
	 */
	List<Room> showUserJoinStudyRoom(User user, int listCount);

	/**
	 * 유저가 룸장으로 생성한 룸 목록
	 * 
	 * @param user
	 * @param listCount
	 * @return
	 */
	List<Room> showUserModeratorsStudyRoom(User user, int listCount);

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
	
	/**
	 * @param userSeq
	 * @return
	 */
	Integer getRoomsCount(int userSeq);
}
