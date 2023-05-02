package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.224  reason: invalid class name */
public final /* synthetic */ class AnonymousClass224 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C25321Ji A03;
    public final /* synthetic */ Jid A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass224(C25321Ji r1, Jid jid, Integer num, String str, int i2, int i3, int i4, boolean z2) {
        this.A07 = z2;
        this.A03 = r1;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A06 = str;
        this.A05 = num;
        this.A04 = jid;
    }

    public final void run() {
        boolean z2 = this.A07;
        C25321Ji r9 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A02;
        String str = this.A06;
        Integer num = this.A05;
        Jid jid = this.A04;
        C75463sC r1 = new C75463sC();
        r1.A01 = Integer.valueOf(i2);
        r1.A03 = Integer.valueOf(i3);
        r1.A02 = Integer.valueOf(i4);
        r1.A05 = str;
        if (num != null) {
            r1.A00 = num;
        }
        if (jid != null) {
            r1.A04 = r9.A01.A00(jid);
        }
        C16490t9 r0 = r9.A00;
        if (z2) {
            r0.A04(r1);
        } else {
            r0.A06(r1);
        }
    }
}
