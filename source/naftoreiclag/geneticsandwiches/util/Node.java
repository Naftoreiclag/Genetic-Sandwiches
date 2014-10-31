/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.geneticsandwiches.util;

import java.util.LinkedList;
import java.util.List;

public abstract class Node
{
	protected Node parent;
	public final List<Node> children = new LinkedList<Node>();
	
	public void addChild(Node child)
	{
		if(child == null)
		{
			System.err.println("tried to add null child");
			return;
		}
		
		this.children.add(child);
		child.parent = this;
	}
	
	//
	public abstract Node clone();
	
	//
	public Node cloneWithChildren()
	{
		Node nu = this.clone();
		
		for(Node child : this.children)
		{
			nu.addChild(child.cloneWithChildren());
		}
		
		return nu;
	}
}
