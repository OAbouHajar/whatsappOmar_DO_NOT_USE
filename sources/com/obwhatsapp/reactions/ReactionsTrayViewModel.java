package com.obwhatsapp.reactions;

import X.AnonymousClass2OJ;
import X.C003401n;
import X.C14710pd;
import X.C16040sK;
import X.C16740tZ;
import X.C17020u3;
import X.C27641So;
import X.C56082kw;
import java.util.Arrays;
import java.util.List;

public class ReactionsTrayViewModel extends C003401n {
    public static final int A0B;
    public static final List A0C;
    public int A00;
    public int A01 = 0;
    public C16740tZ A02;
    public List A03 = A0C;
    public boolean A04;
    public final C16040sK A05;
    public final C14710pd A06;
    public final C17020u3 A07;
    public final C27641So A08;
    public final AnonymousClass2OJ A09 = new AnonymousClass2OJ(-1);
    public final AnonymousClass2OJ A0A = new AnonymousClass2OJ(new C56082kw((String) null, (String) null, false));

    static {
        List asList = Arrays.asList(new String[]{"👍", "❤️", "😂", "😮", "😢", "🙏"});
        A0C = asList;
        A0B = asList.size();
    }

    public ReactionsTrayViewModel(C16040sK r4, C14710pd r5, C17020u3 r6, C27641So r7) {
        this.A06 = r5;
        this.A05 = r4;
        this.A08 = r7;
        this.A07 = r6;
    }

    public void A05(int i2) {
        if (i2 == 0) {
            boolean z2 = false;
            if (((Number) this.A09.A01()).intValue() == 2) {
                z2 = true;
            }
            this.A04 = z2;
        }
        AnonymousClass2OJ r1 = this.A09;
        if (((Number) r1.A01()).intValue() == i2) {
            return;
        }
        if (i2 != 1) {
            r1.A0B(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Use setDisplayStateToTrayOpen instead of setDisplayState(DisplayState.TRAY_OPEN)");
    }

    public void A06(String str) {
        A05(0);
        AnonymousClass2OJ r3 = this.A0A;
        if (!str.equals(((C56082kw) r3.A01()).A00)) {
            r3.A0B(new C56082kw(((C56082kw) r3.A01()).A00, str, true));
        }
    }
}
