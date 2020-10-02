public class Heap{

	private int [] heap;
	private int [] heapSorted;
	private int positionsChanged;

	//Heap Constructor
	public Heap(int [] heap){
		this.heap = heap;
		this.heapConstruction();
	}

	private void heapConstruction(){

		int left = (heap.length/2) + 1;
		while(left > 1){
			left--;
			this.maintanceHeap(left,heap.length);
		}
	}
	//Adjust the actual node passed by parameter
	private void maintanceHeap(int actualNode , int heapSize){
		int leftSon = actualNode*2;
		int value = this.heap[actualNode];

		while(leftSon <= heapSize){
			if((leftSon < heapSize) && this.heap[leftSon+1] > this.heap[leftSon])
				leftSon++;
			if(value >= this.heap[leftSon-1])
				break;
			this.heap[actualNode] = this.heap[leftSon-1];
			actualNode = leftSon;
			leftSon = actualNode*2;
			positionsChanged++;
		}
		this.heap[actualNode-1] = value;
	}
	//Remove the register with the highest value in heap and reorganize
	private int removeMax(int heapSize){
		int max = 0;
		if(heapSize < 1)
			System.out.println("Erro: empty heap");
		else{
			max = this.heap[1];
			this.heap[1] = this.heap[heapSize-1];
			positionsChanged++;
			this.maintanceHeap(1, heapSize);
		}
		return max;
	}
	//Build the heap with the father being bigger than two sons
	public void heapsort(int [] heap , int heapSize){

		int actualNode;
		int heapSizeAux = heapSize;

		this.heapConstruction();
		actualNode = 1;
		while ( heapSizeAux > 1){ 
			this.heap[heapSizeAux-1] = this.removeMax(heapSizeAux);
			heapSizeAux --;
		}
		setHeapSorted(heap);
	}
	
	public int[] getHeap(){
		return this.heap;
	}
	
	public int[] getHeapSorted(){
		return this.heapSorted;
	}

	public void setHeapSorted(int[] heap){
		heapSorted = this.heap;
	}
	
	public int getPositionsChanged(){
		return this.positionsChanged;
	}
}