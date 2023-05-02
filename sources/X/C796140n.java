package X;

/* renamed from: X.40n  reason: invalid class name and case insensitive filesystem */
public enum C796140n {
    SUCCESS_FLAG(0),
    SCREEN_DATA(1),
    ERROR(2),
    ERROR_CODE(3),
    ERROR_MESSAGE(4),
    ERROR_PARAMS(5),
    ERROR_NAME(6);
    
    public final String key;

    /* access modifiers changed from: public */
    static {
        SUCCESS_FLAG = new C796140n("SUCCESS_FLAG", "success", 0);
        SCREEN_DATA = new C796140n("SCREEN_DATA", "screen_data", 1);
        ERROR = new C796140n("ERROR", "error", 2);
        ERROR_CODE = new C796140n("ERROR_CODE", "code", 3);
        ERROR_MESSAGE = new C796140n("ERROR_MESSAGE", "message", 4);
        ERROR_PARAMS = new C796140n("ERROR_PARAMS", "params", 5);
        ERROR_NAME = new C796140n("ERROR_NAME", "error_name", 6);
    }

    /* access modifiers changed from: public */
    C796140n(int i2) {
        this.key = r2;
    }
}
