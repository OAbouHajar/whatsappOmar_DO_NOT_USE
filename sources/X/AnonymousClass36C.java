package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.36C  reason: invalid class name */
public class AnonymousClass36C extends C16690tT {
    public final AnonymousClass024 A00;
    public final AnonymousClass5PU A01;
    public final C16480t8 A02;
    public final HashMap A03 = AnonymousClass000.A0x();

    public AnonymousClass36C(AnonymousClass024 r5, AnonymousClass5PU r6, C16480t8 r7, Collection collection) {
        this.A02 = r7;
        this.A00 = r5;
        this.A01 = r6;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ A0V = C13680ns.A0V(it);
            if (A0V instanceof C16730tY) {
                C16730tY r1 = (C16730tY) A0V;
                String str = r1.A05;
                C16750ta r0 = r1.A02;
                File file = r0 != null ? r0.A0F : null;
                if (!(str == null || file == null)) {
                    this.A03.put(str, file);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator A0j = C13690nt.A0j(this.A03);
        while (A0j.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0j);
            String A0f = C13690nt.A0f(A0z);
            A0u.addAll(this.A02.A0C(this.A00, (File) A0z.getValue(), A0f));
        }
        return A0u;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        this.A01.AQD((Collection) obj);
    }
}
