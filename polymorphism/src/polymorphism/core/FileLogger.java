package polymorphism.core;


public class FileLogger implements Logger{


	@Override
	public void log(String data) {
		System.out.println("Dosya loglandi: " + data);
		
	}

	@Override
	public void log1(String data1) {
		System.out.println("Dosya loglandi: " + data1);
		
	}

	@Override
	public void log2(String data2) {
		System.out.println("Dosya loglandi: " + data2);
		
	}

}
