package dispatcher;

import views.StaffView;
import views.StudentView;

public class DispatcherClass {
	
	StudentView student=new StudentView();
	StaffView staff=new StaffView();
	
	public void dispatch(String request)
	{
		if(request.equalsIgnoreCase("Student"))
		{
			student.show();
		}
		else
		{
			staff.show();
		}
	}
	

}
