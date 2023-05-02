package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: X.5o3  reason: invalid class name and case insensitive filesystem */
public class C114615o3 extends C16690tT {
    public final int A00;
    public final AnonymousClass107 A01;
    public final AnonymousClass108 A02;
    public final C18290wS A03;
    public final C39961tL A04;
    public final C16320sq A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final WeakReference A08;
    public final boolean A09;
    public final boolean A0A = true;
    public final boolean A0B;

    public C114615o3(C14530pL r4, AnonymousClass107 r5, AnonymousClass108 r6, C18290wS r7, C39961tL r8, C16320sq r9, WeakReference weakReference, WeakReference weakReference2, boolean z2, boolean z3) {
        this.A05 = r9;
        this.A04 = r8;
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = new WeakReference(r4);
        this.A0B = z2;
        this.A09 = z3;
        this.A00 = 3;
        this.A07 = weakReference;
        this.A08 = weakReference2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0u = AnonymousClass000.A0u();
        List A0u2 = AnonymousClass000.A0u();
        List A0u3 = AnonymousClass000.A0u();
        if (this.A0B) {
            C39961tL r2 = this.A04;
            r2.A04 = true;
            C18290wS r0 = this.A03;
            r0.A06();
            C221116r r1 = r0.A08;
            A0u2 = r1.A0W(r2);
            r0.A06();
            A0u3 = r1.A0S(this.A00);
        }
        if (this.A0A) {
            A0u = C110115dX.A0H(this.A03).A0A();
        }
        return new C117085sQ(A0u, A0u2, A0u3);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C117085sQ r8 = (C117085sQ) obj;
        synchronized (this) {
            C14530pL r3 = (C14530pL) this.A06.get();
            C1220668d r2 = (C1220668d) this.A07.get();
            AnonymousClass69D r4 = (AnonymousClass69D) this.A08.get();
            if (r3 != null) {
                r3.Ac1();
                if (r2 != null) {
                    List list = r8.A00;
                    r2.AhT(list);
                    if (this.A09) {
                        ArrayList A0u = AnonymousClass000.A0u();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C30671cl A0F = C110115dX.A0F(it);
                            if (!TextUtils.isEmpty(A0F.A0A)) {
                                A0u.add(A0F.A0A);
                            }
                        }
                        this.A05.Acl(new C1211164g(this.A02));
                    }
                }
                if (this.A0B && r4 != null) {
                    List list2 = r8.A02;
                    r4.Ahd(list2);
                    List list3 = r8.A01;
                    r4.AhZ(list3);
                    if (this.A09) {
                        A0B(list2);
                        A0B(list3);
                    }
                }
                r3.invalidateOptionsMenu();
            }
        }
    }

    public final void A0B(List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1Vt r1 = (AnonymousClass1Vt) it.next();
            if (!TextUtils.isEmpty(r1.A0K)) {
                A0u.add(r1.A0K);
            }
        }
        this.A05.Acl(new C1214765q(this, A0u));
    }
}
