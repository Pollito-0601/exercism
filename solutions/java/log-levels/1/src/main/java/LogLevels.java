public class LogLevels {
    
    public static String message(String logLine) {
        String[] logMessage = logLine.split(":");
        String message = logMessage[1].trim();
        return message;
    }

    public static String logLevel(String logLine) {
        String level;
        
        if (logLine.contains("INFO")){
            level = "info";
        } else if (logLine.contains("WARNING")){
            level = "warning";
        } else if (logLine.contains("ERROR")){
            level = "error";
        } else {
            return null;
        }

        return level;
    }

    public static String reformat(String logLine) {
        String reLogLine = message(logLine) + " (" + logLevel(logLine) + ")";
        return reLogLine;
    }
}
