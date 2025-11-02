package poo.interfaceselambda.marketingmessage;

public class WhatsApp implements MarketingService {

    @Override
    public void receiveMessage(String message) {
        System.out.printf("The following message was received on whatsapp: %s\n", message);
    }

}
