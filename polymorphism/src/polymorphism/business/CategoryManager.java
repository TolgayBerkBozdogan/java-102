package polymorphism.business;

import polymorphism.core.Logger;
import polymorphism.dataAccess.ProductDao;
import polymorphism.entites.Category;

public class CategoryManager {
	ProductDao productDao;
	Logger [] loggers;
	Category [] categories;
	public CategoryManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	
	public void add(Category category) throws Exception {
		/*for(Category category1: categories) {
			if(category1.getName()==category.getName()) {
				throw new Exception("Kategori ismi tekrar edemez!");
			}
		}*/
		productDao.add(category);
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
	}
	
	
	
	

}
