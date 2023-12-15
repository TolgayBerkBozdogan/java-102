package polymorphism.dataAccess;

import polymorphism.entites.Category;
import polymorphism.entites.Courses;
import polymorphism.entites.Instructors;

public class JdbcDao implements ProductDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kaydedildi: " + category.getName());
		
	}

	@Override
	public void add1(Courses courses) {
		System.out.println("JDBC ile kaydedildi: " + courses.getName() );
		
	}

	@Override
	public void add2(Instructors instructors) {
		System.out.println("JDBC ile kaydedildi: " + instructors.getName() );
		
	}

}
