package team.cutano.swiftmessengerservice.pojo;

public class Message {
    private Long msgID;
    private Long senderID;
    private Long receiverID;
    private String timeStamp;
    private Long sessionID;
    private Boolean hasRead;
    private String text;

    public Message(Long msgID, Long senderID, Long receiverID, String timeStamp, Long sessionID, Boolean hasRead, String text) {
        this.msgID = msgID;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.timeStamp = timeStamp;
        this.sessionID = sessionID;
        this.hasRead = hasRead;
        this.text = text;
    }

    public Long getMsgID() {
        return msgID;
    }

    public void setMsgID(Long msgID) {
        this.msgID = msgID;
    }

    public Long getSenderID() {
        return senderID;
    }

    public void setSenderID(Long senderID) {
        this.senderID = senderID;
    }

    public Long getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(Long receiverID) {
        this.receiverID = receiverID;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getSessionID() {
        return sessionID;
    }

    public void setSessionID(Long sessionID) {
        this.sessionID = sessionID;
    }

    public Boolean getHasRead() {
        return hasRead;
    }

    public void setHasRead(Boolean hasRead) {
        this.hasRead = hasRead;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
