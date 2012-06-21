package com.sol.eyeq.service;

import java.io.Serializable;
import java.util.List;

import com.sol.eyeq.model.domain.Category;
import com.sol.eyeq.model.domain.Room;

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
