package app.node;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.insert(18);
		list.insert(45);
		list.insert(12);
		
		
		list.insertAtstart(25);
		
		list.insertAt(2,55);
		
		
		list.delectAt(3);
		
		
		list.show();
	
		
	}

}
