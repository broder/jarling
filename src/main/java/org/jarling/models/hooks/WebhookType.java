package org.jarling.models.hooks;

import lombok.Getter;

@Getter
public enum WebhookType {
    INTEREST_CHARGE("INTEREST_CHARGE"),
    SCHEDULED_PAYMENT_CANCELLED("SCHEDULED_PAYMENT_CANCELLED"),
    SCHEDULED_PAYMENT_INSUFFICIENT_FUNDS("SCHEDULED_PAYMENT_INSUFFICIENT_FUNDS"),
    TRANSACTION_CARD("TRANSACTION_CARD"),
    TRANSACTION_CASH_WITHDRAWAL("TRANSACTION_CASH_WITHDRAWAL"),
    TRANSACTION_MOBILE_WALLET("TRANSACTION_MOBILE_WALLET"),
    TRANSACTION_DIRECT_CREDIT("TRANSACTION_DIRECT_CREDIT"),
    TRANSACTION_DIRECT_DEBIT("TRANSACTION_DIRECT_DEBIT"),
    TRANSACTION_DIRECT_DEBIT_INSUFFICIENT_FUNDS("TRANSACTION_DIRECT_DEBIT_INSUFFICIENT_FUNDS"),
    TRANSACTION_DIRECT_DEBIT_DISPUTE("TRANSACTION_DIRECT_DEBIT_DISPUTE"),
    TRANSACTION_FASTER_PAYMENT_IN("TRANSACTION_FASTER_PAYMENT_IN"),
    TRANSACTION_FASTER_PAYMENT_OUT("TRANSACTION_FASTER_PAYMENT_OUT"),
    TRANSACTION_FASTER_PAYMENT_REVERSAL("TRANSACTION_FASTER_PAYMENT_REVERSAL"),
    TRANSACTION_INTEREST_PAYMENT("TRANSACTION_INTEREST_PAYMENT"),
    TRANSACTION_INTERNAL_TRANSFER("TRANSACTION_INTERNAL_TRANSFER"),
    TRANSACTION_NOSTRO_DEPOSIT("TRANSACTION_NOSTRO_DEPOSIT"),
    TRANSACTION_INTEREST_WAIVED_DEPOSIT("TRANSACTION_INTEREST_WAIVED_DEPOSIT"),
    TRANSACTION_STRIPE_FUNDING("TRANSACTION_STRIPE_FUNDING"),
    TRANSACTION_DECLINED_INSUFFICIENT_FUNDS("TRANSACTION_DECLINED_INSUFFICIENT_FUNDS"),
    TRANSACTION_AUTH_DECLINED("TRANSACTION_AUTH_DECLINED"),
    TRANSACTION_AUTH_PARTIAL_REVERSAL("TRANSACTION_AUTH_PARTIAL_REVERSAL"),
    TRANSACTION_AUTH_FULL_REVERSAL("TRANSACTION_AUTH_FULL_REVERSAL");

    private final String value;

    WebhookType(String value) {
        this.value = value;
    }
}
