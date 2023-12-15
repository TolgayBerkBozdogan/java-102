package polymorphism.dataAccess;

import polymorphism.entites.Category;
import polymorphism.entites.Courses;
import polymorphism.entites.Instructors;

public class HibernateDao implements ProductDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kaydedildi: " + category.getName());
		
	}

	@Override
	public void add1(Courses courses) {
		System.out.println("Hibernate ile kaydedildi: " + courses.getName());
		
	}

	@Override
	public void add2(Instructors instructors) {
		System.out.println("Hibernate ile kaydedildi: " + instructors.getName());
		
	}

}
