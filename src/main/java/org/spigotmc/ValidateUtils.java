package org.spigotmc;

public class ValidateUtils {

    public static String limit(String string, int limit) {
        if ( string.length() > limit )
            return string.substring( 0, limit );
        return string;
    }

}