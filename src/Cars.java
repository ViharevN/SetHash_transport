public class Cars extends Transport {
    private BodyType bodyType;

    public Cars(String brand, String model, Double volumeEngine, BodyType bodyType) {
        super(brand, model, volumeEngine);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println(bodyType + " тип авто");
        }
    }

    public boolean checkDiagnostic() {
        return Math.random() > 0.7;
    }
}
