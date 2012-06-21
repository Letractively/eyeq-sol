package com.sol.eyeq.service;

import java.io.Serializable;
import java.util.List;

import com.sol.eyeq.model.domain.Board;
import com.sol.eyeq.model.domain.Room;

public interface BoardService {

	/**
	 * @param board
	 */
	Serializable createBoard(Board board);

	/**
	 * @param board
	 */
	void updateBoard(Board board);

	/**
	 * @param boards
	 */
	void deleteBoards(List<Board> boards);

	/**
	 * @param board
	 */
	void deleteBoard(Board board);

	/**
	 * @param board
	 */
	void mergeUpdateBoards(Board board);
	
	/**
	 * @param room
	 * @param startCount
	 * @param listCount
	 * @return
	 */
	List<Board> getBoardsInRoom(Room room, int startCount, int listCount);

	/**
	 * @param room
	 * @param startCount
	 * @param listCount
	 * @param searchType
	 * @param searchKeyword
	 * @return
	 */
	List<Board> getBoardsInRoom(Room room, int startCount, int listCount,
			String searchType, String searchKeyword);

}
