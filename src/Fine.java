
public class Fine {

	  // Fine class holds information about date book borrowed, due date, date of return, fine amount and status
    private double amount;
    private boolean status;   // set true when book is returned

    public Fine(double amount, boolean status) {
        this.amount =  amount;
        this.status = status;
    }
    /**
     * @param borrowerId
     * @return double
     * The method returns the fine amount against a borrower
     */
    public double getFineAmount(String borrowerId) {
        double fineAmount = 0.0;
        //TODO
        return fineAmount;
    }
}
