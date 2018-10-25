package com.freelancer.leetcode;

import java.util.HashMap;
import java.util.Map;

import com.freelancer.leetcode.support.UndirectedGraphNode;

public class LeetCode133 {

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		return dfsClone(node, new HashMap<Integer, UndirectedGraphNode>());
	}

	private static UndirectedGraphNode dfsClone(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> r) {
		UndirectedGraphNode nNode;
		if (node == null) {
			return null;
		}
		if (!r.containsKey(node.label)) {
			nNode = new UndirectedGraphNode(node.label);
			r.put(node.label, nNode);
		} else {
			nNode = r.get(node.label);
		}

		while (node.neighbors.size() > 0) {
			UndirectedGraphNode child = node.neighbors.remove(0);
			if (child == null) {
				break;
			}
            
			if (child.label == nNode.label) {
				nNode.neighbors.add(nNode);
				continue;
			}
			
			UndirectedGraphNode cn = dfsClone(child, r);
			nNode.neighbors.add(cn);
		}

		return nNode;
	}

}
