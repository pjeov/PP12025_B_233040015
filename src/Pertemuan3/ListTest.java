
package Pertemuan3;

import P3.StrukturList;

public class ListTest {
    public static void main(String[] args) {
        StrukturList list1a = new StrukturList();
        list1a.addTail (3);
        list1a.addTail (2);
        list1a.addTail (1);
        System.out.print("Elemen: ");
        list1a.displayElement();
       
        StrukturList list1b = new StrukturList();
        list1b.addTail (1);
        list1b.addTail (4);
        list1b.addTail (5);
        list1b.addTail (7);
        
        System.out.print("Elemen: ");
        list1a.displayElement();
       
        
    }
}