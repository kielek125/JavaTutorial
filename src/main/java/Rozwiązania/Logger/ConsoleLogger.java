package Rozwiązania.Logger;

import Rozwiązania.Logger.IMessageLogger;

public class ConsoleLogger implements IMessageLogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
