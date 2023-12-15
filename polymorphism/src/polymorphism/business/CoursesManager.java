package polymorphism.business;

import polymorphism.core.Logger;
import polymorphism.dataAccess.ProductDao;
import polymorphism.entites.Courses;

public class CoursesManager {
	ProductDao productDao;
	Logger [] loggers;
	Courses [] course;
	
	
	public CoursesManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
		this.course = course;
	}



	public void add(Courses courses) throws Exception {
		if(courses.getPrice()<=0) {
			throw new Exception("Kurs fiyati 0'dan kucuk olamaz!");
		}
		/*for(Courses course1 : course) {
			throw new Exception("Kurs ismi tekrar edemez!");
		}*/
		productDao.add1(courses);
		for(Logger logger:loggers) {
			logger.log1(courses.getName());
		}
	}
	

}
