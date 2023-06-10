package calculator;

public class TimeCalculate {
    private String value1;
    private String value2;
    private double textField1;
    
    public TimeCalculate(String value1, String value2, double textField1) {
        this.value1 = value1;
        this.value2 = value2;
        this.textField1 = textField1;    
    }

    public double convertTime() {
        switch (value1) {
            case "Milisecond":
                if (value2.equals("Milisecond")) {
                    return textField1;
                } else if (value2.equals("Second")) {
                    return textField1/1000;
                } else if (value2.equals("Minute")) {
                    return textField1/60000;
                } else if (value2.equals("Hour")) {
                    return textField1/3600000;
                } else if (value2.equals("Day")) {
                    return textField1/86400000;
                } else if (value2.equals("Week")) {
                    return textField1/604800000;
                } else if (value2.equals("Month")) {
                    return textField1/604800000;
                } else if (value2.equals("Year")) {
                    return textField1/604800000;
                } else if (value2.equals("Decade")) {
                    return textField1/604800000;
                } else if (value2.equals("Century")) {
                    return textField1/604800000;
                } else if (value2.equals("Millennium")) {
                    return textField1/604800000;
                }
            case "Second":
                if (value2.equals("Milisecond")) {
                    return textField1*1000;
                } else if (value2.equals("Second")) {
                    return textField1;
                } else if (value2.equals("Minute")) {
                    return textField1/60;
                } else if (value2.equals("Hour")) {
                    return textField1/3600;
                } else if (value2.equals("Day")) {
                    return textField1/86400;
                } else if (value2.equals("Week")) {
                    return textField1/604800;
                } else if (value2.equals("Month")) {
                    return textField1/2628000;
                } else if (value2.equals("Year")) {
                    return textField1/31536000;
                } else if (value2.equals("Decade")) {
                    return textField1/315360000;
                } else if (value2.equals("Century")) {
                    return textField1/315360000;
                } else if (value2.equals("Millennium")) {
                    return textField1/315360000;
                }
            case "Minute":
                if (value2.equals("Milisecond")) {
                    return textField1*60000;
                } else if (value2.equals("Second")) {
                    return textField1*60;
                } else if (value2.equals("Minute")) {
                    return textField1;
                } else if (value2.equals("Hour")) {
                    return textField1/60;
                } else if (value2.equals("Day")) {
                    return textField1/1440;
                } else if (value2.equals("Week")) {
                    return textField1/10080;
                } else if (value2.equals("Month")) {
                    return textField1/43800;
                } else if (value2.equals("Year")) {
                    return textField1/525600;
                } else if (value2.equals("Decade")) {
                    return textField1/5256000;
                } else if (value2.equals("Century")) {
                    return textField1/52560000;
                } else if (value2.equals("Millennium")) {
                    return textField1/525600000;
                }
            case "Hour":
                if (value2.equals("Milisecond")) {
                    return textField1*3600000;
                } else if (value2.equals("Second")) {
                    return textField1*3600;
                } else if (value2.equals("Minute")) {
                    return textField1*60;
                } else if (value2.equals("Hour")) {
                    return textField1;
                } else if (value2.equals("Day")) {
                    return textField1/24;
                } else if (value2.equals("Week")) {
                    return textField1/168;
                } else if (value2.equals("Month")) {
                    return textField1/730;
                } else if (value2.equals("Year")) {
                    return textField1/8760;
                } else if (value2.equals("Decade")) {
                    return textField1/87600;
                } else if (value2.equals("Century")) {
                    return textField1/876000;
                } else if (value2.equals("Millennium")) {
                    return textField1/8760000;
                }
            case "Day":
                if (value2.equals("Milisecond")) {
                    return textField1*86400000;
                } else if (value2.equals("Second")) {
                    return textField1*86400;
                } else if (value2.equals("Minute")) {
                    return textField1*1440;
                } else if (value2.equals("Hour")) {
                    return textField1*24;
                } else if (value2.equals("Day")) {
                    return textField1;
                } else if (value2.equals("Week")) {
                    return textField1/7;
                } else if (value2.equals("Month")) {
                    return textField1/30;
                } else if (value2.equals("Year")) {
                    return textField1/365;
                } else if (value2.equals("Decade")) {
                    return textField1/3650;
                } else if (value2.equals("Century")) {
                    return textField1/36500;
                } else if (value2.equals("Millennium")) {
                    return textField1/365000;
                }
            case "week":
                if (value2.equals("Milisecond")) {
                    return textField1*604800000;
                } else if (value2.equals("Second")) {
                    return textField1*604800;
                } else if (value2.equals("Minute")) {
                    return textField1*10080;
                } else if (value2.equals("Hour")) {
                    return textField1*168;
                } else if (value2.equals("Day")) {
                    return textField1*7;
                } else if (value2.equals("Week")) {
                    return textField1;
                } else if (value2.equals("Month")) {
                    return textField1/4.3452381;
                } else if (value2.equals("Year")) {
                    return textField1/52.1428571;
                } else if (value2.equals("Decade")) {
                    return textField1/521.428571;
                } else if (value2.equals("Century")) {
                    return textField1/5214.28571;
                } else if (value2.equals("Millennium")) {
                    return textField1/52142.8571;
                }
            case "Month":
                if (value2.equals("Milisecond")) {
                    return textField1*999999999;
                } else if (value2.equals("Second")) {
                    return textField1*2628000;
                } else if (value2.equals("Minute")) {
                    return textField1*43800;
                } else if (value2.equals("Hour")) {
                    return textField1*730;
                } else if (value2.equals("Day")) {
                    return textField1*30;
                } else if (value2.equals("Week")) {
                    return textField1*4.3452381;
                } else if (value2.equals("Month")) {
                    return textField1;
                } else if (value2.equals("Year")) {
                    return textField1/12;
                } else if (value2.equals("Decade")) {
                    return textField1/120;
                } else if (value2.equals("Century")) {
                    return textField1/1200;
                } else if (value2.equals("Millennium")) {
                    return textField1/12000;
                }
            case "Year":
                if (value2.equals("Milisecond")) {
                    return textField1*999999999;
                } else if (value2.equals("Second")) {
                    return textField1*31536000;
                } else if (value2.equals("Minute")) {
                    return textField1*525600;
                } else if (value2.equals("Hour")) {
                    return textField1*8760;
                } else if (value2.equals("Day")) {
                    return textField1*365;
                } else if (value2.equals("Week")) {
                    return textField1*52.1428571;
                } else if (value2.equals("Month")) {
                    return textField1*12;
                } else if (value2.equals("Year")) {
                    return textField1;
                } else if (value2.equals("Decade")) {
                    return textField1/10;
                } else if (value2.equals("Century")) {
                    return textField1/100;
                } else if (value2.equals("Millennium")) {
                    return textField1/1000;
                }
            case "Decade":
                if (value2.equals("Milisecond")) {
                    return textField1*999999999;
                } else if (value2.equals("Second")) {
                    return textField1*315360000;
                } else if (value2.equals("Minute")) {
                    return textField1*5256000;
                } else if (value2.equals("Hour")) {
                    return textField1*87600;
                } else if (value2.equals("Day")) {
                    return textField1*3650;
                } else if (value2.equals("Week")) {
                    return textField1*521.428571;
                } else if (value2.equals("Month")) {
                    return textField1*120;
                } else if (value2.equals("Year")) {
                    return textField1*10;
                } else if (value2.equals("Decade")) {
                    return textField1;
                } else if (value2.equals("Century")) {
                    return textField1/10;
                } else if (value2.equals("Millennium")) {
                    return textField1/100;
                }
            case "Century":
                if (value2.equals("Milisecond")) {
                    return textField1*999999999;
                } else if (value2.equals("Second")) {
                    return textField1*999999999;
                } else if (value2.equals("Minute")) {
                    return textField1*52560000;
                } else if (value2.equals("Hour")) {
                    return textField1*876000;
                } else if (value2.equals("Day")) {
                    return textField1*36500;
                } else if (value2.equals("Week")) {
                    return textField1*5214.28571;
                } else if (value2.equals("Month")) {
                    return textField1*1200;
                } else if (value2.equals("Year")) {
                    return textField1*100;
                } else if (value2.equals("Decade")) {
                    return textField1*10;
                } else if (value2.equals("Century")) {
                    return textField1;
                } else if (value2.equals("Millennium")) {
                    return textField1/10;
                }
            case "Millennium":
                if (value2.equals("Milisecond")) {
                    return textField1*999999999;
                } else if (value2.equals("Second")) {
                    return textField1*999999999;
                } else if (value2.equals("Minute")) {
                    return textField1*525600000;
                } else if (value2.equals("Hour")) {
                    return textField1*8760000;
                } else if (value2.equals("Day")) {
                    return textField1*365000;
                } else if (value2.equals("Week")) {
                    return textField1*52142.8571;
                } else if (value2.equals("Month")) {
                    return textField1*12000;
                } else if (value2.equals("Year")) {
                    return textField1*1000;
                } else if (value2.equals("Decade")) {
                    return textField1*100;
                } else if (value2.equals("Century")) {
                    return textField1*10;
                } else if (value2.equals("Millennium")) {
                    return textField1;
                }
            default:
                throw new IllegalArgumentException("Error");
        }
    }
}
