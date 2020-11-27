package ua.lviv.iot.view;

import java.sql.Date;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import ua.lviv.iot.controller.*;
import ua.lviv.iot.model.*;

public class View {

    private final CityController cityController = new CityController();
    private final DataIntervalController dataIntervalController = new DataIntervalController();
    private final ManufacturerAddressController manufacturerAddressController = new ManufacturerAddressController();
    private final WindDirectionController windDirectionController = new WindDirectionController();
    private final MeteostationController meteostationController = new MeteostationController();
    private final MeteostationDataController meteostationDataController = new MeteostationDataController();
    private final MeteostationLocationController meteostationLocationController = new MeteostationLocationController();
    private final MeteostationManufacturerController meteostationManufacturerController = new MeteostationManufacturerController();
    private final MeteostationServiceController meteostationServiceController = new MeteostationServiceController();
    private final StreetController streetController = new StreetController();

    private final Map<String, String> menu;
    private final Map<String, Printable> methodsMenu;
    private static final Scanner INPUT = new Scanner(System.in);

    public View() {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();

        menu.put("Q", "Q - exit program");
        menu.put("S", "S - show menu");

        menu.put("1", "1 - Get all cities");
        menu.put("2", "2 - Get a city by ID");
        menu.put("3", "3 - Create a city");
        menu.put("4", "4 - Delete a city by ID");
        menu.put("5", "5 - Update a city");

        menu.put("6", "6 - Get all data intervals");
        menu.put("7", "7 - Get data interval by ID");
        menu.put("8", "8 - Create data interval");
        menu.put("9", "9 - Delete data interval by ID");
        menu.put("10", "10 - Update data interval");

        menu.put("11", "11 - Get manufacturer addresses");
        menu.put("12", "12 - Get manufacturer address by ID");
        menu.put("13", "13 - Create manufacturer address");
        menu.put("14", "14 - Delete manufacturer address by ID");
        menu.put("15", "15 - Update manufacturer address");

        menu.put("16", "16 - Get wind directions");
        menu.put("17", "17 - Get wind direction by ID");
        menu.put("18", "18 - Create wind direction");
        menu.put("19", "19 - Delete wind direction by ID");
        menu.put("20", "20 - Update wind direction");

        menu.put("21", "21 - Get all meteostations");
        menu.put("22", "22 - Get meteostation by ID");
        menu.put("23", "23 - Create meteostation");
        menu.put("24", "24 - Delete meteostation by ID");
        menu.put("25", "25 - Update meteostation");

        menu.put("26", "26 - Get all meteostation data");
        menu.put("27", "27 - Get meteostation data by ID");
        menu.put("28", "28 - Create meteostation data");
        menu.put("29", "29 - Delete meteostation data by ID");
        menu.put("30", "30 - Update meteostation data");

        menu.put("31", "31 - Get all meteostation locations");
        menu.put("32", "32 - Get meteostation location by ID");
        menu.put("33", "33 - Create meteostation location");
        menu.put("34", "34 - Delete meteostation location by ID");
        menu.put("35", "35 - Update meteostation location");

        menu.put("36", "36 - Get all meteostation manufacturers");
        menu.put("37", "37 - Get meteostation manufacturer by ID");
        menu.put("38", "38 - Create meteostation manufacturer");
        menu.put("39", "39 - Delete meteostation manufacturer by ID");
        menu.put("40", "40 - Update meteostation manufacturer");

        menu.put("41", "41 - Get all meteostation services");
        menu.put("42", "42 - Get meteostation service by ID");
        menu.put("43", "43 - Create meteostation service");
        menu.put("44", "44 - Delete meteostation service by ID");
        menu.put("45", "45 - Update meteostation service");

        menu.put("46", "46 - Get all streets");
        menu.put("47", "47 - Get street by ID");
        menu.put("48", "48 - Create street");
        menu.put("49", "49 - Delete street by ID");
        menu.put("50", "50 - Update street");

        methodsMenu.put("S", this::outputMenu);


        methodsMenu.put("1", this::getAllCities);
        methodsMenu.put("2", this::getCityById);
        methodsMenu.put("3", this::createCity);
        methodsMenu.put("4", this::deleteCity);
        methodsMenu.put("5", this::updateCities);

        methodsMenu.put("6", this::getAllDataIntervals);
        methodsMenu.put("7", this::getDataIntervalById);
        methodsMenu.put("8", this::createDataInterval);
        methodsMenu.put("9", this::deleteDataInterval);
        methodsMenu.put("10", this::updateDataInterval);

        methodsMenu.put("11", this::getAllManufacturerAddresses);
        methodsMenu.put("12", this::getManufacturerAddressById);
        methodsMenu.put("13", this::createManufacturerAddress);
        methodsMenu.put("14", this::deleteManufacturerAddress);
        methodsMenu.put("15", this::updateManufacturerAddress);

        methodsMenu.put("16", this::getAllWindDirections);
        methodsMenu.put("17", this::getWindDirectionById);
        methodsMenu.put("18", this::createWindDirection);
        methodsMenu.put("19", this::deleteWindDirection);
        methodsMenu.put("20", this::updateWindDirection);

        methodsMenu.put("21", this::getAllMeteostations);
        methodsMenu.put("22", this::getMeteostationById);
        methodsMenu.put("23", this::createMeteostation);
        methodsMenu.put("24", this::deleteMeteostation);
        methodsMenu.put("25", this::updateMeteostation);

        methodsMenu.put("26", this::getAllMeteostationData);
        methodsMenu.put("27", this::getMeteostationDataById);
        methodsMenu.put("28", this::createMeteostationData);
        methodsMenu.put("29", this::deleteMeteostationData);
        methodsMenu.put("30", this::updateMeteostationData);

        methodsMenu.put("31", this::getAllMeteostationLocations);
        methodsMenu.put("32", this::getMeteostationLocationById);
        methodsMenu.put("33", this::createMeteostationLocation);
        methodsMenu.put("34", this::deleteMeteostationLocation);
        methodsMenu.put("35", this::updateMeteostationLocation);

        methodsMenu.put("36", this::getAllMeteostationManufacturers);
        methodsMenu.put("37", this::getMeteostationManufacturerById);
        methodsMenu.put("38", this::createMeteostationManufacturer);
        methodsMenu.put("39", this::deleteMeteostationManufacturer);
        methodsMenu.put("40", this::updateMeteostationManufacturer);

        methodsMenu.put("41", this::getAllMeteostationServices);
        methodsMenu.put("42", this::getMeteostationServiceById);
        methodsMenu.put("43", this::createMeteostationService);
        methodsMenu.put("44", this::deleteMeteostationService);
        methodsMenu.put("45", this::updateMeteostationService);

        methodsMenu.put("46", this::getAllStreets);
        methodsMenu.put("47", this::getStreetById);
        methodsMenu.put("48", this::createStreet);
        methodsMenu.put("49", this::deleteStreet);
        methodsMenu.put("50", this::updateStreet);

    }

    private void getAllCities() throws SQLException {
        System.out.println("\nCities:");
        System.out.println(cityController.findAll());
    }

    private void getCityById() throws SQLException {
        System.out.println("\nEnter ID for a city you want to find");
        int id = INPUT.nextInt();
        System.out.println(cityController.findBy(id));
    }

    private void deleteCity() throws SQLException {
        System.out.println("\nEnter ID for a city you want to delete");
        int id = INPUT.nextInt();
        System.out.println(cityController.delete(id));
    }

    private void createCity() throws SQLException {
        System.out.println("\nEnter city name");
        String cityName = INPUT.next();
        City city = new City(cityName);
        System.out.println(cityController.create(city));
    }

    private void updateCities() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter city name");
        String cityName = INPUT.next();
        City city = new City(id, cityName);
        System.out.println(cityController.update(city));
    }

    private void getAllDataIntervals() throws SQLException {
        System.out.println("\nDataInterval:");
        System.out.println(dataIntervalController.findAll());
    }

    private void getDataIntervalById() throws SQLException {
        System.out.println("\nEnter ID for an data interval you want to find");
        int id = INPUT.nextInt();
        System.out.println(dataIntervalController.findBy(id));
    }

    private void deleteDataInterval() throws SQLException {
        System.out.println("\nEnter ID for an data interval you want to delete");
        int id = INPUT.nextInt();
        System.out.println(dataIntervalController.delete(id));
    }

    private void createDataInterval() throws SQLException {
        System.out.println("\nEnter hours");
        int hours = INPUT.nextInt();
        System.out.println("\nEnter minutes");
        int minutes = INPUT.nextInt();
        System.out.println("\nEnter seconds");
        int seconds = INPUT.nextInt();
        DataInterval dataInterval = new DataInterval(hours, minutes, seconds);
        System.out.println(dataIntervalController.create(dataInterval));
    }

    private void updateDataInterval() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter hours");
        int hours = INPUT.nextInt();
        System.out.println("\nEnter minutes");
        int minutes = INPUT.nextInt();
        System.out.println("\nEnter seconds");
        int seconds = INPUT.nextInt();
        DataInterval dataInterval = new DataInterval(id, hours, minutes, seconds);
        System.out.println(dataIntervalController.update(dataInterval));
    }

    private void getAllManufacturerAddresses() throws SQLException {
        System.out.println("\nManufacturer Addresses:");
        System.out.println(manufacturerAddressController.findAll());
    }

    private void getManufacturerAddressById() throws SQLException {
        System.out.println("\nEnter ID for manufacturer address you want to find");
        int id = INPUT.nextInt();
        System.out.println(manufacturerAddressController.findBy(id));
    }

    private void deleteManufacturerAddress() throws SQLException {
        System.out.println("\nEnter ID for manufacturer address you want to delete");
        int id = INPUT.nextInt();
        System.out.println(manufacturerAddressController.delete(id));
    }

    private void createManufacturerAddress() throws SQLException {
        System.out.println("\nEnter building number");
        String buildingNumber = INPUT.next();
        System.out.println("\nEnter street id");
        int streetId = INPUT.nextInt();
        ManufacturerAddress manufacturerAddress = new ManufacturerAddress(buildingNumber, streetId);
        System.out.println(manufacturerAddressController.create(manufacturerAddress));
    }

    private void updateManufacturerAddress() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter building number");
        String buildingNumber = INPUT.next();
        System.out.println("\nEnter street id");
        int streetId = INPUT.nextInt();
        ManufacturerAddress manufacturerAddress = new ManufacturerAddress(id, buildingNumber, streetId);
        System.out.println(manufacturerAddressController.update(manufacturerAddress));
    }

    private void getAllWindDirections() throws SQLException {
        System.out.println("\nWind Directions:");
        System.out.println(windDirectionController.findAll());
    }

    private void getWindDirectionById() throws SQLException {
        System.out.println("\nEnter ID for wind direction you want to find");
        int id = INPUT.nextInt();
        System.out.println(windDirectionController.findBy(id));
    }

    private void deleteWindDirection() throws SQLException {
        System.out.println("\nEnter ID for wind direction you want to delete");
        int id = INPUT.nextInt();
        System.out.println(windDirectionController.delete(id));
    }

    private void createWindDirection() throws SQLException {
        System.out.println("\nEnter direction");
        String direction = INPUT.next();
        WindDirection windDirection = new WindDirection(direction);
        System.out.println(windDirectionController.create(windDirection));
    }

    private void updateWindDirection() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter direction");
        String direction = INPUT.next();
        WindDirection windDirection = new WindDirection(id, direction);
        System.out.println(windDirectionController.create(windDirection));
    }

    private void getAllMeteostations() throws SQLException {
        System.out.println("\nMeteostation:");
        System.out.println(meteostationController.findAll());
    }

    private void getMeteostationById() throws SQLException {
        System.out.println("\nEnter ID for meteostation you want to find");
        int id = INPUT.nextInt();
        System.out.println(meteostationController.findBy(id));
    }

    private void deleteMeteostation() throws SQLException {
        System.out.println("\nEnter ID for meteostation you want to delete");
        int id = INPUT.nextInt();
        System.out.println(meteostationController.delete(id));
    }

    private void createMeteostation() throws SQLException {
        System.out.println("\nEnter meteostation code");
        String meteostationCode = INPUT.next();
        System.out.println("\nEnter installation date (yyyy-[m]m-[d]d format)");
        String installationDate = INPUT.next();
        System.out.println("\nEnter meteostation location id");
        int meteostationLocationId = INPUT.nextInt();
        System.out.println("\nEnter meteostation manufacturer id code");
        int meteostationManufacturerId = INPUT.nextInt();
        System.out.println("\nEnter meteostation code");
        int dataIntervalId = INPUT.nextInt();
        Meteostation meteostation = new Meteostation(meteostationCode, Date.valueOf(installationDate), meteostationLocationId, meteostationManufacturerId, dataIntervalId);
        System.out.println(meteostationController.create(meteostation));
    }

    private void updateMeteostation() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter meteostation code");
        String meteostationCode = INPUT.next();
        System.out.println("\nEnter installation date (yyyy-[m]m-[d]d format)");
        String installationDate = INPUT.next();
        System.out.println("\nEnter meteostation location id");
        int meteostationLocationId = INPUT.nextInt();
        System.out.println("\nEnter meteostation manufacturer id code");
        int meteostationManufacturerId = INPUT.nextInt();
        System.out.println("\nEnter meteostation code");
        int dataIntervalId = INPUT.nextInt();
        Meteostation meteostation = new Meteostation(id, meteostationCode, Date.valueOf(installationDate), meteostationLocationId, meteostationManufacturerId, dataIntervalId);
        System.out.println(meteostationController.update(meteostation));
    }

    private void getAllMeteostationData() throws SQLException {
        System.out.println("\nMeteostation Data:");
        System.out.println(meteostationDataController.findAll());
    }

    private void getMeteostationDataById() throws SQLException {
        System.out.println("\nEnter ID for meteostation data you want to find");
        int id = INPUT.nextInt();
        System.out.println(meteostationDataController.findBy(id));
    }

    private void deleteMeteostationData() throws SQLException {
        System.out.println("\nEnter ID for meteostation data you want to delete");
        int id = INPUT.nextInt();
        System.out.println(meteostationDataController.delete(id));
    }

    private void createMeteostationData() throws SQLException {
        System.out.println("\nEnter temperature");
        float temperature = INPUT.nextFloat();
        System.out.println("\nEnter humidity");
        float humidity = INPUT.nextFloat();
        System.out.println("\nEnter wind speed");
        float windSpeed = INPUT.nextFloat();
        System.out.println("\nEnter atmospheric pressure");
        float atmosphericPressure = INPUT.nextFloat();
        System.out.println("\nEnter wind direction id");
        int windDirectionId = INPUT.nextInt();
        System.out.println("\nEnter meteostation id");
        int meteostationId = INPUT.nextInt();
        MeteostationData meteostationData = new MeteostationData(temperature, humidity, windSpeed,
                atmosphericPressure, windDirectionId, meteostationId);
        System.out.println(meteostationDataController.create(meteostationData));
    }

    private void updateMeteostationData() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter temperature");
        float temperature = INPUT.nextFloat();
        System.out.println("\nEnter humidity");
        float humidity = INPUT.nextFloat();
        System.out.println("\nEnter wind speed");
        float windSpeed = INPUT.nextFloat();
        System.out.println("\nEnter atmospheric pressure");
        float atmosphericPressure = INPUT.nextFloat();
        System.out.println("\nEnter wind direction id");
        int windDirectionId = INPUT.nextInt();
        System.out.println("\nEnter meteostation id");
        int meteostationId = INPUT.nextInt();
        MeteostationData meteostationData = new MeteostationData(id, temperature, humidity, windSpeed,
                atmosphericPressure, windDirectionId, meteostationId);
        System.out.println(meteostationDataController.update(meteostationData));
    }

    private void getAllMeteostationLocations() throws SQLException {
        System.out.println("\nMeteostation Location:");
        System.out.println(meteostationLocationController.findAll());
    }

    private void getMeteostationLocationById() throws SQLException {
        System.out.println("\nEnter ID for meteostation location you want to find");
        int id = INPUT.nextInt();
        System.out.println(meteostationLocationController.findBy(id));
    }

    private void deleteMeteostationLocation() throws SQLException {
        System.out.println("\nEnter ID for meteostation location you want to delete");
        int id = INPUT.nextInt();
        System.out.println(meteostationLocationController.delete(id));
    }

    private void createMeteostationLocation() throws SQLException {
        System.out.println("\nEnter gpsLocation");
        String gpsLocation = INPUT.next();
        System.out.println("\nEnter street id");
        int streetId = INPUT.nextInt();
        MeteostationLocation meteostationLocation = new MeteostationLocation(gpsLocation, streetId);
        System.out.println(meteostationLocationController.create(meteostationLocation));
    }

    private void updateMeteostationLocation() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter gpsLocation");
        String gpsLocation = INPUT.next();
        System.out.println("\nEnter street id");
        int streetId = INPUT.nextInt();
        MeteostationLocation meteostationLocation = new MeteostationLocation(id, gpsLocation, streetId);
        System.out.println(meteostationLocationController.update(meteostationLocation));
    }

    private void getAllMeteostationManufacturers() throws SQLException {
        System.out.println("\nMeteostation Manufacturers:");
        System.out.println(meteostationManufacturerController.findAll());
    }

    private void getMeteostationManufacturerById() throws SQLException {
        System.out.println("\nEnter ID for the salary you want to find");
        int id = INPUT.nextInt();
        System.out.println(meteostationManufacturerController.findBy(id));
    }

    private void deleteMeteostationManufacturer() throws SQLException {
        System.out.println("\nEnter ID for the salary you want to delete");
        int id = INPUT.nextInt();
        System.out.println(meteostationManufacturerController.delete(id));
    }

    private void createMeteostationManufacturer() throws SQLException {
        System.out.println("\nEnter name");
        String name = INPUT.next();
        System.out.println("\nEnter phone");
        String phone = INPUT.next();
        System.out.println("\nEnter email");
        String email = INPUT.next();
        System.out.println("\nEnter address id");
        int addressId = INPUT.nextInt();
        MeteostationManufacturer meteostationManufacturer = new MeteostationManufacturer(name, phone, email, addressId);
        System.out.println(meteostationManufacturerController.create(meteostationManufacturer));
    }

    private void updateMeteostationManufacturer() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter name");
        String name = INPUT.next();
        System.out.println("\nEnter phone");
        String phone = INPUT.next();
        System.out.println("\nEnter email");
        String email = INPUT.next();
        System.out.println("\nEnter address id");
        int addressId = INPUT.nextInt();
        MeteostationManufacturer meteostationManufacturer = new MeteostationManufacturer(id, name, phone, email, addressId);
        System.out.println(meteostationManufacturerController.update(meteostationManufacturer));
    }

    private void getAllMeteostationServices() throws SQLException {
        System.out.println("\nMeteostation Service:");
        System.out.println(meteostationServiceController.findAll());
    }

    private void getMeteostationServiceById() throws SQLException {
        System.out.println("\nEnter ID for meteostation service you want to find");
        int id = INPUT.nextInt();
        System.out.println(meteostationServiceController.findBy(id));
    }

    private void deleteMeteostationService() throws SQLException {
        System.out.println("\nEnter ID for meteostation service you want to delete");
        int id = INPUT.nextInt();
        System.out.println(meteostationServiceController.delete(id));
    }

    private void createMeteostationService() throws SQLException {
        System.out.println("\nEnter service description");
        String serviceDescription = INPUT.next();
        System.out.println("\nEnter service date");
        String serviceDate = INPUT.next();
        System.out.println("\nEnter is regular");
        Boolean isRegular = INPUT.nextBoolean();
        System.out.println("\nEnter meteostation id");
        int meteostationId = INPUT.nextInt();
        MeteostationService meteostationService = new MeteostationService(serviceDescription, Date.valueOf(serviceDate), isRegular, meteostationId);
        System.out.println(meteostationServiceController.create(meteostationService));
    }

    private void updateMeteostationService() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter service description");
        String serviceDescription = INPUT.next();
        System.out.println("\nEnter service date");
        String serviceDate = INPUT.next();
        System.out.println("\nEnter is regular");
        Boolean isRegular = INPUT.nextBoolean();
        System.out.println("\nEnter meteostation id");
        int meteostationId = INPUT.nextInt();
        MeteostationService meteostationService = new MeteostationService(id, serviceDescription, Date.valueOf(serviceDate), isRegular, meteostationId);
        System.out.println(meteostationServiceController.update(meteostationService));
    }

    private void getAllStreets() throws SQLException {
        System.out.println("\nStreets:");
        System.out.println(streetController.findAll());
    }

    private void getStreetById() throws SQLException {
        System.out.println("\nEnter ID for street you want to find");
        int id = INPUT.nextInt();
        System.out.println(streetController.findBy(id));
    }

    private void deleteStreet() throws SQLException {
        System.out.println("\nEnter ID for street you want to delete");
        int id = INPUT.nextInt();
        System.out.println(streetController.delete(id));
    }

    private void createStreet() throws SQLException {
        System.out.println("\nEnter street name");
        String streetName = INPUT.next();
        System.out.println("\nEnter city ID");
        int cityId = INPUT.nextInt();
        Street street = new Street(streetName, cityId);
        System.out.println(streetController.create(street));
    }

    private void updateStreet() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter street name");
        String streetName = INPUT.next();
        System.out.println("\nEnter city ID");
        int cityId = INPUT.nextInt();
        Street street = new Street(id, streetName, cityId);
        System.out.println(streetController.update(street));
    }

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    private void outputSubMenu() {
        System.out.println(menu.get("S"));
        System.out.println(menu.get("Q"));
        System.out.println("Please, select menu point.");
    }

    public void show() {
        String keyMenu;
        outputSubMenu();
        do {
            keyMenu = INPUT.next().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            }
            catch (Exception ignored){
            }
            outputSubMenu();
        } while (!keyMenu.equals("Q"));
    }
}