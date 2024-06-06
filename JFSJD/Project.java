import java.util.Scanner;

class GetInformations {
  Scanner sc;
  String name;
  String fatherName;
  int age;
  double phoneNumber;
  String email;
  String graduation;
  String address;
  double tenthPercentage;
  double twelfthPercentage;
  double graduationPercentage;

  public GetInformations() {
    sc = new Scanner(System.in);
    this.name = "";
    this.fatherName = "";
    this.age = 0;
    this.phoneNumber = 0.0;
    this.email = "";
    this.graduation = "";
    this.address = "";
    this.tenthPercentage = 0.0;
    this.twelfthPercentage = 0.0;
    this.graduationPercentage = 0.0;
  }

  public void information(String companyName) {
    System.out.println("Enter your Name:");
    this.name = sc.nextLine();

    System.out.println("Enter your Father's Name:");
    this.fatherName = sc.nextLine();

    System.out.println("Enter your Phone Number:");
    this.phoneNumber = sc.nextDouble();

    System.out.println("Enter your Email:");
    this.email = sc.next();

    System.out.println("Enter your Permanent Address:");
    this.address = sc.next();
    sc.nextLine();

    System.out.println("Enter your Age:");
    this.age = sc.nextInt();

    if (this.age <= 18 || this.age >= 25) {
      System.out.println("You are not eligible for further processing.");
    } else {
      System.out.println("Enter your 10th Percentage:");
      this.tenthPercentage = sc.nextDouble();

      System.out.println("Enter your 12th Percentage:");
      this.twelfthPercentage = sc.nextDouble();

      System.out.println("Enter your Graduation Percentage:");
      this.graduationPercentage = sc.nextDouble();

      if (this.tenthPercentage > 75 && this.twelfthPercentage > 75 && this.graduationPercentage > 75) {
        System.out.println("Thank you! We've received your application for pilot registration for the company " + companyName);
        System.out.println("If you meet our eligibility criteria, you will receive an email notification for further instructions.");
      } else {
        System.out.println("Your qualifications do not match our requirements.");
      }
    }
  }
}

public class Project {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    GetInformations obj1 = new GetInformations();

    System.out.println("=======================================");
    System.out.println("        PILOT REGISTRATION SYSTEM      ");
    System.out.println("=======================================");

    System.out.println("Here are some Airlines Company Names:");

    String[] airlineCompanies = {
      "IndiGo Airlines",
      "Air India",
      "SpiceJet",
      "Vistara",
      "GoAir",
      "AirAsia India",
      "Air India Express",
      "Alliance Air",
      "TruJet",
      "Star Air",
      "Air Odisha",
      "Air Deccan",
      "Zoom Air",
      "Air Pegasus",
      "Air Costa",
    };

    for (String company : airlineCompanies) {
      System.out.println("- " + company);
    }

    System.out.println("Please select one of the following companies to register:");

    String nameOfCompany = sc.nextLine();
    boolean companyFound = false;

    for (int i = 0; i < airlineCompanies.length; i++) {
      if (airlineCompanies[i].equalsIgnoreCase(nameOfCompany)) {
        System.out.println("Please provide relevant information for registration:");
        GetInformations obj2 = new GetInformations(); // Create a new instance of GetInformations
        obj2.information(nameOfCompany);
        companyFound = true;
        break;
      }
    }

    if (!companyFound) {
      System.out.println("Invalid company name. Registration failed.");
    }

    sc.close();
  }
}
