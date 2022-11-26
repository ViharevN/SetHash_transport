import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cars lada = new Cars("Лада", "Гранта", 1.6, BodyType.SEDAN);
        Cars bmw = new Cars("БМВ", "3-я серия", 2.5, BodyType.SEDAN);
        Cars audi = new Cars("Ауди", "А5", 3.2, BodyType.SEDAN);
        Cars hyundai = new Cars("Hyundai", "Avante", 1.8, BodyType.SEDAN);


        Trucks kamaz = new Trucks("Камаз", "5511", 11.95, LoadCapacity.N3);
        Trucks maz = new Trucks("Маз", "5340", 6.9,LoadCapacity.N2);
        Trucks man = new Trucks("Man", "TGA-18-410", 11.9, LoadCapacity.N2);
        Trucks renault = new Trucks("Renault", "Magnum", 12.9,LoadCapacity.N1);

        Buses nefaz = new Buses("Nefaz", "5299", 6.7,Capacity.SMALL);
        Buses busMaz = new Buses("Маз", "103", 6.4, Capacity.ESPECIALLY_BIG);
        Buses paz = new Buses("Паз", "4234", 4.4, Capacity.AVERAGE);
        Buses gazelle = new Buses("Газель", "Next", 2.7, Capacity.BIG);

//        hyundai.pitStop();
//        kamaz.pitStop();
//        nefaz.pitStop();

        DriverCatLicenseB vasily = new DriverCatLicenseB("Василий",
                "Васильевич",
                "Васильев",
                "права категории В",
                "3 года опыта",
                bmw,
                "B");
//        vasily.reFuel();
//        vasily.startMove();
//        System.out.println(vasily.toString());

        DriverCatLicenseC petr = new DriverCatLicenseC("Петр",
                "Петрович",
                "Петров",
                "права категории С",
                "7 лет опыта",
                kamaz,
                "C");
//        petr.reFuel();
//        petr.startMove();
//        System.out.println(petr.toString());

        DriverCatLicenseD alex = new DriverCatLicenseD("Алексей",
                "Алексеевич",
                "Алексеев",
                "права категории Д",
                "12 лет опыта",
                nefaz,
                "D");
//        alex.reFuel();
//        alex.startMove();
//        System.out.println(alex.toString());
//        alex.stopMove();
//        man.checkType();
//        nefaz.checkType();

//        checkDiagnostic(kamaz,
//                hyundai,
//                man,
//                bmw,
//                nefaz,
//                maz,
//                gazelle,
//                lada,
//                audi,
//                hyundai);

        Sponsor<Transport> sponsor1 = new Sponsor<Transport>("Lukoil", 15000);
        Sponsor<Transport> sponsor2 = new Sponsor<Transport>("TatNeft", 15000);
        Sponsor<Transport> sponsor3 = new Sponsor<Transport>("TatarMatarNeft", 15000);
        Sponsor<Transport> sponsor4 = new Sponsor<Transport>("LukoilMukoilNeft", 15000);

        List<Sponsor> sponsors = new ArrayList<>();
        sponsors.add(sponsor1);
        sponsors.add(sponsor2);
        sponsors.add(sponsor3);
        sponsors.add(sponsor4);

//        System.out.println(sponsors);
//        sponsor2.organizationOfRaces();



//        System.out.println(autoList);



        Mehanic<Cars> mehanic1 = new Mehanic<>("Ivan", "Sidorov", "Lukoil", bmw);
        Mehanic<Trucks> mehanic2 = new Mehanic<>("Sidor", "Ivanov", "Lukoil", man);
        Mehanic<Buses> mehanic3 = new Mehanic<>("Sidor", "Sodorov", "Lukoil", nefaz);


        lada.addDriver(vasily);
        lada.addMehanic(mehanic1);
        lada.addSponsor(sponsor1);

        man.addDriver(petr);
        man.addMehanic(mehanic2);
        man.addSponsor(sponsor2);

        nefaz.addDriver(alex);
        nefaz.addMehanic(mehanic3);
        nefaz.addSponsor(sponsor3);


        List<Transport> autoList = new ArrayList<>();
        autoList.add(lada);
        autoList.add(man);
        autoList.add(nefaz);

        System.out.println(autoList);


        for (Transport transport : autoList) {
            printInfo(transport);
        }


        serviceStation<Transport> serviceNumberOne = new serviceStation<>("ServiceNumberOne");
        serviceNumberOne.addAutoInQueue(bmw);
        serviceNumberOne.addAutoInQueue(hyundai);
        serviceNumberOne.addAutoInQueue(lada);
        serviceNumberOne.addAutoInQueue(audi);
        serviceNumberOne.addAutoInQueue(renault);
        serviceNumberOne.addAutoInQueue(kamaz);
        serviceNumberOne.addAutoInQueue(maz);

        serviceNumberOne.repairAuto();





    }

    public static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю: " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getNameCompany());
        }
        System.out.println("Водитель: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFullName());
        }
        System.out.println("Механики: ");
        for (Mehanic<?> mehanic : transport.getMehanics()) {
            System.out.println(mehanic.getName());
        }


    }








    private static void checkDiagnostic(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        if (!transport.checkDiagnostic()) {
            try {
                throw new RuntimeException(
                        "автомобиль "
                                + transport.getBrand() + " "
                                + transport.getModel() +
                                " не прошел диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}