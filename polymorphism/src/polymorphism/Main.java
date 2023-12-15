package polymorphism;

import polymorphism.business.CategoryManager;
import polymorphism.business.CoursesManager;
import polymorphism.business.InstructorsManager;
import polymorphism.core.DatabaseLogger;
import polymorphism.core.FileLogger;
import polymorphism.core.Logger;
import polymorphism.dataAccess.JdbcDao;
import polymorphism.entites.Category;
import polymorphism.entites.Courses;
import polymorphism.entites.Instructors;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger [] loggers = {new FileLogger  (), new DatabaseLogger(), new FileLogger()};
		
		Category category = new Category("Back-end");
		CategoryManager categoryManager = new CategoryManager( new JdbcDao(), loggers);
		categoryManager.add(category);
		System.out.println();
		Courses courses = new Courses("JAVA", 110);
		CoursesManager coursesManager = new CoursesManager(new JdbcDao(), loggers);
		coursesManager.add(courses);
		System.out.println();
		Instructors instructors = new Instructors("Ali");
		InstructorsManager instructorsManager = new InstructorsManager( new JdbcDao(), loggers);
		instructorsManager.add(instructors);
	}

}
