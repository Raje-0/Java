package keyword;
class Counter{
	int count ;
	public void increment() {
		count++;
	}
}
public class K4_Sync {

	public static void main(String[] args) throws Exception {
		Counter c= new Counter();
		
		Thread t= new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i =1;i<=1000;i++) {
					c.increment();
				}
				
			}
		});
		t.start();
		t.join();
		
		System.out.println(c.count);
	}

}
