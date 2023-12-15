package kodlamaio.dataAccess;

import kodlamaio.entities.Category;
import kodlamaio.entities.Courses;
import kodlamaio.entities.Instructors;

public class JdbcDao implements Productdao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kaydedildi : "+ category.getName());
		
	}

	@Override
	public void add1(Courses courses) {
		System.out.println("JDBC ile kaydedildi : "+ courses.getName());
		
	}

	@Override
	public void add2(Instructors instructors) {
		System.out.println("JDBC ile kaydedildi : "+ instructors.getName());
		
	}

}
