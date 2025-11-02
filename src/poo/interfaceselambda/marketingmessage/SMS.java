package poo.interfaceselambda.marketingmessage;

public class SMS implements MarketingService {

    @Override
    public void receiveMessage(String message) {
        System.out.printf("The following message was received by SMS: %s\n", message);
    }

}
