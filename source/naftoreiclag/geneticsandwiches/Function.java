/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.geneticsandwiches;

import naftoreiclag.geneticsandwiches.util.Node;

public class Function extends Element
{
	public String name;
	
	public Function(String name)
	{
		this.name = name;
	}
	
	@Override
	public Element clone()
	{
		return new Function(name);
	}

}
