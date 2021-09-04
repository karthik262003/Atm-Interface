package ATM;

import java.util.Scanner;

interface withdrawalinterface {
    void withdrawal();
}

interface depositinterface {
    void deposits();
}

interface checkbalanceinterface {
    void checkbalance();
}

interface implementation extends withdrawalinterface, depositinterface, checkbalanceinterface {
}

class methodoverriding {
    void withdrawal() {
        System.out.println("withdrawal gets overriden");
    }

    void checkbalance() {
        System.out.println("checkbalance method gets overriden");
    }

    void deposits() {
        System.out.println("deposits gets overriden");
    }
}

class Account extends methodoverriding {
    protected int Accountnumber;
    protected int Accountbalance;
}

class Card extends Account {
    protected int pin;
    protected int card_number;
    final static String Bank = "SBI";
}

class Atminterface extends Card implements implementation {
    private static int balance, withdraw, deposit;

    public void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money to be withdrawn:");
        withdraw = sc.nextInt();
        try {
            if (withdraw > Accountbalance)
                throw new insufficientbalance("insuffcient balance");
        } catch (insufficientbalance j) {
            System.out.println(j);
        }
        if (Accountbalance >= withdraw) {
            Accountbalance = Accountbalance - withdraw;
            System.out.println("Please collect your money");
        } else {
            System.out.println("Insufficient Balance");
        }
        System.out.println("");
    }

    public void deposits() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter money to be deposited:");
        deposit = s.nextInt();
        Accountbalance = Accountbalance + deposit;
        System.out.println("Your Money has been successfully deposited");
        System.out.println("");
    }

    public void checkbalance() {
        System.out.println("Balance : " + Accountbalance);
        System.out.println("");
    }
}
public class ATM extends Atminterface {
    public static void main(String args[]) {
        int pincheck;
        int card_no;
        int account_no;
        ATM c1 = new ATM();
        ATM c2 = new ATM();
        ATM c3 = new ATM();
        ATM c4 = new ATM();
        ATM c5 = new ATM();
        c1.Accountnumber = 12345;
        c1.Accountbalance = 60000;
        c1.pin = 6578;
        c1.card_number = 1;
        c2.Accountnumber = 45678;
        c2.Accountbalance = 70000;
        c2.pin = 2354;
        c2.card_number = 2;
        c3.Accountnumber = 56789;
        c3.Accountbalance = 80000;
        c3.pin = 3489;
        c3.card_number = 3;
        c4.Accountnumber = 12098;
        c4.Accountbalance = 90000;
        c4.pin = 3541;
        c4.card_number = 4;
        c5.Accountnumber = 79086;
        c5.Accountbalance = 100000;
        c5.pin = 5717;
        c5.card_number = 5;
        while (true) {
            Scanner card = new Scanner(System.in);
            System.out.println("swipe your card");
            card_no = card.nextInt();
            if (card_no == 0) {
                System.exit(0);
            }
            try {
                if (card_no > 5)
                    throw new invalidcard("invalidcard");
            } catch (invalidcard k) {
                System.out.println(k);
            }
            if (card_no == 1) {
                account_no = c1.Accountnumber;
                System.out.println("enterpin");
                pincheck = card.nextInt();
                if (pincheck == c1.pin) {
                    Scanner sol = new Scanner(System.in);
                    menu1:
                    while (true) {
                        System.out.println("Automated Teller Machine");
                        System.out.println("Bank is " + Bank);
                        System.out.println("Account no " + account_no);
                        System.out.println("Choose 1 for Withdraw");
                        System.out.println("Choose 2 for Deposit");
                        System.out.println("Choose 3 for Check Balance");
                        System.out.println("Choose 4 for EXIT ");
                        System.out.print("Choose the operation you want to perform:");
                        int n = sol.nextInt();
                        try {
                            if (n > 4)
                                throw new invalidinput("invalid input");
                        } catch (invalidinput i) {
                            System.out.println(i);
                        }
                        switch (n) {
                            case 1:
                                c1.withdrawal();
                                break;
                            case 2:
                                c1.deposits();
                                break;
                            case 3:
                                c1.checkbalance();
                                break;
                            case 4:
                                System.out.println("Thank you  for visiting");
                                break menu1;
                        }
                    }
                }
            }
            if (card_no == 2) {
                account_no = c2.Accountnumber;
                System.out.println("enterpin");
                pincheck = card.nextInt();
                if (pincheck == c2.pin) {
                    Scanner sol = new Scanner(System.in);
                    menu2:
                    while (true) {
                        System.out.println("Automated Teller Machine");
                        System.out.println("Bank is " + Bank);
                        System.out.println("Account no " + account_no);
                        System.out.println("Choose 1 for Withdraw");
                        System.out.println("Choose 2 for Deposit");
                        System.out.println("Choose 3 for Check Balance");
                        System.out.println("Choose 4 for EXIT ");
                        System.out.print("Choose the operation you want to perform:");
                        int n = sol.nextInt();
                        try {
                            if (n > 4)
                                throw new invalidinput("invalid input");
                        } catch (invalidinput i) {
                            System.out.println(i);
                        }
                        switch (n) {
                            case 1:
                                c2.withdrawal();
                                break;
                            case 2:
                                c2.deposits();
                                break;
                            case 3:
                                c2.checkbalance();
                                break;
                            case 4:
                                System.out.println("Thank you  for visiting");
                                break menu2;
                        }
                    }
                }
            }
            if (card_no == 3) {
                account_no = c3.Accountnumber;
                System.out.println("enterpin");
                pincheck = card.nextInt();
                if (pincheck == c3.pin) {
                    Scanner sol = new Scanner(System.in);
                    menu3:
                    while (true) {
                        System.out.println("Automated Teller Machine");
                        System.out.println("Bank is " + Bank);
                        System.out.println("Account no " + account_no);
                        System.out.println("Choose 1 for Withdraw");
                        System.out.println("Choose 2 for Deposit");
                        System.out.println("Choose 3 for Check Balance");
                        System.out.println("Choose 4 for EXIT ");
                        System.out.print("Choose the operation you want to perform:");
                        int n = sol.nextInt();
                        try {
                            if (n > 4)
                                throw new invalidinput("invalid input");
                        } catch (invalidinput i) {
                            System.out.println(i);
                        }
                        switch (n) {
                            case 1:
                                c3.withdrawal();
                                break;
                            case 2:
                                c3.deposits();
                                break;
                            case 3:
                                c3.checkbalance();
                                break;
                            case 4:
                                System.out.println("Thank you  for visiting");
                                break menu3;
                        }
                    }
                }
            }
            if (card_no == 4) {
                account_no = c4.Accountnumber;
                System.out.println("enterpin");
                pincheck = card.nextInt();
                if (pincheck == c4.pin) {
                    Scanner sol = new Scanner(System.in);
                    menu4:
                    while (true) {
                        System.out.println("Automated Teller Machine");
                        System.out.println("Bank is " + Bank);
                        System.out.println("Account no " + account_no);
                        System.out.println("Choose 1 for Withdraw");
                        System.out.println("Choose 2 for Deposit");
                        System.out.println("Choose 3 for Check Balance");
                        System.out.println("Choose 4 for EXIT ");
                        System.out.print("Choose the operation you want to perform:");
                        int n = sol.nextInt();
                        try {
                            if (n > 4)
                                throw new invalidinput("invalid input");
                        } catch (invalidinput i) {
                            System.out.println(i);
                        }
                        switch (n) {
                            case 1:
                                c4.withdrawal();
                                break;
                            case 2:
                                c4.deposits();
                                break;
                            case 3:
                                c4.checkbalance();
                                break;
                            case 4:
                                System.out.println("Thank you  for visiting");
                                break menu4;
                        }
                    }
                }
            }
            if (card_no == 5) {
                account_no = c5.Accountnumber;
                System.out.println("enterpin");
                pincheck = card.nextInt();
                if (pincheck == c5.pin) {
                    Scanner sol = new Scanner(System.in);
                    menu5:
                    while (true) {
                        System.out.println("Automated Teller Machine");
                        System.out.println("Bank is " + Bank);
                        System.out.println("Account no " + account_no);
                        System.out.println("Choose 1 for Withdraw");
                        System.out.println("Choose 2 for Deposit");
                        System.out.println("Choose 3 for Check Balance");
                        System.out.println("Choose 4 for EXIT ");
                        System.out.print("Choose the operation you want to perform:");
                        int n = sol.nextInt();
                        try {
                            if (n > 4)
                                throw new invalidinput("invalid input");
                        } catch (invalidinput i) {
                            System.out.println(i);
                        }
                        switch (n) {
                            case 1:
                                c5.withdrawal();
                                break;
                            case 2:
                                c5.deposits();
                                break;
                            case 3:
                                c5.checkbalance();
                                break;
                            case 4:
                                System.out.println("Thank you  for visiting");
                                break menu5;
                        }
                    }
                }
            }
        }
    }
}

class invalidinput extends Exception {
    public invalidinput(String s) {
        super(s);
    }
}

class insufficientbalance extends Exception {
    public insufficientbalance(String p) {
        super(p);
    }
}

class invalidcard extends Exception {
    public invalidcard(String x) {
        super(x);
    }
}