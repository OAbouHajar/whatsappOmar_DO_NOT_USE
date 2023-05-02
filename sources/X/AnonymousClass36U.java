package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36U  reason: invalid class name */
public class AnonymousClass36U extends C16690tT {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C16760tb A01;
    public final /* synthetic */ C15860rz A02;
    public final /* synthetic */ AnonymousClass11A A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass36U(C001300o r2, C16760tb r3, C15860rz r4, AnonymousClass11A r5, WeakReference weakReference, List list, long j2, boolean z2) {
        super(r2, true);
        this.A05 = list;
        this.A01 = r3;
        this.A06 = z2;
        this.A00 = j2;
        this.A04 = weakReference;
        this.A02 = r4;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            this.A01.A0I(C16010sH.A01(C13680ns.A0U(it)), this.A06);
        }
        C14550pN.A0y(this.A00, 300);
        return null;
    }

    public void A0A(Object obj) {
        C14550pN r1 = (C14550pN) this.A04.get();
        if (r1 != null && !r1.isFinishing()) {
            r1.Ac1();
        }
        C15860rz r12 = this.A02;
        C13680ns.A0w(r12.A0K(), "delete_chat_count", r12.A05() + this.A05.size());
        this.A03.A05(0);
    }
}
