package X;

import android.os.Build;
import com.obwhatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2ql  reason: invalid class name */
public class AnonymousClass2ql extends C003401n {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final AnonymousClass027 A03;
    public final AnonymousClass027 A04;
    public final AnonymousClass027 A05 = C13690nt.A0O();
    public final AnonymousClass027 A06;
    public final AnonymousClass027 A07;
    public final AnonymousClass027 A08;
    public final AnonymousClass027 A09;
    public final AnonymousClass027 A0A;
    public final AnonymousClass1KA A0B;
    public final C49992Xb A0C;
    public final C449626k A0D;
    public final C18260wP A0E;
    public final C15860rz A0F;
    public final UserJid A0G;
    public final AnonymousClass1KS A0H;
    public final C30801cy A0I;

    public AnonymousClass2ql(AnonymousClass1KA r7, C49992Xb r8, C449626k r9, C18260wP r10, C15860rz r11, UserJid userJid, AnonymousClass1KS r13, int i2) {
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A06 = A0O;
        AnonymousClass027 A0O2 = C13690nt.A0O();
        this.A09 = A0O2;
        AnonymousClass027 A0O3 = C13690nt.A0O();
        this.A04 = A0O3;
        AnonymousClass027 A0O4 = C13690nt.A0O();
        this.A08 = A0O4;
        AnonymousClass027 A0O5 = C13690nt.A0O();
        this.A03 = A0O5;
        this.A07 = C13690nt.A0O();
        this.A0A = C13690nt.A0O();
        this.A0I = C30801cy.A01();
        this.A0G = userJid;
        this.A0C = r8;
        this.A0D = r9;
        this.A0E = r10;
        this.A02 = i2;
        this.A0B = r7;
        this.A0F = r11;
        this.A0H = r13;
        r8.A01 = A0O;
        r8.A00 = A0O3;
        r8.A03 = A0O2;
        r9.A00 = A0O5;
        r8.A02 = A0O4;
    }

    public void A05(ProductDetailActivity productDetailActivity) {
        if (productDetailActivity.getIntent().getBooleanExtra("is_from_product_detail_screen", false)) {
            if (Build.VERSION.SDK_INT < 29) {
                productDetailActivity.onStateNotSaved();
            }
            this.A05.A0B(Boolean.TRUE);
            return;
        }
        productDetailActivity.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r0 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C35701mM r3, int r4) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L_0x001c
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x001c
            if (r4 != 0) goto L_0x001c
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x001c
            X.1mK r0 = r3.A01
            if (r0 == 0) goto L_0x001c
            int r0 = r0.A00
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ql.A06(X.1mM, int):boolean");
    }
}
