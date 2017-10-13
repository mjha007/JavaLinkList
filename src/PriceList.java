
public class PriceList {

	Node Head;
	
	PriceList()
	{
		Head = null;
	}
	
    void addLast(int x){
    	
    	
	if(Head==null){
		Head = new Node(x);
	    return ;
	}  
	
	Node tmp = Head;
	while(tmp.nxt!=null)
		tmp=tmp.nxt;
	tmp.nxt= new Node(x);
	tmp.nxt.nxt=null;
	
	}
	
	void addFirst(int x)
	{
		if(Head==null)
		{
			Head = new Node(x);
			Head.nxt=null;
			return;
		}
		
		Node tmp = new Node(x);
		tmp.nxt=Head;
		Head=tmp;
		
	}
	
	void display()
	{
		Node tmp = Head;
		while(tmp!=null)
		{
			System.out.print(tmp.data +" --> ");
			tmp=tmp.nxt;
		}
		
		System.out.println("null");
		
	}
	
	
	void reverse(Node link)
	{
		if(Head.nxt==null)
		{
			Head.nxt=link;
			return;
		}
		else
		{
		Node tmp = Head;
		Head=Head.nxt;
		tmp.nxt=link;
		reverse(tmp);
		}
		
		
	}
	

	
	
}
