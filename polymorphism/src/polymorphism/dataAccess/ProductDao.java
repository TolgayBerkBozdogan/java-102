package polymorphism.dataAccess;

import polymorphism.entites.Category;
import polymorphism.entites.Courses;
import polymorphism.entites.Instructors;

public interface ProductDao {
	void add(Category category);
	void add1(Courses courses);
	void add2(Instructors instructors);

}
