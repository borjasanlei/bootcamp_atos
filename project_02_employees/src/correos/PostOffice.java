package correos;

public class PostOffice {
	
	public static void main(String[] args) {
		
		CommunicationSystem mail_message = new MailCommunication();
		
		System.out.println(mail_message.sendMessage());
		
	}
}

