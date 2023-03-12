package com.example.hotelmanagementsystem.Model;

public class ModelBillGenerate {

    String OrderId , UserId , TotalAmount , Date;

    public ModelBillGenerate() {
    }

    public ModelBillGenerate(String orderId, String userId, String totalAmount, String date) {
        OrderId = orderId;
        UserId = userId;
        TotalAmount = totalAmount;
        Date = date;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        TotalAmount = totalAmount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
