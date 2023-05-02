package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.4Uf  reason: invalid class name and case insensitive filesystem */
public final class C86804Uf {
    public final Uri A00;
    public final Object A01;
    public final List A02;
    public final List A03;

    public C86804Uf(Uri uri, Object obj, List list, List list2) {
        this.A00 = uri;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86804Uf)) {
            return false;
        }
        C86804Uf r4 = (C86804Uf) obj;
        return this.A00.equals(r4.A00) && AnonymousClass3C1.A0F((Object) null, (Object) null) && AnonymousClass3C1.A0F((Object) null, (Object) null) && AnonymousClass3C1.A0F((Object) null, (Object) null) && this.A02.equals(r4.A02) && AnonymousClass3C1.A0F((Object) null, (Object) null) && this.A03.equals(r4.A03) && AnonymousClass3C1.A0F(this.A01, r4.A01);
    }

    public int hashCode() {
        int i2 = 0;
        int A0H = ((((AnonymousClass3K3.A0H(this.A00) * 31 * 31 * 31) + this.A02.hashCode()) * 31 * 31) + this.A03.hashCode()) * 31;
        Object obj = this.A01;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return A0H + i2;
    }
}
