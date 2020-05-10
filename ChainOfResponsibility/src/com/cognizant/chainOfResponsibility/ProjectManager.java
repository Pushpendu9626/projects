package com.cognizant.chainOfResponsibility;

public class ProjectManager implements LeaveRequestHandler {
	private LeaveRequestHandler nextHandler;

	public ProjectManager() {
		super();
	}

	public ProjectManager(LeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() <= 5)
			System.out.println("Project Manager approves leave for " + leaveRequest);
		else
			nextHandler.handleRequest(leaveRequest);
	}

}
