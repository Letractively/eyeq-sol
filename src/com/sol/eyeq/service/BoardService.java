package com.sol.eyeq.service;

import java.util.List;

import com.sol.eyeq.model.domain.Board;
import com.sol.eyeq.model.domain.Room;

/**
 * @author 1106303
 * 
 */
/**
 * @author 1106303
 * 
 */
public interface BoardService {

	/**
	 * @param board
	 */
	void createBoard(Board board);

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
	 * 룸에 해당하는 보드를 출력
	 * 
	 * @param room
	 * @return
	 */
	List<Board> showBoardsInRoom(Room room, int listCount);
}
