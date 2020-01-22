package com.formation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	private String INPUT = "12345";
			
	@Test
			public void testLength() {
		assertEquals(64, App.sha256(INPUT).length());
	}
	@Test
	public void testHex() {
		String expected = "5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5";
		assertEquals(expected, App.sha256(INPUT));
	}
	
	@Test
	public void testFonction() {
		assertEquals("bye",App.fonction(20));
	}
}

///*
//{
//	/* extends TestCase
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
// /*   public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
// /*   public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
///*
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//}
//} */
