package kodlamaio.business;

import kodlamaio.core.Logger;
import kodlamaio.dataAccess.Productdao;
import kodlamaio.entities.Category;

public class CategoryManager {
	private Productdao productDao;
	private Logger[] loggers;

	public CategoryManager(Productdao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
		
	}
	
	public void add(Category category) {
		productDao.add(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getName());
			
		
		}
		
		
	}

}
