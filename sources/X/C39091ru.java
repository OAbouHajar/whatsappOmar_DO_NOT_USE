package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ru  reason: invalid class name and case insensitive filesystem */
public class C39091ru extends C16830ti {
    public C39091ru(AnonymousClass173 r13, AnonymousClass220 r14, C28381Vw r15, long j2) {
        super(r15, (byte) 54, j2);
        C35191lW r9;
        if (r14.A0d().A02.size() > 0) {
            String str = ((AnonymousClass222) r14.A0d().A02.get(0)).A01;
            AnonymousClass22R r2 = r14.A05;
            r2 = r2 == null ? AnonymousClass22R.A06 : r2;
            C35251lc A02 = C39801t5.A02(r13, str, (r2.A01 == 6 ? (C28631Ww) r2.A02 : C28631Ww.A01).A04(), true);
            if (A02 != null) {
                C58202t7 r0 = r14.A03;
                String str2 = (r0 == null ? C58202t7.A02 : r0).A01;
                C58212t8 r02 = r14.A04;
                String str3 = (r02 == null ? C58212t8.A02 : r02).A01;
                AnonymousClass221 A0d = r14.A0d();
                if (A0d.A02.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < A0d.A02.size(); i2++) {
                        AnonymousClass222 r03 = (AnonymousClass222) A0d.A02.get(i2);
                        arrayList.add(new C35181lV(new C35071lK(r03.A02, r03.A01), false));
                    }
                    r9 = new C35191lW((List) arrayList);
                } else {
                    r9 = null;
                }
                this.A00 = new C16880tn(A02, (C35201lX) null, r9, str2, str3);
                A12();
                return;
            }
        }
        StringBuilder sb = new StringBuilder("FMessageInteractive/parseE2EMessage/invalid message; message.key=");
        sb.append(this.A11);
        Log.e(sb.toString());
        throw new AnonymousClass23S(26);
    }

    public C39091ru(AnonymousClass173 r12, C58852uG r13, C28381Vw r14, long j2) {
        super(r14, (byte) 54, j2);
        C35191lW r8;
        C58382tP r0 = ((AnonymousClass2u3) r13.A03.get(0)).A03;
        if ((r0 == null ? C58382tP.A03 : r0).A02 == null) {
            Log.e("FMessageInteractive/parseE2ECheckoutInfo/invalid native flow message does not have parameters json");
        } else {
            AnonymousClass2u3 r2 = (AnonymousClass2u3) r13.A03.get(0);
            byte[] A04 = (r13.A01 == 3 ? (C445224k) r13.A05 : C445224k.A0R).A0A.A04();
            C58382tP r02 = r2.A03;
            C35251lc A02 = C39801t5.A02(r12, (r02 == null ? C58382tP.A03 : r02).A02, A04, false);
            if (A02 != null) {
                String str = r13.A06;
                String str2 = r13.A07;
                if (r13.A03.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < r13.A03.size(); i2++) {
                        C58382tP r03 = ((AnonymousClass2u3) r13.A03.get(i2)).A03;
                        if (r03 == null) {
                            r03 = C58382tP.A03;
                        }
                        arrayList.add(new C35181lV(new C35071lK(r03.A01, r03.A02), false));
                    }
                    r8 = new C35191lW((List) arrayList);
                } else {
                    r8 = null;
                }
                this.A00 = new C16880tn(A02, (C35201lX) null, r8, str, str2);
                A12();
                return;
            }
        }
        StringBuilder sb = new StringBuilder("FMessageInteractive/parseE2EMessage/invalid message; message.key=");
        sb.append(this.A11);
        Log.e(sb.toString());
        throw new AnonymousClass23S(26);
    }

    public C39091ru(C28381Vw r2, long j2) {
        super(r2, (byte) 54, j2);
    }
}
