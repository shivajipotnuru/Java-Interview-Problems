import java.util.*;

public class MainHeap{
	public static void main(String [] args){

		Heap [] exp1 = new Heap[10];
        Heap [] exp2 = new Heap[10];
        Heap [] exp3 = new Heap[10];
        int n [] = {10000 , 20000 , 30000 , 40000 , 50000 , 60000 , 70000 , 80000 , 90000 , 100000};
        int value = 10000;

        for (int i = 0; i < 10; i++){
            int v[] = new int[value];
            for (int j = 1; j < value ; j++){
                v[j] = j;
            }
            exp1[i] = new Heap(v);
            value += 10000;
        }

        value = 10000;

         for (int i = 0; i < 10; i++){
            int v[] = new int[value];
            for (int j = value-1, k = 1 ; j >= 1 ; j-- , k++){
                v[k] = j;
            }
            exp2[i] = new Heap(v);
            value += 10000;
        }

        value = 10000;

         for (int i = 0; i < 10; i++){
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int j = 1; j < value ; j++){
				numbers.add(j);            
			}
			Collections.shuffle(numbers);
			int [] v = new int[value];

			for(int j = 1 , k = 0 ; j < value ; j++ , k++)
				v[j] = numbers.get(k);
			
            exp3[i] = new Heap(v);
            value += 10000;
        }

        System.out.println("Experiment 1");
        for(int i = 0 ; i < 10 ; i++){
        	exp1[i].heapsort(exp1[i].getHeap(),n[i]);
        	System.out.println("Number of positions changed for  " + n[i] + "  elements:  " + exp1[i].getPositionsChanged());
        }
        
        System.out.println();
        System.out.println("Experiment 2");
        for(int i = 0 ; i < 10 ; i++){
        	exp2[i].heapsort(exp2[i].getHeap(),n[i]);
        	System.out.println("Number of positions changed for  " + n[i] + "  elements:  " + exp2[i].getPositionsChanged());
        }

        System.out.println();
        System.out.println("Experiment 3");
        for(int i = 0 ; i < 10 ; i++){
        	exp3[i].heapsort(exp3[i].getHeap(),n[i]);
        	System.out.println("Number of positions changed for  " + n[i] + "  elements:  " + exp3[i].getPositionsChanged());
        }
	}
}