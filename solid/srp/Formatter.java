package solid.live.srp;

public class Formatter {
    public Employee employee;
    Formatter(Employee employee){
        this.employee=employee;
    }
    public String toHtml(Employee employee){
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpID() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";

        str += "<div class='right'><span>" + (employee.getTotalLeaveAllowed() - employee.getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";
        if (employee.getManager() != null) str += "<span>" + this.employee.getManager() + "</span>";
        else str += "<span>None</span>";

        int totalLeaveLeftPreviously = employee.calculateTotalLeaveLeftPreviously();
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
