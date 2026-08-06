public class LogLevels {
    
    public static String message(String logLine) {
        String[] logMessage = logLine.split(":", 2);
        String message = logMessage[1].trim();
        return message;
    }

    public static String logLevel(String logLine) {
        String level = logLine.substring((logLine.indexOf("[")+1), logLine.indexOf("]")).toLowerCase();
        return level;
    }

    public static String reformat(String logLine) {
        String reLogLine = message(logLine) + " (" + logLevel(logLine) + ")";
        return reLogLine;
    }
}
