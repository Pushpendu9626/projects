package com.cognizant.chainOfResponsibility;

public interface LeaveRequestHandler {

	public static final LeaveRequestHandler nextHandler=null;

	public void handleRequest(LeaveRequest leaveRequest);

}
