package X;

import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.10e  reason: invalid class name and case insensitive filesystem */
public class C204510e {
    public final C16980tz A00;
    public final C15940sA A01;

    public C204510e(C16980tz r1, C15940sA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(String str) {
        int i2 = Build.VERSION.SDK_INT;
        Uri parse = Uri.parse("content://com.obwhatsapp.provider.instrumentation");
        if (i2 >= 26) {
            this.A00.A00.revokeUriPermission(str, parse, 3);
        } else {
            this.A00.A00.revokeUriPermission(parse, 3);
        }
    }

    public void A01(String str, List list) {
        this.A01.A02(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if ("com.obwhatsapp.provider.instrumentation".equals(uri.getAuthority())) {
                this.A00.A00.grantUriPermission(str, uri, 129);
            } else {
                StringBuilder sb = new StringBuilder("Unexpected authority in URI: ");
                sb.append(uri);
                throw new SecurityException(sb.toString());
            }
        }
    }
}
