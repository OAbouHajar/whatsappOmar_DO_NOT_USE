package X;

import com.mod.bomfab.R$styleable;

/* renamed from: X.45O  reason: invalid class name */
public final class AnonymousClass45O {
    public static String A00(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return "RECONNECTION_TIMED_OUT";
            default:
                return C13680ns.A0i("unknown status code: ", C13690nt.A0g(32), i2);
        }
    }
}
