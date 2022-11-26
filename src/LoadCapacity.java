public enum LoadCapacity {
    N1("с полной массой до 3,5 тонн"),
    N2("с полной массой свыше 3,5 до 12 тонн"),
    N3("с полной массой более 12 тонн");

    String loadCapacity;

    LoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }
}
