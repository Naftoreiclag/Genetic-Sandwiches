/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.geneticsandwiches;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Main
{
	static Root root;
	
	public static void main(String[] args)
	{
		root = new Root();
		
		Function func = new Function("fconsume");
		func.addChild(new Call("tconsume"));
		
		root.addChild(func);
		
		saveAll();
	}
	
	public static void saveAll()
	{
		StringBuilder builder = new StringBuilder();
		
		for(Element element : root.children)
		{
			
		}
		
		FileUtils.writeStringToFile(new File("file.txt"), builder.toString());
		System.out.println("   Successuful print");
	}
}
