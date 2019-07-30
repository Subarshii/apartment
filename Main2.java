package apertment;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Renter[] apartment = new Renter[50];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < apartment.length; i++) {
            newRenter(apartment, i);
            printRenter(apartment[i]);
        }

        System.out.println("check name = 0 ");
        System.out.println("delete name = -1");

        String choose = scanner.nextLine();


        for (int i = 0; i < apartment.length; i++) {

            switch (choose) {

                case "0": {
                    System.out.println("Enter find name");

                    String findname = scanner.nextLine();

                    for (int j = 0; j < apartment.length; j++) {
                        if (apartment[j].getName().equals(findname)) {
                            printRenter(apartment[j]);

                        }
                    }
                    break;
                }
                case "-1": {
                    System.out.println("Delete name name");

                    String name = scanner.nextLine();

                    for (int s = 0; s < apartment.length; s++) {
                        if (apartment[s].getName().equals(name)) {
                            for (int j = s; j < apartment.length - 1; j++) {
                                apartment[i] = apartment[i + 1];
                                System.out.println(apartment[j].getName());
                            }
                        }

                    }
                    break;
                }

                default: {
                    System.out.println("input condition");
                }

            }

            choose = scanner.nextLine();

        }


    }

    private static void printRenter(Renter renter) {
        System.out.println(" Name Is  " + renter.getName() + " Id Card " + renter.getIdCard()
                + " Address Home " + renter.getAddressHome() + " Address Work " + renter.getAddressWork()
                + " People Amount In Room " + renter.getAmountInRoom());
    }

    private static void newRenter(Renter[] apartment, int i) {
        apartment[i] = new Renter("k" + i, "123456789011" + i
                , "addressHome" + i, "addressWork" + i, 2 + i);
    }
}
