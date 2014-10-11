
//Parameter defines configuration parametes for an LSP client or server

public class Parameters {

    //Default values for LSP parameters
    private static int DefaultEpochLimit = 5;
    private static int DefaultEpochMillis = 2000;
    private static int DefaultWindowSize = 1;

    // EpochLimit is the number of epochs that can transpire before declaring a
    // connection to be lost.
    private int _epochLimit;

    // EpochMillis is the number of milliseconds between epochs.
    private int _epochMillis;

    // WindowSize is the size of the sliding window (i.e. the max number of
    // non-acknowledged messages that can be sent at a given time).
    private int _windowSize;

    public Parameters(int epochLimit,int epochMillis, int windowSize)
    {
        _epochLimit = epochLimit;
        _epochMillis = epochMillis;
        _windowSize = windowSize;

    }

    //Returns a Parameters object with default values
    public static Parameters GetParameters()
    {
       return new Parameters(DefaultEpochLimit,DefaultEpochMillis,DefaultWindowSize);
    }



}
