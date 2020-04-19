import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCollinLi {
 
    @Test
    public void testGetFullName() {
    	String result = new CollinLi().getFullName();
    	assertEquals("Collin Li",result);
    }
    
    @Test
    public void testGetFirstName() {
    	String result = new CollinLi().getFirstName();
    	assertEquals("Collin",result);
    }
    
    @Test
    public void testGetLastName() {
    	String result = new CollinLi().getLastName();
    	assertEquals("Li",result);
    }
    
    @Test
    public void testGetUCInetID() {
    	String result = new CollinLi().getUCInetID();
    	assertEquals("mucongl",result);
    }
    
    @Test
    public void testGetStudentNumber() {
    	int result = new CollinLi().getStudentNumber();
    	assertEquals(18937404,result);
    }
    
    @Test
    public void testGetRotatedFullName1() {
    	String result = new CollinLi().getRotatedFullName(2);
    	assertEquals("llin LiCo",result);
    }
    
    @Test
    public void testGetRotatedFullName2() {
    	String result = new CollinLi().getRotatedFullName(-5);
    	assertEquals("in LiColl",result);
    }
}