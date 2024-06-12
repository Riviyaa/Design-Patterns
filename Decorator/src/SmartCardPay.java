public class SmartCardPay {
    public static void main(String [] args) {
        SmartCard pincard = new SimpleSmartCard();
        pincard.authenticate("1234");
        SmartCard otpcard = new OTPSmartCardDecorator(pincard);
        otpcard.authenticate("abcd");
        SmartCard tfacard = new TFASmartCardDecorator(pincard);
        tfacard.authenticate("1234");
    }
}