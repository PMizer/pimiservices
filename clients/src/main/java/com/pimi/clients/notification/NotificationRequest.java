package com.pimi.clients.notification;


public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerEmail,
        String message
) {
}
