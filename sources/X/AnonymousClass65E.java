package X;

import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.65E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65E implements Runnable {
    public final /* synthetic */ AnonymousClass21B A00;
    public final /* synthetic */ C117475t3 A01;

    public /* synthetic */ AnonymousClass65E(AnonymousClass21B r1, C117475t3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        String str;
        String str2;
        C117475t3 r2 = this.A01;
        C31761ez r1 = this.A00.A02;
        synchronized (r1) {
            str = r1.A07;
        }
        if (str != null) {
            List list = r2.A04;
            list.add(str);
            int size = list.size();
            List list2 = r2.A05;
            if (size == list2.size()) {
                BrazilPayBloksActivity brazilPayBloksActivity = r2.A02;
                String str3 = r2.A03;
                AnonymousClass1Z7 r12 = r2.A01;
                C35281lf A02 = brazilPayBloksActivity.A0C.A02();
                if (A02 == null || (str2 = A02.A00.A01) == null) {
                    brazilPayBloksActivity.A3A(r12);
                    return;
                }
                ArrayList A0u = AnonymousClass000.A0u();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass000.A0m(it);
                    C35081lL[] r22 = new C35081lL[2];
                    C35081lL.A02("type", str3, r22, 0);
                    C35081lL.A02("id", A0m, r22, 1);
                    A0u.add(new C28371Vv("document", r22));
                }
                C35081lL[] r3 = new C35081lL[2];
                C35081lL.A02("action", "document-upload-step-up-challenge", r3, 0);
                C35081lL.A02("challenge_id", str2, r3, 1);
                C28371Vv r23 = new C28371Vv("account", r3, (C28371Vv[]) A0u.toArray(new C28371Vv[0]));
                brazilPayBloksActivity.A0D.A0F(new IDxRCallbackShape20S0200000_3_I1(brazilPayBloksActivity, brazilPayBloksActivity.A0A, brazilPayBloksActivity.A05, r12, brazilPayBloksActivity, 15), r23, "set");
                return;
            }
            String str4 = r2.A03;
            r2.A02.A3D(r2.A01, str4, list2, list, r2.A00 + 1);
            return;
        }
        r2.A02.A3A(r2.A01);
    }
}
