package com.seleniumtraining.ex_07_PayloadManagement.POJO.ManualWay.Request;

public class BookingDates {
    private String checkin;
    private String checkout;

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }
}
