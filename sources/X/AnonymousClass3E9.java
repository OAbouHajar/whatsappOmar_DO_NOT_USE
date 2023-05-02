package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.3E9  reason: invalid class name */
public final class AnonymousClass3E9 implements AnonymousClass5RD {
    public static final Uri A01;
    public final LogPrinter A00 = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        A01 = builder.build();
    }

    public final Uri Aj2() {
        return A01;
    }

    public final void AjL(AnonymousClass3BD r7) {
        ArrayList A0n = C13680ns.A0n(r7.A0A.values());
        Collections.sort(A0n, new C1047556u());
        StringBuilder A0o = AnonymousClass000.A0o();
        int size = A0n.size();
        for (int i2 = 0; i2 < size; i2++) {
            String obj = A0n.get(i2).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (A0o.length() != 0) {
                    A0o.append(", ");
                }
                A0o.append(obj);
            }
        }
        this.A00.println(A0o.toString());
    }
}
