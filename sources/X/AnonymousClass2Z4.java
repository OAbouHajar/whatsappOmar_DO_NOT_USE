package X;

import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2Z4  reason: invalid class name */
public final class AnonymousClass2Z4 {
    public final C14870pt A00;
    public final C16760tb A01;
    public final AnonymousClass01Y A02;
    public final C18260wP A03;
    public final C16000sG A04;
    public final C15810rt A05;
    public final AnonymousClass11A A06;
    public final AnonymousClass2Z3 A07;
    public final C17240ul A08;
    public final C17780vd A09;

    public AnonymousClass2Z4(C14870pt r2, C16760tb r3, AnonymousClass01Y r4, C18260wP r5, C16000sG r6, C15810rt r7, AnonymousClass11A r8, AnonymousClass2Z3 r9, C17240ul r10, C17780vd r11) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r7, 2);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r6, 4);
        C18450wi.A0H(r4, 5);
        C18450wi.A0H(r10, 6);
        C18450wi.A0H(r8, 8);
        C18450wi.A0H(r5, 10);
        this.A00 = r2;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A08 = r10;
        this.A09 = r11;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r5;
    }

    public final void A00(List list, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        if (i6 != -1) {
            C18260wP r2 = this.A03;
            if (!r2.A0A()) {
                this.A00.A09(R.string.str0474, 0);
                return;
            }
            List<C15830rv> list2 = list;
            int i7 = 0;
            for (C15830rv r6 : list2) {
                C15810rt r1 = this.A05;
                C16000sG r0 = this.A04;
                C18450wi.A0F(r6);
                if (C40491uD.A00(r0, r1, r6) == 0) {
                    i7++;
                }
                if (i6 != -1) {
                    if (!r2.A0A()) {
                        this.A00.A09(R.string.str0822, 1);
                    } else {
                        AnonymousClass00B.A06(r6);
                        boolean z2 = r6 instanceof UserJid;
                        if (!z2 || !this.A02.A0V((UserJid) r6)) {
                            boolean A0N = C16030sJ.A0N(r6);
                            if (A0N) {
                                C18450wi.A0F(r6);
                                C16050sL r14 = (C16050sL) r6;
                                this.A09.A07(new C40821uk(this.A06, this.A08, r14, (String) null, (List) null, 224), r14, i6);
                            } else if (z2) {
                                C18450wi.A0F(r6);
                                this.A01.A0K((UserJid) r6, i6);
                            } else {
                                C18450wi.A0F(r6);
                                Log.e(C18450wi.A06("Ephemeral not supported for this type of jid, type=", Integer.valueOf(r6.getType())));
                            }
                            AnonymousClass2Z3 r8 = this.A07;
                            C18450wi.A0H(r6, 0);
                            C75233rp r7 = new C75233rp();
                            r7.A02 = Long.valueOf((long) i6);
                            int i8 = i3;
                            r7.A03 = Long.valueOf(i8 == -1 ? 0 : (long) i8);
                            r7.A00 = 4;
                            r7.A04 = r8.A03.A03(r6.getRawString());
                            if (A0N) {
                                C16070sO r02 = r8.A00;
                                C16050sL A032 = C16050sL.A03(r6);
                                AnonymousClass00B.A06(A032);
                                C17380uz A042 = r02.A07.A04(A032).A04();
                                C18450wi.A0B(A042);
                                r7.A01 = Integer.valueOf(C40511uF.A02(A042));
                            }
                            r8.A02.A06(r7);
                        } else {
                            int i9 = R.string.str0831;
                            if (i2 == 0) {
                                i9 = R.string.str0830;
                            }
                            this.A00.A09(i9, 1);
                        }
                    }
                }
            }
            AnonymousClass2Z3 r12 = this.A07;
            int i10 = i5;
            r12.A01(list2, 3, i6, i7, i4, i10);
            if (list2.size() > 0) {
                r12.A00(2, i10);
            }
        }
    }
}
