package X;

import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;

/* renamed from: X.10w  reason: invalid class name and case insensitive filesystem */
public class C206210w {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C220516l A02;
    public final C19230xz A03;
    public final AnonymousClass12D A04;
    public final C16440t3 A05;
    public final C14710pd A06;
    public final C16320sq A07;

    public C206210w(C16040sK r1, C16000sG r2, C220516l r3, C19230xz r4, AnonymousClass12D r5, C16440t3 r6, C14710pd r7, C16320sq r8) {
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void A00() {
        int A032;
        if (!this.A00.A0G() && (A032 = this.A06.A03(C16620tM.A02, 1144)) != -1 && this.A05.A00() - this.A04.A01().getLong("last_out_contact_sync_time", -1) > ((long) A032) * 60000) {
            this.A07.Acm(new RunnableRunnableShape7S0100000_I0_6(this, 2), "ContactDiscoverySyncHelper/syncOutContact");
        }
    }
}
