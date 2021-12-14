import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public
class Log {

        public Logger logger;
        public FileHandler loggerFileHandler;


    public
    Log(String fileName,String loggerName) throws SecurityException, IOException {

        File logFile= new File(fileName);
        if(!logFile.exists()){
            logFile.createNewFile();
        }

        loggerFileHandler=new FileHandler(fileName,true);
        logger= Logger.getLogger(loggerName);
        logger.addHandler(loggerFileHandler);
        logger.setUseParentHandlers(false);
        SimpleFormatter formatter = new SimpleFormatter();
        loggerFileHandler.setFormatter(formatter);
    }
}
