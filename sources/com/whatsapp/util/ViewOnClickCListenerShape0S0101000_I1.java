package com.whatsapp.util;

import X.AnonymousClass1KX;
import X.AnonymousClass3SN;
import X.C004601z;
import X.C13680ns;
import X.C19980zJ;
import X.C34331k5;
import X.C35701mM;
import X.C455529g;
import X.C47612Jr;
import X.C54602hp;
import X.C64263Nl;
import X.C65103Sw;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.CatalogImageListActivity;
import com.obwhatsapp.CatalogMediaView;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

public class ViewOnClickCListenerShape0S0101000_I1 extends C34331k5 {
    public int A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape0S0101000_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public void A06(View view) {
        switch (this.A02) {
            case 0:
                Context context = view.getContext();
                AnonymousClass3SN r1 = (AnonymousClass3SN) this.A01;
                CatalogImageListActivity catalogImageListActivity = r1.A03;
                C35701mM r5 = catalogImageListActivity.A05;
                C54602hp r4 = r1.A02;
                int i2 = this.A00;
                UserJid userJid = catalogImageListActivity.A09;
                Intent intent = new Intent(context, CatalogMediaView.class);
                intent.putExtra("product", r5);
                intent.putExtra("target_image_index", i2);
                intent.putExtra("cached_jid", userJid.getRawString());
                C455529g.A07(context, intent, view);
                C455529g.A08(context, intent, view, r4, C47612Jr.A04(AnonymousClass1KX.A00(i2, r5.A0D)));
                return;
            case 1:
                C65103Sw r12 = (C65103Sw) this.A01;
                ThumbnailButton thumbnailButton = r12.A01;
                if (thumbnailButton.getTag(R.id.loaded_image_url) != null) {
                    CatalogCarouselDetailImageView catalogCarouselDetailImageView = r12.A02;
                    catalogCarouselDetailImageView.A03.A04(catalogCarouselDetailImageView.A07, 25, catalogCarouselDetailImageView.A02.A0D, 6);
                    String str = catalogCarouselDetailImageView.A02.A0D;
                    int i3 = this.A00;
                    thumbnailButton.setTag(AnonymousClass1KX.A00(i3, str));
                    Context context2 = catalogCarouselDetailImageView.getContext();
                    UserJid userJid2 = catalogCarouselDetailImageView.A07;
                    Intent A09 = C13680ns.A09();
                    A09.setClassName(context2.getPackageName(), "com.obwhatsapp.CatalogMediaView");
                    A09.putExtra("target_image_index", i3);
                    A09.putExtra("cached_jid", userJid2.getRawString());
                    A09.putExtra("product", catalogCarouselDetailImageView.A02);
                    C455529g.A07(catalogCarouselDetailImageView.getContext(), A09, thumbnailButton);
                    C455529g.A08(catalogCarouselDetailImageView.getContext(), A09, thumbnailButton, new C54602hp(catalogCarouselDetailImageView.getContext()), C47612Jr.A04(AnonymousClass1KX.A00(i3, catalogCarouselDetailImageView.A02.A0D)));
                    return;
                }
                return;
            case 2:
                C65103Sw r13 = (C65103Sw) this.A01;
                ThumbnailButton thumbnailButton2 = r13.A01;
                if (thumbnailButton2.getTag(R.id.loaded_image_url) != null) {
                    CatalogCarouselDetailImageView catalogCarouselDetailImageView2 = r13.A02;
                    catalogCarouselDetailImageView2.A03.A04(catalogCarouselDetailImageView2.A07, 25, catalogCarouselDetailImageView2.A02.A0D, 6);
                    Activity A022 = C19980zJ.A02(catalogCarouselDetailImageView2);
                    String str2 = catalogCarouselDetailImageView2.A02.A0D;
                    int i4 = this.A00;
                    C004601z.A0n(thumbnailButton2, C47612Jr.A04(AnonymousClass1KX.A00(i4, str2)));
                    Context context3 = catalogCarouselDetailImageView2.getContext();
                    UserJid userJid3 = catalogCarouselDetailImageView2.A07;
                    Intent A092 = C13680ns.A09();
                    A092.setClassName(context3.getPackageName(), "com.obwhatsapp.CatalogImageListActivity");
                    A092.putExtra("image_index", i4);
                    A092.putExtra("cached_jid", userJid3.getRawString());
                    A092.putExtra("product", catalogCarouselDetailImageView2.A02);
                    A022.startActivity(A092, C455529g.A05(A022, thumbnailButton2, C004601z.A0L(thumbnailButton2)));
                    return;
                }
                return;
            default:
                C64263Nl r14 = (C64263Nl) this.A01;
                r14.A00 = this.A00;
                r14.notifyDataSetChanged();
                return;
        }
    }
}
