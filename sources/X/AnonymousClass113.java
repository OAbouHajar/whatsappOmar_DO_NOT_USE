package X;

import android.content.pm.PackageManager;
import com.whatsapp.util.Log;

/* renamed from: X.113  reason: invalid class name */
public abstract class AnonymousClass113 implements C17810vg {
    public void A00(String str) {
        if (this instanceof AnonymousClass1GK) {
            AnonymousClass1GK r2 = (AnonymousClass1GK) this;
            C15900s5 r0 = r2.A01.A00;
            C15920s8 r3 = C15910s6.A11;
            if (r0.A05(r3)) {
                C19470yU r1 = r2.A00;
                if (r1 instanceof AnonymousClass11B) {
                    AnonymousClass11B r12 = (AnonymousClass11B) r1;
                    if (r12.A04.A00.A05(r3)) {
                        AnonymousClass118 r13 = r12.A05;
                        try {
                            if (r13.A02.A01(str).A03) {
                                AnonymousClass01D r02 = (AnonymousClass01D) r13.A00.A00.get(str);
                                if (r02 != null) {
                                    ((AnonymousClass1V3) r02.get()).A00();
                                }
                                r13.A03.A00(str);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        StringBuilder sb = new StringBuilder("InstrumentationChangeDispatcher/verification failed, dropping event for package - ");
                        sb.append(str);
                        Log.w(sb.toString());
                    }
                }
                r2.A03.A03(str);
            }
        }
    }
}
