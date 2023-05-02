package com.obwhatsapp.biz.linkedaccounts;

import X.AnonymousClass013;
import X.AnonymousClass1KR;
import X.AnonymousClass1P0;
import X.AnonymousClass1P1;
import X.C004601z;
import X.C14870pt;
import X.C16150sX;
import X.C16320sq;
import X.C16440t3;
import X.C17210ui;
import X.C18260wP;
import X.C19980zJ;
import X.C25531Kd;
import X.C26781Pd;
import X.C35561m8;
import X.C35571m9;
import X.C35611mD;
import X.C35661mI;
import X.C447925o;
import X.C448125q;
import X.C448225r;
import X.C52932eg;
import X.C54302hB;
import X.C59472yL;
import X.C60032zq;
import X.C62723Er;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape274S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.ui.media.MediaCard;
import com.whatsapp.jid.UserJid;
import java.text.NumberFormat;
import java.util.Set;

public class LinkedAccountsMediaCard extends MediaCard {
    public int A00;
    public C19980zJ A01;
    public C52932eg A02;
    public C448125q A03;
    public C26781Pd A04;
    public AnonymousClass1P1 A05;
    public UserJid A06;
    public boolean A07;

    public LinkedAccountsMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinkedAccountsMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinkedAccountsMediaCard(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A06(attributeSet);
    }

    public C60032zq A02(ViewGroup.LayoutParams layoutParams, C54302hB r5, int i2) {
        C60032zq A022 = super.A02(layoutParams, r5, i2);
        A022.A02 = getResources().getDimension(R.dimen.dimen016c);
        return A022;
    }

    public void A06(AttributeSet attributeSet) {
        if (this.A00 == null) {
            super.A06(attributeSet);
            ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
            layoutParams.height = getThumbnailPixelSize();
            this.A00.setLayoutParams(layoutParams);
            this.A00 = getThumbnailPixelSize();
            ((TextView) C004601z.A0E(this, R.id.media_card_info)).setAllCaps(false);
            ((TextView) C004601z.A0E(this, R.id.media_card_empty_info)).setAllCaps(false);
            this.A04.A00 = this.A00;
        }
    }

    public void A09() {
        C447925o r1;
        C26781Pd r3 = this.A04;
        if (!r3.A02) {
            Set<C62723Er> set = r3.A0A;
            for (C62723Er A022 : set) {
                r3.A02(A022);
            }
            set.clear();
            C59472yL r12 = r3.A01;
            if (r12 != null) {
                r12.A02(false);
                r3.A01 = null;
            }
            r3.A02 = true;
        }
        C448125q r2 = this.A03;
        if (r2 != null && (r1 = r2.A00) != null && r2.equals(r1.A01)) {
            r1.A01 = null;
        }
    }

    public View getOpenProfileView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout0382, this, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0528);
        int i2 = this.A00;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        inflate.setLayoutParams(layoutParams);
        return C004601z.A0E(inflate, R.id.linked_account_open_profile_layout);
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.dimen04c2);
    }

    public void setup(UserJid userJid, boolean z2, C35611mD r26, int i2, Integer num, C35661mI r29, boolean z3, AnonymousClass1KR r31) {
        C35571m9 r0;
        UserJid userJid2 = userJid;
        if (!userJid2.equals(this.A06)) {
            this.A06 = userJid2;
            C19980zJ r12 = this.A01;
            C35661mI r17 = r29;
            AnonymousClass1KR r16 = r31;
            AnonymousClass013 r19 = this.A0B;
            this.A03 = new C448125q(r12, this.A02, this.A05, this, r16, r17, r26, r19, num, i2, z3);
            this.A00.removeAllViews();
            if (!z2 || !this.A03.A02(userJid2)) {
                C448125q r5 = this.A03;
                LinkedAccountsMediaCard linkedAccountsMediaCard = r5.A07;
                int i3 = r5.A02;
                Context context = r5.A03;
                int i4 = R.string.str1cec;
                if (i3 == 0) {
                    i4 = R.string.str1cc2;
                }
                linkedAccountsMediaCard.setTitle(context.getString(i4));
                C35561m8 r1 = r5.A0A.A02;
                if (r1 != null) {
                    if (i3 == 0) {
                        r0 = r1.A00;
                    } else if (i3 == 1) {
                        r0 = r1.A01;
                    }
                    if (r0 != null) {
                        int i5 = r0.A01;
                        String str = r0.A02;
                        if (i5 > 0) {
                            int i6 = R.plurals.plurals00bf;
                            if (i3 == 0) {
                                i6 = R.plurals.plurals0093;
                            }
                            String format = NumberFormat.getIntegerInstance(AnonymousClass013.A00(r5.A0B.A00)).format((long) i5);
                            String quantityString = context.getResources().getQuantityString(i6, i5, new Object[]{str, format});
                            int i7 = 35;
                            if (context.getResources().getDisplayMetrics().densityDpi <= 240) {
                                i7 = 25;
                            }
                            int length = quantityString.length();
                            if (length > i7) {
                                int i8 = length - i7;
                                int length2 = str.length();
                                if (i8 > length2) {
                                    str = "";
                                } else {
                                    String substring = str.substring(0, length2 - i8);
                                    if (substring.length() < length2) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(substring);
                                        sb.append("... ");
                                        str = sb.toString();
                                    }
                                }
                            }
                            str = context.getResources().getQuantityString(i6, i5, new Object[]{str, format});
                        }
                        linkedAccountsMediaCard.setMediaInfo(str);
                    }
                }
                linkedAccountsMediaCard.setSeeMoreClickListener(new IDxCListenerShape274S0100000_2_I0(r5, 0));
                C448125q r4 = this.A03;
                if (!r4.A01) {
                    r4.A07.A07((View.OnClickListener) null, 3);
                    r4.A01 = true;
                }
                C448125q r52 = this.A03;
                int i9 = this.A00;
                if (r52.A02(userJid2)) {
                    r52.A01(userJid2);
                    return;
                }
                C52932eg r13 = r52.A05;
                C448225r r7 = new C448225r(userJid2, i9, i9, r52.A02);
                C16150sX r14 = r13.A00.A03;
                C14870pt r42 = (C14870pt) r14.AB3.get();
                AnonymousClass1P1 r6 = (AnonymousClass1P1) r14.ADP.get();
                C17210ui r10 = (C17210ui) r14.A73.get();
                C18260wP r11 = (C18260wP) r14.A4p.get();
                C447925o r3 = new C447925o(r42, r52, r6, r7, (AnonymousClass1P0) r14.ADS.get(), (C25531Kd) r14.A2q.get(), r10, r11, (C16440t3) r14.AP2.get(), (C16320sq) r14.ARB.get());
                r52.A00 = r3;
                if (!r3.A08.A0A()) {
                    r3.A01(-1);
                    return;
                }
                r3.A0A.Acl(new RunnableRunnableShape4S0100000_I0_3(r3, 7));
                r3.A00 = System.currentTimeMillis();
                return;
            }
            this.A03.A01(userJid2);
        }
    }
}
