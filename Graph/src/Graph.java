import java.util.*;
public class Graph {

	private int verticies;
	private LinkedList<Integer> adjacency[];
	
	public Graph(int v){
		verticies = v;
		adjacency = new LinkedList[v];
		for(int i = 0;i < v; i++)
			adjacency[i] = new LinkedList();
	}
	
	public void addEdge(int v, int node){
		adjacency[v].add(node);
	}
	
	public void BFS(int current){
		/* Avoid visiting the same nodes */
		boolean visited[] = new boolean[verticies];
		LinkedList queue = new LinkedList();
		visited[current] = true;
		queue.add(current);
		/* Visit the next node stored in the queue
		 * until we run out of nodes needed to be visited */
		while(queue.size()!= 0){
			/* Print the node */
			int node = (int)queue.poll();
			System.out.print(node + " ");
			
			/* Find current nodes immediate neighbors using 
			 * an iterator and add to the queue */
			Iterator<Integer> i = adjacency[node].listIterator(); 
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					queue.add(n);
					visited[n] = true;
				}
			}
		}
	}
	
	public void DFS(int current){
		boolean visited[] = new boolean[verticies];
		DFSCurrent(current, visited);
	}
	
	public void DFSCurrent(int current, boolean visited[]){
		/* Print node and mark as visited */
		System.out.print(current + " ");
		visited[current] = true;
		
		Iterator<Integer> i = adjacency[current].listIterator();
		while(i.hasNext()){
			int node = i.next();
			if(!visited[node])
				DFSCurrent(node, visited);
		}
	}
	
}
