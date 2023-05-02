package X;

import com.whatsapp.util.Log;

/* renamed from: X.2A3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2A3 implements AnonymousClass1WE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C19200xv A01;

    public /* synthetic */ AnonymousClass2A3(C19200xv r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void accept(Object obj) {
        int i2;
        C19200xv r5 = this.A01;
        int i3 = this.A00;
        C16730tY r7 = (C16730tY) obj;
        StringBuilder sb = new StringBuilder("mediaautodownload/updatequeue/foreach message.key=");
        sb.append(r7.A11);
        Log.i(sb.toString());
        C209212c r4 = r5.A07;
        C30701co A03 = r4.A03(r7);
        if (A03 == null) {
            Log.i("mediaautodownload/updatequeue/foreach message skipped");
        } else if (A03.A0u != 0) {
            C216214u r1 = r5.A06;
            if (r1.A03(r7)) {
                i2 = 1;
            } else {
                boolean A06 = r1.A06(r7, i3);
                i2 = 2;
                if (!A06) {
                    r4.A0B(r7, false, false);
                    return;
                }
            }
            A03.A0u = i2;
            C30741cs r12 = A03.A0c;
            synchronized (r12) {
                r12.A00 = i2;
            }
        }
    }
}
