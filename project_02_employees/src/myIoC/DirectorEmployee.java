package myIoC;

public class DirectorEmployee implements Employee {

	private ReportCreation newReport;
	
	public DirectorEmployee(ReportCreation newReport) {
		this.newReport = newReport;
	}
	
	@Override
	public String getTasks() {
		return "My main task is to manage the agenda.";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report created by Director: " + newReport.getReport();
	}

}
