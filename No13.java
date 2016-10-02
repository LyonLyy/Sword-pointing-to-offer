
public class No13 {

	/**
	 * ��������������ͷָ���һ�����ָ�룬 ����һ��������O��1��ʱ��ɾ���ýڵ�
	 */
	public static void main(String[] args) {
		MyNode a = new MyNode("A");
		MyNode b = new MyNode("B");
		MyNode c = new MyNode("C");
		MyNode d = new MyNode("D");
		a.setNext(b);b.setNext(c);c.setNext(d);
		delete(a,d);
		MyNode temp=a;
		while(temp!=null){
			System.out.println(temp.getData());
			temp=temp.next;
		}
	}

	private static void delete(MyNode head, MyNode c) {
		//�����β�ڵ�,ֻ�ܱ���ɾ��
		if(c.next==null){
			while(head.next!=c){
				head=head.next;
			}
			head.next=null;
		}
		else if(head==c){
			head=null;
		}
		else{
			c.setData(c.getNext().getData());
			c.setNext(c.getNext().getNext());
		}
		
	}

	

}

class MyNode {
	MyNode next;
	String data;

	public MyNode(String data) {
		super();
		this.data = data;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}