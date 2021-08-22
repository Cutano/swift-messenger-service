package team.cutano.swiftmessengerservice.json.ws;

import com.fasterxml.jackson.annotation.*;

public class Data {
    private Long userID;
    private Long timeStamp;
    private Long msgID;
    private Long receiverID;
    private Long senderID;
    private String text;
    private Boolean hasRead;

    @JsonProperty("userID")
    public Long getUserID() { return userID; }
    @JsonProperty("userID")
    public void setUserID(Long value) { this.userID = value; }

    @JsonProperty("timeStamp")
    public Long getTimeStamp() { return timeStamp; }
    @JsonProperty("timeStamp")
    public void setTimeStamp(Long value) { this.timeStamp = value; }

    @JsonProperty("msgID")
    public Long getMsgID() { return msgID; }
    @JsonProperty("msgID")
    public void setMsgID(Long value) { this.msgID = value; }

    @JsonProperty("receiverID")
    public Long getReceiverID() { return receiverID; }
    @JsonProperty("receiverID")
    public void setReceiverID(Long value) { this.receiverID = value; }

    @JsonProperty("senderID")
    public Long getSenderID() { return senderID; }
    @JsonProperty("senderID")
    public void setSenderID(Long value) { this.senderID = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("hasRead")
    public Boolean getHasRead() { return hasRead; }
    @JsonProperty("hasRead")
    public void setHasRead(Boolean value) { this.hasRead = value; }
}
