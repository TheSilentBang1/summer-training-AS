package summerTrainingAS.oops;

public class Bank {
    int balance;
    int accountNum;
    String location;

    void isEmpty() {
        if(balance == 0) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }

    void checkBalance() {
        System.out.println(balance);
    }
}
