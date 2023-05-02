package X;

import android.os.Handler;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.jobqueue.job.SendRetryReceiptJob;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1dJ  reason: invalid class name and case insensitive filesystem */
public final class C31001dJ {
    public final int A00;
    public final C211512z A01;
    public final C19000xb A02;
    public final AnonymousClass126 A03;
    public final C27541Sd A04;
    public final C20340zt A05;
    public final C30161br A06;
    public final C30971dG A07;
    public final C30971dG A08;
    public final boolean A09;
    public final byte[] A0A;
    public final byte[] A0B;

    public C31001dJ(C211512z r2, C19000xb r3, C208211s r4, AnonymousClass126 r5, C27541Sd r6, C20340zt r7, C30161br r8, C30971dG r9, C30971dG r10, byte[] bArr, byte[] bArr2, boolean z2) {
        this.A05 = r7;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
        this.A00 = r4.A07.A01();
        this.A0B = bArr;
        this.A08 = r9;
        this.A07 = r10;
        this.A0A = bArr2;
        this.A09 = z2;
    }

    public void A00() {
        StringBuilder sb = new StringBuilder("need to send retry receipt; message.key=");
        C30161br r6 = this.A06;
        C28381Vw r0 = r6.A0C;
        if (r0 == null) {
            r0 = r6.A0m;
        }
        sb.append(r0);
        sb.append(" participant = ");
        sb.append(r6.A08);
        Log.i(sb.toString());
        r6.A0f = true;
        int i2 = this.A00;
        byte[] A022 = C28641Wx.A02(i2);
        if (r6.A00() > 1) {
            this.A01.A02();
        }
        if (r6.A01 == 0 && r6.A00 == 0) {
            StringBuilder sb2 = new StringBuilder("recording local placeholder for retry receipt; message.key=");
            C28381Vw r02 = r6.A0C;
            if (r02 == null) {
                r02 = r6.A0m;
            }
            sb2.append(r02.toString());
            Log.i(sb2.toString());
            this.A03.A01(new RunnableRunnableShape9S0200000_I0_7(this, 2, r6), 50);
        }
        StringBuilder sb3 = new StringBuilder("axolotl sending retry receipt; message.key=");
        C28381Vw r03 = r6.A0C;
        if (r03 == null) {
            r03 = r6.A0m;
        }
        sb3.append(r03);
        sb3.append("; localRegistrationId=");
        sb3.append(i2);
        Log.i(sb3.toString());
        if (!this.A09) {
            C20340zt r4 = this.A05;
            Jid jid = r6.A0k;
            String str = r6.A0o;
            Jid jid2 = r6.A08;
            UserJid userJid = r6.A0l;
            long j2 = r6.A0j;
            int A002 = r6.A00() + 1;
            byte[] bArr = this.A0B;
            C30971dG r12 = this.A08;
            C30971dG r13 = this.A07;
            byte[] bArr2 = this.A0A;
            long j3 = r6.A06;
            String str2 = r6.A0R;
            if (r4.A02.A05) {
                byte[] bArr3 = bArr;
                Message obtain = Message.obtain((Handler) null, 0, 11, 0, new AnonymousClass2QJ(jid, jid2, userJid, r12, r13, str, str2, A022, bArr3, bArr2, (byte) 5, A002, j2, j3));
                r4.A00((AnonymousClass2QJ) obtain.obj);
                r4.A03.A09(obtain, false);
                return;
            }
            return;
        }
        this.A02.A00(new SendRetryReceiptJob(r6, i2));
    }
}
