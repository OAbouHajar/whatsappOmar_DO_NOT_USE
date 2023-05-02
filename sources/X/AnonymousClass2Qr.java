package X;

import com.obwhatsapp.jobqueue.job.ReceiptProcessingJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.2Qr  reason: invalid class name */
public final class AnonymousClass2Qr implements AnonymousClass2Qs {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final Jid A03;
    public final C40111ta A04;
    public final C30641ci A05;
    public final boolean A06;
    public final C28381Vw[] A07;

    public AnonymousClass2Qr(DeviceJid deviceJid, Jid jid, C40111ta r3, C30641ci r4, C28381Vw[] r5, int i2, long j2, boolean z2) {
        this.A07 = r5;
        this.A03 = jid;
        this.A02 = deviceJid;
        this.A00 = i2;
        this.A01 = j2;
        this.A05 = r4;
        this.A06 = z2;
        this.A04 = r3;
    }

    public boolean AJK() {
        return this.A06;
    }

    public C28381Vw AK2(int i2) {
        return this.A07[i2];
    }

    public DeviceJid AaF(int i2) {
        return this.A02;
    }

    public C40111ta AbY() {
        return this.A04;
    }

    public Jid Abp() {
        return this.A03;
    }

    public void Ad5(C19000xb r9, int i2) {
        C28381Vw[] r2 = this.A07;
        int length = r2.length - i2;
        C28381Vw[] r4 = new C28381Vw[length];
        System.arraycopy(r2, i2, r4, 0, length);
        Jid jid = this.A03;
        r9.A00(new ReceiptProcessingJob(this.A02, jid, this.A04, r4, this.A00, this.A01));
    }

    public C30641ci Ag0() {
        return this.A05;
    }

    public int AgJ() {
        return this.A00;
    }

    public long Agl(int i2) {
        return this.A01;
    }

    public int size() {
        return this.A07.length;
    }
}
