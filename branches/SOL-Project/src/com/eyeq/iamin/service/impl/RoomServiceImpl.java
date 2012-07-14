package com.eyeq.iamin.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.eyeq.iamin.model.Room;
import com.eyeq.iamin.model.User;
import com.eyeq.iamin.service.RoomService;

@Transactional
public class RoomServiceImpl implements RoomService {

	/**
	 * @see com.eyeq.iamin.service.RoomService#createStudyRoom(com.eyeq.iamin.model.Room)
	 */
	@Override
	public Serializable createStudyRoom(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.RoomService#updateStudyRoom(com.eyeq.iamin.model.Room)
	 */
	@Override
	public void updateStudyRoom(Room room) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.RoomService#deleteStudyRooms(java.util.List)
	 */
	@Override
	public void deleteStudyRooms(List<Room> rooms) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.RoomService#deleteStudyRoom(com.eyeq.iamin.model.Room)
	 */
	@Override
	public void deleteStudyRoom(Room room) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.RoomService#getStudyRoomByRoomSeq(int)
	 */
	@Override
	public Room getStudyRoomByRoomSeq(int roomSeq) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.RoomService#getUsersInRoom(com.eyeq.iamin.model.Room)
	 */
	@Override
	public List<User> getUsersInRoom(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.RoomService#getRooms(int, int)
	 */
	@Override
	public List<Room> getRooms(int startCount, int listCount) {
		// TODO Auto-generated method stub
		return null;
	}

}
