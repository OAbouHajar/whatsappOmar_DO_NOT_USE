package X;

import com.facebook.redex.IDxNConsumerShape39S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.obwhatsapp.R;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.1Ot  reason: invalid class name and case insensitive filesystem */
public class C26691Ot {
    public final C16300so A00;
    public final C16180sb A01;
    public final C14870pt A02;
    public final C16440t3 A03;
    public final C16460t6 A04;
    public final C19150xq A05;
    public final C16320sq A06;
    public final Map A07 = new HashMap();

    public C26691Ot(C16300so r2, C16180sb r3, C14870pt r4, C16440t3 r5, C16460t6 r6, C19150xq r7, C16320sq r8) {
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A06 = r8;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
    }

    public void A00(C16730tY r12) {
        byte b2 = r12.A10;
        long A022 = this.A03.A02(r12.A0I);
        String str = r12.A05;
        if (str == null) {
            this.A06.Acl(new RunnableRunnableShape8S0200000_I0_6(this, 26, r12));
            return;
        }
        C16300so r5 = this.A00;
        C16320sq r6 = this.A06;
        int i2 = r12.A08;
        ArrayList arrayList = new ArrayList(3);
        C16180sb r1 = this.A01;
        arrayList.add(r1.A0C(b2, i2, 2));
        arrayList.add(r1.A0C(b2, i2, 1));
        arrayList.add(r1.A0C(b2, i2, 3));
        C59322x3 r4 = new C59322x3(r5, r6, str, arrayList, A022);
        this.A07.put(r12, r4);
        C16750ta r2 = r12.A02;
        AnonymousClass00B.A06(r2);
        r2.A0Z = true;
        r2.A0C = 0;
        this.A05.A08(r12, -1);
        IDxNConsumerShape39S0200000_2_I0 iDxNConsumerShape39S0200000_2_I0 = new IDxNConsumerShape39S0200000_2_I0(r12, 10, this);
        Executor executor = this.A02.A06;
        r4.A01(iDxNConsumerShape39S0200000_2_I0, executor);
        r4.A00.A03(new IDxNConsumerShape39S0200000_2_I0(r12, 11, this), executor);
        r6.Acl(r4);
    }

    public final void A01(C16730tY r4, Throwable th) {
        this.A07.remove(r4);
        C16750ta r1 = r4.A02;
        AnonymousClass00B.A06(r1);
        r1.A0Z = false;
        this.A05.A08(r4, -1);
        if (th instanceof FileNotFoundException) {
            this.A02.A07(R.string.str0bad, 1);
        }
    }
}
