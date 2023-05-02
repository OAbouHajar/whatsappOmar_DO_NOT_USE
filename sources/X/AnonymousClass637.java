package X;

import java.io.Serializable;

/* renamed from: X.637  reason: invalid class name */
public class AnonymousClass637 implements Serializable {
    public String code;
    public String encryptedBase64String;
    public String hmac;
    public String ki;
    public String pid;
    public String type;

    public AnonymousClass637(String str, String str2, String str3) {
        this.ki = str;
        this.code = str2;
        this.encryptedBase64String = str3;
    }
}
