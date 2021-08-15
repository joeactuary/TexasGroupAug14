import java.util.ArrayList;
import java.util.Iterator;
class Task78 {

public  static void task78(Integer[] array) {
    //  public static void main(String[] args) {
    Mylist mylist = new Mylist(array);

    System.out.println("The largest value is " + mylist.getMaxItem());

    System.out.println("The smallest value is " + mylist.getMinItem());

    System.out.println("The second largest value is " + mylist.getSecondMaxItem());
}
}

class Mylist {
    private ArrayList<Integer> mylist;
    private int maxItem;
    private int minItem;
    private int secondMaxItem;

    public Mylist(Integer[] array) {
        this.mylist = new ArrayList<Integer>();
        this.maxItem = Integer.MIN_VALUE;
        this.minItem = (Integer.MAX_VALUE);
        this.secondMaxItem = Integer.MIN_VALUE ;
        for (int item : array) {
            this.mylist.add(item);
        }
    }

    //public MyList(ArrayList<Integer> myList) {
    //    this.myList = myList;
    // }

    public int getMaxItem() {
        Iterator<Integer> iterator = this.mylist.iterator();
        while (iterator.hasNext()) {
            maxItem = Math.max(maxItem, iterator.next());
        }
        return maxItem;
    }
    public int getSecondMaxItem() {
        Iterator<Integer> iterator = this.mylist.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            maxItem = Math.max(maxItem,temp);
            if (maxItem != temp) secondMaxItem=Math.max(secondMaxItem,temp);
            //    This produces the second largest element that is not equal to the largest.  So second largest in {10,5,10}  would be 5, not 10.
        }
        return secondMaxItem;
    }

    public int getMinItem() {
        Iterator<Integer> iterator = this.mylist.iterator();
        while (iterator.hasNext()) {
            minItem = Math.min(minItem, iterator.next());
        }
        return minItem;
    }

    /*public void printMyList() {
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");
        System.out.println("");
    }

    public void addItems(Integer[] array) {
        for (int item : array) {
            this.myList.add(item);
        }
    }*/
}

