package com.eyeq.iamin.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.eyeq.iamin.model.Board;
import com.eyeq.iamin.model.Room;
import com.eyeq.iamin.service.BoardService;

@Transactional
public class BoardServiceImpl implements BoardService {

	/**
	 * @see com.eyeq.iamin.service.BoardService#createBoard(com.eyeq.iamin.model.Board)
	 */
	@Override
	public Serializable createBoard(Board board) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.BoardService#updateBoard(com.eyeq.iamin.model.Board)
	 */
	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.BoardService#deleteBoards(java.util.List)
	 */
	@Override
	public void deleteBoards(List<Board> boards) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.BoardService#deleteBoard(com.eyeq.iamin.model.Board)
	 */
	@Override
	public void deleteBoard(Board board) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.BoardService#mergeBoards(com.eyeq.iamin.model.Board)
	 */
	@Override
	public void mergeBoards(Board board) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.BoardService#getBoardsInRoom(com.eyeq.iamin.model.Room,
	 *      int, int)
	 */
	@Override
	public List<Board> getBoardsInRoom(Room room, int startCount, int listCount) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.BoardService#getBoardsInRoom(com.eyeq.iamin.model.Room,
	 *      int, int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Board> getBoardsInRoom(Room room, int startCount,
			int listCount, String searchType, String searchKeyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
