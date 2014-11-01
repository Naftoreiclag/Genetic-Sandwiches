/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.geneticsandwiches;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.yaml.snakeyaml.Yaml;

public class Main
{
	static Root root;
	
	public static void main(String[] args) throws Exception
	{
		root = new Root();
		
		Function func = new Function("fconsume");
		func.addChild(new Call("tconsume"));
		
		root.addChild(func);
		loadAll();
		//saveAll();
	}
	
	public static void loadAll() throws FileNotFoundException
	{
		Yaml yaml = new Yaml();
		
		Object data = yaml.load(new FileInputStream(new File("data.yml")));
		
		System.out.println(yaml.dump(data));
	}
	
	public static void saveAll()
	{
		StringBuilder builder = new StringBuilder();
		
		Yaml yaml = new Yaml();
		
		for(Element element : root.children)
		{
			
		}
	}
}
