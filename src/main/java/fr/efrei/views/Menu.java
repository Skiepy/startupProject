package fr.efrei.views;

import fr.efrei.domain.*;
import fr.efrei.factory.*;
import fr.efrei.repository.*;

import java.util.Scanner;

public class Menu {
    private Boolean run = true;
    private final Scanner scan = new Scanner(System.in);

    // "DataBase"
    private static final GenderRepository genderDB = GenderRepository.getGenderDB();
    private static final RaceRepository raceDB = RaceRepository.getRepository();
    private static final EmployeeRepository employeeDB = EmployeeRepository.getRepository();
    // private static final PositionRepository positionDB = PositionRepository.getRepository();
    // private static final JobRepository jobDB = JobRepository.getRepository();

    // Pre-taped answers for gender
    private static final Gender gender1 = GenderFactory.createGender("Male");
    private static final Gender gender2 = GenderFactory.createGender("Female");
    private static final Gender gender3 = GenderFactory.createGender("Other");

    // Pre-taped answers for race
    private static final Race race1 = RaceFactory.createRace("White");
    private static final Race race2 = RaceFactory.createRace("Black");
    private static final Race race3 = RaceFactory.createRace("Coloured");
    private static final Race race4 = RaceFactory.createRace("Indian");
    private static final Race race5 = RaceFactory.createRace("Other");


    public void loadMenu() {
        // Add pre-taped values to the "Database"
        // Gender
        genderDB.create(gender1);
        genderDB.create(gender2);
        genderDB.create((gender3));

        // Race
        raceDB.create(race1);
        raceDB.create(race2);
        raceDB.create(race3);
        raceDB.create(race4);
        raceDB.create(race5);

        System.out.println("Welcome to Startup employees management system.");
        while (run) {
            System.out.println("┌────────────────────┐");
            System.out.printf("│%-20s│%n", "Options menu :");
            System.out.println("└────────────────────┘");
            System.out.println("┌──────────────────────────────────┐");
            System.out.printf("│%-34s│%n", "(1) Add Employee");
            System.out.printf("│%-34s│%n", "(2) Delete Employee");
            System.out.printf("│%-34s│%n", "(3) Update Employee");
            System.out.printf("│%-34s│%n", "(4) Search for an Employee by ID");
            System.out.printf("│%-34s│%n", "(5) Display all Employees");
            System.out.printf("│%-34s│%n", "(6) Exit the program");
            System.out.println("└──────────────────────────────────┘");
            System.out.print("Your choice : ");

            String answer = scan.nextLine();

            switch (answer) {
                case "1":
                    System.out.println("You've choose to add a new employee.\nPlease, fill this form :");
                    System.out.print("Firstname : ");
                    String firstName = scan.nextLine();
                    System.out.println("Does he have a middlename ?");
                    String middleNameChoice;
                    do {
                        System.out.print("(1) Yes / (2) No : ");
                        middleNameChoice = scan.nextLine();
                        if (!(middleNameChoice.equals("1")|| middleNameChoice.equals("2")))
                            System.out.println("Please enter a value between 1 and 2.");
                    } while (!(middleNameChoice.equals("1")|| middleNameChoice.equals("2")));
                    String middleName = "";
                    if (middleNameChoice.equals("1")) {
                        System.out.print("Middlename : ");
                        middleName = scan.nextLine();
                    } else {
                        middleName = "/";
                    }
                    System.out.print("Lastname : ");
                    String lastName = scan.nextLine();
                    Name employeeName = NameFactory.createName(firstName, middleName, lastName);

                    System.out.println("Select a gender : ");
                    String genderChoice;
                    do {
                        System.out.print("(1) Male / (2) Female / (3) Other : ");
                        genderChoice = scan.nextLine();
                        if (!(genderChoice.equals("1") || genderChoice.equals("2") || genderChoice.equals("3")))
                            System.out.println("Please enter a value between 1 and 3.");
                    } while (!(genderChoice.equals("1") || genderChoice.equals("2") || genderChoice.equals("3")));
                    Gender gender;
                    if (genderChoice.equals("1")) {
                        gender = genderDB.read(gender1.getId());
                    } else if (genderChoice.equals("2")) {
                        gender = genderDB.read(gender2.getId());
                    } else {
                        gender = genderDB.read(gender3.getId());
                    }

                    System.out.println("Select a race : ");
                    String raceChoice;
                    do {
                        System.out.print("(1) White / (2) Black / (3) Coloured / (4) Indian / (5) Other : ");
                        raceChoice = scan.nextLine();
                        if (!(raceChoice.equals("1") || raceChoice.equals("2") || raceChoice.equals("3") || raceChoice.equals("4") || raceChoice.equals("5")))
                            System.out.println("Please enter a value between 1 and 5.");
                    } while (!(raceChoice.equals("1") || raceChoice.equals("2") || raceChoice.equals("3") || raceChoice.equals("4") || raceChoice.equals("5")));
                    Race race;
                    if (raceChoice.equals("1")) {
                        race = raceDB.read(race1.getId());
                    } else if (raceChoice.equals("2")) {
                        race = raceDB.read(race2.getId());
                    } else if (raceChoice.equals("3")) {
                        race = raceDB.read(race3.getId());
                    } else if (raceChoice.equals("4")) {
                        race = raceDB.read(race4.getId());
                    } else {
                        race = raceDB.read(race5.getId());
                    }

                    System.out.println("-----Contact details-----");
                    System.out.print("Phone number : ");
                    String phoneNumber = scan.nextLine();
                    System.out.println("Does he have a home phone number ? ");
                    String homeNumberChoice;
                    do {
                        System.out.print("(1) Yes / (2) No : ");
                        homeNumberChoice = scan.nextLine();
                        if (!(homeNumberChoice.equals("1")|| homeNumberChoice.equals("2")))
                            System.out.println("Please enter a value between 1 and 2.");
                    } while (!(homeNumberChoice.equals("1")|| homeNumberChoice.equals("2")));
                    String homePhoneNumber = "";
                    if (homeNumberChoice.equals("1")) {
                        System.out.print("Home phone number : ");
                        homePhoneNumber = scan.nextLine();
                    } else {
                        homePhoneNumber = "/";
                    }
                    System.out.print("Email : ");
                    String email = scan.nextLine();
                    ContactDetails contacts = ContactDetailsFactory.createContactDetails(phoneNumber, homePhoneNumber, email);

                    System.out.println("-----Address details-----");
                    System.out.print("Street address : ");
                    String streetAddress = scan.nextLine();
                    System.out.print("Postal address : ");
                    String postalAddress = scan.nextLine();
                    AddressDetails address = AddressDetailsFactory.createAddressDetails(streetAddress, postalAddress);

                    System.out.println("-----Official ID-----");
                    System.out.println("Select an official document : ");
                    String idChoice;
                    do {
                        System.out.print("(1) ID card / (2) Passport / (3) Driving licence : ");
                        idChoice = scan.nextLine();
                        if (!(idChoice.equals("1") || idChoice.equals("2") || idChoice.equals("3")))
                            System.out.println("Please enter a value between 1 and 3.");
                    } while (!(idChoice.equals("1") || idChoice.equals("2") || idChoice.equals("3")));
                    System.out.print("ID Number : ");
                    String idNumber = scan.nextLine();
                    Identity identity;
                    if (idChoice.equals("1")) {
                        identity = IdentityFactory.createIdentity("ID Card", idNumber);
                    } else if (idChoice.equals("2")) {
                        identity = IdentityFactory.createIdentity("Passport", idNumber);
                    } else {
                        identity = IdentityFactory.createIdentity("Driving Licence", idNumber);
                    }

                    // Create Employee
                    Employee employee = EmployeeFactory.createEmployee(employeeName, gender, race, contacts, address, identity);

                    // Store Employee in the "Database"
                    if (employeeDB.create(employee) != null) {
                        System.out.println("You have successfully created Employee N°" + employee.getEmployeeNumber() + " !");

                        // Add Job and Position
                        System.out.println("Do you want to add him to a job and a position ?");
                        String addJobChoice;
                        do {
                            System.out.print("(1) Yes / (2) No : ");
                            addJobChoice = scan.nextLine();
                            if (!(addJobChoice.equals("1")|| addJobChoice.equals("2")))
                                System.out.println("Please enter a value between 1 and 2.");
                        } while (!(addJobChoice.equals("1")|| addJobChoice.equals("2")));
                        if (addJobChoice.equals("1")){
                            // System.out.print("Enter the employee's job : ");
                            // String jobInput = scan.nextLine();
                            // System.out.print("Enter it's position : ");
                            // String positionInput = scan.nextLine();
                            System.out.println("Sorry, this feature is not available on this version of the program.");
                        }
                    } else {
                        System.out.println("Oups... Something went wrong. Please try again !");
                    }
                    System.out.println("Press enter to continue...");
                    break;

                case "2": // Delete Employee
                    System.out.print("Please enter the employee's ID : ");
                    int employeeID = scan.nextInt();
                    if (employeeDB.read(employeeID) != null) {
                        employeeDB.delete(employeeID);
                        System.out.println("The employee N°" + employeeID + " has been successfully deleted.");
                    } else {
                        System.out.println("The employee you are looking for does not exist.");
                    }
                    break;

                case "3": // Update Employee
                    System.out.print("Please enter the employee's ID : ");
                    employeeID = scan.nextInt();
                    if (employeeDB.read(employeeID) != null) {
                        Employee newEmployee = employeeDB.read(employeeID);
                        String choice;

                        System.out.println("You'll be updating employee N°" + employeeID);
                        scan.nextLine();

                        // Modify Name
                        do {
                            System.out.println("Do you want to modify the employee's firstname, middlename or lastname ?");
                            System.out.print("(1) Yes / (2) No : ");
                            choice = scan.nextLine();
                        } while(!(choice.equals("1") || choice.equals("2")));
                        Name newName;
                        if (choice.equals("1")) {
                            System.out.print("Firstname : ");
                            String newFirstName = scan.nextLine();
                            System.out.println("Does he have a middlename ?");
                            do {
                                System.out.print("(1) Yes / (2) No : ");
                                middleNameChoice = scan.nextLine();
                                if (!(middleNameChoice.equals("1")|| middleNameChoice.equals("2")))
                                    System.out.println("Please enter a value between 1 and 2.");
                            } while (!(middleNameChoice.equals("1")|| middleNameChoice.equals("2")));
                            String newMiddleName;
                            if (middleNameChoice.equals("1")) {
                                System.out.print("Middlename : ");
                                newMiddleName = scan.nextLine();
                            } else {
                                newMiddleName = "/";
                            }
                            System.out.print("Lastname : ");
                            String newLastName = scan.nextLine();
                            newName = NameFactory.createName(newFirstName, newMiddleName, newLastName);
                        } else {
                            newName = newEmployee.getName();
                        }


                        //Modify gender
                        do {
                            System.out.println("Do you want to modify the employee's gender ?");
                            System.out.print("(1) Yes / (2) No : ");
                            choice = scan.nextLine();
                        } while(!(choice.equals("1") || choice.equals("2")));
                        Gender newGender;
                        if (choice.equals("1")) {
                            System.out.println("Select a gender : ");
                            do {
                                System.out.print("(1) Male / (2) Female / (3) Other : ");
                                genderChoice = scan.nextLine();
                                if (!(genderChoice.equals("1") || genderChoice.equals("2") || genderChoice.equals("3")))
                                    System.out.println("Please enter a value between 1 and 3.");
                            } while (!(genderChoice.equals("1") || genderChoice.equals("2") || genderChoice.equals("3")));
                            if (genderChoice.equals("1")) {
                                newGender = genderDB.read(gender1.getId());
                            } else if (genderChoice.equals("2")) {
                                newGender = genderDB.read(gender2.getId());
                            } else {
                                newGender = genderDB.read(gender3.getId());
                            }
                        }else {
                            newGender = newEmployee.getGender();
                        }


                        //Modify race
                        do {
                            System.out.println("Do you want to modify the employee's race ?");
                            System.out.print("(1) Yes / (2) No : ");
                            choice = scan.nextLine();
                        } while(!(choice.equals("1") || choice.equals("2")));
                        Race newRace;
                        if (choice.equals("1")){
                            System.out.println("Select a race : ");
                            do {
                                System.out.print("(1) White / (2) Black / (3) Coloured / (4) Indian / (5) Other : ");
                                raceChoice = scan.nextLine();
                                if (!(raceChoice.equals("1") || raceChoice.equals("2") || raceChoice.equals("3") || raceChoice.equals("4") || raceChoice.equals("5")))
                                    System.out.println("Please enter a value between 1 and 5.");
                            } while (!(raceChoice.equals("1") || raceChoice.equals("2") || raceChoice.equals("3") || raceChoice.equals("4") || raceChoice.equals("5")));
                            if (raceChoice.equals("1")) {
                                newRace = raceDB.read(race1.getId());
                            } else if (raceChoice.equals("2")) {
                                newRace = raceDB.read(race2.getId());
                            } else if (raceChoice.equals("3")) {
                                newRace = raceDB.read(race3.getId());
                            } else if (raceChoice.equals("4")) {
                                newRace = raceDB.read(race4.getId());
                            } else {
                                newRace = raceDB.read(race5.getId());
                            }
                        } else {
                            newRace = newEmployee.getRace();
                        }


                        //Modify contact details
                        do {
                            System.out.println("Do you want to modify the employee's contact details ?");
                            System.out.print("(1) Yes / (2) No : ");
                            choice = scan.nextLine();
                        } while(!(choice.equals("1") || choice.equals("2")));
                        ContactDetails newContacts;
                        if (choice.equals("1")) {
                            System.out.println("-----Contact details-----");
                            System.out.print("Phone number : ");
                            String newPhoneNumber = scan.nextLine();
                            System.out.println("Does he have a home phone number ? ");
                            do {
                                System.out.print("(1) Yes / (2) No : ");
                                homeNumberChoice = scan.nextLine();
                                if (!(homeNumberChoice.equals("1")|| homeNumberChoice.equals("2")))
                                    System.out.println("Please enter a value between 1 and 2.");
                            } while (!(homeNumberChoice.equals("1")|| homeNumberChoice.equals("2")));
                            String newHomePhoneNumber = "";
                            if (homeNumberChoice.equals("1")) {
                                System.out.print("Home phone number : ");
                                newHomePhoneNumber = scan.nextLine();
                            } else {
                                newHomePhoneNumber = "/";
                            }
                            System.out.print("Email : ");
                            String newEmail = scan.nextLine();
                            newContacts = ContactDetailsFactory.createContactDetails(newPhoneNumber, newHomePhoneNumber, newEmail);
                        } else {
                            newContacts = newEmployee.getContactDetails();
                        }


                        //Modify address details
                        do {
                            System.out.println("Do you want to modify the employee's address details ?");
                            System.out.print("(1) Yes / (2) No : ");
                            choice = scan.nextLine();
                        } while(!(choice.equals("1") || choice.equals("2")));
                        AddressDetails newAddress;
                        if (choice.equals("1")) {
                            System.out.println("-----Address details-----");
                            System.out.print("Street address : ");
                            String newStreetAddress = scan.nextLine();
                            System.out.print("Postal address : ");
                            String newPostalAddress = scan.nextLine();
                            newAddress = AddressDetailsFactory.createAddressDetails(newStreetAddress, newPostalAddress);
                        } else {
                            newAddress = newEmployee.getAddressDetails();
                        }


                        //Modify Identity
                        do {
                            System.out.println("Do you want to modify the employee's contact details ?");
                            System.out.print("(1) Yes / (2) No : ");
                            choice = scan.nextLine();
                        } while(!(choice.equals("1") || choice.equals("2")));
                        Identity newIdentity;
                        if (choice.equals("1")) {
                            System.out.println("-----Official ID-----");
                            System.out.println("Select an official document : ");
                            do {
                                System.out.print("(1) ID card / (2) Passport / (3) Driving licence : ");
                                idChoice = scan.nextLine();
                                if (!(idChoice.equals("1") || idChoice.equals("2") || idChoice.equals("3")))
                                    System.out.println("Please enter a value between 1 and 3.");
                            } while (!(idChoice.equals("1") || idChoice.equals("2") || idChoice.equals("3")));
                            System.out.print("ID Number : ");
                            String newIdNumber = scan.nextLine();
                            if (idChoice.equals("1")) {
                                newIdentity = IdentityFactory.createIdentity("ID Card", newIdNumber);
                            } else if (idChoice.equals("2")) {
                                newIdentity = IdentityFactory.createIdentity("Passport", newIdNumber);
                            } else {
                                newIdentity = IdentityFactory.createIdentity("Driving Licence", newIdNumber);
                            }
                        } else {
                            newIdentity = newEmployee.getIdentity();
                        }

                        // Update old employee
                        employeeDB.update(EmployeeFactory.createEmployee(employeeID, newName, newGender, newRace, newContacts, newAddress, newIdentity));

                        System.out.println("The employee N°" + employeeID + " has been successfully modified.");
                    } else {
                        System.out.println("The employee you are looking for does not exist.");
                    }
                    System.out.println("Press enter to continue...");
                    break;

                case "4": // Search Employee by ID
                    System.out.print("Please enter the employee's ID : ");
                    employeeID = scan.nextInt();
                    if (employeeDB.read(employeeID) != null) {
                        System.out.println(employeeDB.read(employeeID));
                    } else {
                        System.out.println("The employee you are looking for does not exist.");
                    }
                    break;

                case "5": // Display all employee
                    System.out.println("List of all employees : ");
                    System.out.println(employeeDB.getAll().toString());
                    System.out.println("Press enter to continue...");
                    break;

                case "6": // Exit
                    System.out.println("Thank you for using our program.");
                    run = false;
                    System.out.println("Press enter to exit...");
                    break;

                default:
                    System.out.println("Please enter a number between 1 and 6.");
                    System.out.println("Press enter to continue...");
                    break;
            }
            scan.nextLine();
        }
    }
}