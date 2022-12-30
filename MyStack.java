class MyStack{ //Test
	private int[]arr;
	private int size;
	private int top;
	public int getArr(int x){
		return arr[x];
	}
	public int getArrSize(){
		return arr.length;
	}
	public void setArr(int a){
		arr=new int[a];
	}
	public int getSize(){
		return size;
	}
	public void setSize(){
		this.size=size;
	}
	public int getTop(){
		return top;
	}
	public void setTop(){
		this.top=-1;
	}

	MyStack(int x){
		setArr(x);
		setSize();
		setTop();
	}
	void push(int a){
		if(this.getTop()==arr.length)
			System.out.println("The stack is full");
		top++;
		arr[top]=a;
	}
	int pop(){
		if(top==-1)
			return -1;
		int res= arr[top];
		top--;
		return res;
		
	}
	int size(){
		return top+1;
	}
	int peak(){
		if(top==-1)
			return -1;
		else
		return arr[top];
	}
	boolean isEmpty(){
		return (top==-1);
	}

}

