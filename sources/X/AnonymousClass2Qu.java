package X;

import android.util.Pair;
import com.obwhatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.2Qu  reason: invalid class name */
public final class AnonymousClass2Qu implements AnonymousClass2Qs {
    public final int A00;
    public final Jid A01;
    public final C28381Vw A02;
    public final C40111ta A03;
    public final C30641ci A04;
    public final List A05;
    public final boolean A06;

    public AnonymousClass2Qu(Jid jid, C28381Vw r2, C40111ta r3, C30641ci r4, List list, int i2, boolean z2) {
        this.A02 = r2;
        this.A01 = jid;
        this.A00 = i2;
        this.A05 = list;
        this.A04 = r4;
        this.A06 = z2;
        this.A03 = r3;
    }

    public boolean AJK() {
        return this.A06;
    }

    public C28381Vw AK2(int i2) {
        return this.A02;
    }

    public DeviceJid AaF(int i2) {
        return (DeviceJid) ((Pair) this.A05.get(i2)).first;
    }

    public C40111ta AbY() {
        return this.A03;
    }

    public Jid Abp() {
        return this.A01;
    }

    public void Ad5(C19000xb r7, int i2) {
        List list = this.A05;
        List subList = list.subList(i2, list.size());
        C28381Vw r2 = this.A02;
        r7.A00(new ReceiptMultiTargetProcessingJob(this.A01, r2, this.A03, subList, this.A00));
    }

    public C30641ci Ag0() {
        return this.A04;
    }

    public int AgJ() {
        return this.A00;
    }

    public long Agl(int i2) {
        return ((Number) ((Pair) this.A05.get(i2)).second).longValue();
    }

    public int size() {
        return this.A05.size();
    }
}
