package com.cognizant.chainOfResponsibility;

public class Program {
	public static LeaveRequestHandler getChainOfILeaveRequestHandlers() {
		LeaveRequestHandler hr = new HR();
		LeaveRequestHandler projectManager = new ProjectManager(hr);
		LeaveRequestHandler supervisor = new Supervisor(projectManager);
		return supervisor;
	}

	public static void main(String[] args) {
		LeaveRequest request1 = new LeaveRequest("Mr. Sourav", 5);
		LeaveRequest request2 = new LeaveRequest("Mr. Nayan", 6);
		LeaveRequest request3 = new LeaveRequest("Mr. Ram", 3);
		LeaveRequest request4 = new LeaveRequest("Mr. Sam", 4);
		LeaveRequest request5 = new LeaveRequest("Mr. Kaustab", 2);
		LeaveRequest request6 = new LeaveRequest("Mr. Pushpendu", 3);
		LeaveRequestHandler handler = getChainOfILeaveRequestHandlers();
		handler.handleRequest(request1);
		handler.handleRequest(request2);
		handler.handleRequest(request3);
		handler.handleRequest(request4);
		handler.handleRequest(request5);
		handler.handleRequest(request6);
	}
}
