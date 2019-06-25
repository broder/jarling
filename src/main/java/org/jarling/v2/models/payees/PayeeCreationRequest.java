package org.jarling.v2.models.payees;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.List;

@Data
public class PayeeCreationRequest {
    private @NonNull String payeeName;
    private String phoneNumber;
    private @NonNull PayeeType payeeType;
    private String firstName;
    private String middleName;
    private String lastName;
    private String businessName;
    private LocalDate dateOfBirth;
    private List<PayeeAccountCreationRequest> accounts;
}