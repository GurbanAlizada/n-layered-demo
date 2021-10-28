package Demo.Adapters;

import Demo.core.LoggerService;
import Demo.jLogger.LoggerManager;

public class LoggerManagerAdapter implements LoggerService {

    @Override
    public void logToSystem(String message) {
        LoggerManager loggerManager = new LoggerManager();
        loggerManager.log(message);
    }

}
