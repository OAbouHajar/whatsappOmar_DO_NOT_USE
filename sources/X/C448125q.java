package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.IDxFListenerShape90S0200000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.25q  reason: invalid class name and case insensitive filesystem */
public class C448125q {
    public C447925o A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final C19980zJ A04;
    public final C52932eg A05;
    public final AnonymousClass1P1 A06;
    public final LinkedAccountsMediaCard A07;
    public final AnonymousClass1KR A08;
    public final C35661mI A09;
    public final C35611mD A0A;
    public final AnonymousClass013 A0B;
    public final Integer A0C;
    public final boolean A0D;

    public C448125q(C19980zJ r2, C52932eg r3, AnonymousClass1P1 r4, LinkedAccountsMediaCard linkedAccountsMediaCard, AnonymousClass1KR r6, C35661mI r7, C35611mD r8, AnonymousClass013 r9, Integer num, int i2, boolean z2) {
        this.A07 = linkedAccountsMediaCard;
        this.A02 = i2;
        this.A0A = r8;
        this.A03 = linkedAccountsMediaCard.getContext();
        this.A06 = r4;
        this.A05 = r3;
        this.A0B = r9;
        this.A04 = r2;
        this.A0C = num;
        this.A09 = r7;
        this.A0D = z2;
        this.A08 = r6;
    }

    public final void A00() {
        C35571m9 r7;
        C35561m8 r2 = this.A0A.A02;
        if (r2 != null) {
            LinkedAccountsMediaCard linkedAccountsMediaCard = this.A07;
            if (linkedAccountsMediaCard.A06 != null) {
                int i2 = this.A02;
                if (i2 == 0) {
                    r7 = r2.A00;
                } else if (i2 == 1) {
                    r7 = r2.A01;
                } else {
                    return;
                }
                if (r7 != null) {
                    Uri A002 = AnonymousClass4Xp.A00(r7, i2);
                    C19980zJ r4 = this.A04;
                    Context context = this.A03;
                    AnonymousClass1KR r5 = this.A08;
                    String rawString = linkedAccountsMediaCard.A06.getRawString();
                    Integer num = this.A0C;
                    C35661mI r6 = this.A09;
                    AnonymousClass4Xp.A01(context, A002, r4, r5, r6, r7, num, rawString, i2, true, this.A0D);
                    int i3 = 23;
                    if (i2 == 0) {
                        i3 = 20;
                    }
                    r5.A02(r6, i3);
                }
            }
        }
    }

    public void A01(UserJid userJid) {
        UserJid userJid2;
        AnonymousClass4VS r2;
        int i2 = this.A02;
        AnonymousClass1P1 r1 = this.A06;
        synchronized (r1) {
            userJid2 = userJid;
            r2 = i2 == 0 ? (AnonymousClass4VS) r1.A00.get(userJid2) : (AnonymousClass4VS) r1.A01.get(userJid2);
        }
        String string = this.A03.getString(R.string.str0307);
        if (r2 != null) {
            List list = r2.A00;
            if (!list.isEmpty()) {
                LinkedAccountsMediaCard linkedAccountsMediaCard = this.A07;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                for (int i4 = 0; i4 < list.size() && i3 < 12; i4++) {
                    AnonymousClass4WG r10 = (AnonymousClass4WG) list.get(i4);
                    if (!r10.A03.isEmpty()) {
                        C35691mL r102 = (C35691mL) r10.A03.get(0);
                        i3++;
                        arrayList.add(new C54302hB((Drawable) null, new AnonymousClass3HB(r102, linkedAccountsMediaCard.A03, userJid2), new IDxFListenerShape90S0200000_2_I0(r102, 0, linkedAccountsMediaCard), (String) null, string, C47612Jr.A04(AnonymousClass1KX.A00(0, r102.A04))));
                    }
                }
                linkedAccountsMediaCard.A08(arrayList, Integer.MAX_VALUE);
                int i5 = R.drawable.ic_business_instagram;
                if (i2 == 0) {
                    i5 = R.drawable.ic_settings_fb;
                }
                ViewOnClickCListenerShape7S0100000_I0 viewOnClickCListenerShape7S0100000_I0 = new ViewOnClickCListenerShape7S0100000_I0((Object) this, 48);
                View openProfileView = linkedAccountsMediaCard.getOpenProfileView();
                openProfileView.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
                ((ImageView) C004601z.A0E(openProfileView, R.id.linked_account_icon)).setImageResource(i5);
                linkedAccountsMediaCard.A00.addView(openProfileView);
                return;
            }
        }
        LinkedAccountsMediaCard linkedAccountsMediaCard2 = this.A07;
        ViewOnClickCListenerShape0S0100000_I0 viewOnClickCListenerShape0S0100000_I0 = new ViewOnClickCListenerShape0S0100000_I0(this, 19);
        linkedAccountsMediaCard2.A00.removeAllViews();
        linkedAccountsMediaCard2.A07(viewOnClickCListenerShape0S0100000_I0, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(com.whatsapp.jid.UserJid r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            X.1P1 r2 = r3.A06
            monitor-enter(r2)
            if (r0 != 0) goto L_0x0016
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0013 }
            r1 = 0
            if (r0 == 0) goto L_0x0011
            r1 = 1
        L_0x0011:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            return r1
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0
        L_0x0016:
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0022 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0022 }
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r1 = 1
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C448125q.A02(com.whatsapp.jid.UserJid):boolean");
    }
}
