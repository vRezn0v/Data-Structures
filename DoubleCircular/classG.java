import java.util.*;
public class classG{
	static class Node{
	Node prev;
	Node next;
	int data;
		Node(int data){
		
		this.data=data;}
	}
	
	public static Node insertAtEnd(Node head,int data)
	{	
	
		Node q=new Node(data);
		q.prev=null;
		q.next=null;
		if(head==null) {q.prev=q;q.next=q;return q;}
		Node t=head.prev;
		head.prev=q;
		q.prev=t;
		t.next=q;
		q.next=head;
	//System.out.print(q.data);
		return head;
	
	
	}
	public static Node deleteAtBeg(Node head)
	{
		if(head.next==head) return null;
		
		Node p=head.prev;
		p.next=head.next;
		head.next.prev=p;
		return head.next;
	
	}
	
	public static Node deleteAtEnd(Node head)
	{
		if(head.next==head) return null;
		
		Node p=head.prev;
		head.prev=head.prev.prev;
		p.prev.next=head;
		return head;
		
	
	}
	public static Node insertAtBeg(Node head,int data)
	{	
	
		Node q=new Node(data);
		q.prev=null;
		q.next=null;
		if(head==null) {q.prev=q;q.next=q;return q;}
		Node t=head.prev;
		t.next=q;
		q.prev=t;
		q.next=head;
		head.prev=q;
	//System.out.print(q.data);
		return q;
	
	
	}
	
		static void print(Node head)
	{if(head==null) return ;
		Node p=head.next;
		System.out.print(head.data+" ");
		while(p!=head)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		//System.out.print(p.data);
		
	
	}
	
	public static Node deleteOdd(Node head)
	{
		Node p=head,x=null;
		int i=0;
		head=deleteAtBeg(head);
		p=head.next;
		while(p!=head)
		{i++;
			if(i%2!=0)
			{
				if(p.next==head) return deleteAtEnd(head);
			
				System.out.println(p.data);
				Node t=p.prev,y=p.next;
				y.prev=t;
				t.next=y;
				
					p=y;
					
			i=0;
			}
			p=p.next;
				
		}
		//return head;
		return head;//deleteAtEnd(head);
		//return head;
	
	}
	public static Node deleteEven(Node head)
	{
		Node p=head,x=null;
		int i=0;
	//	head=deleteAtBeg(head);
		p=head.next;
		while(p!=head)
		{i++;
			if(i%2!=0)
			{
				if(p.next==head) return deleteAtEnd(head);
			
				System.out.println(p.data);
				Node t=p.prev,y=p.next;
				y.prev=t;
				t.next=y;
				
					p=y;
					
			i=0;
			}
			p=p.next;
				
		}
		//return head;
		return head;//deleteAtEnd(head);
		//return head;
	
	}
	
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=n;
		Node head=null;
		while(n-->0) head=insertAtEnd(head,scan.nextInt());
	
		
			
		
	print(head);
	if(x>0){
	int t=scan.nextInt();
	/*if(t==1)
		head=insertAtBeg(head,scan.nextInt());
	
	if(t==2)
		head=insertAtEnd(head,scan.nextInt());
	if(t==1)
		head=deleteAtBeg(head);//,scan.nextInt());
	
	if(t==2)
		head=deleteAtEnd(head);//,scan.nextInt());
	*/
	
	if(t==1)
		head=deleteOdd(head);//,scan.nextInt());
	
	if(t==2)
		head=deleteEven(head);//,scan.nextInt());
	
	print(head);
	
}	}

}
