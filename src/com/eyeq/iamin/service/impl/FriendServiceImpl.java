package com.eyeq.iamin.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.eyeq.iamin.model.Friend;
import com.eyeq.iamin.service.FriendService;
import com.eyeq.iamin.service.exception.AcceptException;
import com.eyeq.iamin.service.exception.ProposeException;

@Transactional
public class FriendServiceImpl implements FriendService {

	/**
	 * @see com.eyeq.iamin.service.FriendService#propose(int, int)
	 */
	@Override
	public void propose(int userSeq, int friendSeq) throws ProposeException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.FriendService#accept(int, int)
	 */
	@Override
	public void accept(int userSeq, int friendSeq) throws AcceptException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.FriendService#reject(int, int)
	 */
	@Override
	public void reject(int userSeq, int friendSeq) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.FriendService#delete(int, int)
	 */
	@Override
	public void delete(int userSeq, int friendSeq) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.eyeq.iamin.service.FriendService#getRequestFriends(int)
	 */
	@Override
	public List<Friend> getRequestFriends(int userSeq) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.FriendService#getFriend(int, int)
	 */
	@Override
	public Friend getFriend(int userSeq, int friendSeq) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.eyeq.iamin.service.FriendService#getFriends(int, int, int)
	 */
	@Override
	public List<Friend> getFriends(int startCount, int listCount, int userSeq) {
		// TODO Auto-generated method stub
		return null;
	}

}
