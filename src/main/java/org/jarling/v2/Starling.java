package org.jarling.v2;

import org.jarling.StarlingBankApiVersion;
import org.jarling.StarlingBankEnvironment;
import org.jarling.StarlingBase;
import org.jarling.exceptions.StarlingBankRequestException;
import org.jarling.v2.api.*;
import org.jarling.v2.models.accountholder.AccountHolder;
import org.jarling.v2.models.accountholder.AccountHolderName;
import org.jarling.v2.models.addresses.Address;
import org.jarling.v2.models.addresses.AddressUpdateRequest;
import org.jarling.v2.models.addresses.Addresses;
import org.jarling.v2.models.apiuseridentity.Identity;
import org.jarling.v2.models.individuals.EmailUpdateRequest;
import org.jarling.v2.models.individuals.Individual;
import org.jarling.v2.models.businesses.Business;
import org.jarling.v2.models.jointaccounts.JointAccount;

/**
 * API class responsible for creating services to access Starling Bank resources
 */
public final class Starling extends StarlingBase implements StarlingBank {

    public Starling(StarlingBankEnvironment environment, String accessToken) {
        super(StarlingBankApiVersion.V2, environment, accessToken);
    }

    @Override
    public AccountHolderResource accountHolder() {
        return this;
    }

    @Override
    public AccountHolder getAccountHolder() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/account-holder").asString(), AccountHolder.class);
    }

    @Override
    public AccountHolderName getAccountHolderName() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/account-holder/name").asString(), AccountHolderName.class);
    }

    @Override
    public AddressesResource addresses() {
        return this;
    }

    @Override
    public Addresses getAddresses() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/addresses").asString(), Addresses.class);
    }

    @Override
    public void updateAddress(AddressUpdateRequest addressUpdateRequest) throws StarlingBankRequestException {
        apiService.post("/addresses", null, null, gson.toJson(addressUpdateRequest));
    }

    @Override
    public ApiUserIdentityResource identity() {
        return this;
    }

    @Override
    public Individual getAuthorisingIndividual() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/identity/individual").asString(), Individual.class);
    }

    @Override
    public Identity getTokenIdentity() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/identity/token").asString(), Identity.class);
    }

    @Override
    public BusinessesResource businesses() {
        return this;
    }

    @Override
    public Business getBusiness() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/account-holder/business").asString(), Business.class);
    }

    @Override
    public Address getRegisteredAddress() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/account-holder/business/registered-address").asString(), Address.class);
    }

    @Override
    public Address getCorrespondenceAddress() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/account-holder/business/correspondence-address").asString(), Address.class);
    }

    @Override
    public IndividualsResource individuals() {
        return this;
    }

    @Override
    public Individual getIndividual() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/account-holder/individual").asString(), Individual.class);
    }

    @Override
    public void updateEmail(EmailUpdateRequest emailUpdateRequest) throws StarlingBankRequestException {
        apiService.put("/account-holder/individual/email", null, null, gson.toJson(emailUpdateRequest));
    }

    @Override
    public JointAccountsResource jointAccounts() {
        return this;
    }

    @Override
    public JointAccount getJointAccount() throws StarlingBankRequestException {
        return gson.fromJson(apiService.get("/account-holder/joint").asString(), JointAccount.class);
    }
}
