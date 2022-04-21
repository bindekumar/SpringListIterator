package com.binde.spring;

import java.util.Iterator;
import java.util.List;

public class TestBean implements Test {
    private List<String> list;

	public void setList(List<String> list) {
		this.list = list;
	}

	public void display() {
	Iterator<String> i=list.iterator();
	while(i.hasNext())
	{
		String name=i.next();
		System.out.println(name);
	}
	}
}
