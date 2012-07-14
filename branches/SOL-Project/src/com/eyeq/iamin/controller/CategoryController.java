package com.eyeq.iamin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eyeq.iamin.model.Category;
import com.eyeq.iamin.service.RoomCategoryService;

@Controller
public class CategoryController {

	@Autowired
	private RoomCategoryService roomCategoryService;

	public CategoryController() {
		System.out.println("컨트롤러 초기화");
	}

	@RequestMapping("/category/{categoryId}")
	public String getCategoryList(@PathVariable Integer categoryId, Model model) {
		System.out.println("음");
		return "category/list";
	}

	@RequestMapping(value = "/categoryCreate.action")
	public String createCategory(ModelAndView mav) {
		Category category = new Category();
		category.setCateName("정묵카테고리");
		category.setHits(1);
		roomCategoryService.createCategory(category);
		return "category/list";
	}
}
