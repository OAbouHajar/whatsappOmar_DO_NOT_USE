package X;

import com.facebook.redex.IDxSCallbackShape334S0100000_2_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.37D  reason: invalid class name */
public class AnonymousClass37D extends C16690tT {
    public final /* synthetic */ AnonymousClass3BC A00;

    public AnonymousClass37D(AnonymousClass3BC r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C35011lE r2;
        AnonymousClass3BC r5 = this.A00;
        r5.A02.A00();
        IDxSCallbackShape334S0100000_2_I1 iDxSCallbackShape334S0100000_2_I1 = new IDxSCallbackShape334S0100000_2_I1(this, 1);
        AnonymousClass1D0 r8 = r5.A08;
        ArrayList A05 = r8.A05(iDxSCallbackShape334S0100000_2_I1, 0, 100);
        C16700tU r6 = this.A02;
        if (!r6.isCancelled()) {
            Log.i("CallsHistoryDataSource/RefreshCallsHistoryItemsTask/doInBackground");
            try {
                r2 = C30341cC.A07();
            } catch (UnsatisfiedLinkError e2) {
                Log.e((Throwable) e2);
                r2 = null;
            }
            AnonymousClass4KH A0B = A0B(r2, A05);
            if (A05.size() < 100) {
                return A0B;
            }
            A07(A0B);
            ArrayList A052 = r8.A05(iDxSCallbackShape334S0100000_2_I1, 100, 1000);
            if (!r6.isCancelled()) {
                AnonymousClass4KH A0B2 = A0B(r2, A052);
                ArrayList arrayList = A0B.A00;
                ArrayList arrayList2 = A0B.A01;
                arrayList.addAll(A0B2.A00);
                arrayList2.addAll(A0B2.A01);
                return new AnonymousClass4KH(r5, arrayList, arrayList2);
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass3BC r1 = this.A00;
        r1.A00 = null;
        AnonymousClass3BC.A00((AnonymousClass4KH) obj, r1);
    }

    public final AnonymousClass4KH A0B(C35011lE r15, ArrayList arrayList) {
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        AnonymousClass3BC r2 = this.A00;
        C16440t3 r10 = r2.A07;
        C14710pd r9 = r2.A09;
        C16000sG r8 = r2.A03;
        C16080sP r7 = r2.A06;
        C616739v r5 = new C616739v(r8, r7, r10, r9);
        Iterator it = arrayList.iterator();
        C16010sH r6 = null;
        while (it.hasNext()) {
            C37831po r1 = (C37831po) it.next();
            C16010sH A02 = C30341cC.A02(r8, r2.A0A, r1.A04, r2.A0C);
            boolean A1V = AnonymousClass000.A1V(A02);
            if ((!r1.A0C.equals(r15) && (!r1.A0A() || r1.A04().size() > 0)) || r1.A06 != null) {
                if (!r5.A09(r1, A1V)) {
                    if (r5.A07()) {
                        A0u2.add(new C101134wl(r5, r6));
                    } else {
                        A0u.add(new C101124wk(r5, r6));
                    }
                    r5 = new C616739v(r8, r7, r10, r9);
                }
                r5.A04.add(r1);
            }
            r6 = A02;
        }
        if (!r5.A04.isEmpty()) {
            if (r5.A07()) {
                A0u2.add(new C101134wl(r5, r6));
            } else {
                A0u.add(new C101124wk(r5, r6));
            }
        }
        return new AnonymousClass4KH(r2, A0u, A0u2);
    }
}
