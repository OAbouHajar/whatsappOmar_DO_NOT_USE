package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: X.2eE  reason: invalid class name and case insensitive filesystem */
public final class C52662eE implements AnonymousClass007 {
    public final View A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public C52662eE(View view) {
        this.A00 = view;
    }

    public static C52662eE A00(View view) {
        return new C52662eE(view);
    }

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    Class<AnonymousClass007> cls = AnonymousClass007.class;
                    View view = this.A00;
                    Context context = view.getContext();
                    while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (context == AnonymousClass1UR.A00(context.getApplicationContext())) {
                        C52772eQ.A00("%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", new Object[]{view.getClass()}, false);
                        context = null;
                    }
                    if (context instanceof AnonymousClass007) {
                        C49132Rg r0 = (C49132Rg) ((AnonymousClass2Rf) C004501y.A00(AnonymousClass2Rf.class, (AnonymousClass007) context));
                        C16150sX r3 = r0.A1s;
                        C52782eR r02 = new C52782eR(r0.A1q, r0.A1r, r3);
                        r02.A00 = view;
                        C16150sX r32 = r02.A03;
                        this.A02 = new C52652eD(r02.A01, r02.A02, r32);
                    } else {
                        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{view.getClass()}));
                    }
                }
            }
        }
        return this.A02;
    }
}
