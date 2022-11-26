import java.util.Objects;

public class Mehanic <M extends Transport>{
    private String name;
    private String surName;
    private String company;
    private M transport;

    public Mehanic(String name, String surName, String company, M transport) {
        this.name = name;
        this.surName = surName;
        this.company = company;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public M getTransport() {
        return transport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mehanic<?> mehanic = (Mehanic<?>) o;
        return Objects.equals(name, mehanic.name) && Objects.equals(surName, mehanic.surName) && Objects.equals(company, mehanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, company);
    }

    public boolean service(M transport){
        return transport.checkDiagnostic();
    }

    public void repair(M transport) {
        System.out.println("механик " +
                getName() + " " +
                getSurName() + " проводит ремонт " +
                transport.getBrand() + " " +
                transport.getModel());
    }

    @Override
    public String toString() {
        return " Имя:" + name +
                ", Фамилия: " + surName +
                ", Компания: " + company +
                ", Тип авто" + transport;
    }
}
