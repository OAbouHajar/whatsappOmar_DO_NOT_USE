package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Sq  reason: invalid class name and case insensitive filesystem */
public abstract class C65043Sq extends C005602k {
    public C65043Sq(View view) {
        super(view);
    }

    public void A07(C82584Dj r12) {
        if (this instanceof C73203nT) {
            C73203nT r4 = (C73203nT) this;
            C18450wi.A0H(r12, 0);
            C73143nN r3 = (C73143nN) r12;
            AnonymousClass4N4 r2 = r3.A00;
            ((TextView) r4.A02.getValue()).setText(r2.A02);
            View view = r4.A0H;
            C13680ns.A1B(view, r4, r12, 34);
            C55352jN.A00(view);
            CategoryThumbnailLoader categoryThumbnailLoader = r4.A00;
            UserJid userJid = r3.A01;
            C35691mL r6 = r2.A00;
            C18450wi.A0A(r6);
            categoryThumbnailLoader.A00(r6, userJid, new C106395Dr(r4), new C106405Ds(r4), new AnonymousClass5FI(r4));
        } else if (this instanceof C73163nP) {
            ((ShimmerFrameLayout) ((C73163nP) this).A00.getValue()).A01();
        } else if (this instanceof C73183nR) {
            C73183nR r32 = (C73183nR) this;
            C18450wi.A0H(r12, 0);
            ((TextView) r32.A01.getValue()).setText(((C73133nM) r12).A00.A02);
            View view2 = r32.A0H;
            C13680ns.A1B(view2, r32, r12, 33);
            ((WaImageView) r32.A00.getValue()).A01 = true;
            C55352jN.A00(view2);
        } else if (this instanceof C73153nO) {
        } else {
            if (this instanceof C73193nS) {
                C73193nS r33 = (C73193nS) this;
                C18450wi.A0H(r12, 0);
                C73123nL r122 = (C73123nL) r12;
                AnonymousClass4N4 r1 = r122.A00;
                ((TextView) r33.A03.getValue()).setText(r1.A02);
                CategoryThumbnailLoader categoryThumbnailLoader2 = r33.A00;
                UserJid userJid2 = r122.A01;
                C35691mL r5 = r1.A00;
                C18450wi.A0A(r5);
                categoryThumbnailLoader2.A00(r5, userJid2, new C106315Dj(r33), new C106325Dk(r33), new AnonymousClass5FH(r33));
                return;
            }
            C73173nQ r34 = (C73173nQ) this;
            C18450wi.A0H(r12, 0);
            C73113nK r123 = (C73113nK) r12;
            AnonymousClass4N4 r13 = r123.A00;
            ((TextView) r34.A02.getValue()).setText(r13.A02);
            C55352jN.A00(r34.A0H);
            CategoryThumbnailLoader categoryThumbnailLoader3 = r34.A00;
            UserJid userJid3 = r123.A01;
            C35691mL r52 = r13.A00;
            C18450wi.A0A(r52);
            categoryThumbnailLoader3.A00(r52, userJid3, new C106275Df(r34), new C106285Dg(r34), new AnonymousClass5FG(r34));
        }
    }
}
