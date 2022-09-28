package ca.sheridancollege.teasdaco.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.teasdaco.beans.Course;

@Controller
public class CourseController {
	List<Course> courseList = new CopyOnWriteArrayList<Course>();

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("courseList", courseList);
		return "index";
	}
	
	@PostMapping("/addCourse")
	public String 
}
