package calculator;

public class TemperatureCalculate {
    private String value1;
    private String value2;
    private double textField1;
    
    public TemperatureCalculate(String value1, String value2, double textField1) {
        this.value1 = value1;
        this.value2 = value2;
        this.textField1 = textField1;    
    }

    public double convertTemperature() {
        switch (value1) {
            case "Celcius":
            if (value2.equals("Celcius")) {
                return textField1;
            } else if (value2.equals("Fahrenheit")) {
                return ((textField1 * 9/5) + 32);
            } else if (value2.equals("Kelvin")) {
                return (textField1 + 273);
            } else if (value2.equals("Reamur")) {
                return textField1 * 4/5;
            }
            case "Fahrenheit":
            if (value2.equals("Celcius")) {
                return (textField1 - 32) * 5/9;
            } else if (value2.equals("Fahrenheit")) {
                return textField1;
            } else if (value2.equals("Kelvin")) {
                return (textField1 + 460) * 5/9;
            } else if (value2.equals("Reamur")) {
                return (textField1 - 32) * 4/9;
            }
            case "Kelvin":
            if (value2.equals("Celcius")) {
                return textField1 - 273;
            } else if (value2.equals("Fahrenheit")) {
                return (textField1 * 9/5) - 460;
            } else if (value2.equals("Kelvin")) {
                return textField1;
            } else if (value2.equals("Reamur")) {
                return (textField1-273) * 4/5;
            }
            case "Reamur":
            if (value2.equals("Celcius")) {
                return textField1 * 5/4;
            } else if (value2.equals("Fahrenheit")) {
                return (textField1 * 9/4) + 32;
            } else if (value2.equals("Kelvin")) {
                return textField1 + 273;
            } else if (value2.equals("Reamur")) {
                return (textField1 * 5/4) + 273;
            }
            default:
                throw new IllegalArgumentException("Error");
        }
    }
}