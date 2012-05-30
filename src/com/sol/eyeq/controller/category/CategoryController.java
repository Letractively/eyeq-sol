package com.sol.eyeq.controller.category;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	public CategoryController() {
		System.out.println("컨트롤러 초기화");
	}

	@RequestMapping("/category/{categoryId}")
	public String getCategoryList(@PathVariable Integer categoryId, Model model) {
		System.out.println("음");
		return "category/list";
	}
}
