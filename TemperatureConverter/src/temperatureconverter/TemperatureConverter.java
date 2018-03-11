
package temperatureconverter;

import java.util.Scanner;

/**
 *
 * @author Daniel Gurbiel
 */

public class TemperatureConverter {
    private static double temperatureC;
    private double temperatureF;
    private double temperatureK;
    private static Scanner input;

    public TemperatureConverter() {
        temperatureC = 0;
        temperatureF = 0;
        temperatureK = 0;
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();
        String option;
        do{
            temp.showOptions();
            option = input.nextLine();
            option.substring(0, 1);
            
        } while(!option.equals("1") && !option.equals("2") && !option.equals("3"));
        switch(option){
            case "1": {
                temp.celsius();
                break;
            }
            
            case "2": {
                temp.fahrenheit();
                break;
            }
            
            case "3":{
                temp.kelvin();
                break;
            }
        }
    }

    public void setTemperatureC(double temperatureC) {
        this.temperatureC = temperatureC;
    }

    public void setTemperatureF(double temperatureF) {
        this.temperatureF = temperatureF;
    }

    public void setTemperatureK(double temperatureK) {
        this.temperatureK = temperatureK;
    }

    public double getTemperatureC() {
        return temperatureC;
    }

    public double getTemperatureF() {
        return temperatureF;
    }

    public double getTemperatureK() {
        return temperatureK;
    }
    
    public void convertCToF(){
        setTemperatureF((getTemperatureC() * 9) / 5 + 32);
    }
    
    public void convertCToK(){
        setTemperatureK(getTemperatureC() + 273.15);
    }
    
    public void convertFToC(){
        
    }
    
    public void convertFToK(){
        
    }
    
    public void convertKToC(){
        
    }
    
    public void convertKToF(){
        
    }
    
    public void rounding(){
        setTemperatureC(getTemperatureC() * 100);
        setTemperatureC(Math.round(getTemperatureC()));
        setTemperatureC(getTemperatureC() / 100);
        setTemperatureF(getTemperatureF() * 100);
        setTemperatureF(Math.round(getTemperatureF()));
        setTemperatureF(getTemperatureF() / 100);
        setTemperatureK(getTemperatureK() * 100);
        setTemperatureK(Math.round(getTemperatureK()));
        setTemperatureK(getTemperatureK() / 100);
    }
    
    public void showTemperatures(){
        rounding();
        System.out.println("Temperature[C] = " + getTemperatureC());
        System.out.println("Temperature[F] = " + getTemperatureF());
        System.out.println("Temperature[K] = " + getTemperatureK());
    }
    
    public void showOptions(){
        System.out.print("1. Celsius | 2. Fahrenheit | 3. Kelvin         ");
    }
    
    public void celsius(){
        System.out.print("Hello! Insert temperature in Celsius: ");
        temperatureC = input.nextDouble();
        convertCToF();
        convertCToK();     
        showTemperatures();
        
    }
    
    public void fahrenheit(){
        
    }
    
    public void kelvin(){
        
    }
}
