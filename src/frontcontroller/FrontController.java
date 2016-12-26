package frontcontroller;

import dispatcher.DispatcherClass;

public class FrontController {
	
	private DispatcherClass dispatcher;
	
	
	public FrontController() {
	
		dispatcher=new DispatcherClass();
	}
	
	
	public void dispatchRequest(String request)
	{
		
		dispatcher.dispatch(request);
	}
	

}
