/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author slaks
 */
public class InsuranceClaims {
    String patientUsername, insuranceAgencyId, amount, approval1, approval2;
    int id, pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getInsuranceAgencyId() {
        return insuranceAgencyId;
    }

    public void setInsuranceAgencyId(String insuranceAgencyId) {
        this.insuranceAgencyId = insuranceAgencyId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getApproval1() {
        return approval1;
    }

    public void setApproval1(String approval1) {
        this.approval1 = approval1;
    }

    public String getApproval2() {
        return approval2;
    }

    public void setApproval2(String approval2) {
        this.approval2 = approval2;
    }
    
    @Override
    public String toString(){
        return patientUsername;
    }
}
