package team.cutano.swiftmessengerservice.pojo;

public class Session {
    private Long sessionID;
    private String recentMsg;
    private String recentMsgTimeStamp;

    public Session(Long sessionID, String recentMsg, String recentMsgTimeStamp) {
        this.sessionID = sessionID;
        this.recentMsg = recentMsg;
        this.recentMsgTimeStamp = recentMsgTimeStamp;
    }

    public Long getSessionID() {
        return sessionID;
    }

    public void setSessionID(Long sessionID) {
        this.sessionID = sessionID;
    }

    public String getRecentMsg() {
        return recentMsg;
    }

    public void setRecentMsg(String recentMsg) {
        this.recentMsg = recentMsg;
    }

    public String getRecentMsgTimeStamp() {
        return recentMsgTimeStamp;
    }

    public void setRecentMsgTimeStamp(String recentMsgTimeStamp) {
        this.recentMsgTimeStamp = recentMsgTimeStamp;
    }
}
