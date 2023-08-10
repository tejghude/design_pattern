package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyAdapter implements LeaveRecord{
    ThirdPartyLeaveRecord thirdpartyLeaveRecord;


    ThirdPartyAdapter(ThirdPartyLeaveRecord thirdpartyLeaveRecord,Employee employee){
        this.thirdpartyLeaveRecord=thirdpartyLeaveRecord;
    }


    @Override
    public String getMostAbsentEmployee() {
        return thirdpartyLeaveRecord.getMostAbsentEmployee().getName();
    }

    @Override
    public int getEmployeeAbsences(String employeeName) {
        Employee employee = new Employee(employeeName);
        return thirdpartyLeaveRecord.getEmployeeAbsences(employee);
    }
}
