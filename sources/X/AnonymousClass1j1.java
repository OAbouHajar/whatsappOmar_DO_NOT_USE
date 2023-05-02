package X;

import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1j1  reason: invalid class name */
public class AnonymousClass1j1 extends C20380zx {
    public final C14870pt A00;
    public final C16040sK A01;
    public final AnonymousClass01Z A02;
    public final C24621Gq A03;
    public final AnonymousClass14W A04;
    public final AnonymousClass1CX A05;
    public final C24601Go A06;
    public final C16320sq A07;

    public AnonymousClass1j1(C14870pt r1, C16040sK r2, AnonymousClass01Z r3, C24621Gq r4, C20360zv r5, AnonymousClass14W r6, AnonymousClass1CX r7, C24601Go r8, C16320sq r9) {
        super(r5);
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r9;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final C34151jm A0A(C36931oL r7) {
        C36921oK r1 = r7.A01;
        C34151jm r5 = new C34151jm();
        String str = r1.A07;
        r5.A0D = str;
        r5.A0G = r1.A08;
        r5.A08 = r1.A04;
        r5.A0B = r1.A05;
        r5.A0C = r1.A06;
        r5.A03 = r1.A01;
        r5.A02 = r1.A00;
        r5.A06 = r1.A03;
        r5.A00 = (int) r1.A02;
        AnonymousClass1CX r3 = this.A05;
        AnonymousClass00B.A06(str);
        File A032 = r3.A06.A03(str);
        AnonymousClass00B.A06(A032);
        if (A032.exists() || ((A032 = r3.A05(r5, A032)) != null && A032.exists())) {
            r5.A09 = A032.getAbsolutePath();
            r5.A01 = 1;
            C37711pb.A00(r5);
            return r5;
        }
        StringBuilder sb = new StringBuilder("StickerRepository/setFileForFavoriteSticker download fail, fileHash=");
        sb.append(str);
        Log.w(sb.toString());
        return null;
    }

    public final void A0B(C34151jm r4, long j2) {
        if (!r4.A0H && this.A05.A0I(r4, Long.valueOf(j2), true, true)) {
            this.A00.A0K(new RunnableRunnableShape4S0200000_I0_2(this, 26, r4));
        }
    }

    public final void A0C(String str) {
        C24601Go r2 = this.A06;
        C34151jm A002 = r2.A00(str);
        if (A002 != null) {
            this.A02.A07(str);
            AnonymousClass00B.A00();
            r2.A01();
            C37751pf r1 = r2.A01;
            r1.A02(str, r1.A00(str));
            r2.A04.A04(str);
            this.A00.A0K(new RunnableRunnableShape4S0200000_I0_2(this, 27, A002));
        }
    }
}
