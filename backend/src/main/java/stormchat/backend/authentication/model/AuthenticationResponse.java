package stormchat.backend.authentication.model;

public class AuthenticationResponse {

    private String bearer;
    private String refresh;

    public AuthenticationResponse(String bearer, String refresh) {
        this.bearer = bearer;
        this.refresh = refresh;
    }

    public AuthenticationResponse() {
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }
}
