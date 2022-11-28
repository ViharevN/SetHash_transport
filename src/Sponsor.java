public class Sponsor <S extends Transport>{
    private String nameCompany;
    private Integer sponsoredCash;

    public Sponsor(String nameCompany, Integer sponsoredCash) {
        this.nameCompany = nameCompany;
        this.sponsoredCash = sponsoredCash;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public Integer getSponsoredCash() {
        return sponsoredCash;
    }

    public void setSponsoredCash(Integer sponsoredCash) {
        this.sponsoredCash = sponsoredCash;
    }

    public void organizationOfRaces() {
        System.out.println(getNameCompany() + " организовал гонки");
    }

    @Override
    public String toString() {
        return " Компания: " + nameCompany +
                ", спонсорская помощь: " + sponsoredCash;
    }
}
