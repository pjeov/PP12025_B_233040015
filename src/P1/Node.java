package P1;

public class Node {
	private int Nilai;
	private Node Next;
	
	//inisialisasi Node
	public Node(int Nilai) {
		this.Nilai = Nilai;
	}
//	menambahkan getter dan setter
	public void setNilai (int Nilai) {
		this.Nilai=Nilai;
	}
	public int getNilai() {
		return Nilai;
	}
	public void setNext (Node Next) {
		this.Next = Next;
	}
	public Node getNext() {
		return Next;
	}
}