package X;

import java.util.Iterator;

/* renamed from: X.4y0  reason: invalid class name and case insensitive filesystem */
public class C101864y0 implements AnonymousClass1yq {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C42561y1 A05;
    public final /* synthetic */ C83694Hr A06;
    public final /* synthetic */ C24831Hl A07;

    public C101864y0(C42561y1 r1, C83694Hr r2, C24831Hl r3, int i2, int i3) {
        this.A07 = r3;
        this.A04 = i2;
        this.A03 = i3;
        this.A05 = r1;
        this.A06 = r2;
    }

    public void ARM() {
        C221616w r1 = this.A07.A02;
        C42561y1 r0 = this.A05;
        r1.A05(r0);
        C15830rv r5 = r0.A07;
        C83694Hr r4 = this.A06;
        C24841Hm r6 = r4.A01;
        AnonymousClass17I r7 = r6.A06;
        C28701Xf A042 = r7.A04(r5);
        r6.A03.A0K().remove("storage_usage_deletion_jid").remove("storage_usage_deletion_current_msg_cnt").remove("storage_usage_deletion_all_msg_cnt").apply();
        r6.A01.A0H(new C28711Xg(r7.A04(r5), r5));
        Iterator it = r6.A09.iterator();
        while (it.hasNext()) {
            ((C41761wc) it.next()).APV(A042, r5);
        }
        r4.A00.ARM();
    }

    public void AVM(int i2, int i3) {
        int i4 = this.A02;
        if (i4 == -1) {
            i4 = Math.max(this.A03 / 100, 1);
            this.A02 = i4;
        }
        int i5 = this.A04 + i2;
        this.A00 = i5;
        if (i5 - this.A01 > i4) {
            C24831Hl.A00(this.A06, this.A05.A07, this.A03, i5);
            this.A01 = this.A00;
        }
    }

    public void AXP() {
        this.A00 = this.A04;
    }

    public boolean AfQ() {
        return false;
    }
}
