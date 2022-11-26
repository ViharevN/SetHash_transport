public enum Capacity {
    ESPECIALLY_SMALL("особо малая"),
    SMALL("малая"),
    AVERAGE("средняя"),
    BIG("большая"),
    ESPECIALLY_BIG("особо большая");

    String capacity;

    Capacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }
}
