package P4;

public class StrukturList {
	private Node HEAD;
    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }
    
    public void addHead(double d) {
        Node newNode = new Node(d);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(double d) {
        Node newNode = new Node(d);
        
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public void addMid(double d, int position) {
        if (position <= 0) {
            addHead(d);
            return;
        }
        
        Node newNode = new Node(d);
        Node curNode = HEAD;
        int index = 0;
        
        while (curNode != null && index < position - 1) {
            curNode = curNode.getNext();
            index++;
        }
        
        if (curNode == null) {
            addTail(d);
        } else {
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(10);
        list.addTail(20);
        list.addTail(30);
        
        System.out.println("Isi Linked List:");
        list.displayElement();
        
        list.addMid(25, 2);
        System.out.println("Setelah menambahkan 25 di posisi 2:");
        list.displayElement();
    }
}