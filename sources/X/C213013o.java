package X;

import android.net.Uri;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.13o  reason: invalid class name and case insensitive filesystem */
public class C213013o {
    public String A00 = "static.whatsapp.net";
    public final C19040xf A01;
    public final C16320sq A02;
    public final Object A03 = new Object();

    public C213013o(C19040xf r2, C16320sq r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public String A00(String str) {
        A01();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Uri.Builder encodedAuthority = buildUpon.scheme("https").encodedAuthority(this.A00);
        StringBuilder sb = new StringBuilder("wa/static");
        sb.append(parse.getEncodedPath());
        encodedAuthority.encodedPath(sb.toString());
        return C38191qO.A00(Uri.parse(buildUpon.build().toString()).buildUpon(), "_nc_cat", "1").build().toString();
    }

    public final void A01() {
        C38211qQ r3;
        synchronized (this.A03) {
            C16320sq r32 = this.A02;
            C19040xf r2 = this.A01;
            r32.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) r2, 9));
            C38091qE A07 = r2.A07();
            String str = "static.whatsapp.net";
            if (A07 != null) {
                List list = A07.A0A;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            r3 = (C38211qQ) it2.next();
                            if ("primary".equals(r3.A08)) {
                                break;
                            }
                        }
                    } else {
                        r3 = (C38211qQ) it.next();
                        Set set = r3.A0A;
                        if (set != null && set.contains("1")) {
                            break;
                        }
                    }
                }
                str = r3.A04;
            }
            this.A00 = str;
        }
    }
}
