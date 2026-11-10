package com.example.demo;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class CourseContoller {
	
	@RequestMapping("/courses") 
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28Minutes"),
				new Course(2, "Learn Devops", "in28Minutes"),
				new Course(3, "Learn Azure", "in28Minutes"),
				new Course(4, "Learn GCP", "in28Minutes")
				);
	}

}
