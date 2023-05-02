package X;

/* renamed from: X.2Ce  reason: invalid class name and case insensitive filesystem */
public class C46062Ce extends Exception {
    public static final long serialVersionUID = 1;
    public String banMessage;
    public int code;
    public long expiration_time;
    public int expire_time_out;
    public String faqUrl;
    public final int serverErrorCode;
    public final int type;
    public int violationType;

    public C46062Ce(int i2, int i3) {
        this.type = i2;
        this.serverErrorCode = i3;
    }
}
