package com.sol.eyeq.service;

import java.util.List;

import com.sol.eyeq.model.domain.Category;
import com.sol.eyeq.model.domain.Room;

public interface RoomCategoryService {

	/**
	 * @param category
	 */
	void createCategory(Category category);

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
	 * @param listCount
	 * @return
	 */
	List<Category> showCategories(int listCount);

	/**
	 * @param category
	 * @param listCount
	 * @return
	 */
	List<Room> showCategoryInRoom(Category category, int listCount);

}
