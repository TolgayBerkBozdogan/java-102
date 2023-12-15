package kodlamaio;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CoursesManager;
import kodlamaio.business.InstructorsManager;
import kodlamaio.core.DataLogger;
import kodlamaio.core.FileLogger;
import kodlamaio.core.Logger;
import kodlamaio.core.MailLogger;
import kodlamaio.dataAccess.JdbcDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Courses;
import kodlamaio.entities.Instructors;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DataLogger(), new FileLogger(), new MailLogger() };

		Category category = new Category("Back-end");
		CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers);
		categoryManager.add(category);
		System.out.println();

		Courses courses = new Courses("JAVA", 0);
		CoursesManager coursesManager = new CoursesManager(new JdbcDao(), loggers);
		coursesManager.add(courses);
		System.out.println();
		
		Instructors instructors = new Instructors("Ali");
		InstructorsManager instructorsManager = new InstructorsManager(new JdbcDao(), loggers);
		instructorsManager.add(instructors);

	}

}
