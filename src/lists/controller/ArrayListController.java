package lists.controller;

import java.util.ArrayList;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
	}
	
	public void start()
	{
		firstWords.add("lol");
		System.out.println(firstWords);
	}
}
