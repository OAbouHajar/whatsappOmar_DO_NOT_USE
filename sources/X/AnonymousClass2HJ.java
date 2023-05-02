package X;

import android.text.TextUtils;

/* renamed from: X.2HJ  reason: invalid class name */
public class AnonymousClass2HJ {
    public int A00;
    public int A01;
    public long A02;
    public C28371Vv A03;
    public C28371Vv A04;
    public C28371Vv A05;
    public String A06;
    public String A07;
    public String A08;

    public AnonymousClass2HJ() {
        this.A00 = 0;
    }

    public AnonymousClass2HJ(int i2) {
        this.A00 = i2;
    }

    public AnonymousClass2HJ(C28371Vv r6) {
        this.A00 = C29501aj.A00(r6.A0N("error-code", (String) null), 0);
        this.A08 = r6.A0N("error-text", (String) null);
        r6.A0N("display_title", (String) null);
        this.A07 = r6.A0N("display_text", (String) null);
        this.A01 = C29501aj.A00(r6.A0N("remaining-retries", (String) null), -1);
        this.A02 = C29501aj.A01(r6.A0N("next-retry-ts", (String) null), 0);
        this.A06 = r6.A0N("auth-ticket-fp", (String) null);
        this.A04 = r6.A0J("offer_eligibility");
        int i2 = this.A00;
        if (i2 == 1448) {
            this.A03 = r6.A0J("key");
        } else if (i2 == 10718) {
            this.A01 = 0;
        } else if (i2 == 454) {
            this.A05 = r6.A0J("step_up");
        }
    }

    public static AnonymousClass2HJ A00(C28371Vv r2) {
        if (!TextUtils.isEmpty(r2.A0N("error-code", (String) null)) || (r2 = r2.A0J("pin")) != null) {
            return new AnonymousClass2HJ(r2);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[ code: ");
        sb.append(this.A00);
        sb.append(" text: ");
        sb.append(this.A08);
        sb.append(" remaining-retries: ");
        sb.append(this.A01);
        sb.append(" next-attempt-ts: ");
        sb.append(this.A02);
        String str2 = this.A06;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder(" auth-ticket-fp: ");
            sb2.append(str2);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(" key-node: ");
        sb.append(this.A03 != null ? "set" : "null");
        sb.append(" ]");
        return sb.toString();
    }
}
