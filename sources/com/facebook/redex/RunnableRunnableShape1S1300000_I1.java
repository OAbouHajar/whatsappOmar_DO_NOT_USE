package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass14O;
import X.AnonymousClass14R;
import X.AnonymousClass1KE;
import X.AnonymousClass2JT;
import X.AnonymousClass41H;
import X.AnonymousClass43C;
import X.AnonymousClass5S7;
import X.C102364yp;
import X.C106805Fg;
import X.C13680ns;
import X.C15830rv;
import X.C16030sJ;
import X.C16460t6;
import X.C16740tZ;
import X.C18450wi;
import X.C26571Oh;
import X.C28381Vw;
import X.C30011bb;
import X.C30591cd;
import X.C32121fg;
import X.C59142uk;
import X.C62003Bg;
import X.C75493sF;
import X.C87884Za;
import X.C93644jX;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.obwhatsapp.IDxTSpanShape14S0200000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;

public class RunnableRunnableShape1S1300000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape1S1300000_I1(int i2, String str, Object obj, Object obj2, Object obj3) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj3;
    }

    public void run() {
        String str;
        int i2;
        String A032;
        C26571Oh r4;
        String str2;
        boolean A1V;
        int i3;
        Integer valueOf;
        switch (this.A04) {
            case 0:
                try {
                    RunnableRunnableShape12S0200000_I1 runnableRunnableShape12S0200000_I1 = new RunnableRunnableShape12S0200000_I1(this, 26, C87884Za.A00(this.A03));
                    if (C62003Bg.A03()) {
                        runnableRunnableShape12S0200000_I1.run();
                        return;
                    } else {
                        C62003Bg.A00().post(runnableRunnableShape12S0200000_I1);
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    RunnableRunnableShape17S0100000_I1 runnableRunnableShape17S0100000_I1 = new RunnableRunnableShape17S0100000_I1((Object) this, 3);
                    if (C62003Bg.A03()) {
                        runnableRunnableShape17S0100000_I1.run();
                        return;
                    } else {
                        C62003Bg.A00().post(runnableRunnableShape17S0100000_I1);
                        return;
                    }
                }
            case 1:
                C59142uk r8 = (C59142uk) this.A00;
                Uri uri = (Uri) this.A01;
                String str3 = this.A03;
                View view = (View) this.A02;
                ClipboardManager A0B = r8.A08.A0B();
                if (A0B != null) {
                    try {
                        if ("wapay".equals(str3)) {
                            str = uri.getLastPathSegment();
                            i2 = R.string.str0f5e;
                        } else if ("tel".equals(str3)) {
                            str = uri.getSchemeSpecificPart();
                            i2 = R.string.str127e;
                            if (r8 instanceof IDxTSpanShape14S0200000_1_I0) {
                                IDxTSpanShape14S0200000_1_I0 iDxTSpanShape14S0200000_1_I0 = (IDxTSpanShape14S0200000_1_I0) r8;
                                if (1 - iDxTSpanShape14S0200000_1_I0.A02 == 0) {
                                    ((C30011bb) iDxTSpanShape14S0200000_1_I0.A00).A0i.A00(Boolean.valueOf(((C16740tZ) iDxTSpanShape14S0200000_1_I0.A01).A11.A02), (Boolean) null, 2);
                                }
                            }
                        } else {
                            str = r8.A09;
                            i2 = R.string.str0c1b;
                        }
                        Pair A0F = C13680ns.A0F(str, i2);
                        CharSequence charSequence = (CharSequence) A0F.first;
                        A0B.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
                        r8.A04 = false;
                        view.invalidate();
                        r8.A07.A09(AnonymousClass000.A0D(A0F.second), 0);
                        return;
                    } catch (NullPointerException | SecurityException e2) {
                        Log.e("linktouchablespan/copy/", e2);
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                C102364yp r5 = (C102364yp) this.A00;
                AnonymousClass2JT r0 = (AnonymousClass2JT) this.A01;
                String str4 = this.A03;
                AnonymousClass5S7 r3 = (AnonymousClass5S7) this.A02;
                AnonymousClass14R r2 = r0.A03;
                AnonymousClass14O r1 = r0.A02;
                if (r0.A00 == 0) {
                    if (r1 != null) {
                        C93644jX r12 = (C93644jX) r1.A00;
                        if (r12 != null) {
                            r12.A00 = str4;
                            r3.AR7(r12);
                            r5.A00.A01.A06(str4, r12);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (r2 != null) {
                    AnonymousClass1KE.A00(r5.A00, r3, str4, r2.A00, false);
                    return;
                }
                return;
            case 3:
                Throwable th = (Throwable) this.A01;
                String str5 = this.A03;
                Log.e(th);
                HashMap A0x = AnonymousClass000.A0x();
                A0x.put(-1, new C32121fg(AnonymousClass000.A0h(th.getLocalizedMessage(), AnonymousClass000.A0r("Failed to fetch metadata: "))));
                AnonymousClass1KE.A00(((C102364yp) this.A00).A00, (AnonymousClass5S7) this.A02, str5, A0x, true);
                return;
            case 4:
                CatalogAllCategoryViewModel catalogAllCategoryViewModel = (CatalogAllCategoryViewModel) this.A00;
                String str6 = this.A03;
                UserJid userJid = (UserJid) this.A01;
                AnonymousClass41H r22 = (AnonymousClass41H) this.A02;
                C18450wi.A0H(r22, 3);
                catalogAllCategoryViewModel.A04.A00(userJid, str6, new C106805Fg(r22, catalogAllCategoryViewModel, userJid));
                return;
            case 5:
                MessageRatingViewModel messageRatingViewModel = (MessageRatingViewModel) this.A00;
                String str7 = this.A03;
                Object obj = this.A02;
                C16740tZ A002 = C16460t6.A00(messageRatingViewModel.A03, new C28381Vw((C15830rv) this.A01, str7, false));
                if (A002 != null) {
                    A032 = C16030sJ.A03(A002.A0C());
                    r4 = messageRatingViewModel.A02;
                    str2 = A002 instanceof C30591cd ? ((C30591cd) A002).AGV().A04 : null;
                    A1V = AnonymousClass000.A1V(messageRatingViewModel.A04.A00(A002.A13));
                    int i4 = 1;
                    i3 = 1;
                    if (obj != AnonymousClass43C.LONG_PRESS) {
                        i4 = 2;
                    }
                    valueOf = Integer.valueOf(i4);
                    break;
                } else {
                    return;
                }
            default:
                MessageRatingViewModel messageRatingViewModel2 = (MessageRatingViewModel) this.A00;
                String str8 = this.A03;
                Object obj2 = this.A02;
                C16740tZ A003 = C16460t6.A00(messageRatingViewModel2.A03, new C28381Vw((C15830rv) this.A01, str8, false));
                if (A003 != null) {
                    A032 = C16030sJ.A03(A003.A0C());
                    r4 = messageRatingViewModel2.A02;
                    str2 = A003 instanceof C30591cd ? ((C30591cd) A003).AGV().A04 : null;
                    A1V = AnonymousClass000.A1V(messageRatingViewModel2.A04.A00(A003.A13));
                    i3 = C13680ns.A0a();
                    int i5 = 2;
                    if (obj2 == AnonymousClass43C.LONG_PRESS) {
                        i5 = 1;
                    }
                    valueOf = Integer.valueOf(i5);
                    break;
                } else {
                    return;
                }
        }
        C75493sF r13 = new C75493sF();
        r13.A05 = A032;
        r13.A02 = i3;
        r13.A03 = valueOf;
        r13.A01 = null;
        r13.A06 = str2;
        r13.A00 = Boolean.valueOf(A1V);
        r4.A00.A04(r13);
    }
}
