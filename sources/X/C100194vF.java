package X;

import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.4vF  reason: invalid class name and case insensitive filesystem */
public class C100194vF implements AnonymousClass5TC {
    public int A00;
    public int A01;
    public final AnonymousClass4D1 A02;
    public final C35581mA A03;
    public final WeakReference A04 = C13690nt.A0h((Object) null);

    public C100194vF(AnonymousClass4D1 r2, C35581mA r3, int i2, int i3) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean A8u() {
        return TextUtils.isEmpty(this.A03.A03);
    }

    public ImageView ACj() {
        return (ImageView) this.A04.get();
    }

    public int ADO() {
        return this.A00;
    }

    public int ADQ() {
        return this.A01;
    }

    public Integer AE5() {
        return C13690nt.A0U();
    }

    public String AGp() {
        String str = this.A03.A03;
        return str == null ? "" : str;
    }

    public String getId() {
        return this.A03.A00;
    }
}
