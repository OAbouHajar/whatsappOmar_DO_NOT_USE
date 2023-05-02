package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.3AY  reason: invalid class name */
public final class AnonymousClass3AY {
    public final int A00;
    public final C17930vs A01;
    public final C32001fU A02;
    public final C16050sL A03;
    public final UserJid A04;
    public final UserJid A05;
    public final CallState A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public AnonymousClass3AY(C17930vs r2, C32001fU r3, C16050sL r4, UserJid userJid, UserJid userJid2, CallState callState, String str, String str2, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A01 = r2;
        this.A0A = z2;
        this.A0C = z3;
        this.A06 = callState;
        this.A0F = z4;
        this.A0D = z5;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = userJid;
        this.A07 = str;
        this.A0E = z6;
        this.A0B = z7;
        this.A04 = userJid2;
        this.A00 = i2;
        this.A09 = z8;
        this.A08 = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3AY(com.whatsapp.voipcalling.CallInfo r19) {
        /*
            r18 = this;
            r1 = r19
            java.util.Map r0 = r1.participants
            X.0vs r2 = X.C17930vs.copyOf((java.util.Map) r0)
            boolean r11 = r1.isCallFull()
            boolean r12 = r1.isGroupCall
            com.whatsapp.voipcalling.CallState r7 = r1.callState
            boolean r13 = r1.videoEnabled
            boolean r14 = r1.isInLonelyState()
            X.1fU r3 = r1.self
            com.whatsapp.jid.GroupJid r0 = r1.groupJid
            X.0sL r4 = X.C16050sL.A03(r0)
            com.whatsapp.jid.UserJid r5 = r1.getPeerJid()
            java.lang.String r8 = r1.callId
            boolean r15 = r1.isSelfRequestingUpgrade()
            boolean r16 = r1.isEitherSideRequestingUpgrade()
            com.whatsapp.jid.UserJid r6 = r1.callLinkCreatorJid
            int r10 = r1.callLinkState
            boolean r0 = r1.callEnding
            java.lang.String r9 = r1.callLinkToken
            r1 = r18
            r17 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AY.<init>(com.whatsapp.voipcalling.CallInfo):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3AY.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3AY r5 = (AnonymousClass3AY) obj;
            if (!(this.A0A == r5.A0A && this.A0C == r5.A0C && this.A0F == r5.A0F && this.A0D == r5.A0D && this.A0E == r5.A0E && this.A0B == r5.A0B && this.A01.equals(r5.A01) && this.A06 == r5.A06 && C34901l3.A00(this.A02, r5.A02) && C34901l3.A00(this.A03, r5.A03) && C34901l3.A00(this.A05, r5.A05) && C34901l3.A00(this.A04, r5.A04) && this.A07.equals(r5.A07) && this.A00 == r5.A00 && this.A09 == r5.A09 && this.A08 == r5.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        objArr[0] = this.A01;
        objArr[1] = Boolean.valueOf(this.A0A);
        objArr[2] = Boolean.valueOf(this.A0C);
        objArr[3] = this.A06;
        objArr[4] = Boolean.valueOf(this.A0F);
        objArr[5] = Boolean.valueOf(this.A0D);
        objArr[6] = this.A02;
        objArr[7] = this.A03;
        objArr[8] = this.A05;
        objArr[9] = this.A07;
        objArr[10] = Boolean.valueOf(this.A0E);
        objArr[11] = Boolean.valueOf(this.A0B);
        objArr[12] = this.A04;
        objArr[13] = Integer.valueOf(this.A00);
        objArr[14] = Boolean.valueOf(this.A09);
        return AnonymousClass000.A0F(this.A08, objArr, 15);
    }
}
