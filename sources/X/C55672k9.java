package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.ConversationListRowHeaderView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2k9  reason: invalid class name and case insensitive filesystem */
public abstract class C55672k9 extends C55682kA {
    public AnonymousClass01Q A00;
    public TextEmojiLabel A01;
    public C87244Vz A02;
    public C604131j A03;
    public C73953pO A04;
    public CharSequence A05;
    public final int A06;
    public final int A07;
    public final C85934Qo A08;
    public final C25781Lc A09;

    public C55672k9(Context context, C85934Qo r3, C25781Lc r4) {
        super(context);
        this.A09 = r4;
        this.A08 = r3;
        this.A06 = AnonymousClass00T.A00(context, R.color.color0505);
        this.A07 = AnonymousClass00T.A00(context, R.color.color0507);
        if (!(this instanceof AnonymousClass34G) && !(this instanceof AnonymousClass34E)) {
            A01();
        }
    }

    public static CharSequence A00(C16010sH r5, C16740tZ r6, C55682kA r7) {
        return C61963Bc.A01(r7.getContext(), r7.A04, r7.A06, r7.A09, r5, r6.A11.A02);
    }

    private void setTitleColorBasedOnQuery(List list) {
        C87244Vz r0;
        if (list == null || list.isEmpty()) {
            r0 = this.A02;
            int i2 = this.A07;
        } else {
            r0 = this.A02;
            int i3 = this.A06;
        }
        TextEmojiLabel textEmojiLabel = r0.A00.A00;
    }

    public abstract CharSequence A02(C16010sH r1, C16740tZ r2);

    public CharSequence A03(C16740tZ r10, List list) {
        String str;
        String str2;
        if (this instanceof AnonymousClass34M) {
            C30581cc r102 = (C30581cc) r10;
            if (((AnonymousClass34M) this) instanceof AnonymousClass34U) {
                str2 = r102.A13() == null ? "" : r102.A13();
                if (list != null && !"".equals(str2)) {
                    String str3 = C42171xL.A00((C14710pd) null, r102).A03;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (!str3.isEmpty() && str2.contains(str3)) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (str3.contains(AnonymousClass000.A0m(it))) {
                                int indexOf = str2.indexOf(str3);
                                if (indexOf == 0 || indexOf == str2.length() - str3.length()) {
                                    String str4 = r102.A06;
                                    String str5 = r102.A04;
                                    String A002 = C61863As.A00(str3);
                                    String[] A1b = C13690nt.A1b(str4, str5, 3);
                                    A1b[2] = A002;
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        int i2 = 0;
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        String A0m = AnonymousClass000.A0m(it2);
                                        while (true) {
                                            String str6 = A1b[i2];
                                            if (str6 != null && str6.contains(A0m)) {
                                                return str2.replace(str3, "");
                                            }
                                            i2++;
                                            if (i2 >= 3) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                str2 = "";
                if (r102.A0E().A00 != null) {
                    String str7 = r102.A0E().A00.A00;
                    if (!TextUtils.isEmpty(str7)) {
                        str2 = str7;
                    }
                    if (!TextUtils.isEmpty(r102.A0I())) {
                        StringBuilder A0r = AnonymousClass000.A0r("*");
                        A0r.append(r102.A0I());
                        A0r.append("*\n\n");
                        return AnonymousClass000.A0h(str2, A0r);
                    }
                } else if (r102.A13() != null) {
                    return r102.A13();
                }
            }
            return str2;
        }
        if (!(this instanceof AnonymousClass34P) && !(this instanceof AnonymousClass2k8)) {
            if (this instanceof AnonymousClass34T) {
                AnonymousClass34T r2 = (AnonymousClass34T) this;
                C16730tY r103 = (C16730tY) r10;
                String A012 = C42551xz.A01(r103);
                return (!TextUtils.isEmpty(A012) || ((A012 = r103.A13()) != null && !C42551xz.A04(r103))) ? A012 : r2.getDefaultMessageText();
            } else if (((AnonymousClass34O) this) instanceof AnonymousClass34G) {
                C30901d9 r104 = (C30901d9) r10;
                return (!(r104 instanceof C38841rV) || (str = ((C38841rV) r104).A03) == null) ? "" : str;
            }
        }
    }

    public void A04(C16010sH r6, C16010sH r7, C16740tZ r8, List list) {
        C87244Vz r0;
        int i2;
        this.A00 = new AnonymousClass01Q(Boolean.TRUE, r7);
        this.A02.A02(r6, AnonymousClass2TP.A02, list);
        this.A02.A02.A09(r6);
        setTitleColorBasedOnQuery(list);
        if (this instanceof AnonymousClass34T) {
            r0 = this.A02;
            i2 = 8;
        } else {
            AnonymousClass01Q r1 = new AnonymousClass01Q(C28961Zl.A0A(this.A09, this.A08.A02(r8.A0I), false), C28961Zl.A0A(this.A09, this.A08.A02(r8.A0I), true));
            ConversationListRowHeaderView conversationListRowHeaderView = this.A02.A00;
            conversationListRowHeaderView.A01.setText((CharSequence) r1.A00);
            conversationListRowHeaderView.A01.setContentDescription((CharSequence) r1.A01);
            r0 = this.A02;
            i2 = 0;
        }
        r0.A00.A01.setVisibility(i2);
        A06(r8, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r0 == null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C16740tZ r12, java.util.List r13) {
        /*
            r11 = this;
            X.3pO r0 = r11.A04
            if (r0 == 0) goto L_0x0007
            r0.A00()
        L_0x0007:
            X.31j r0 = r11.A03
            if (r0 == 0) goto L_0x000e
            r0.A00()
        L_0x000e:
            r8 = r13
            r11.setTitleColorBasedOnQuery(r13)
            X.0sG r1 = r11.A05
            X.1Vw r0 = r12.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            X.0sH r3 = r1.A07(r0)
            r2 = 0
            if (r3 == 0) goto L_0x0032
            X.0sK r0 = r11.A04
            X.0rv r1 = X.C61963Bc.A00(r0, r3, r12)
            if (r1 == 0) goto L_0x00ad
            X.0sG r0 = r11.A05
            X.0sH r0 = r0.A07(r1)
            if (r0 != 0) goto L_0x00ae
        L_0x0032:
            X.4Vz r0 = r11.A02
            r0.A01()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.01Q r0 = new X.01Q
            r0.<init>(r1, r2)
            r11.A00 = r0
            X.0sK r1 = r11.A04
            X.0sG r0 = r11.A05
            X.3pO r3 = new X.3pO
            r3.<init>(r1, r0, r12)
            r11.A04 = r3
            X.4Qo r2 = r11.A08
            r1 = 0
            com.facebook.redex.IDxCallbackShape46S0300000_2_I0 r0 = new com.facebook.redex.IDxCallbackShape46S0300000_2_I0
            r0.<init>(r12, r11, r13, r1)
            r2.A00(r0, r3)
            java.lang.CharSequence r7 = r11.A03(r12, r13)
        L_0x005a:
            android.content.Context r1 = r11.getContext()
            com.obwhatsapp.TextEmojiLabel r0 = r11.A01
            android.text.TextPaint r2 = r0.getPaint()
            com.obwhatsapp.TextEmojiLabel r0 = r11.A01
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            int r10 = r0.getMeasuredWidth()
            X.0um r5 = r11.A0A
            X.01V r3 = r11.A07
            X.013 r4 = r11.A09
            X.0u3 r6 = r11.A0B
            r9 = 3
            X.31j r0 = new X.31j
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A03 = r0
            r0 = 1
            com.facebook.redex.IDxCallbackShape46S0300000_2_I0 r5 = new com.facebook.redex.IDxCallbackShape46S0300000_2_I0
            r5.<init>(r12, r11, r13, r0)
            int r1 = r7.length()
            r0 = 768(0x300, float:1.076E-42)
            if (r1 > r0) goto L_0x00c0
            X.20g r10 = new X.20g
            r10.<init>(r7)
            int r9 = r7.length()
            r8 = 0
            r7 = 0
        L_0x0099:
            if (r7 >= r9) goto L_0x00b6
            r10.A00 = r7
            long r3 = com.obwhatsapp.emoji.EmojiDescriptor.A00(r10, r8)
            int r6 = r10.A01(r7, r3)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            int r7 = r7 + r6
            goto L_0x0099
        L_0x00ad:
            r0 = r2
        L_0x00ae:
            java.lang.CharSequence r7 = r11.A03(r12, r13)
            r11.A04(r3, r0, r12, r13)
            goto L_0x005a
        L_0x00b6:
            X.31j r0 = r11.A03
            java.lang.Object r0 = r0.call()     // Catch:{ 057 -> 0x00ce }
            r5.AOt(r0)     // Catch:{ 057 -> 0x00ce }
            return
        L_0x00c0:
            com.obwhatsapp.TextEmojiLabel r1 = r11.A01
            r0 = 80
            r1.setPlaceholder(r0)
            X.4Qo r1 = r11.A08
            X.31j r0 = r11.A03
            r1.A00(r5, r0)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55672k9.A05(X.0tZ, java.util.List):void");
    }

    public final void A06(C16740tZ r4, List list) {
        AnonymousClass01Q r2 = this.A00;
        if (r2 != null && Boolean.TRUE.equals(r2.A00) && this.A05 != null) {
            CharSequence A022 = C61963Bc.A02(AnonymousClass2TP.A01(getContext(), this.A09, A02((C16010sH) r2.A01, r4), list), this.A05);
            this.A01.setPlaceholder(0);
            if (TextUtils.isEmpty(A022)) {
                this.A01.setVisibility(8);
                return;
            }
            this.A01.setVisibility(0);
            this.A01.A0I((List) null, A022);
        }
    }

    public Paint getMessageViewPaint() {
        return this.A01.getPaint();
    }
}
