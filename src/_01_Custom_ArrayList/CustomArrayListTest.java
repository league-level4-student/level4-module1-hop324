package _01_Custom_ArrayList;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

//Complete the ArrayList class using the generic to make the tests pass.

public class CustomArrayListTest {

	@Test
	public void testAddAndGet() {
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(206);
	
		if(list.get(0) != 0) fail("list.get(0) returning improper value.");
		if(list.get(1) != 1) fail("list.get(1) returning improper value.");
		if(list.get(2) != 206) fail("list.get(2) returning improper value.");
	}
	
	@Test
	public void testSet() {
		CustomArrayList<String> list = new CustomArrayList<String>();
		list.add("TESTER");
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		
		list.set(2, "PICKLES");
		
		if(!list.get(0).equals("TESTER")) fail("list.get(0) returning improper value.");
		if(!list.get(1).equals("ONE"))  fail("list.get(1) returning improper value.");
		if(!list.get(2).equals("PICKLES"))  fail("list.get(2) returning improper value.");
		if(!list.get(3).equals("THREE"))  fail("list.get(3) returning improper value.");
	}
	
	@Test
	public void testAddAt() {
		CustomArrayList<Character> list = new CustomArrayList<Character>();
		list.add('D');
		list.add('I');
		list.add('G');
		list.add('O');
		
		list.insert(2, 'E');
		
		if(list.get(0) != 'D') fail("list.get(0) returning improper value.");
		if(list.get(1) != 'I') fail("list.get(1) returning improper value.");
		if(list.get(2) != 'E') fail("list.get(2) returning improper value.");
		if(list.get(3) != 'G') fail("list.get(3) returning improper value.");
		if(list.get(4) != 'O') fail("list.get(4) returning improper value.");
	}
	
	@Test
	public void testRemove() {
		class Student { 
			public String name; 
			public Student(String s) {
				name = s;
			}
		}
		CustomArrayList<Student> list = new CustomArrayList<Student>();
		list.add(new Student("Tim"));
		list.add(new Student("Sara"));
		list.add(new Student("Kamara"));
		list.add(new Student("Devaugn"));
		
		list.remove(0);
		
		if(!list.get(0).name.equals("Sara")) {
			fail("list.get(0) returning improper value.");
		}
		if(!list.get(1).name.equals("Kamara")) {
			fail("list.get(1) returning improper value.");
		}
		if(!list.get(2).name.equals("Devaugn")) {
			fail("list.get(2) returning improper value.");
		}
		
		list.remove(2);
		if(!list.get(0).name.equals("Sara")) {
			fail("list.get(0) returning improper value.");
		}
		if(!list.get(1).name.equals("Kamara")) {
			fail("list.get(1) returning improper value.");
		}
	}
	
	@Test
	public void testContains() {
		CustomArrayList<String> list = new CustomArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("only");
		list.add("a");
		list.add("test");
		
		assertTrue(list.contains("This"));
		assertTrue(list.contains("is"));
		assertTrue(list.contains("only"));
		assertFalse(list.contains("the"));
		assertFalse(list.contains("best"));
	}
	
	@Test
	public void testSize() {
		CustomArrayList<String> list = new CustomArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("only");
		list.add("a");
		list.add("test");

		assertTrue(list.list.length == 5);
		
		CustomArrayList<Integer> list2 = new CustomArrayList<Integer>();
		list2.add(0);
		list2.add(1);
		list2.add(206);
		
		assertTrue(list2.list.length == 3);
	}
	
	@Test
	public void testSizeOnRemove() {
		CustomArrayList<String> list = new CustomArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("only");
		list.add("a");
		list.add("test");
		
		assertTrue(list.size() == 5);
		
		list.remove(0);
		list.remove(0);
		
		assertTrue(list.size() == 3);
	}
}
