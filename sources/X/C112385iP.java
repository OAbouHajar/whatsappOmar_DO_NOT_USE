package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5iP  reason: invalid class name and case insensitive filesystem */
public class C112385iP extends C112485iZ {
    public final /* synthetic */ C116605re A00;
    public final /* synthetic */ C112205i7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112385iP(Context context, C14870pt r8, C116605re r9, C18340wX r10, AnonymousClass4XO r11, C112205i7 r12) {
        super(context, r8, r10, r11, "upi-get-blocked-vpas");
        this.A01 = r12;
        this.A00 = r9;
    }

    public void A03(AnonymousClass2HJ r3) {
        C116605re r1 = this.A00;
        Log.e(AnonymousClass000.A0g("PAY: IndiaUpiBlockListManager fetch error: ", r3));
        r1.A01.AWL(r3);
    }

    public void A04(AnonymousClass2HJ r3) {
        C116605re r1 = this.A00;
        Log.e(AnonymousClass000.A0g("PAY: IndiaUpiBlockListManager fetch error: ", r3));
        r1.A01.AWL(r3);
    }

    public void A05(C28371Vv r10) {
        ArrayList arrayList;
        C28371Vv A0X = C110115dX.A0X(r10);
        if (A0X != null) {
            arrayList = AnonymousClass000.A0u();
            C28371Vv[] r4 = A0X.A03;
            if (r4 != null) {
                for (C28371Vv A05 : r4) {
                    String A052 = C28371Vv.A05(A05, "vpa");
                    if (!TextUtils.isEmpty(A052)) {
                        arrayList.add(A052);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        C116605re r5 = this.A00;
        AnonymousClass60O r42 = r5.A00;
        synchronized (r42) {
            long A002 = r42.A04.A00();
            r42.A00 = A002;
            if (arrayList != null) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("PAY: IndiaUpiBlockListManager fetch success size: ");
                A0o.append(arrayList.size());
                A0o.append(" time: ");
                A0o.append(r42.A00);
                C13680ns.A1V(A0o);
                Set set = r42.A0B;
                set.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(new C118685v5(C110105dW.A0J(C110105dW.A0L(), String.class, AnonymousClass000.A0m(it), "upiHandle"), r42));
                }
                r42.A0A.A0I(TextUtils.join(";", arrayList));
            } else {
                StringBuilder A0o2 = AnonymousClass000.A0o();
                A0o2.append("PAY: IndiaUpiBlockListManager fetch success hash matched time: ");
                A0o2.append(A002);
                C13680ns.A1V(A0o2);
            }
            C13680ns.A0x(C110105dW.A06(r42.A0A), "payments_block_list_last_sync_time", r42.A00);
        }
        r5.A01.AWL((AnonymousClass2HJ) null);
    }
}
