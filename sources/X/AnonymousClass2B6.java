package X;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.IDxFunctionShape205S0100000_1_I0;
import com.facebook.redex.IDxFunctionShape206S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2B6  reason: invalid class name */
public class AnonymousClass2B6 {
    public C18940xV A00;
    public Boolean A01;
    public AtomicBoolean A02;
    public final AnonymousClass026 A03;
    public final AnonymousClass026 A04;
    public final AnonymousClass026 A05;
    public final AnonymousClass026 A06;
    public final AnonymousClass026 A07;
    public final AnonymousClass026 A08;
    public final AnonymousClass027 A09 = new AnonymousClass027();
    public final AnonymousClass027 A0A = new AnonymousClass027();
    public final AnonymousClass027 A0B = new AnonymousClass027();
    public final AnonymousClass027 A0C = new AnonymousClass027();
    public final AnonymousClass027 A0D = new AnonymousClass027();
    public final C16000sG A0E;
    public final C16080sP A0F;
    public final C16440t3 A0G;
    public final AnonymousClass17F A0H;
    public final C42391xi A0I;
    public final C42391xi A0J;
    public final C14710pd A0K;
    public final C16490t9 A0L;
    public final AnonymousClass17S A0M;
    public final C23221Ay A0N;

    public AnonymousClass2B6(AnonymousClass028 r11, AnonymousClass028 r12, AnonymousClass028 r13, AnonymousClass028 r14, C16000sG r15, C16080sP r16, C16440t3 r17, AnonymousClass013 r18, AnonymousClass17F r19, C14710pd r20, C16490t9 r21, AnonymousClass17S r22, C23221Ay r23, C23131Ap r24) {
        AnonymousClass026 r3 = new AnonymousClass026();
        this.A05 = r3;
        AnonymousClass026 r5 = new AnonymousClass026();
        this.A08 = r5;
        AnonymousClass026 r1 = new AnonymousClass026();
        this.A06 = r1;
        AnonymousClass026 r6 = new AnonymousClass026();
        this.A03 = r6;
        AnonymousClass026 r4 = new AnonymousClass026();
        this.A04 = r4;
        AnonymousClass026 r2 = new AnonymousClass026();
        this.A07 = r2;
        this.A02 = new AtomicBoolean();
        this.A00 = new IDxMObserverShape73S0100000_1_I0(this, 5);
        AnonymousClass013 r8 = r18;
        C42391xi r9 = new C42391xi(r8);
        r9.A01 = 100;
        this.A0I = r9;
        this.A0J = new C42391xi(r8);
        this.A0G = r17;
        this.A0K = r20;
        this.A0L = r21;
        this.A0E = r15;
        this.A0F = r16;
        this.A0H = r19;
        this.A0N = r23;
        this.A0M = r22;
        A0A(false);
        C23131Ap r7 = r24;
        r7.A00(new IDxFunctionShape205S0100000_1_I0(this, 5), r3, r1);
        r7.A00(new IDxFunctionShape206S0100000_2_I0(this, 2), r5, r6);
        r7.A00(new IDxFunctionShape205S0100000_1_I0(this, 4), r5, r4);
        r3.A0D(r2, new IDxObserverShape115S0100000_2_I0((Object) this, 240));
        r2.A0D(r12, new IDxObserverShape115S0100000_2_I0((Object) this, 243));
        r2.A0D(r11, new IDxObserverShape115S0100000_2_I0((Object) this, 244));
        r2.A0D(r13, new IDxObserverShape115S0100000_2_I0((Object) this, 241));
        r2.A0D(r14, new IDxObserverShape115S0100000_2_I0((Object) this, 242));
    }

    public AnonymousClass028 A00() {
        return this.A09;
    }

    public AnonymousClass028 A01() {
        return this.A03;
    }

    public AnonymousClass028 A02() {
        return this.A04;
    }

    public AnonymousClass028 A03() {
        return this.A0B;
    }

    public AnonymousClass028 A04() {
        return this.A0C;
    }

    public AnonymousClass028 A05() {
        return this.A0D;
    }

    public AnonymousClass028 A06() {
        return this.A06;
    }

    public final String A07() {
        List list;
        C42391xi r2 = this.A0I;
        String A022 = r2.A02();
        UserJid of = UserJid.of(r2.A04);
        if (of == null) {
            return A022;
        }
        C16010sH A0A2 = this.A0E.A0A(of);
        C16080sP r8 = this.A0F;
        List A032 = r2.A03();
        AnonymousClass01Q r0 = r2.A03;
        if (r0 == null || (list = (List) r0.A00) == null || list.isEmpty()) {
            Object obj = r2.A00().A00;
            AnonymousClass00B.A06(obj);
            list = (List) obj;
        }
        boolean z2 = false;
        if (list.size() % 2 == 0) {
            z2 = true;
        }
        AnonymousClass00B.A0C("tokenPositions.size must be even", z2);
        Iterator it = list.iterator();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        for (Object next : A032) {
            Object next2 = it.next();
            Object next3 = it.next();
            if (r8.A0T(A0A2, Collections.singletonList(next), true)) {
                arrayList.add(next2);
                arrayList.add(next3);
            }
        }
        arrayList.add(Integer.valueOf(A022.length()));
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Number number = (Number) it2.next();
            Number number2 = (Number) it2.next();
            if (number == null || number2 == null) {
                Log.e("messageSearchModel/invalid index in token mapping");
            } else if (!number.equals(number2)) {
                String trim = A022.subSequence(number.intValue(), number2.intValue()).toString().trim();
                if (trim.length() > 0) {
                    arrayList2.add(trim);
                }
            }
        }
        return TextUtils.join(" ", arrayList2);
    }

    public void A08() {
        Pair pair;
        if (!this.A02.get()) {
            AnonymousClass026 r3 = this.A07;
            if (r3.A01() != null) {
                Object obj = ((Pair) r3.A01()).first;
                Number number = (Number) ((Pair) r3.A01()).second;
                if (number != null) {
                    AnonymousClass027 r1 = this.A0A;
                    if (r1.A01() != null && ((Number) r1.A01()).intValue() != -1) {
                        pair = new Pair(obj, Integer.valueOf(number.intValue() + 1));
                    } else if (Boolean.TRUE.equals(obj)) {
                        pair = new Pair(Boolean.FALSE, 0);
                    } else {
                        return;
                    }
                    r3.A0B(pair);
                }
            }
        }
    }

    public void A09() {
        A0A(true);
    }

    public void A0A(boolean z2) {
        AnonymousClass027 r0 = this.A0C;
        Boolean bool = Boolean.TRUE;
        r0.A0B(bool);
        this.A06.A0B(new AnonymousClass2B9());
        AnonymousClass026 r2 = this.A07;
        if (!z2) {
            bool = null;
        }
        r2.A0B(new Pair(bool, 0));
        this.A08.A0B(this.A0J);
        this.A0I.A0F = true;
    }
}
