package com.freelancer.leetcode;

import org.junit.Test;

import com.freelancer.leetcode.support.UndirectedGraphNode;

import junit.framework.Assert;

public class LeetCode133Test {
	
	@Test
    public void testCloneGraph() {
        LeetCode133 leetCode133 = new LeetCode133();
        
        UndirectedGraphNode n = new UndirectedGraphNode(0);
        
        UndirectedGraphNode n1 = new UndirectedGraphNode(1);
        UndirectedGraphNode n2 = new UndirectedGraphNode(2);
        
        n.neighbors.add(n1);
        n.neighbors.add(n2);
        
        n1.neighbors.add(n2);
        
        n2.neighbors.add(n2);
        
        UndirectedGraphNode nNode = leetCode133.cloneGraph(n);
        Assert.assertEquals(0, nNode.label);
        Assert.assertEquals(2, nNode.neighbors.size());
        Assert.assertEquals(1, nNode.neighbors.get(0).label);
        Assert.assertEquals(2, nNode.neighbors.get(1).label);
        
        Assert.assertEquals(1, nNode.neighbors.get(0).neighbors.size());
        Assert.assertEquals(2, nNode.neighbors.get(0).neighbors.get(0).label);
        
        Assert.assertEquals(1, nNode.neighbors.get(1).neighbors.size());
        Assert.assertEquals(2, nNode.neighbors.get(1).neighbors.get(0).label);
    }
	
	@Test
	public void test666() {
		LeetCode133 leetCode133 = new LeetCode133();
		
		UndirectedGraphNode n = new UndirectedGraphNode(0);
		n.neighbors.add(n);
		n.neighbors.add(n);
		
		UndirectedGraphNode nNode = leetCode133.cloneGraph(n);
        Assert.assertEquals(0, nNode.label);
        
        Assert.assertEquals(2, nNode.neighbors.size());
	}
	
	@Test
	public void test666666666() {
		LeetCode133 leetCode133 = new LeetCode133();
		
		UndirectedGraphNode n47 = new UndirectedGraphNode(-47);
		UndirectedGraphNode n43 = new UndirectedGraphNode(-43);
		UndirectedGraphNode n96 = new UndirectedGraphNode(96);
		UndirectedGraphNode n42 = new UndirectedGraphNode(-42);
		UndirectedGraphNode n41 = new UndirectedGraphNode(-41);
		UndirectedGraphNode n40 = new UndirectedGraphNode(-40);
		UndirectedGraphNode n12 = new UndirectedGraphNode(12);
		UndirectedGraphNode n31 = new UndirectedGraphNode(31);
		UndirectedGraphNode n44 = new UndirectedGraphNode(44);
		UndirectedGraphNode n60 = new UndirectedGraphNode(60);
		UndirectedGraphNode n29 = new UndirectedGraphNode(-29);
		
		n47.neighbors.add(n43);
		n47.neighbors.add(n96);
		
		n43.neighbors.add(n42);
		n42.neighbors.add(n41);
		
		n41.neighbors.add(n40);
		n41.neighbors.add(n12);
		
		n40.neighbors.add(n31);
		n40.neighbors.add(n44);
		n40.neighbors.add(n60);
		
		n31.neighbors.add(n31);
		n31.neighbors.add(n29);
		
		UndirectedGraphNode nNode = leetCode133.cloneGraph(n47);
		
		System.err.println(nNode);
	}

}
