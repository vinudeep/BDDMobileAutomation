package helpers;

import java.io.IOException;

public class AppiumServerJava_cmdLine {
    public void startServer() {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
            Thread.sleep(10000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopServer() {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("taskkill /F /IM node.exe");
            runtime.exec("taskkill /F /IM cmd.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  /*  public static void main(String[] args) {
        AppiumServerJava_cmdLine appiumServer = new AppiumServerJava_cmdLine();
        appiumServer.startServer();

        appiumServer.stopServer();
    }*/
}
