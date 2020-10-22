
import java.util.*;

public class TestBinaryTree {

    public static void main(String[] args) {
        
       
       //You can change the tree that will be used updating the value of variable num (0 to 8)
       int num = 8;

       int N [] = {1000 , 2000 , 3000 , 4000 , 5000 , 6000 , 7000 , 8000 , 9000};

       BinaryTree [] tree = new BinaryTree [9];

       tree[num] = new BinaryTree();
      
    //Experiment
       ArrayList<Integer> numbers = new ArrayList<Integer>();
    //Fill arrayList sorted
       for(int i = 0; i < N[num]; i++){
           numbers.add(i);
       }
    //With shuffle the numbers are randomized
       Collections.shuffle(numbers);
       for(int i = 0; i < N[num]; i++){
           Item it = new Item(numbers.get(i));
           tree[num].insert(it);
       }
        
        
        long initialTime = System.nanoTime();
       
        Item search = new Item(9003);
        tree[num].search(search);
        System.out.println("Number of comparisons: "+ tree[num].getComparisons());
       
        long finalTime = System.nanoTime();
       
      
        //Returns the current value of the system timer, in nanoseconds
        System.out.print("Time in ns = ");
        System.out.println(finalTime - initialTime);
      
        
    }
    
}
