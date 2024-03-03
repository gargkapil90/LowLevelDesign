package ParKing.model;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    Token token;
    Date exitTime;
    Gate generatedAtGate;
    Operator generatedBy;
    List<Payment> payments;
    int amount;
    BillStatus billStatus;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Gate getGeneratedAtGate() {
        return generatedAtGate;
    }

    public void setGeneratedAtGate(Gate generatedAtGate) {
        this.generatedAtGate = generatedAtGate;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
