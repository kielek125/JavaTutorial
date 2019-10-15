package Rozwiązania.Logger;

import Rozwiązania.Logger.IMessageLogger;

public class LoggerOCP {
    private IMessageLogger messageLogger;

    public LoggerOCP(IMessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    public void log(String message) throws Exception {
        messageLogger.log(message);
    }
}