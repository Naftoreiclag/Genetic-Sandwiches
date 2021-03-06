/* Copyright (c) 2014 "Naftoreiclag" https://github.com/Naftoreiclag
 *
 * Distributed under the Apache License Version 2.0 (http://www.apache.org/licenses/)
 * See accompanying file LICENSE
 */
package naftoreiclag.geneticsandwiches.util;

import java.util.LinkedList;
import java.util.List;

public abstract class Node<Subclass extends Node<Subclass>>
{
	protected Node<Subclass> parent;
	public final List<Node<Subclass>> children = new LinkedList<Node<Subclass>>();
	
	public void addChild(Node<Subclass> child)
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
	public abstract Node<Subclass> clone();
	
	//
	public Node<Subclass> cloneWithChildren()
	{
		Node<Subclass> nu = this.clone();
		
		for(Node<Subclass> child : this.children)
		{
			nu.addChild(child.cloneWithChildren());
		}
		
		return nu;
	}
}
