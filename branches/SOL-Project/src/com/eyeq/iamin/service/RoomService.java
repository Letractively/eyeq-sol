package com.eyeq.iamin.service;

import java.io.Serializable;
import java.util.List;

import com.eyeq.iamin.model.Room;
import com.eyeq.iamin.model.User;

public interface RoomService {

	/**
	 * 스터디 룸을 생성함. 스탭별로 가게끔 되어 있는데 인터페이스를 스탭별로 나눌 지 or 스탭을 넘기면서 hidden값으로 같이 넘겨
	 * 한번에 Room을 생성할 것인지 협의
	 * 
	 * @param room
	 */
	Serializable createStudyRoom(Room room);

	/**
	 * 룸 정보 수정. 만약 스탭을 넘기지 않을 경우 updateStudyRoom 에서 스탭2 스탭3 처리.
	 * 
	 * @param room
	 */
	void updateStudyRoom(Room room);

	/**
	 * 스터디 룸 을 생성한 사람에 의해 또는 스터디가 끝남으로써 자동으로 실행되는 메소드임.
	 * 
	 * @param rooms
	 */
	void deleteStudyRooms(List<Room> rooms);

	/**
	 * 하나만 지울경우.
	 * 
	 * @param room
	 */
	void deleteStudyRoom(Room room);

	/**
	 * 룸 정보를 보여줌
	 * 
	 * @param roomSeq
	 * @return
	 */
	Room getStudyRoomByRoomSeq(int roomSeq);

	/**
	 * @param room
	 * @return
	 */
	List<User> getUsersInRoom(Room room);

	/**
	 * @param startCount
	 * @param listCount
	 * @return
	 */
	List<Room> getRooms(int startCount, int listCount);
}