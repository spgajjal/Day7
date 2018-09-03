package com.capgemini.domain;


	import java.io.BufferedReader;

	import java.io.FileReader;
	import java.io.IOException;

	public class LineCount {
		
	public int LineCount1(String FileLocation) throws IOException {
		int count=0;
		FileReader fr= new FileReader(FileLocation);
		BufferedReader br=new BufferedReader(fr);
		while(br.readLine()!=null)
			count++;
		return count;
		
		
	}

	}



