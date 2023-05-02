package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogMediaCard;
import com.obwhatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3F2  reason: invalid class name */
public class AnonymousClass3F2 implements AnonymousClass5TL, AnonymousClass1yY {
    public C35611mD A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C19980zJ A05;
    public final C14870pt A06;
    public final C16040sK A07;
    public final C17150uc A08;
    public final AnonymousClass1KY A09;
    public final C18640x1 A0A;
    public final C17170ue A0B;
    public final AnonymousClass1KA A0C;
    public final CatalogMediaCard A0D;
    public final C25821Lg A0E;
    public final AnonymousClass1KW A0F;
    public final AnonymousClass1GN A0G;
    public final C16320sq A0H;
    public final boolean A0I;

    public AnonymousClass3F2(C19980zJ r2, C14870pt r3, C16040sK r4, C17150uc r5, AnonymousClass1KY r6, C18640x1 r7, C17170ue r8, AnonymousClass1KA r9, CatalogMediaCard catalogMediaCard, C25821Lg r11, AnonymousClass1KW r12, AnonymousClass1GN r13, C16320sq r14, boolean z2) {
        this.A06 = r3;
        this.A07 = r4;
        this.A0G = r13;
        this.A05 = r2;
        this.A0E = r11;
        this.A0I = z2;
        this.A0B = r8;
        this.A0H = r14;
        this.A08 = r5;
        this.A0C = r9;
        this.A0A = r7;
        this.A09 = r6;
        this.A0D = catalogMediaCard;
        this.A04 = catalogMediaCard.getContext();
        this.A0F = r12;
        r6.A02(this);
    }

    public final void A00() {
        Activity A002 = C19980zJ.A00(this.A04);
        if (A002 instanceof AnonymousClass5MU) {
            C449726l r2 = (C449726l) ((AnonymousClass5MU) A002);
            r2.A0b.A01 = true;
            C13680ns.A13(r2.A0X);
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = r2.A0Y;
            if (ellipsizedTextEmojiLabel != null) {
                ellipsizedTextEmojiLabel.A00 = Integer.MAX_VALUE;
            }
        }
    }

    public void A4g() {
        if (!this.A03) {
            this.A0D.A0I.A07((View.OnClickListener) null, 3);
            this.A03 = true;
        }
    }

    public void A69() {
        this.A09.A03(this);
    }

    public void A8x(UserJid userJid, int i2) {
        this.A0C.A04(userJid, i2);
    }

    public int AFF(UserJid userJid) {
        return this.A0A.A00(userJid);
    }

    public C54312hC AGY(C35701mM r2, UserJid userJid, boolean z2) {
        return new AnonymousClass3HC(r2, this, userJid, z2);
    }

    public boolean AHU(UserJid userJid) {
        return this.A0A.A0H(userJid);
    }

    public void AIC(UserJid userJid) {
        if (this.A01 != null) {
            C448425v r2 = this.A0D.A0I;
            Context context = this.A04;
            r2.setTitle(context.getString(R.string.str03b8));
            r2.setTitleTextColor(AnonymousClass00T.A00(context, R.color.color0100));
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0644);
            r2.A05(dimensionPixelSize, dimensionPixelSize);
        }
        C448425v r1 = this.A0D.A0I;
        r1.setSeeMoreClickListener(new AnonymousClass52N(this, userJid));
        r1.setCatalogBrandingDrawable((Drawable) null);
    }

    public void AR2(UserJid userJid, int i2) {
        CatalogMediaCard catalogMediaCard = this.A0D;
        if (C34901l3.A00(catalogMediaCard.A0G, userJid) && !this.A0A.A0J(catalogMediaCard.A0G)) {
            Log.w(C13680ns.A0c(i2, "CatalogMediaCard/requestCatalogProductsFromBeginning/FetchFailed/Error: "));
            int i3 = R.string.str03c9;
            if (i2 != 406) {
                i3 = R.string.str03c7;
                if (i2 != 404) {
                    i3 = R.string.str03eb;
                    if (i2 == -1) {
                        i3 = R.string.str03c8;
                    }
                }
            }
            catalogMediaCard.setError(i3);
        }
    }

    public void AR3(UserJid userJid, boolean z2, boolean z3) {
        if (C34901l3.A00(this.A0D.A0G, userJid)) {
            ARC(userJid);
        }
    }

    public void ARC(UserJid userJid) {
        C18640x1 r5 = this.A0A;
        UserJid userJid2 = userJid;
        int A002 = r5.A00(userJid2);
        CatalogMediaCard catalogMediaCard = this.A0D;
        if (A002 != catalogMediaCard.A00) {
            catalogMediaCard.A00 = A002;
            boolean A0J = r5.A0J(userJid2);
            C35611mD r0 = this.A00;
            if (!A0J) {
                if (r0 != null && r0.A0L) {
                    UserJid userJid3 = r0.A04;
                    String str = r0.A0E;
                    ArrayList A0n = C13680ns.A0n(r0.A0G);
                    ArrayList A0n2 = C13680ns.A0n(r0.A0I);
                    String str2 = r0.A0B;
                    String str3 = r0.A0A;
                    C35551m7 r36 = r0.A03;
                    C35621mE r35 = r0.A00;
                    String str4 = r0.A05;
                    String str5 = r0.A0D;
                    String str6 = r0.A06;
                    boolean z2 = r0.A0J;
                    String str7 = r0.A0F;
                    boolean z3 = r0.A0K;
                    boolean z4 = r0.A0N;
                    C35561m8 r13 = r0.A02;
                    String str8 = r0.A09;
                    String str9 = r0.A08;
                    boolean z5 = r0.A0M;
                    C35581mA r9 = r0.A01;
                    ArrayList A0n3 = C13680ns.A0n(r0.A0H);
                    String str10 = r0.A07;
                    C35621mE r11 = r35;
                    C35581mA r12 = r9;
                    C35551m7 r14 = r36;
                    UserJid userJid4 = userJid3;
                    String str11 = str;
                    String str12 = str2;
                    this.A00 = new C35611mD(r11, r12, r13, r14, userJid4, str11, str12, str3, str4, str5, str6, str7, str8, str9, str10, r0.A0C, Collections.unmodifiableList(C13680ns.A0n(A0n)), Collections.unmodifiableList(C13680ns.A0n(A0n2)), Collections.unmodifiableList(C13680ns.A0n(A0n3)), false, z2, z3, z4, z5);
                    this.A0H.Acl(new RunnableRunnableShape12S0200000_I1(this, 44, userJid2));
                }
                Log.w("CatalogMediaCard/onFetchCatalogSuccess/Error: no products");
                catalogMediaCard.A0I.setError(this.A04.getString(R.string.str03c7));
                A00();
            } else {
                if (r0 != null && !r0.A0L) {
                    UserJid userJid5 = r0.A04;
                    String str13 = r0.A0E;
                    ArrayList A0n4 = C13680ns.A0n(r0.A0G);
                    ArrayList A0n5 = C13680ns.A0n(r0.A0I);
                    String str14 = r0.A0B;
                    String str15 = r0.A0A;
                    C35551m7 r362 = r0.A03;
                    C35621mE r352 = r0.A00;
                    String str16 = r0.A05;
                    String str17 = r0.A0D;
                    String str18 = r0.A06;
                    boolean z6 = r0.A0J;
                    String str19 = r0.A0F;
                    boolean z7 = r0.A0K;
                    boolean z8 = r0.A0N;
                    C35561m8 r132 = r0.A02;
                    String str20 = r0.A09;
                    String str21 = r0.A08;
                    boolean z9 = r0.A0M;
                    C35581mA r92 = r0.A01;
                    ArrayList A0n6 = C13680ns.A0n(r0.A0H);
                    String str22 = r0.A07;
                    C35621mE r112 = r352;
                    C35581mA r122 = r92;
                    C35551m7 r142 = r362;
                    UserJid userJid6 = userJid5;
                    String str23 = str13;
                    String str24 = str14;
                    this.A00 = new C35611mD(r112, r122, r132, r142, userJid6, str23, str24, str15, str16, str17, str18, str19, str20, str21, str22, r0.A0C, Collections.unmodifiableList(C13680ns.A0n(A0n4)), Collections.unmodifiableList(C13680ns.A0n(A0n5)), Collections.unmodifiableList(C13680ns.A0n(A0n6)), true, z6, z7, z8, z9);
                    this.A0H.Acl(new RunnableRunnableShape12S0200000_I1(this, 45, userJid2));
                }
                List A003 = catalogMediaCard.A00(userJid2, this.A04.getString(R.string.str030d), r5.A08(userJid2), this.A0I);
                if (A003.isEmpty()) {
                    A00();
                }
                catalogMediaCard.A0I.A08(A003, 5);
            }
            C35611mD r02 = this.A00;
            if (r02 == null || r02.A0L || r5.A0J(userJid2)) {
                catalogMediaCard.setVisibility(0);
            } else {
                catalogMediaCard.setVisibility(8);
            }
            if (!this.A02) {
                this.A02 = true;
            }
        }
    }

    public boolean AfH() {
        C35611mD r0 = this.A00;
        return r0 == null || !r0.A0L;
    }
}
