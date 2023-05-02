package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.2hW  reason: invalid class name and case insensitive filesystem */
public class C54442hW implements AnonymousClass007 {
    public final AnonymousClass01A A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public C54442hW(AnonymousClass01A r2) {
        this.A00 = r2;
    }

    public static final Context A00(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static C54442hW A01(AnonymousClass01A r1) {
        return new C54442hW(r1);
    }

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    AnonymousClass01A r5 = this.A00;
                    AnonymousClass061 r0 = r5.A0F;
                    C001000l r6 = r0 == null ? null : r0.A04;
                    if (r6 != null) {
                        C52772eQ.A00("Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", new Object[]{r6.getClass()}, r6 instanceof AnonymousClass007);
                        AnonymousClass061 r02 = r5.A0F;
                        C49132Rg r03 = (C49132Rg) ((AnonymousClass2Rf) C004501y.A00(AnonymousClass2Rf.class, r02 == null ? null : r02.A04));
                        C84654Lj r04 = new C84654Lj(r03.A1q, r03.A1r, r03.A1s);
                        r04.A00 = r5;
                        this.A02 = new C17050uS(r04.A01, r04.A02, r04.A03);
                    } else {
                        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
                    }
                }
            }
        }
        return this.A02;
    }
}
