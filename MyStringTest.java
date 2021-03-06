import static org.junit.Assert.*;

import org.junit.Test;


public class MyStringTest {

    //fail("Not yet implemented");

    @Test
    public void testCharAtValid() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals('c', m.charAt(2));
    }

    @Test
    public void testCharAtNotValid() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertNotEquals('b', m.charAt(2));
    }

    @Test
    public void testCharAtOutOfBoundsPositive() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(' ', m.charAt(12));
    }

    @Test
    public void testCharAtOutOfBoundsNegative() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(' ', m.charAt(-1));
    }

    @Test
    public void testCharAtWhitespace() {
        MyString m = new MyString(new char [] {'a', 'b', ' ', 'd', 'e'});
        assertEquals(' ', m.charAt(2));
    }

    @Test
    public void testContainsCharFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.containsChar('c'));
    }

    @Test
    public void testContainsCharNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.containsChar('f'));
    }

    @Test
    public void testContainsCharIgnoreCaseFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.containsCharIgnoreCase('C'));
    }

    @Test
    public void testContainsCharIgnoreCaseNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertNotEquals(true, m.containsChar('F'));
    }

    @Test
    public void testCopy() {

    }

    @Test
    public void testStarsWithCharFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(true, m.startsWithChar('a'));
    }

    @Test
    public void testStartsWithCharNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.startsWithChar('z'));
    }

    @Test
    public void testEndsWithCharFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertNotEquals(true, m.endsWithChar('a'));
    }

    @Test
    public void testEndsWithCharNotFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(false, m.endsWithChar('z'));
    }

    @Test
    public void testFirstIndexOfFound() {
        MyString m = new MyString(new char [] {'a', 'b', 'c', 'd', 'e'});
        assertEquals(0, m.firstIndexOf('a'));
    }

    @Test
    public void testFirstIndexOfNotFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	
        assertEquals(-1, m.firstIndexOf('z'));
    }

    @Test
    public void testLastIndexOfFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	
        assertEquals(8, m.lastIndexOf('E'));
    }

    @Test
    public void testLastIndexOfNotFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	
        assertEquals(-1, m.lastIndexOf('z'));
    }

    @Test
    public void testIndexOfFromFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	
    	assertEquals(8, m.indexOfFrom('E', 6));
    	assertEquals(5, m.indexOfFrom('E', 0));
    }

    @Test
    public void testIndexOfFromNotFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	
    	assertEquals(-1, m.indexOfFrom('q', 0));
    }

    @Test
    public void testToCharArray() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	
    	char[] returnedArray = m.toCharArray();
    	assertEquals(initialArray, returnedArray);
    }

    @Test
    public void testLength() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	
    	assertEquals(15, m.length());
    }

    @Test
    public void testReplaceFirstInstanceCharFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	m.replaceFirstInstance('E', 'Q');
    	
    	assertEquals(m.charAt(5), 'Q');
    	assertNotEquals(m.charAt(8), 'Q');
    }

    @Test
    public void testReplaceFirstInstanceCharNotFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	m.replaceFirstInstance('Q', 'Z');
    	
    	assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testReplaceLastInstanceCharFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	m.replaceLastInstance('E', 'Q');
    	
    	assertNotEquals(m.charAt(5), 'Q');
    	assertEquals(m.charAt(8), 'Q');
    }

    @Test
    public void testReplaceLastInstanceCharNotFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	m.replaceLastInstance('Q', 'Z');
    	
    	assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testReplaceAllCharFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	m.replaceAll('E', 'Q');
    	
    	assertEquals(m.charAt(5), 'Q');
    	assertEquals(m.charAt(8), 'Q');
    	assertEquals(-1, m.indexOfFrom('E', 0));
    }

    @Test
    public void testReplaceAllCharNotFound() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	m.replaceAll('Q', 'Z');
    	
    	assertEquals(-1, m.indexOfFrom('Q', 0));
    	assertEquals(-1, m.indexOfFrom('Z', 0));
    }

    @Test
    public void testAccessToUppercaseMyString() {
    	
    }

    @Test
    public void testAccessToUppercaseMyStringAlreadyUppercase() {

    }

    @Test
    public void testAccessToLowercaseMyString() {

    }

    @Test
    public void testAccessToLowercaseMyStringAlreadyUppercase() {

    }

    @Test
    public void testMutateToUppercaseMyString() {

    }

    @Test
    public void testMutateToLowercaseMyString() {

    }

    @Test
    public void testAccessToUppercaseChars() {

    }

    @Test
    public void testAccessToLowercaseChars() {

    }

    @Test
    public void testMutateToUppercaseChars() {

    }

    @Test
    public void testMutateToLowercaseChars() {

    }

    @Test
    public void testToString() {
    	char[] initialArray = new char [] {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'T', 'E', 'S', 'T', 'I', 'N', 'G', '!'};
    	MyString m = new MyString(initialArray);
    	
    	assertEquals("I LOVE TESTING!", m.toString());
    }

    @Test
    public void test() {

    }
}
