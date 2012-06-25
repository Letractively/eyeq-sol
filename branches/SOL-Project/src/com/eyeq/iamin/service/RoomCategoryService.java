package com.eyeq.iamin.service;

import java.io.Serializable;
import java.util.List;

import com.eyeq.iamin.model.domain.Category;
import com.eyeq.iamin.model.domain.Room;

/**
 * @author 1106303
 * 
 */
public interface RoomCategoryService {

	/**
	 * @param category
	 */
	Serializable createCategory(Category category);

	/**
	 * @param category
	 */
	void updateCategory(Category category);

	/**
	 * @param categories
	 */
	void deleteCategories(List<Category> categories);

	/**
	 * @param category
	 */
	void deleteCategory(Category category);

	/**
	 * @param startCount
	 * @param listCount
	 * @return
	 */
	List<Category> getCategories(int startCount, int listCount);

	/**
	 * @param category
	 * @param startCount
	 * @param listCount
	 * @return
	 */
	List<Room> getCategoryInRoom(Category category, int startCount,
			int listCount);

}
