package com.Java.S1_Introduction;

import java.util.*;
import java.security.*;

// Link:https://www.hackerrank.com/challenges/java-int-to-string?isFullScreen=true
public class Java_Int2String {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            // String s=???; Complete this line below
            String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}


// The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
