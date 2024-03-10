package com.assesment.reportgenerator.entities;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Chargeback {
    @Id
    private String bankCode;
    private String ClientName;
    private String productType;
    private String monthYear;
    private int noOfChargeBack;


    public Chargeback() {
    }

    public Chargeback(String bankCode, String ClientName, String productType, String monthYear, int noOfChargeBack) {
        this.bankCode = bankCode;
        this.ClientName = ClientName;
        this.productType = productType;
        this.monthYear = monthYear;
        this.noOfChargeBack = noOfChargeBack;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getClientName() {
        return this.ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getMonthYear() {
        return this.monthYear;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

    public int getNoOfChargeBack() {
        return this.noOfChargeBack;
    }

    public void setNoOfChargeBack(int noOfChargeBack) {
        this.noOfChargeBack = noOfChargeBack;
    }

    public Chargeback bankCode(String bankCode) {
        setBankCode(bankCode);
        return this;
    }

    public Chargeback ClientName(String ClientName) {
        setClientName(ClientName);
        return this;
    }

    public Chargeback productType(String productType) {
        setProductType(productType);
        return this;
    }

    public Chargeback monthYear(String monthYear) {
        setMonthYear(monthYear);
        return this;
    }

    public Chargeback noOfChargeBack(int noOfChargeBack) {
        setNoOfChargeBack(noOfChargeBack);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Chargeback)) {
            return false;
        }
        Chargeback chargeback = (Chargeback) o;
        return Objects.equals(bankCode, chargeback.bankCode) && Objects.equals(ClientName, chargeback.ClientName) && Objects.equals(productType, chargeback.productType) && Objects.equals(monthYear, chargeback.monthYear) && noOfChargeBack == chargeback.noOfChargeBack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankCode, ClientName, productType, monthYear, noOfChargeBack);
    }

    @Override
    public String toString() {
        return "{" +
            " bankCode='" + getBankCode() + "'" +
            ", ClientName='" + getClientName() + "'" +
            ", productType='" + getProductType() + "'" +
            ", monthYear='" + getMonthYear() + "'" +
            ", noOfChargeBack='" + getNoOfChargeBack() + "'" +
            "}";
    }
    
}
