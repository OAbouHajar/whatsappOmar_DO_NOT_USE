package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.4Wy  reason: invalid class name and case insensitive filesystem */
public abstract class C87484Wy {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C15060qG A06;
    public C32481gS A07;
    public AnonymousClass5SM A08;
    public AnonymousClass4GD A09 = new AnonymousClass4GD();
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass4RM A0C = new AnonymousClass4RM();

    public void A00(boolean z2) {
        int i2;
        if (z2) {
            this.A09 = new AnonymousClass4GD();
            this.A04 = 0;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.A01 = i2;
        this.A05 = -1;
        this.A02 = 0;
    }

    public boolean A01(AnonymousClass4GD r7, C90504eH r8, long j2) {
        if (this instanceof C65453Uv) {
            C65453Uv r5 = (C65453Uv) this;
            boolean z2 = true;
            if (!r5.A00) {
                byte[] copyOf = Arrays.copyOf(r8.A02, r8.A00);
                List A002 = C806644z.A00(copyOf);
                C32471gR A0N = AnonymousClass3K4.A0N();
                A0N.A0R = "audio/opus";
                A0N.A04 = copyOf[9] & 255;
                A0N.A0D = 48000;
                A0N.A0S = A002;
                r7.A00 = new C32491gT(A0N);
                r5.A00 = true;
                return true;
            }
            if (r8.A07() != 1332770163) {
                z2 = false;
            }
            r8.A0S(0);
            return z2;
        }
        C65433Ut r3 = (C65433Ut) this;
        byte[] bArr = r8.A02;
        C90654eW r4 = r3.A00;
        if (r4 == null) {
            C90654eW r2 = new C90654eW(bArr, 17);
            r3.A00 = r2;
            r7.A00 = r2.A03((C93724jf) null, Arrays.copyOfRange(bArr, 9, r8.A00));
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & Byte.MAX_VALUE) == 3) {
            AnonymousClass4G8 A003 = AnonymousClass450.A00(r8);
            C90654eW A042 = r4.A04(A003);
            r3.A00 = A042;
            r3.A01 = new C96854p0(A003, A042);
            return true;
        } else if (b2 != -1) {
            return true;
        } else {
            C96854p0 r0 = r3.A01;
            if (r0 == null) {
                return false;
            }
            r0.A00 = j2;
            r7.A01 = r0;
            return false;
        }
    }
}
