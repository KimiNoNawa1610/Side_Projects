public class Logger {

    private static Logger LogInstance;

    private static GameRule rule;

    public Logger(GameRule run){

        rule=run;

    }

    public void logMove(String symbol, String message){

        System.out.println(symbol+" "+message);

    }

    public void logString(String Message){

        System.out.println(Message);

    }

    public static void setInstance(Logger instance){

        LogInstance=instance;

    }
}
