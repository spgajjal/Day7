package com.capgemini.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.domain.MyDate;

class MyDateTest {

	@Test
	void testMyDate() throws IOException, ClassNotFoundException {
		MyDate d1=new MyDate();
		MyDate d2=new MyDate();
		MyDate d3=new MyDate();
		MyDate d4=new MyDate();
		MyDate d5=new MyDate();
		ArrayList<MyDate> ar= new ArrayList<MyDate>();
		ar.add(d1);
		ar.add(d2);
		ar.add(d3);
		ar.add(d4);
		ar.add(d5);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\spgajjal\\Desktop\\objects.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ar);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\spgajjal\\Desktop\\objects.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<MyDate> array1 = (ArrayList<MyDate>) ois.readObject();
		ois.close();
		assertEquals(1,array1.get(0).a);
		assertEquals("neeraj agrawal",array1.get(2).name);
		
	}

}
