package com.eyeq.iamin.service;

import java.util.List;

import com.eyeq.iamin.model.Friend;
import com.eyeq.iamin.service.exception.AcceptException;
import com.eyeq.iamin.service.exception.ProposeException;

/**
 * @author 1106303
 * 
 */
public interface FriendService {

	/**
	 * @param userSeq
	 * @param friendSeq
	 * @throws ProposeException
	 */
	void propose(int userSeq, int friendSeq) throws ProposeException;

	/**
	 * @param userSeq
	 * @param friendSeq
	 * @throws AcceptException
	 */
	void accept(int userSeq, int friendSeq) throws AcceptException;

	/**
	 * @param userSeq
	 * @param friendSeq
	 */
	void reject(int userSeq, int friendSeq);

	/**
	 * @param userSeq
	 * @param friendSeq
	 */
	void delete(int userSeq, int friendSeq);

	/**
	 * @param userSeq
	 * @return
	 */
	List<Friend> getRequestFriends(int userSeq);

	/**
	 * @param userSeq
	 * @param friendSeq
	 * @return
	 */
	Friend getFriend(int userSeq, int friendSeq);

	/**
	 * @param startCount
	 * @param listCount
	 * @param userSeq
	 * @return
	 */
	List<Friend> getFriends(int startCount, int listCount, int userSeq);
}
