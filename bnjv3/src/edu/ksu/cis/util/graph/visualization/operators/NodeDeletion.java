package edu.ksu.cis.util.graph.visualization.operators;
import edu.ksu.cis.util.graph.visualization.CodePage;
import edu.ksu.cis.util.graph.visualization.CodePageOperator;
import edu.ksu.cis.util.graph.visualization.GraphOperator;
import edu.ksu.cis.util.GlobalOptions;
import edu.ksu.cis.util.graph.visualization.*;
import edu.ksu.cis.util.graph.core.*;
import edu.ksu.cis.bnj.ver3.core.BeliefNode;



public class NodeDeletion{

	private BeliefNode node;
	
	public NodeDeletion(BeliefNode N)
	{
		node = N;
	}
	
	public Graph remove(Graph G)
	{
		//G.removeNode(node);
		return G;
	}
	
	public Graph applyInverse(Graph G)
	{
		//G.addNode(node);
		return G;
	}
	
	public int getTime()
	{
		return GlobalOptions.getInstance().getInteger("time_edge_create", 50);
	}
	
	
	
}
