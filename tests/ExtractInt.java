package tests;

import org.testng.annotations.Test;

public class ExtractInt {
  @Test
  public void f() {
	  String value = "Hello123";
	  String intValue = value.replaceAll("[^0-9]", "");
	  int v = Integer.parseInt(intValue);
	  System.out.println(v);
	  
//	  String stringToStrip="radius: -0.118211 zone";
	  String stringToStrip="width: 80%;";
	  String stripedValue = (stringToStrip.replaceAll("[\\s+a-zA-Z :%;]",""));
	  int i = Integer.parseInt(stripedValue);
	  System.out.println(i);
	  double dbl = Double.parseDouble(stripedValue);
	  System.out.println(dbl);
  }
}
