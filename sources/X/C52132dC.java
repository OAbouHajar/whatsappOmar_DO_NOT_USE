package X;

import android.content.Context;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.2dC  reason: invalid class name and case insensitive filesystem */
public class C52132dC extends C16690tT {
    public Context A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C18380wb A04;
    public final AnonymousClass152 A05;
    public final List A06;

    public C52132dC(Context context, C18380wb r2, AnonymousClass152 r3, List list, int i2, int i3, int i4) {
        this.A00 = context;
        this.A06 = list;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A04 = r2;
        AnonymousClass00B.A06(r3);
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        for (C16010sH r4 : this.A06) {
            Context context = this.A00;
            if (context != null) {
                this.A05.A01(context, r4, (float) this.A01, this.A02);
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putInt("notification_type", this.A03);
        this.A04.A00(new C204710g("refresh_notification", bundle));
    }
}
