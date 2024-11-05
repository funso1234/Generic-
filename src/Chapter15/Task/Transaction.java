package Chapter15.Task;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private int id;
    private BigDecimal amount;
    private String reference;
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;

    public Transaction() {}

    public Transaction(int id, BigDecimal amount, String reference, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.reference = reference;
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
