package poo.interfaceselambda.marketingmessage;

public class Email implements MarketingService {

    @Override
    public void receiveMessage(String message) {
        System.out.printf("The following message was received on the E-mail: %s\n", message);
    }

}
