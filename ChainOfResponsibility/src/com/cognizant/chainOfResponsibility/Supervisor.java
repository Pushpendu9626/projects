package com.cognizant.chainOfResponsibility;

public class Supervisor implements LeaveRequestHandler {
	private LeaveRequestHandler nextHandler;

	public Supervisor() {
		super();
	}

	public Supervisor(LeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() <= 3)
			System.out.println("Supervisor approves leave for " + leaveRequest);
		else
			nextHandler.handleRequest(leaveRequest);
	}

}
