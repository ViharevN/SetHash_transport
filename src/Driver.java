public class Driver <T extends Transport>{
    private String firstName;
    private String secondName;
    private String lastName;
    private String carLicense;
    private String experience;
    private T cars;
    private String category;


    public Driver(String firstName, String secondName, String lastName, String carLicense, String experience, T cars, String category) {
        if (firstName != null && !firstName.isBlank() && !firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            this.firstName = "default firstName";
        }
        if (secondName != null && !secondName.isEmpty() && !secondName.isBlank()) {
            this.secondName = secondName;
        } else {
            this.secondName = "default secondName";
        }
        if (lastName != null && !lastName.isBlank() && !lastName.isEmpty()) {
            this.lastName = lastName;
        } else {
            this.lastName = "default lastName";
        }
        if (carLicense != null && !carLicense.isEmpty() && !carLicense.isBlank()) {
            this.carLicense = carLicense;
        } else {
            this.carLicense = "default catLicense";
        }
        if (experience != null && !experience.isBlank() && !experience.isEmpty()) {
            this.experience = experience;
        } else {
            this.experience = "default experience";
        }
        if (cars != null) {
            this.cars = cars;
        }

        setCategory(category);
    }
    public String getFullName() {
        return firstName + " " + secondName + " " + lastName;
    }

    public String getCarLicense() {
        return carLicense;
    }

    public String getExperience() {
        return experience;
    }

    public T getCars() {
        return cars;
    }

    public void startMove() {
        System.out.println("Водитель " + getFullName() + " начинает движение на " + cars.getBrand());

    }
    public void stopMove() {
        System.out.println("Водитель " + getFullName() + " заканчивает движение на " + cars.getBrand());

    }
    public void reFuel() {
        System.out.println("Водитель " + getFullName() + " заправляет топливом " + cars.getBrand());
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        } else {
            this.category = category;
        }
    }

    @Override
    public String toString() {
        return "Водитель " + getFullName() +
                ", управляет автомобилем " + cars.getBrand() +
                " и будет участвовать в заезде.";
    }
}
