public class LatihanIfElse1{
public static void main(String[]args){
 String forecast;
 double temperature= getTemperature();
 if(temperature<=32.0){
  forecast= "SNOW";
 }
 else{
  forecast= "RAIN";
 }
  System.out.println(forecast);
 }
 public static double getTemperature(){
  return 30.0;
 }
 }