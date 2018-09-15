/**
	Queue

	Ethan Chen

	Like Stack, Queue is a linnear structure which follows a particular
	order in which the operations are performed. The order is First In First Out
	(FIFO). A good example of queue is any queue of consumers for a resource  where
	the consumer that came first is served first. The difference between stacks and queues
	is in removing. In a stack we remove the itme the most recently added; in a queue, we 
	remove the item the least recently added.

	Operations on Queue:
	Mainly the following four basic operations are performed on queue:

	Enqueue: Adds an item to the queue. If the queue is full, then Overflow condition

	Dequeue: Removes an item from the queue. The items are popped in the same order in 
		which they are pushed. If the queue is empty, then Underflow condition.

	Front: Get the front item from queue

	Rear: Get the last item from queue

	Information from Geeks for Geeks:
	https://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/

**/

Class Queue{
	//Initialize variables
	int front, rear, size;
	int capacity;
	int array[];

	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	// Queue is full when size becomes equal to 
	// the capacity
	boolean isFull(Queue queue) {
		return(queue.size == queue.capacity);
	}

	// Queue is empty when size is 0
	boolean isEmpty(Queue queue) {
		return (queue.size == 0);
	}

	// Method to add an item to the queue,
	// It changes rear and size
	void enqueue(int item) {
		// If the queue is full, it won't add any items
		if(isFull(this)) {
			return;
		}

		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " Enqueued to queue");
	}

	// Method to remove an item from queue.
	// It changes front and size
	int dequeue()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
          
        int item = this.array[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }

	// Method to get front of queue
	int front() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return this.array[this.front];
	}

	// Method to get rear of Queue
	int rear(){
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return this.array[this.rear];
	}

	// Driver
	public static void main(String[] args) {
		Queue queue = new Queue(100);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		System.out.println(queue.dequeue() + " Dequeued from queue.");
		System.out.println("Front item is " + queue.front());
		System.out.println("Rear item is " + queue.rear());

	}
}