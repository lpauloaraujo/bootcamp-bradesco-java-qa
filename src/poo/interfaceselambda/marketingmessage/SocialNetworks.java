package poo.interfaceselambda.marketingmessage;

public class SocialNetworks implements MarketingService {

    @Override
    public void receiveMessage(String message) {
        System.out.printf("The following message was received on Social Networks: %s\n", message);
    }
}
