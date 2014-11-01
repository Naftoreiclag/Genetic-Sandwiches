/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.geneticsandwiches;

import naftoreiclag.geneticsandwiches.util.Node;

public class Call extends Element
{
	public String name;
	
	public Call(String name)
	{
		this.name = name;
	}
	
	@Override
	public Element clone()
	{
		return new Call(name);
	}

}
