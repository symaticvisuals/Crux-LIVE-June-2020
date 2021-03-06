package info.company.Lec19;

public class CircularQueue {

    protected int[] ar;

    private int DEFAULT_SIZE=10;

    protected int rear = 0;

    protected int front= 0;

    protected int size=0;

    public CircularQueue() {

        this.ar = new int[DEFAULT_SIZE];

    }

    protected boolean isFull(){
        return size==ar.length;
    }

    public void insert(int element){

        if(isFull()){
            return;
        }

        if(rear==ar.length){
            rear=0;
        }

        ar[rear++]=element;

//        rear = rear % ar.length;

        size++;
    }

    private boolean isEmpty(){
        return size==0;
    }

    public int delete(){

        if (isEmpty()){
            return -1;
        }

        int temp = ar[front];

        front++;
        front=front % ar.length;
        size--;
        return temp;
    }

    public void display(){

        for (int i = 0; i <size ; i++) {

            System.out.print(ar[(front+i)%ar.length]+ " ");

        }
        System.out.println();
    }


}
