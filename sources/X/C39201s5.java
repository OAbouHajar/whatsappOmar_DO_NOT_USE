package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.1s5  reason: invalid class name and case insensitive filesystem */
public class C39201s5 extends C16740tZ implements C30081bi, C39131ry {
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public C39201s5(C28381Vw r2, long j2) {
        super(r2, (byte) 69, j2);
    }

    public C39201s5(C445324l r7, C28381Vw r8, long j2) {
        super(r8, (byte) 69, j2);
        int i2 = r7.A00;
        if ((i2 & 1) == 1) {
            this.A03 = r7.A0J;
        }
        if ((i2 & 16) == 16) {
            this.A00 = r7.A04;
        }
        if ((i2 & 8) == 8) {
            byte[] A04 = r7.A07.A04();
            int length = A04.length;
            if (length != 32) {
                StringBuilder sb = new StringBuilder("FMessageMediaExpessPathNotify/bogus sha-256 hash received; length=");
                sb.append(length);
                sb.append("; message.key=");
                sb.append(r8);
                Log.w(sb.toString());
            } else {
                this.A02 = Base64.encodeToString(A04, 2);
            }
        }
        if ((r7.A00 & 256) == 256) {
            byte[] A042 = r7.A06.A04();
            int length2 = A042.length;
            if (length2 != 32) {
                StringBuilder sb2 = new StringBuilder("FMessageMediaExpessPathNotify/bogus sha-256 enc hash received; length=");
                sb2.append(length2);
                sb2.append("; message.key=");
                sb2.append(r8);
                Log.e(sb2.toString());
                return;
            }
            this.A01 = Base64.encodeToString(A042, 2);
        }
    }

    public void A5j(AnonymousClass21Q r7, AnonymousClass1GC r8) {
        if (this.A03 == null || this.A02 == null || this.A01 == null || this.A00 <= 0) {
            Log.w("FMessageMediaExpressPathNotify/buildE2EMessage unable to send media express path noitfy message due to missing url or fileHash");
            return;
        }
        C33221iE r4 = r7.A04;
        C445324l r0 = ((C33211iD) r4.A00).A0C;
        if (r0 == null) {
            r0 = C445324l.A0L;
        }
        C28581Wr A0U = r0.A0U();
        String str = this.A03;
        A0U.A03();
        C445324l r1 = (C445324l) A0U.A00;
        r1.A00 |= 1;
        r1.A0J = str;
        long j2 = this.A00;
        A0U.A03();
        C445324l r5 = (C445324l) A0U.A00;
        r5.A00 |= 16;
        r5.A04 = j2;
        try {
            byte[] decode = Base64.decode(this.A02, 2);
            C28631Ww A012 = C28631Ww.A01(decode, 0, decode.length);
            A0U.A03();
            C445324l r12 = (C445324l) A0U.A00;
            r12.A00 |= 8;
            r12.A07 = A012;
            byte[] decode2 = Base64.decode(this.A01, 2);
            C28631Ww A013 = C28631Ww.A01(decode2, 0, decode2.length);
            A0U.A03();
            C445324l r13 = (C445324l) A0U.A00;
            r13.A00 |= 256;
            r13.A06 = A013;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("fmessagemediaexpresspathnotify/createdocumentmessagebuilder ex = ");
            sb.append(e2.toString());
            Log.e(sb.toString());
        }
        A0U.A03();
        C445324l r14 = (C445324l) A0U.A00;
        r14.A00 |= 2;
        r14.A0G = "document";
        r4.A03();
        C33211iD r15 = (C33211iD) r4.A00;
        r15.A0C = (C445324l) A0U.A02();
        r15.A00 |= 64;
    }
}
