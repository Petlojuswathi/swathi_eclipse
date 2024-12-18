
import java.util.*;
import java.util.stream.Collectors;

class Smartwatch {
    private int watchId;
    private String brandName;
    private String modelName;
    private int price;
    private String releaseDate;
    private int batteryLife;
    private String connectivity;
    private String waterResistanceLevel;

    public Smartwatch(int watchId, String brandName, String modelName, int price, String releaseDate, int batteryLife, String connectivity, String waterResistanceLevel) {
        this.watchId = watchId;
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
        this.releaseDate = releaseDate;
        this.batteryLife = batteryLife;
        this.connectivity = connectivity;
        this.waterResistanceLevel = waterResistanceLevel;
    }

    public int getWatchId() {
        return watchId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public void setWaterResistanceLevel(String waterResistanceLevel) {
        this.waterResistanceLevel = waterResistanceLevel;
    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "watchId=" + watchId +
                ", brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                ", releaseDate='" + releaseDate + '\'' +
                ", batteryLife=" + batteryLife +
                ", connectivity='" + connectivity + '\'' +
                ", waterResistanceLevel='" + waterResistanceLevel + '\'' +
                '}';
    }
}

public class SmartwatchApp {
    private static List<Smartwatch> smartwatchList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("SMARTWATCH MANAGEMENT APPLICATION");
            System.out.println("----------------------------------");
            System.out.println("1. Add a Smartwatch");
            System.out.println("2. View All Smartwatches");
            System.out.println("3. Update a Smartwatch");
            System.out.println("4. Delete a Smartwatch");
            System.out.println("0. Exit");
            System.out.print("Please select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addSmartwatch(scanner);
                    break;
                case 2:
                    viewAllSmartwatches();
                    break;
                case 3:
                    updateSmartwatch(scanner);
                    break;
                case 4:
                    deleteSmartwatchById(scanner);
                    break;
                case 0:
                    System.out.println("Thank you for using the Smartwatch Management Application!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void addSmartwatch(Scanner scanner) {
        System.out.print("Enter Watch ID: ");
        int watchId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Brand Name: ");
        String brandName = scanner.nextLine();
        System.out.print("Enter Model Name: ");
        String modelName = scanner.nextLine();
        System.out.print("Enter Price: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Release Date (YYYY-MM-DD): ");
        String releaseDate = scanner.nextLine();
        System.out.print("Enter Battery Life (in hours): ");
        int batteryLife = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Connectivity: ");
        String connectivity = scanner.nextLine();
        System.out.print("Enter Water Resistance Level: ");
        String waterResistanceLevel = scanner.nextLine();

        Smartwatch smartwatch = new Smartwatch(watchId, brandName, modelName, price, releaseDate, batteryLife, connectivity, waterResistanceLevel);
        smartwatchList.add(smartwatch);
        System.out.println("Smartwatch added successfully!");
    }

    private static void viewAllSmartwatches() {
        if (smartwatchList.isEmpty()) {
            System.out.println("No smartwatches available.");
        } else {
            smartwatchList.forEach(System.out::println);
        }
    }

    private static void updateSmartwatch(Scanner scanner) {
        System.out.print("Enter Watch ID to Update: ");
        int watchId = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Smartwatch smartwatch = smartwatchList.stream()
                .filter(s -> s.getWatchId() == watchId)
                .findFirst()
                .orElse(null);

        if (smartwatch == null) {
            System.out.println("No smartwatch found with Watch ID: " + watchId);
            return;
        }

        System.out.print("Enter New Brand Name: ");
        String brandName = scanner.nextLine();
        System.out.print("Enter New Model Name: ");
        String modelName = scanner.nextLine();
        System.out.print("Enter New Price: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter New Release Date (YYYY-MM-DD): ");
        String releaseDate = scanner.nextLine();
        System.out.print("Enter New Battery Life (in hours): ");
        int batteryLife = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter New Connectivity: ");
        String connectivity = scanner.nextLine();
        System.out.print("Enter New Water Resistance Level: ");
        String waterResistanceLevel = scanner.nextLine();

        smartwatch.setBrandName(brandName);
        smartwatch.setModelName(modelName);
        smartwatch.setPrice(price);
        smartwatch.setReleaseDate(releaseDate);
        smartwatch.setBatteryLife(batteryLife);
        smartwatch.setConnectivity(connectivity);
        smartwatch.setWaterResistanceLevel(waterResistanceLevel);

        System.out.println("Smartwatch updated successfully!");
    }

    private static void deleteSmartwatchById(Scanner scanner) {
        System.out.print("Enter Watch ID to Delete: ");
        int watchId = scanner.nextInt();

        boolean removed = smartwatchList.removeIf(s -> s.getWatchId() == watchId);

        if (removed) {
            System.out.println("Smartwatch deleted successfully!");
        } else {
            System.out.println("No smartwatch found with Watch ID: " + watchId);
        }
    }
}

