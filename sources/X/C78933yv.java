package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.3yv  reason: invalid class name and case insensitive filesystem */
public final class C78933yv extends C16690tT {
    public final AnonymousClass4EB A00;
    public final C15830rv A01;
    public final C16210se A02;
    public final WeakReference A03;

    public C78933yv(Context context, AnonymousClass4EB r3, C15830rv r4, C16210se r5) {
        this.A03 = C13690nt.A0h(context);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C16210se r2 = this.A02;
        return r2.A03(r2.A06((Context) this.A03.get(), this.A01));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        this.A00.A00.A00((Drawable) obj);
    }
}
