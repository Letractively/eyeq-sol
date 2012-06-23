package com.sol.eyeq.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sol.eyeq.model.domain.Category;
import com.sol.eyeq.model.domain.Room;
import com.sol.eyeq.service.RoomCategoryService;

@Transactional
public class RoomCategoryServiceImpl implements RoomCategoryService {

	@Override
	public Serializable createCategory(Category category) {
		return null;
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategories(List<Category> categories) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> getCategories(int startCount, int listCount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Room> getCategoryInRoom(Category category, int startCount,
			int listCount) {
		// TODO Auto-generated method stub
		return null;
	}

}
