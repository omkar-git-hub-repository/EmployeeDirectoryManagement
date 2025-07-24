package employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeDocuments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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