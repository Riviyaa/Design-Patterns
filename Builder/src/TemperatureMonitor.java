public class TemperatureMonitor {
    public static void main(String [] args) {
        AnalogValue lm57 = new AnalogValue("[analog input signal]");
        // Let A-to-D Converter creation be handled by a Converter
        // Builder. This way, client program is completely isolated
        // from complex object construction required for building an
        // A-to-D Converter.
        ADCBuilder adcb = new SARADCBuilder();
        adcb.build(lm57);
        BitRegister br = adcb.output();
    }
}