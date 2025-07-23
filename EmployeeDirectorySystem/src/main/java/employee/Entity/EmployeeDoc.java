package employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeDoc")
public class EmployeeDoc {

    @Id
    private int id;
    private String AAdharNo;
    private String PanNo;

    // getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAAdharNo() {
        return AAdharNo;
    }

    public void setAAdharNo(String aAdharNo) {
        AAdharNo = aAdharNo;
    }

    public String getPanNo() {
        return PanNo;
    }

    public void setPanNo(String panNo) {
        PanNo = panNo;
    }

    @Override
    public String toString() {
        return "EmployeeDoc{" +
                "id=" + id +
                ", AAdharNo='" + AAdharNo + '\'' +
                ", PanNo='" + PanNo + '\'' +
                '}';
    }
}
