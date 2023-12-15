package polymorphism.core;



public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail gonderildi: " + data);
		
	}

	@Override
	public void log1(String data1) {
		System.out.println("Mail gonderildi: " + data1);
		
	}

	@Override
	public void log2(String data2) {
		System.out.println("Mail gonderildi: " + data2);
		
	}


}
