package starter.MembershiStepDef.GetAllMembershipSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import starter.Membership.GetAllMembership;

public class GetAllMembershipSteps {

    @Steps
    GetAllMembership getAllMembership;

    @Given("User mengatur endpoint yang valid untuk melihat seluruh data membership")
    public void apiEnd(){getAllMembership.ApiEndGetAllMembership();}

    @When("User mengirimkan request untuk meminta seluruh data membership")
    public void sendReqGetAllMember(){getAllMembership.requestGetAllMemberships();}

    @And("Seluruh data membership ditampilkan sebagai respon")
    public void responseAllMembership(){getAllMembership.getAllMemberships();}

    @Given("User mengatur endpoint yang salah untuk meminta seluruh data membership")
    public void apiInvalidEnd(){getAllMembership.getAllMembershipsInvalidEndpoint();}

    @And("Tidak ada data membership yang muncul")
    public void noDataMembership(){getAllMembership.noMembershipsData();}

}
