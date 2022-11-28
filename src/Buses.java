public class Buses extends Transport {
    private Capacity capacity;
    public Buses(String brand, String model, Double volumeEngine, Capacity capacity) {
        super(brand, model, volumeEngine);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startMove() {
    }

    @Override
    public void stopMove() {
    }

    @Override
    public void pitStop() {
        System.out.println("ПитСтоп " + getBrand());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: "+getBrand());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand());
    }
    @Override
    public void checkType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println(capacity + " тип авто");
        }
    }

    @Override
    public boolean checkDiagnostic() {
        System.out.println("Автобус " + getBrand() + getModel() +  "  в диагностике не нуждается");
        return false;
    }
}
