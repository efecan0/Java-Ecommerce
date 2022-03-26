
package ecommerce;

import java.time.LocalDate;

public class CreditCard {
    private long number;
    private User user;
    private int securityCode;
    private LocalDate expireDate;

    public CreditCard(long number, User user, int securityCode, LocalDate expireDate) {
        this.number = number;
        this.user = user;
        this.securityCode = securityCode;
        this.expireDate = expireDate;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return  "number=" + number +
                ", user='" + user.getName()+" "+user.getSurname() + '\'' +
                ", securityCode=" + securityCode +
                ", expireDate=" + expireDate.getYear()+"/"+
                expireDate.getMonth().getValue();
    }

}
