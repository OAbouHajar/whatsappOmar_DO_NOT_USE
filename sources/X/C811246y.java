package X;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* renamed from: X.46y  reason: invalid class name and case insensitive filesystem */
public class C811246y {
    public static int A00(Exception exc) {
        if (exc instanceof UnknownHostException) {
            return 2;
        }
        if (exc instanceof SocketTimeoutException) {
            return 3;
        }
        return exc instanceof ConnectException ? 19 : 18;
    }
}
