package Sevlets;

import java.util.*;

class Channel
{
	List<CustomerSubscriber> subs = new ArrayList();
	public void subscribe(CustomerSubscriber sub) 
	{
		subs.add(sub);
		
	}
	
}
class CustomerSubscriber
{
	String name;
	Channel WorldAffairs = new Channel();
	
	public CustomerSubscriber(String name) 
	{
		this.name = name;
	}
	public void subscribeChannel(Channel ch) 
	{
		WorldAffairs = ch;
		
	}
}

public class FirstServlet {

	public static void main(String[] args) {
		
		Channel op = new Channel();
		CustomerSubscriber s1 = new CustomerSubscriber("Chinmay");
		CustomerSubscriber s2 = new CustomerSubscriber("Tuhsar");
		CustomerSubscriber s3 = new CustomerSubscriber("Aman");
		CustomerSubscriber s4 = new CustomerSubscriber("Sujal");
		CustomerSubscriber s5 = new CustomerSubscriber("Alim");
		
		op.subscribe(s1);
		op.subscribe(s2);
		op.subscribe(s3);
		op.subscribe(s4);
		op.subscribe(s5);
		
		s1.subscribeChannel(op);
		s2.subscribeChannel(op);
		s3.subscribeChannel(op);
		s4.subscribeChannel(op);
		s5.subscribeChannel(op);
	}

}
