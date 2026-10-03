/*2a) Data Types:

Write a Java program to store and display the following details of a rooftop solar system:

Panel ID – integer
Energy generated in kWh – decimal value
Number of solar panels – integer
System status – character
Use appropriate Java data types for each value and display all the details.*/


public class Q2a{
public static void main(String[] args){
int panelid = 406;
double energygenerated = 11.1;
int solarpanels = 2;
char systemstatus = 'G';
System.out.println("Panel ID = "+panelid);
System.out.println("Energy generated = "+energygenerated+"kWh");
System.out.println("Number of solar panels"+solarpanels);
System.out.println("System status"+systemstatus);
}
}