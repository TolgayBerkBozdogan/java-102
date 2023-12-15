package kodlamaio.business;

import kodlamaio.core.Logger;
import kodlamaio.dataAccess.Productdao;
import kodlamaio.entities.Courses;

public class CoursesManager {
	private Productdao productdao;
	private Logger[] loggers;

	public CoursesManager( Productdao productdao, Logger[] loggers) {
		this.productdao = productdao;
		this.loggers = loggers;
	}
	
	public void add(Courses courses) throws Exception {
		if(courses.getPrice()<0) {
			throw new Exception("Kurs fiyati 0'dan kucuk olamaz! ");
		}
		productdao.add1(courses);
		for(Logger logger : loggers) {
			logger.log(courses.getName());
			
		}
	}

}
