


package P3;

public class ListMain {
    public static void main(String[] args) {
//    test 2    
        StrukturList listBaru = new StrukturList();
        listBaru.addHead(5);
        listBaru.addHead(4);
        listBaru.addHead(3);
        System.out.println("");
        System.out.print("Element : ");
        listBaru.displayElement();
        
//        test 3
        StrukturList list3a = new StrukturList();
        list3a.addHead(1);
        list3a.addHead(2);
        list3a.addHead(3);
        System.out.println("");
        System.out.print("Element : ");
        list3a.displayElement();
        
        StrukturList list3b = new StrukturList();
        list3b.addHead(7);
        list3b.addHead(5);
        list3b.addHead(4);
        list3b.addHead(1);
        System.out.println("");
        System.out.print("Element : ");
        list3b.displayElement();
        
        
        
        
    }
}