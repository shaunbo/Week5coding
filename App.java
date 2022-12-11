public class App {
    public static void main(String[] args) {
        Logger myAsteriskLogger = new AsteriskLogger();
        myAsteriskLogger.log("Apple");
        myAsteriskLogger.error("Orange");

        Logger mySpacedLogger = new SpacedLogger();
        mySpacedLogger.log("Banana");
        mySpacedLogger.error("Kiwi");
    }
}
interface Logger {
    public void log(String message);
    public void error(String message);
    }

class AsteriskLogger implements Logger {
    public void log(String message) {    
        System.out.println("***" + message + "***");
    }    
    public void error(String message) {       
        System.out.println("********************");
        System.out.println("***Error: " + message + "***");
        System.out.println("********************");
    }
}
class SpacedLogger implements Logger {
    public void log(String message) {    
        for (int i = 0; i < message.length(); i ++) {
            System.out.print(message.charAt(i) + " ");
        }
        System.out.println();
    }    
    public void error(String message) {       
        System.out.print("ERROR: ");
        for (int i = 0; i < message.length(); i ++) {
            System.out.print(message.charAt(i) + " ");
    }
}

}

    

