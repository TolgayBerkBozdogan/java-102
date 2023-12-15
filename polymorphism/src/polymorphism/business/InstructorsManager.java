package polymorphism.business;

import polymorphism.core.Logger;
import polymorphism.dataAccess.ProductDao;
import polymorphism.entites.Instructors;

public class InstructorsManager {
	ProductDao productDao;
	Logger [] loggers;
	
	
	public InstructorsManager(ProductDao productDao, Logger[] loggers) {
		super();
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Instructors instructors) {
		productDao.add2(instructors);
		for(Logger logger:loggers) {
			logger.log2(instructors.getName());
		}
	}
	

}


