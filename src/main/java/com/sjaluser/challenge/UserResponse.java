package com.sjaluser.challenge;

/**
 *  Class used to the return the user response in Json
 */
public class UserResponse {

    public UserResponse() {
        success= true;
        apiVersion= "1.3";
    }
    
    /**
     * Response is success, true -> yes. false-> no
     */
    private Boolean success;
    /**
     * Api version
     */
    private String apiVersion;
    
    /**
     * Ouput message
     */
    private String message;

    public Boolean getSuccess() {
        return success;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getApiVersion() {
        return apiVersion;
    }
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
