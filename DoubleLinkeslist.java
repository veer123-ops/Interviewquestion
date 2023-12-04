package veer.com;


public class DoubleLinkeslist {
	
	
	public static  class Node{
		int data;
		Node next;
		Node prev; 
		 
		Node(int data){
			 this.data=data;
		
		}
		
		public static void display(Node head) {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+ " -> ");
				temp=temp.next;
				
			}
			System.out.println();
		}
			public static void displayrevr(Node tail) {
				Node temp=tail;
				while(temp!=null) {
					System.out.print(temp.data+ " -> ");
					temp=temp.prev;
					
				}
			System.out.println();
			
			}
			public static void displayrandom(Node random) {
				Node temp=random;
				while(temp.prev!=null) {
					//System.out.print(temp.data+ " -> ");
					temp=temp.prev;
					
				}
				
				while(temp!=null) {
					System.out.print(temp.data+ " -> ");
					temp=temp.next;
					
				}
				System.out.println();
		
			
			
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Node a =new Node(10);
   Node b =new Node(4);
   Node c =new Node(110);
   Node d =new Node(9);
   Node e =new Node(8);
   Node f =new Node(100);
   a.prev=null;
   a.next=b;
   b.prev=a;
   b.next=c;
   c.prev=b;
   c.next=d;
   d.prev=c;
   d.next=e;
   e.prev=d;
   e.next=f;
   f.prev=e;
   f.next=null;
   
   display(a);
   displayrevr(f);
   //displayrandom(e);
   
	}

}}
