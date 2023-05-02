package X;

import com.whatsapp.util.Log;

/* renamed from: X.2CO  reason: invalid class name */
public final class AnonymousClass2CO {
    public boolean A00;
    public final String A01;

    public AnonymousClass2CO(String str, boolean z2) {
        this.A01 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" initialize to ");
        sb.append(z2);
        Log.log(3, sb.toString());
        this.A00 = z2;
    }

    public void A00(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" ");
        sb.append(this.A00);
        sb.append(" change to ");
        sb.append(z2);
        Log.log(3, sb.toString());
        this.A00 = z2;
    }
}
