package com.carecloud.carepaylibray.models;

import java.util.ArrayList;

/**
 * Created by Jahirul Bhuiyan on 8/24/2016.
 */
public class WorkflowModel {
    private ScreenModel selectLanguageScreenModel;
    private ScreenModel loginScreenModel;
    private ScreenModel signupScreenModel;
    private ScreenModel responsabScreenModel;
    private ScreenModel demographicsAddressScreenModel;
    private ScreenModel demographicsDetailsScreenModel;
    private ScreenModel demographicsDetailsEthnicityScreenModel;
    private ScreenModel demographicsDocumentsScreenModel;
    private ScreenModel demographicsMoreDetailsScreenModel;
    private ScreenModel demographicsMoreDetailsUpdatesScreenModel;
    private ScreenModel insuranceInfoScreenModel;
    private ScreenModel newProfileScreenModel;


    public ScreenModel getSelectLanguageScreenModel() {
        selectLanguageScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<ScreenComponentModel>();
        componentModels.add(new ScreenComponentModel("", "imageView", true));
        componentModels.add(new ScreenComponentModel("", "choice", true));
        componentModels.add(new ScreenComponentModel("...", "button", false));
        componentModels.add(new ScreenComponentModel("Continue", "button", false));
        selectLanguageScreenModel.setComponentModels(componentModels);
        return selectLanguageScreenModel;
    }

    public void setSelectLanguageScreenModel(ScreenModel selectLanguageScreenModel) {
        this.selectLanguageScreenModel = selectLanguageScreenModel;
    }

    public ScreenModel getLoginScreenModel() {
        loginScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<ScreenComponentModel>();
        componentModels.add(new ScreenComponentModel("Email", "inputtext", true));
        componentModels.add(new ScreenComponentModel("Password", "password", true));
        componentModels.add(new ScreenComponentModel("SIGN IN", "button", false));
        componentModels.add(new ScreenComponentModel("CREATE NEW ACCOUNT", "button", false));
        componentModels.add(new ScreenComponentModel("Change Language", "text", false));
        componentModels.add(new ScreenComponentModel("Forgot Password", "text", false));
        loginScreenModel.setComponentModels(componentModels);
        return loginScreenModel;
    }

    public void setLoginScreenModel(ScreenModel loginScreenModel) {
        this.loginScreenModel = loginScreenModel;
    }

    public ScreenModel getSignupScreenModel() {
        signupScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<ScreenComponentModel>();
        componentModels.add(new ScreenComponentModel("Full Name", "inputtext", true));
        componentModels.add(new ScreenComponentModel("Email", "email", true));
        componentModels.add(new ScreenComponentModel("Create Password", "password", true));
        componentModels.add(new ScreenComponentModel("Repeat Password", "Password", true));
        componentModels.add(new ScreenComponentModel("SIGN UP", "button", false));
        componentModels.add(new ScreenComponentModel("Already Have an Account", "text", false));
        signupScreenModel.setComponentModels(componentModels);
        return signupScreenModel;
    }

    public void setSignupScreenModel(ScreenModel signupScreenModel) {
        this.signupScreenModel = signupScreenModel;
    }

    public ScreenModel getResponsabScreenModel() {
        responsabScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        componentModels.add(new ScreenComponentModel("doctor", "text", true));
        componentModels.add(new ScreenComponentModel("label_cost", "text", true));
        componentModels.add(new ScreenComponentModel("cost", "text", true));
        componentModels.add(new ScreenComponentModel("label_prev_balance", "text", true));
        componentModels.add(new ScreenComponentModel("prev_balance", "text", true));
        componentModels.add(new ScreenComponentModel("label_insurance_copay", "text", true));
        componentModels.add(new ScreenComponentModel("insurance_copay", "text", true));
        componentModels.add(new ScreenComponentModel("sign_and_pay", "buttom", true));
        responsabScreenModel.setComponentModels(componentModels);
        return responsabScreenModel;
    }

    public void setResponsabScreenModel(ScreenModel responsabScreenModel) {
        this.responsabScreenModel = responsabScreenModel;
    }

    public ScreenModel getDemographicsAddressScreenModel() {
        demographicsAddressScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        componentModels.add(new ScreenComponentModel("logo", "text", true));
        componentModels.add(new ScreenComponentModel("phone", "phonenumber", true));
        componentModels.add(new ScreenComponentModel("zip", "text", true));
        componentModels.add(new ScreenComponentModel("address1", "inputtext", true));
        componentModels.add(new ScreenComponentModel("address2", "inputtext", false));
        componentModels.add(new ScreenComponentModel("city", "inputtext", true));
        componentModels.add(new ScreenComponentModel("state", "inputtext", true));
        componentModels.add(new ScreenComponentModel("next", "button", true));
        demographicsAddressScreenModel.setComponentModels(componentModels);
        return demographicsAddressScreenModel;
    }

    public void setDemographicsAddressScreenModel(ScreenModel demographicsAddressScreenModel) {
        this.demographicsAddressScreenModel = demographicsAddressScreenModel;
    }


    public ScreenModel getDemographicsDetailsScreenModel() {
        demographicsAddressScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        componentModels.add(new ScreenComponentModel("logo", "text", true));
        componentModels.add(new ScreenComponentModel("picture", "imageview", true));
        componentModels.add(new ScreenComponentModel("label_race", "text", true));
        componentModels.add(new ScreenComponentModel("choose_race", "button", true));
        componentModels.add(new ScreenComponentModel("label_ethinicity", "text", true));
        componentModels.add(new ScreenComponentModel("choose_ethnicity", "button", true));
        componentModels.add(new ScreenComponentModel("label_pref_lang", "text", true));
        componentModels.add(new ScreenComponentModel("pref_lang", "text", true));
        return demographicsDetailsScreenModel;
    }

    public void setDemographicsDetailsScreenModel(ScreenModel demographicsDetailsScreenModel) {
        this.demographicsDetailsScreenModel = demographicsDetailsScreenModel;
    }


    public ScreenModel getDemographicsDetailsEthnicityScreenModel() {
        demographicsDetailsEthnicityScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        componentModels.add(new ScreenComponentModel("ethnicity", "listview", true));
        return demographicsDetailsEthnicityScreenModel;
    }

    public void setDemographicsDetailsEthnicityScreenModel(ScreenModel demographicsDetailsEthnicityScreenModel) {
        this.demographicsDetailsEthnicityScreenModel = demographicsDetailsEthnicityScreenModel;
    }

    public ScreenModel getDemographicsDocumentsScreenModel() {
        demographicsDocumentsScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        componentModels.add(new ScreenComponentModel("logo", "text", true));
        componentModels.add(new ScreenComponentModel("thumbnail_license", "imageview", true));
        componentModels.add(new ScreenComponentModel("scan_license", "button", true));
        componentModels.add(new ScreenComponentModel("license_number", "text", true));
        componentModels.add(new ScreenComponentModel("label_license_state", "text", true));
        componentModels.add(new ScreenComponentModel("select", "button", true));
        componentModels.add(new ScreenComponentModel("label_have_insurance", "text", true));
        componentModels.add(new ScreenComponentModel("have_insurance", "togglebutton", true));
        componentModels.add(new ScreenComponentModel("next", "button", true));
        componentModels.add(new ScreenComponentModel("thumbnail_insurance", "imageview", false));
        componentModels.add(new ScreenComponentModel("scan_insurance", "button", false));
        componentModels.add(new ScreenComponentModel("insurance_info_1", "text", false));
        componentModels.add(new ScreenComponentModel("insurance_info_2", "text", false));
        componentModels.add(new ScreenComponentModel("insurance_info_3", "text", false));
        componentModels.add(new ScreenComponentModel("check_insurance", "button", false));
        demographicsDocumentsScreenModel.setComponentModels(componentModels);
        return demographicsDocumentsScreenModel;
    }

    public void setDemographicsDocumentsScreenModel(ScreenModel demographicsDocumentsScreenModel) {
        this.demographicsDocumentsScreenModel = demographicsDocumentsScreenModel;
    }

    public ScreenModel getDemographicsMoreDetailsScreenModel() {
        demographicsMoreDetailsScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        componentModels.add(new ScreenComponentModel("logo", "text", true));
        componentModels.add(new ScreenComponentModel("sub-logo", "text", true));
        componentModels.add(new ScreenComponentModel("label_want_updates", "text", true));
        componentModels.add(new ScreenComponentModel("want_updates", "togglebutton", true));
        componentModels.add(new ScreenComponentModel("add", "button", true));
        componentModels.add(new ScreenComponentModel("do_later", "button", true));
        demographicsMoreDetailsScreenModel.setComponentModels(componentModels);
        return demographicsMoreDetailsScreenModel;
    }

    public void setDemographicsMoreDetailsScreenModel(ScreenModel demographicsMoreDetailsScreenModel) {
        this.demographicsMoreDetailsScreenModel = demographicsMoreDetailsScreenModel;
    }

    public ScreenModel getDemographicsMoreDetailsUpdatesScreenModel() {
        demographicsMoreDetailsUpdatesScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        componentModels.add(new ScreenComponentModel("updates", "listview", true));
        demographicsMoreDetailsUpdatesScreenModel.setComponentModels(componentModels);
        return demographicsMoreDetailsUpdatesScreenModel;
    }

    public void setDemographicsMoreDetailsUpdatesScreenModel(ScreenModel demographicsMoreDetailsUpdatesScreenModel) {
        this.demographicsMoreDetailsUpdatesScreenModel = demographicsMoreDetailsUpdatesScreenModel;
    }

    public ScreenModel getInsuranceInfoScreenModel() {
        insuranceInfoScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        // todo add components when mock-up available
        insuranceInfoScreenModel.setComponentModels(componentModels);
        return insuranceInfoScreenModel;
    }

    public void setInsuranceInfoScreenModel(ScreenModel insuranceInfoScreenModel) {
        this.insuranceInfoScreenModel = insuranceInfoScreenModel;
    }

    public ScreenModel getNewProfileScreenModel() {
        newProfileScreenModel = new ScreenModel();
        ArrayList<ScreenComponentModel> componentModels = new ArrayList<>();
        // todo add components when mock-up available
        newProfileScreenModel.setComponentModels(componentModels);
        return newProfileScreenModel;
    }

    public void setNewProfileScreenModel(ScreenModel newProfileScreenModel) {
        this.newProfileScreenModel = newProfileScreenModel;
    }
}
