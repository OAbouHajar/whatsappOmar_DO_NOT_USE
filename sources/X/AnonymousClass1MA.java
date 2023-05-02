package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;

/* renamed from: X.1MA  reason: invalid class name */
public class AnonymousClass1MA {
    public final C14870pt A00;
    public final C18260wP A01;
    public final C16980tz A02;
    public final C16460t6 A03;
    public final AnonymousClass173 A04;
    public final C18340wX A05;
    public final C18300wT A06;
    public final AnonymousClass17Y A07;
    public final C18310wU A08;
    public final C18290wS A09;
    public final AnonymousClass1HB A0A;

    public AnonymousClass1MA(C14870pt r1, C18260wP r2, C16980tz r3, C16460t6 r4, AnonymousClass173 r5, C18340wX r6, C18300wT r7, AnonymousClass17Y r8, C18310wU r9, C18290wS r10, AnonymousClass1HB r11) {
        this.A00 = r1;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A06 = r7;
        this.A0A = r11;
        this.A08 = r9;
        this.A04 = r5;
        this.A01 = r2;
        this.A05 = r6;
        this.A07 = r8;
    }

    public void A00(AnonymousClass1TV r16, C228919r r17, String str, boolean z2) {
        AnonymousClass1W5 A002 = AnonymousClass1W5.A00();
        C35081lL[] r4 = new C35081lL[4];
        r4[0] = new C35081lL("action", "get-transaction");
        int i2 = 1;
        r4[1] = new C35081lL("id", str);
        if (!z2) {
            i2 = 2;
        }
        r4[2] = new C35081lL("version", i2);
        if (!A002.A00.get()) {
            r4[3] = new C35081lL("client-public-key", Base64.encodeToString(A002.A02, 10));
            C28371Vv r11 = new C28371Vv("account", r4);
            C18310wU r9 = this.A08;
            C1222969a ACC = r17.ACC();
            Context context = this.A02.A00;
            C14870pt r7 = this.A00;
            AnonymousClass1TV r2 = r16;
            r9.A0H(new AnonymousClass2HI(context, r2, this.A05, this, A002, ACC, r7, false), r11, "get", 0);
            return;
        }
        throw new IllegalStateException("key has been destroyed");
    }

    public void A01(AnonymousClass1TV r16, Integer num, Integer num2, String str, String str2) {
        C228919r A042;
        C1222969a r6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35081lL("action", "get-transactions"));
        String str3 = str;
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new C35081lL("after", str3));
        }
        if (num != null) {
            arrayList.add(new C35081lL("version", num.intValue()));
        }
        if (num2 != null) {
            arrayList.add(new C35081lL("limit", num2.intValue()));
        }
        AnonymousClass1W5 A002 = AnonymousClass1W5.A00();
        if (!A002.A00.get()) {
            arrayList.add(new C35081lL("client-public-key", Base64.encodeToString(A002.A02, 10)));
            C28371Vv r11 = new C28371Vv("account", (C35081lL[]) arrayList.toArray(new C35081lL[0]));
            String str4 = str2;
            boolean A0E = AnonymousClass1ZW.A0E(str4);
            C18290wS r0 = this.A09;
            if (A0E) {
                A042 = r0.A03();
            } else {
                A042 = r0.A04(str4);
                if (A042 == null) {
                    r6 = null;
                    AnonymousClass1TV r2 = r16;
                    this.A08.A0H(new AnonymousClass2HI(this.A02.A00, r2, this.A05, this, A002, r6, this.A00, true), r11, "get", 0);
                    return;
                }
            }
            r6 = A042.ACC();
            if (r6 != null) {
                r6.AgB();
            }
            AnonymousClass1TV r22 = r16;
            this.A08.A0H(new AnonymousClass2HI(this.A02.A00, r22, this.A05, this, A002, r6, this.A00, true), r11, "get", 0);
            return;
        }
        throw new IllegalStateException("key has been destroyed");
    }

    @Deprecated
    public void A02(AnonymousClass1TV r2, String str, boolean z2) {
        A00(r2, this.A09.A03(), str, z2);
    }
}
