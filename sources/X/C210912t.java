package X;

import android.os.ConditionVariable;
import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;

/* renamed from: X.12t  reason: invalid class name and case insensitive filesystem */
public class C210912t implements C19170xs {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass12E A02;
    public final C14870pt A03;
    public final C16040sK A04;
    public final C18800xH A05;
    public final C16200sd A06;
    public final C19670yo A07;
    public final C19080xj A08;
    public final C210812s A09;
    public final C210712r A0A;
    public final AnonymousClass12W A0B;
    public final AnonymousClass01V A0C;
    public final C16440t3 A0D;
    public final C16980tz A0E;
    public final C15860rz A0F;
    public final AnonymousClass013 A0G;
    public final AnonymousClass2GV A0H = new AnonymousClass2GV();
    public final C16250si A0I;
    public final C14710pd A0J;
    public final C16490t9 A0K;
    public final C19490yW A0L;
    public final C16990u0 A0M;
    public final C16320sq A0N;
    public final AnonymousClass12P A0O;
    public final AnonymousClass01D A0P;

    public C210912t(AnonymousClass12E r3, C14870pt r4, C16040sK r5, C18800xH r6, C16200sd r7, C19670yo r8, C19080xj r9, C210812s r10, C210712r r11, AnonymousClass12W r12, AnonymousClass01V r13, C16440t3 r14, C16980tz r15, C15860rz r16, AnonymousClass013 r17, C16250si r18, C14710pd r19, C16490t9 r20, C19490yW r21, C16990u0 r22, C16320sq r23, AnonymousClass12P r24, AnonymousClass01D r25) {
        this.A0E = r15;
        this.A0D = r14;
        this.A0J = r19;
        this.A03 = r4;
        this.A0A = r11;
        this.A04 = r5;
        this.A0N = r23;
        this.A0K = r20;
        this.A0P = r25;
        this.A08 = r9;
        this.A0C = r13;
        this.A0G = r17;
        this.A0O = r24;
        this.A06 = r7;
        this.A05 = r6;
        this.A0B = r12;
        this.A0I = r18;
        this.A0F = r16;
        this.A09 = r10;
        C19490yW r1 = r21;
        this.A0L = r1;
        this.A0M = r22;
        this.A07 = r8;
        this.A02 = r3;
        r1.A02(new AnonymousClass2GW(r14, this));
    }

    public final void A00() {
        int i2;
        String str;
        C16990u0 r5 = this.A0M;
        synchronized (r5) {
            r5.A00 = true;
        }
        r5.A00("localbackupmanager/sendCreateBackupKeyIfNeeded/started", 2);
        if (C40691uX.A0E(this.A0E.A00)) {
            byte[] A0E2 = C004101u.A0E(16);
            byte[] A0G2 = C40691uX.A0G(A0E2);
            if (A0G2 != null) {
                ConditionVariable conditionVariable = new ConditionVariable(false);
                this.A05.A01(new RunnableRunnableShape8S0100000_I0_7(conditionVariable, 37), A0G2, A0E2, 1);
                r5.A00("localbackupmanager/backup/waiting-for-the-key", 2);
                if (!conditionVariable.block(32000)) {
                    i2 = 4;
                    str = "localbackupmanager/backup/backup-key-not-received";
                } else {
                    r5.A00("localbackupmanager/backup/key-received", 2);
                    return;
                }
            } else {
                i2 = 3;
                str = "localbackupmanager/backup/backup-key/null/account-hash/null";
            }
            r5.A00(str, i2);
        }
    }

    public void A01(AnonymousClass2Ga r14, long j2) {
        AnonymousClass2GV r8 = this.A0H;
        r8.A02(r14);
        AnonymousClass01D r10 = this.A0P;
        C19080xj r5 = this.A08;
        AnonymousClass01V r6 = this.A0C;
        C16250si r9 = this.A0I;
        this.A03.Acq(new RunnableRunnableShape6S0200000_I0_4(this, 37, new C46742Gb(this.A02, r5, r6, this, r8, r9, r10, j2)));
    }

    public final boolean A02(boolean z2) {
        C16040sK r1 = this.A04;
        r1.A0B();
        return r1.A00 != null && !r1.A0G() && this.A00 && z2 && !this.A0B.A02() && this.A09.A00.A02();
    }

    public void AS4() {
        if (A02(this.A0L.A00)) {
            AnonymousClass2GY r3 = new AnonymousClass2GY();
            r3.A04 = Long.valueOf(System.currentTimeMillis());
            r3.A03 = 2;
            A01(new AnonymousClass2GZ((ConditionVariable) null, this, r3), -1);
        }
    }
}
