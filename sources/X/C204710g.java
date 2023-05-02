package X;

import android.os.Bundle;
import android.os.Message;

/* renamed from: X.10g  reason: invalid class name and case insensitive filesystem */
public class C204710g {
    public final Bundle A00;
    public final Message A01;
    public final String A02;

    public C204710g(Message message, String str) {
        AnonymousClass00B.A0F(true);
        this.A02 = str;
        this.A00 = null;
        this.A01 = message;
    }

    public C204710g(String str) {
        AnonymousClass00B.A0F(true);
        this.A02 = str;
        this.A00 = null;
        this.A01 = null;
    }

    public C204710g(String str, Bundle bundle) {
        AnonymousClass00B.A0F(true);
        this.A02 = str;
        this.A00 = bundle;
        this.A01 = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("action=");
        sb.append(this.A02);
        sb.append(", args=");
        sb.append(this.A00);
        sb.append(", message=");
        sb.append(this.A01);
        return sb.toString();
    }
}
