package helper;

// set default value
public class BlocConfig {
    // use high mode
    // 0:default  1:high
    public static int defaultMode = 0;

    //default true
    public static boolean useFolder = true;

    //default false
    public static boolean usePrefix = false;

    //default false
    public static boolean bloc8 = false;

    //default false
    public static boolean nullSafety = false;


    //Logical layer name
    public static String blocName = "Bloc";
    public static String cubitName = "Cubit";

    //view layer name
    public static String viewName = "Page";
    public static String viewFileName = "View";

    //event layer name
    public static String eventName = "Event";

    //mode name
    public static final String modeDefault = "Cubit";
    public static final String modeHigh = "Bloc";
}
