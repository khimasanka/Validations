package view.tdm;

import java.math.BigDecimal;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class CustomerTM {
    private String id;
    private String name;
    private String address;
    private BigDecimal salary;

    public CustomerTM() {
    }

    public CustomerTM(String id, String name, String address, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
