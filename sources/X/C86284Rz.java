package X;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Rz  reason: invalid class name and case insensitive filesystem */
public final class C86284Rz {
    public Uri A00;
    public Object A01;
    public String A02;
    public List A03 = Collections.emptyList();
    public List A04 = Collections.emptyList();
    public List A05 = Collections.emptyList();
    public Map A06 = Collections.emptyMap();

    public C86924Ur A00() {
        Uri uri = this.A00;
        C86804Uf r4 = null;
        if (uri != null) {
            r4 = new C86804Uf(uri, this.A01, this.A04, this.A05);
            String str = this.A02;
            if (str == null) {
                str = uri.toString();
            }
            this.A02 = str;
        }
        return new C86924Ur(new AnonymousClass4SN(), new AnonymousClass4SO(), r4, new AnonymousClass4SP(), this.A02);
    }
}
