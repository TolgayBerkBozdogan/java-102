package kodlamaio.dataAccess;

import kodlamaio.entities.Category;
import kodlamaio.entities.Courses;
import kodlamaio.entities.Instructors;

public interface Productdao {
	void add(Category category);
	void add1(Courses courses);
	void add2(Instructors instructors);

}
