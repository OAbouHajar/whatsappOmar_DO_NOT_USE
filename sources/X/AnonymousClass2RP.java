package X;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.facebook.redex.IDxFListenerShape364S0100000_2_I0;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2RP  reason: invalid class name */
public class AnonymousClass2RP extends C003401n {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass027 A02;
    public final AnonymousClass027 A03;
    public final AnonymousClass027 A04;
    public final AnonymousClass027 A05;
    public final AnonymousClass027 A06;
    public final AnonymousClass027 A07;
    public final AnonymousClass027 A08;
    public final AnonymousClass027 A09;
    public final AnonymousClass027 A0A = new AnonymousClass027();
    public final AnonymousClass027 A0B;
    public final AnonymousClass027 A0C;
    public final C16760tb A0D;
    public final C19000xb A0E;
    public final C17150uc A0F;
    public final AnonymousClass1KZ A0G;
    public final AnonymousClass2RQ A0H;
    public final AnonymousClass2RR A0I;
    public final C17170ue A0J;
    public final AnonymousClass3F0 A0K;
    public final C17030uP A0L;
    public final C16080sP A0M;
    public final C16440t3 A0N;
    public final C14710pd A0O;
    public final UserJid A0P;
    public final C18630x0 A0Q;
    public final AnonymousClass1KW A0R;
    public final C16320sq A0S;

    public AnonymousClass2RP(C16760tb r13, C19000xb r14, C17150uc r15, AnonymousClass1KZ r16, AnonymousClass2RQ r17, AnonymousClass2RR r18, C17170ue r19, AnonymousClass3F0 r20, C17030uP r21, C16080sP r22, C16440t3 r23, C14710pd r24, UserJid userJid, C18630x0 r26, AnonymousClass1KW r27, C16320sq r28) {
        AnonymousClass027 r10 = new AnonymousClass027();
        this.A07 = r10;
        AnonymousClass027 r9 = new AnonymousClass027();
        this.A0B = r9;
        AnonymousClass027 r8 = new AnonymousClass027();
        this.A02 = r8;
        AnonymousClass027 r7 = new AnonymousClass027();
        this.A04 = r7;
        AnonymousClass027 r6 = new AnonymousClass027();
        this.A09 = r6;
        AnonymousClass027 r5 = new AnonymousClass027();
        this.A08 = r5;
        AnonymousClass027 r4 = new AnonymousClass027();
        this.A05 = r4;
        AnonymousClass027 r3 = new AnonymousClass027();
        this.A03 = r3;
        AnonymousClass027 r2 = new AnonymousClass027();
        this.A06 = r2;
        AnonymousClass027 r1 = new AnonymousClass027();
        this.A0C = r1;
        this.A01 = true;
        this.A0N = r23;
        this.A0O = r24;
        this.A0P = userJid;
        AnonymousClass2RR r11 = r18;
        this.A0I = r11;
        this.A0D = r13;
        this.A0E = r14;
        this.A0Q = r26;
        this.A0K = r20;
        this.A0M = r22;
        this.A0G = r16;
        this.A0L = r21;
        this.A0J = r19;
        this.A0F = r15;
        this.A0H = r17;
        this.A0S = r28;
        this.A0R = r27;
        r11.A05 = r10;
        r11.A00 = r8;
        r11.A08 = r9;
        r11.A07 = r6;
        r11.A02 = r7;
        r11.A06 = r5;
        r11.A03 = r4;
        r11.A09 = r1;
        r11.A01 = r3;
        r11.A04 = r2;
    }

    public final void A05(C000900k r13, AnonymousClass2W6 r14, C50262Yq r15, String str, String str2) {
        C35691mL r4;
        AnonymousClass4K8 r8 = (AnonymousClass4K8) this.A0B.A01();
        List list = r14.A08;
        if (!list.isEmpty()) {
            try {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass2W8 r1 = (AnonymousClass2W8) it.next();
                    if (r1 instanceof C50092Xx) {
                        List list2 = ((C50092Xx) r1).A00.A01.A06;
                        if (!list2.isEmpty() && (r4 = (C35691mL) list2.get(0)) != null && r8 != null && r8.A02 != null) {
                            C85154Ni r5 = new C85154Ni(r13, this, r8, str, str2, r14.A0E());
                            AnonymousClass3F0 r82 = this.A0K;
                            r82.A00 = r5;
                            r15.A01((ImageView) null, r4, new C100424vc(), (AnonymousClass4H5) null, new IDxFListenerShape364S0100000_2_I0(r82, 1), r82, 3);
                            return;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.A09.A09(Boolean.TRUE);
    }

    public void A06(BottomSheetDialogFragment bottomSheetDialogFragment, boolean z2) {
        UserJid userJid = this.A0P;
        AnonymousClass1KW r0 = this.A0R;
        Context A022 = bottomSheetDialogFragment.A02();
        if (!z2) {
            bottomSheetDialogFragment.A1C();
            return;
        }
        r0.A00();
        Intent A0T = C14750ph.A0T(A022, userJid, (Integer) null, 14);
        A0T.addFlags(603979776);
        A022.startActivity(A0T);
    }
}
