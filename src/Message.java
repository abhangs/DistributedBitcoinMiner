
// Message represents a message used by the LSP protocol.
public class Message {

    MessageTypes messageType;
    int connectionID;
    int sequenceNumber;
    byte[] payLoad;

    // returns a new connect message.
    public static Message newConnection()
    {
        Message message = new Message();
        message.messageType = MessageTypes.Connect;
        return message;
    }

    //returns a new data message with the specified connection ID,
    // sequence number, and payload.
    public static Message newDataMessage(int connectionID, int sequenceNumber,byte[] payLoad)
    {
        Message message = new Message();
        message.messageType = MessageTypes.Data;
        message.connectionID = connectionID;
        message.sequenceNumber = sequenceNumber;
        message.payLoad = payLoad;
        return message;
    }

    //returns a new acknowledgement message with the specified
    // connection ID and sequence number.
    public static Message newAcknowledge(int connectionID, int sequenceNumber)
    {
        Message message = new Message();
        message.messageType = MessageTypes.Acknowledge;
        message.connectionID = connectionID;
        message.sequenceNumber = sequenceNumber;
        return message;
    }
}
