package X;

import android.os.SystemClock;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.Timer;

/* renamed from: X.27A  reason: invalid class name */
public class AnonymousClass27A {
    public static HashMap A0N = new HashMap();
    public long A00 = SystemClock.elapsedRealtime();
    public AnonymousClass5CT A01 = new AnonymousClass5CT(this);
    public Long A02;
    public boolean A03;
    public boolean A04;
    public byte[] A05;
    public byte[] A06;
    public final C14870pt A07;
    public final C16040sK A08;
    public final C16000sG A09;
    public final C17140ub A0A;
    public final AnonymousClass120 A0B;
    public final AnonymousClass12A A0C;
    public final C16440t3 A0D;
    public final C16460t6 A0E;
    public final C16070sO A0F;
    public final C19780yz A0G;
    public final C16490t9 A0H;
    public final C15830rv A0I;
    public final C211613a A0J;
    public final AnonymousClass121 A0K;
    public final AnonymousClass122 A0L;
    public final boolean A0M;

    public AnonymousClass27A(C14870pt r5, C16040sK r6, C16000sG r7, C17140ub r8, AnonymousClass120 r9, AnonymousClass12A r10, C16440t3 r11, C16460t6 r12, C16070sO r13, C19780yz r14, C16490t9 r15, C15830rv r16, C211613a r17, AnonymousClass121 r18, AnonymousClass122 r19, byte[] bArr, byte[] bArr2, boolean z2) {
        this.A0D = r11;
        this.A07 = r5;
        this.A08 = r6;
        this.A0H = r15;
        this.A0J = r17;
        this.A09 = r7;
        this.A0A = r8;
        this.A0E = r12;
        this.A0G = r14;
        this.A0B = r9;
        this.A0C = r10;
        this.A0K = r18;
        this.A0L = r19;
        this.A0F = r13;
        this.A0I = r16;
        this.A05 = bArr;
        this.A06 = bArr2;
        this.A0M = z2;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.A02 = valueOf;
        A0N.put(valueOf.toString(), this);
        new Timer().schedule(this.A01, 32000);
    }

    public static boolean A00(C15830rv r3) {
        if (r3 != null) {
            for (AnonymousClass27A r0 : A0N.values()) {
                if (r3.equals(r0.A0I)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A01(int i2) {
        C75113rd r4 = new C75113rd();
        byte[] bArr = this.A05;
        int i3 = 0;
        int length = bArr == null ? 0 : bArr.length;
        byte[] bArr2 = this.A06;
        if (bArr2 != null) {
            i3 = bArr2.length;
        }
        r4.A01 = Double.valueOf((double) (length + i3));
        r4.A03 = Long.valueOf(SystemClock.elapsedRealtime() - this.A00);
        r4.A02 = Integer.valueOf(i2);
        boolean z2 = this.A0M;
        r4.A00 = Boolean.valueOf(z2);
        this.A0H.A05(r4);
        if (z2) {
            C211613a r2 = this.A0J;
            C74573ql r1 = new C74573ql();
            r1.A00 = r2.A02;
            r1.A01 = r2.A03;
            r2.A05.A06(r1);
        }
    }

    public final void A02(C15830rv r3) {
        this.A0C.A05.A04(this.A09.A0A(r3));
        this.A0A.A04(r3);
    }

    public final void A03(C15830rv r4, int i2) {
        A02(r4);
        this.A0K.A0L.A00(r4, i2);
        C14870pt r2 = this.A07;
        boolean A0L2 = C16030sJ.A0L(r4);
        int i3 = R.string.str08d7;
        if (A0L2) {
            i3 = R.string.str08d4;
        }
        r2.A09(i3, 0);
    }
}
