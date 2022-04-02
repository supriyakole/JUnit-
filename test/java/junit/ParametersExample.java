package junit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {

	
	@ParameterizedTest
	@ValueSource(strings = {"radar","madam","level"}) 
		public void test1(String name) {
		assertTrue(StringFunctions.ispalindrom(name));
		
	}
  @ParameterizedTest
  @ValueSource(ints ={4,8,6,24}) 
        public void test2(int num) {
       assertTrue(num%2==0);

}
  @ParameterizedTest
  @EnumSource(Month.class)
  public void test3(Month month) {
	  int monthVal = month.getValue();
	  System.out.println(monthVal);
	  assertTrue(monthVal<12);
  }
   @ParameterizedTest
  @EnumSource(value=Month.class,names= {"APRIL","JUNE","SAPTEMBER","NOVEMBER"}) 
  public void test4(Month month) {
	  assertEquals(30,month.length(false));
   }

   @ParameterizedTest
   @MethodSource("DPMethod")
   
   public void test5(String name) {
	   assertTrue(StringFunctions.ispalindrom(name)) ;
   }
   public static Stream<String> DPMethod() {
	   return Stream.of("radar","madam","level","racecar");
   }
		
}

