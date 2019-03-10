package treeuse;
import java.util.*;
public class adlist {
	static int nV;// รั vertex
	static int nE;// รั edge
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		adlist hello =new adlist();
		nV=input.nextInt();
		nE= input.nextInt();
		
		ArrayList<Edge> ad = new <Edge> ArrayList();
		for(int i=0; i<nV; i++) {
			ad.add(new<Integer, Integer> Edge());
			
		}
	
		for(int i=0; i<nE; i++) {
			int start, end, weight;
			start = input.nextInt();
			end = input.nextInt();
			weight = input.nextInt();
		
			ad.get(start).set_Edge(end, weight);
		}
	
	}
	
}
class Edge <W, V> {
	private W weight;
	private V v;//end
	
	public void set_Edge(W weight, V v){
		this.weight = weight;
		this.v = v;
	}
}
