package X;

import android.graphics.Typeface;

/* renamed from: X.0gl  reason: invalid class name and case insensitive filesystem */
public class C10210gl implements Runnable {
    public final /* synthetic */ Typeface A00;
    public final /* synthetic */ AnonymousClass0NP A01;
    public final /* synthetic */ AnonymousClass0PP A02;

    public C10210gl(Typeface typeface, AnonymousClass0NP r2, AnonymousClass0PP r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = typeface;
    }

    public void run() {
        AnonymousClass0NP r0 = this.A01;
        Typeface typeface = this.A00;
        C017508g r02 = r0.A00;
        if (r02 != null) {
            r02.A02(typeface);
        }
    }
}
