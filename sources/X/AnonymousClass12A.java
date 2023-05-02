package X;

import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.12A  reason: invalid class name */
public class AnonymousClass12A {
    public final C208811y A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C16000sG A03;
    public final C17140ub A04;
    public final AnonymousClass120 A05;
    public final C16290sm A06;
    public final C16460t6 A07;
    public final C19780yz A08;
    public final AnonymousClass10K A09;
    public final C17770vc A0A;
    public final C16320sq A0B;

    public AnonymousClass12A(C208811y r1, C14870pt r2, C16040sK r3, C16000sG r4, C17140ub r5, AnonymousClass120 r6, C16290sm r7, C16460t6 r8, C19780yz r9, AnonymousClass10K r10, C17770vc r11, C16320sq r12) {
        this.A01 = r2;
        this.A02 = r3;
        this.A0B = r12;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A0A = r11;
        this.A08 = r9;
        this.A05 = r6;
        this.A09 = r10;
        this.A06 = r7;
    }

    public void A00(C16010sH r4) {
        this.A05.A03(r4);
        if (this.A02.A0I((C15830rv) r4.A08(C15830rv.class)) && this.A09.A02.A0E(C16620tM.A02, 2413)) {
            this.A0B.Acl(new RunnableRunnableShape7S0100000_I0_6(this, 0));
        }
    }

    public void A01(C16010sH r3, int i2, int i3) {
        boolean A0I = this.A02.A0I(r3.A0E);
        r3.A04 = i2;
        r3.A05 = i3;
        if (A0I) {
            this.A06.A00.edit().putInt("profile_photo_full_id", i2).putInt("profile_photo_thumb_id", i3).apply();
            return;
        }
        r3.A0A = System.currentTimeMillis();
        this.A03.A0N(r3);
    }

    public void A02(C16010sH r4, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            try {
                File A002 = this.A05.A00(r4);
                if (A002 != null) {
                    AnonymousClass1XI.A0G(A002, bArr);
                    if (this.A02.A0I((C15830rv) r4.A08(C15830rv.class)) && this.A09.A02.A0E(C16620tM.A02, 2413)) {
                        this.A0B.Acl(new RunnableRunnableShape4S0200000_I0_2(this, 44, bArr));
                    }
                } else {
                    Log.e("ContactPhotoUpdater/updatePhotoFiles/no full photo file when expected");
                }
            } catch (IOException e2) {
                Log.e("ContactPhotoUpdater/updatePhotoFiles", e2);
                return;
            }
        }
        if (bArr2 != null) {
            File A012 = this.A05.A01(r4);
            if (A012 != null) {
                AnonymousClass1XI.A0G(A012, bArr2);
            } else {
                Log.e("ContactPhotoUpdater/updatePhotoFiles/no thumb photo file when expected");
            }
        }
    }

    public void A03(C15830rv r4) {
        this.A00.A01(new RunnableRunnableShape4S0200000_I0_2(this, 42, r4));
    }
}
