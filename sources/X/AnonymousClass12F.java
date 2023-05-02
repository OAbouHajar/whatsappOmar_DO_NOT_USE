package X;

import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.redex.RunnableRunnableShape0S0500000_I0;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.12F  reason: invalid class name */
public class AnonymousClass12F implements C19420yP {
    public final AnonymousClass129 A00;
    public final AnonymousClass12E A01;
    public final C16300so A02;
    public final C208811y A03;
    public final C14870pt A04;
    public final C16040sK A05;
    public final AnonymousClass127 A06;
    public final C18930xU A07;
    public final C16000sG A08;
    public final C17140ub A09;
    public final AnonymousClass120 A0A;
    public final AnonymousClass12A A0B;
    public final C19230xz A0C;
    public final AnonymousClass12D A0D;
    public final C16980tz A0E;
    public final AnonymousClass126 A0F;
    public final AnonymousClass128 A0G;
    public final AnonymousClass12C A0H;
    public final C17190ug A0I;
    public final AnonymousClass124 A0J;
    public final C207811o A0K;
    public final C14850pr A0L;
    public final AnonymousClass125 A0M;
    public final AnonymousClass12B A0N;
    public final C17770vc A0O;
    public final C16320sq A0P;

    public AnonymousClass12F(AnonymousClass129 r2, AnonymousClass12E r3, C16300so r4, C208811y r5, C14870pt r6, C16040sK r7, AnonymousClass127 r8, C18930xU r9, C16000sG r10, C17140ub r11, AnonymousClass120 r12, AnonymousClass12A r13, C19230xz r14, AnonymousClass12D r15, C16980tz r16, AnonymousClass126 r17, AnonymousClass128 r18, AnonymousClass12C r19, C17190ug r20, AnonymousClass124 r21, C207811o r22, C14850pr r23, AnonymousClass125 r24, AnonymousClass12B r25, C17770vc r26, C16320sq r27) {
        this.A0E = r16;
        this.A04 = r6;
        this.A02 = r4;
        this.A05 = r7;
        this.A0P = r27;
        this.A0J = r21;
        this.A07 = r9;
        this.A0I = r20;
        this.A08 = r10;
        this.A03 = r5;
        this.A0L = r23;
        this.A0M = r24;
        this.A09 = r11;
        this.A0O = r26;
        this.A0F = r17;
        this.A06 = r8;
        this.A0A = r12;
        this.A0C = r14;
        this.A0G = r18;
        this.A00 = r2;
        this.A0B = r13;
        this.A0K = r22;
        this.A0N = r25;
        this.A0H = r19;
        this.A0D = r15;
        this.A01 = r3;
    }

    public int[] ACW() {
        return new int[]{25};
    }

    public boolean AHS(Message message, int i2) {
        boolean z2 = false;
        if (i2 != 25) {
            return false;
        }
        Message message2 = message;
        Parcelable parcelable = message2.getData().getParcelable("stanzaKey");
        AnonymousClass00B.A07(parcelable, "stanzaKey is null");
        C30641ci r6 = (C30641ci) parcelable;
        C28371Vv r7 = (C28371Vv) message2.obj;
        C28371Vv A0I2 = r7.A0I(0);
        C52282dU r2 = (C52282dU) this.A0K.A00(2, r6.A00);
        if (r2 != null) {
            r2.A00 = A0I2 != null ? A0I2.A00 : null;
            r2.A00(3);
        }
        if (A0I2 != null) {
            if (C28371Vv.A07(A0I2, "add")) {
                AnonymousClass00B.A0D("ContactUpdateNotificationHandler/handleContactAdd/add notification should only be sent to primary", !this.A05.A0G());
                byte[] bArr = A0I2.A01;
                C452927v r22 = new C452927v(C34861kz.A0F);
                r22.A02 = true;
                r22.A00 = C453027w.A09;
                r22.A02(bArr);
                this.A0C.A03(r22.A01(), true);
            } else if (C28371Vv.A07(A0I2, "remove")) {
                AnonymousClass00B.A0D("ContactUpdateNotificationHandler/handleContactRemove/remove notification should only be sent to primary", !this.A05.A0G());
                Jid A0F2 = A0I2.A0F(this.A02, UserJid.class, "jid");
                this.A0F.A01(new RunnableRunnableShape9S0200000_I0_7(this, 38, A0F2), 45);
                this.A0P.Acl(new RunnableRunnableShape1S0300000_I0_1(this, A0F2, r6, 47));
                z2 = true;
            } else if (C28371Vv.A07(A0I2, "update")) {
                String A0N2 = A0I2.A0N("hash", (String) null);
                if (A0N2 == null) {
                    C16300so r13 = this.A02;
                    UserJid userJid = (UserJid) A0I2.A0F(r13, UserJid.class, "jid");
                    C16000sG r10 = this.A08;
                    C16010sH A082 = r10.A08(userJid);
                    if (A082 != null) {
                        this.A03.A01(new RunnableRunnableShape1S0300000_I0_1(this, A082, userJid, 45));
                        AnonymousClass125 r72 = this.A0M;
                        if (!r72.A08(userJid)) {
                            r72.A02(userJid, 0);
                            this.A04.Acq(new RunnableRunnableShape9S0200000_I0_7(this, 39, userJid));
                        }
                        if (this.A01.A00().A01(userJid) && this.A0L.A00 != 3) {
                            r72.A05(userJid);
                        }
                        new C34591kW(r13, this.A0E, this.A0H, this.A0I, new C49442Te(this.A04, this.A07, r10, this.A09, this.A0P)).A00(userJid, A082.A0B);
                    }
                } else if (!TextUtils.isEmpty(A0N2)) {
                    byte[] decode = Base64.decode(A0N2.getBytes(), 0);
                    Arrays.toString(decode);
                    C452927v r1 = new C452927v(C34861kz.A0H);
                    r1.A02 = true;
                    r1.A00 = new C453027w(false, false, true, true, false, false, false, false, false);
                    r1.A02(decode);
                    this.A0C.A03(r1.A01(), true);
                }
            } else if (C28371Vv.A07(A0I2, "sync")) {
                long j2 = 0;
                long A012 = C29501aj.A01(A0I2.A0N("after", (String) null), 0) * 1000;
                long A013 = C29501aj.A01(r7.A0N("t", (String) null), 0) * 1000;
                C14870pt r73 = this.A04;
                RunnableRunnableShape12S0100000_I0_11 runnableRunnableShape12S0100000_I0_11 = new RunnableRunnableShape12S0100000_I0_11((Object) this, 34);
                if (A012 > A013 && A013 > 0) {
                    j2 = A012 - A013;
                }
                r73.A0L(runnableRunnableShape12S0100000_I0_11, j2);
            } else if (C28371Vv.A07(A0I2, "modify")) {
                long A014 = C29501aj.A01(r7.A0N("t", (String) null), 0) * 1000;
                Class<UserJid> cls = UserJid.class;
                C16300so r74 = this.A02;
                UserJid userJid2 = (UserJid) A0I2.A0F(r74, cls, "old");
                UserJid userJid3 = (UserJid) A0I2.A0F(r74, cls, "new");
                Class<AnonymousClass1ZX> cls2 = AnonymousClass1ZX.class;
                UserJid userJid4 = (UserJid) A0I2.A0F(r74, cls2, "old_lid");
                UserJid userJid5 = (UserJid) A0I2.A0F(r74, cls2, "new_lid");
                StringBuilder sb = new StringBuilder("contactupdatenotificationhandler/handleContactModify oldUserJid=");
                sb.append(userJid2);
                sb.append(" newUserJid=");
                sb.append(userJid3);
                Log.i(sb.toString());
                AnonymousClass129 r8 = this.A00;
                StringBuilder sb2 = new StringBuilder("ChangeNumberManager/onContactNumberChanged/oldPnJid=");
                sb2.append(userJid2);
                sb2.append("; newPnJid=");
                sb2.append(userJid3);
                sb2.append("/oldLidJid=");
                sb2.append(userJid4);
                sb2.append("; newLidJid=");
                sb2.append(userJid5);
                Log.i(sb2.toString());
                r8.A02(userJid2, userJid3, A014);
                if (!(userJid4 == null || userJid5 == null)) {
                    r8.A02(userJid4, userJid5, A014);
                    r8.A09.Acl(new RunnableRunnableShape0S0500000_I0(r8, userJid4, userJid5, userJid2, userJid3, 0));
                }
            }
            this.A0J.A02(r6);
            z2 = true;
        }
        if (!z2) {
            this.A0J.A02(r6);
            StringBuilder sb3 = new StringBuilder("ContactUpdateNotificationHandler/handleXmppMessage/handled-issue/operation was not handled: ");
            sb3.append(A0I2);
            Log.w(sb3.toString());
            this.A02.AcB("ContactUpdateNotificationHandler/handleXmppMessage", "handled-issue", true);
        }
        return true;
    }
}
