public class Trucks extends Transport{
    private LoadCapacity loadCapacity;
    public Trucks(String brand, String model, Double volumeEngine, LoadCapacity loadCapacity) {
        super(brand, model, volumeEngine);
        this.loadCapacity = loadCapacity;
    }


    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
        if (loadCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println(loadCapacity + " тип авто");
        }
    }

    public boolean checkDiagnostic() {
        return Math.random() > 0.7;
    }

}
