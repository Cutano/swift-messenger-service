package team.cutano.swiftmessengerservice.pojo;

public class Link {
    private Long userID;
    private Long sessionID;

    public Link(Long userID, Long sessionID) {
        this.userID = userID;
        this.sessionID = sessionID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getSessionID() {
        return sessionID;
    }

    public void setSessionID(Long sessionID) {
        this.sessionID = sessionID;
    }
}
