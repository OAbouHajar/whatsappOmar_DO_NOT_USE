package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.biz.catalog.view.CategoryMediaCard;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3Sy  reason: invalid class name and case insensitive filesystem */
public abstract class C65123Sy extends C005602k {
    public C65123Sy(View view) {
        super(view);
    }

    public void A07() {
        if (this instanceof C71633kk) {
            this.A0H.clearAnimation();
        }
    }

    public void A08(C50082Xw r10) {
        CategoryMediaCard categoryMediaCard;
        if (this instanceof C71623kj) {
            C71623kj r2 = (C71623kj) this;
            C71553kc r102 = (C71553kc) r10;
            r2.A04.setText(r102.A00);
            int i2 = 0;
            r2.A00.setVisibility(C13680ns.A02(r102.A01 ? 1 : 0));
            WaButton waButton = r2.A02;
            if ("catalog_products_all_items_collection_id".equals(r102.A02)) {
                i2 = 8;
            }
            waButton.setVisibility(i2);
        } else if (this instanceof C71633kk) {
            ((C71633kk) this).A09();
        } else if (this instanceof C71583kf) {
            WaTextView waTextView = ((C71583kf) this).A00;
            waTextView.setText((CharSequence) null);
            waTextView.setContentDescription(waTextView.getContext().getString(R.string.str130d, AnonymousClass000.A1a((Object) null)));
        } else if (this instanceof C71593kg) {
            C71593kg r5 = (C71593kg) this;
            C71533ka r103 = (C71533ka) r10;
            Resources A0D = C13680ns.A0D(r5.A0H);
            Object[] A1b = C13680ns.A1b();
            A1b[0] = r103.A01;
            r5.A01.setText(A0D.getString(R.string.str03cf, A1b));
            r5.A00.setText(r103.A00);
        } else {
            if (this instanceof C71613ki) {
                C71613ki r6 = (C71613ki) this;
                List list = ((C71513kY) r10).A00;
                if (list != null && !list.isEmpty()) {
                    LinkedList linkedList = new LinkedList();
                    int i3 = 0;
                    while (i3 < list.size()) {
                        AnonymousClass4N4 r0 = (AnonymousClass4N4) list.get(i3);
                        linkedList.add(new C84744Ls((Drawable) null, new C100584vs(r0, r6, i3), new AnonymousClass4H8(r0, r6), r0.A02));
                        i3++;
                        if (i3 >= 6) {
                            break;
                        }
                    }
                    C84744Ls r4 = null;
                    if (list.size() > 6) {
                        CategoryMediaCard categoryMediaCard2 = r6.A03;
                        r4 = new C84744Ls(AnonymousClass00T.A04(categoryMediaCard2.getContext(), R.drawable.catalog_product_placeholder_background), new C100574vr(r6), (AnonymousClass4H8) null, categoryMediaCard2.getContext().getString(R.string.str03c2));
                    }
                    CategoryMediaCard categoryMediaCard3 = r6.A03;
                    categoryMediaCard3.setup(linkedList, r4);
                    categoryMediaCard = categoryMediaCard3;
                } else {
                    return;
                }
            } else if (this instanceof C71603kh) {
                categoryMediaCard = ((C71603kh) this).A00;
            } else {
                return;
            }
            categoryMediaCard.setVisibility(0);
        }
    }
}
