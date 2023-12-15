package kodlamaio.business;

import kodlamaio.core.Logger;
import kodlamaio.dataAccess.Productdao;
import kodlamaio.entities.Instructors;

public class InstructorsManager {
	private Productdao productdao;
	private Logger [] loggers;

	public InstructorsManager(Productdao productdao, Logger[] loggers) {
		this.productdao = productdao;
		this.loggers = loggers;
	}
	
	public void add(Instructors instructors) {
		productdao.add2(instructors);
		
		for(Logger logger : loggers) {
			logger.log(instructors.getName());
			
		}
		
	}

}
