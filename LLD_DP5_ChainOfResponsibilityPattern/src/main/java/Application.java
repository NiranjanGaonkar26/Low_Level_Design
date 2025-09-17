import handler.DebugLogger;
import handler.ErrorLogger;
import handler.InfoLogger;
import handler.Logger;

public class Application {

    private static Logger getLogger(){

        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger infoLogger = new InfoLogger(Logger.INFO);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);                      //Here the chain set is InfoLogger -> DebugLogger -> ErrorLogger

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger logger = getLogger();        //Returns InfoLogger object

//        logger.logMessage(Logger.INFO, "This is an information");
//        logger.logMessage(Logger.DEBUG, "This is a debug level information");
        logger.logMessage(Logger.ERROR, "This is an error information");
    }
}
