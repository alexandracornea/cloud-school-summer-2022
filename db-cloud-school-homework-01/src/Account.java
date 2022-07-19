public class Account {
    private int accountNo;
    private int amount;
    private int nationalId;

    public Account() { }

    /**
     * adds money in the current account.
     *
     * @param amount the current amount of money
     */
    public void deposit(int amount) {
        this.amount += amount;
    }

    /**
     * removes funds from the current account.
     *
     * @param amount the current amount of money
     * @throws NotEnoughMoneyException thrown if insufficient funds
     */
    public void withdraw(int amount) throws NotEnoughMoneyException {
        if (amount > this.amount) {
            throw new NotEnoughMoneyException("not enough money");
        }
        this.amount -= amount;
    }

    /**
     * checks if the given national id is valid. National id format must be GYYMMDD,
     * where "G" stands for genre, "Y" for birth year, "M" for month and "D" for day.
     *
     * @param nationalId the national id to be checked
     * @return true if valid, false otherwise
     */
    public static boolean checkNationalId(int nationalId) {
        /* wrong length: */
        if (String.valueOf(nationalId).length() != 7) {
            return false;
        }
        int genre = nationalId / 1000000;

        /* not a valid first digit, representing the genre: */
        if (genre != 5 && genre != 6) {
            return false;
        }
        int day = nationalId % 100;
        nationalId /= 100;
        int month = nationalId % 100;
        nationalId /= 100;
        int year = nationalId % 100;

        /* the owner must be between 18 and 99 years old, born between 1923 and 2004: */
        if (year > 4 && year < 23) {
            return false;
        }
        if (month > 12) {
            return false;
        }
        return switch (month) {
            case 2 -> day <= 28;
            case 4, 6, 9, 11 -> day <= 30;
            default -> day <= 31;
        };
    }

    /**
     * sets the national id property if valid. "nationalId" property must be an
     * int as the method signature requires, therefore it cannot have 13 digits.
     * For the current task I decided to keep just the first 7 digits format.
     *
     * @param nationalId the national id to be checked and set
     * @throws InvalidNationalIdException exception thrown if national id not valid
     */
    public void linkToNationalId(int nationalId) throws InvalidNationalIdException {
        if (!checkNationalId(nationalId)) {
            throw new InvalidNationalIdException("invalid national id");
        }
        this.setNationalId(nationalId);
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    /**
     * inner class for custom exception, thrown due to insufficient funds.
     */
    public static class NotEnoughMoneyException extends Exception {
        public NotEnoughMoneyException(String message) {
            super(message);
        }
    }

    /**
     * inner class for custom exception, thrown due to invalid national id.
     */
    public static class InvalidNationalIdException extends Exception {
        public InvalidNationalIdException(String message) {
            super(message);
        }
    }
}
