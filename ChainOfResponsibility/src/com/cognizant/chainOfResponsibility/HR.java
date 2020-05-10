package com.cognizant.chainOfResponsibility;

public class HR implements LeaveRequestHandler {

	@SuppressWarnings("unused")
	private LeaveRequestHandler nextHandler;

	public HR(LeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	public HR() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {

		System.out.println("HR approves the leave for" + leaveRequest);
	}

}
