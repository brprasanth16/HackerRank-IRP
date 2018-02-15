
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CarSort implements Comparable<CarSort>{

    String name;
    Colors color;

    public CarSort(String name, Colors color){
        this.name = name;
        this.color = color;
    } 

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Colors getColor() {
        return color;
    }
    public void setColor(Colors color) {
        this.color = color;
    }

    //Implement the natural order for this class
    public int compareTo(CarSort c)
    {
        return getName().compareTo(c.getName());
    }

    static class ColorComparator implements Comparator<CarSort>
    {
        public int compare(CarSort c1, CarSort c2)
        {
            return c1.getColor().compareTo(c2.getColor());
        }
    }

    public enum Colors {
         SILVER, MAGENTA, BLUE, RED
    }

     public static void main(String[] args)
     {
         List<CarSort> carList = new ArrayList<CarSort>();

         carList.add(new CarSort("Ford Figo",Colors.SILVER));
         carList.add(new CarSort("Santro",Colors.BLUE));
         carList.add(new CarSort("Honda Jazz",Colors.MAGENTA));
         carList.add(new CarSort("Indigo V2",Colors.RED));
         Collections.sort(carList, new ColorComparator());

         ListIterator<CarSort> itr=carList.listIterator();
         while (itr.hasNext()) {
            CarSort carSort = (CarSort) itr.next();
            System.out.println("Car colors: "+carSort.getColor());
        }
         
         Queue<String> stck = new PriorityQueue<String>();
         stck.add("sasasas"); 
         System.out.println(Arrays.toString(stck.toArray()));
     }
}