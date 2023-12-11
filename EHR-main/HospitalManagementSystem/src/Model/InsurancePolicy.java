
package Model;


public class InsurancePolicy {
    String  patientUsername, insuranceAgencyId;
    int id;
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
    
         @Override
    public String toString(){
        return patientUsername;
    }
}
