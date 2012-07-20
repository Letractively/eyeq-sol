package com.eyeq.iamin.service.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eyeq.iamin.model.Category;
import com.eyeq.iamin.model.Room;
import com.eyeq.iamin.service.RoomCategoryService;

@Transactional
@Service("roomCategoryService")
public class RoomCategoryServiceImpl implements RoomCategoryService {

	@Autowired
	private SessionFactory factory;

	@Override
	public Serializable createCategory(Category category) {
		Session session = factory.getCurrentSession();
		return session.save(category);
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
	public List<Room> getRoomInCategory(Category category, int startCount,
			int listCount) {
		// TODO Auto-generated method stub
		return null;
	}


}
