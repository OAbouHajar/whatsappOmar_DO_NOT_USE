package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass013;
import X.AnonymousClass3OZ;
import X.AnonymousClass4H8;
import X.AnonymousClass4N4;
import X.C004601z;
import X.C13680ns;
import X.C16150sX;
import X.C45902Bo;
import X.C52652eD;
import X.C71613ki;
import X.C84744Ls;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.redex.IDxBListenerShape285S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape268S0100000_2_I1;
import com.obwhatsapp.InfoCard;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;
import java.util.Iterator;
import java.util.List;

public class CategoryMediaCard extends InfoCard {
    public HorizontalScrollView A00;
    public LinearLayout A01;
    public AnonymousClass013 A02;
    public boolean A03;

    public CategoryMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public CategoryMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CategoryMediaCard(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        C13680ns.A0G(this).inflate(R.layout.layout00f9, this, true);
        this.A01 = (LinearLayout) C004601z.A0E(this, R.id.media_card_thumbs);
        this.A00 = (HorizontalScrollView) C004601z.A0E(this, R.id.media_card_scroller);
    }

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            this.A02 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public final AnonymousClass3OZ A02(C84744Ls r11) {
        AnonymousClass3OZ r3 = new AnonymousClass3OZ(getContext());
        ThumbnailButton thumbnailButton = (ThumbnailButton) C004601z.A0E(r3, R.id.category_thumbnail_image);
        thumbnailButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        thumbnailButton.A02 = getResources().getDimension(R.dimen.dimen016c);
        C004601z.A0n(thumbnailButton, (String) null);
        String str = r11.A03;
        if (str != null) {
            r3.setText(str);
        }
        Drawable drawable = r11.A00;
        if (drawable != null) {
            thumbnailButton.setImageDrawable(drawable);
        }
        C13680ns.A1A(r3, r11, 39);
        AnonymousClass4H8 r0 = r11.A02;
        if (r0 != null) {
            C71613ki r2 = r0.A01;
            AnonymousClass4N4 r1 = r0.A00;
            thumbnailButton.setTag(r1.A01);
            r2.A02.A02(thumbnailButton, r1.A00, new IDxBListenerShape285S0100000_2_I1(thumbnailButton, 2), new IDxSListenerShape268S0100000_2_I1(thumbnailButton, 2), 2);
        }
        return r3;
    }

    public void setError(String str) {
        this.A01.setVisibility(8);
    }

    public void setup(List list, C84744Ls r6) {
        HorizontalScrollView horizontalScrollView;
        int i2;
        if (list.size() == 0) {
            horizontalScrollView = this.A00;
            i2 = 8;
        } else {
            LinearLayout linearLayout = this.A01;
            linearLayout.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView(A02((C84744Ls) it.next()));
            }
            if (r6 != null) {
                AnonymousClass3OZ A022 = A02(r6);
                C004601z.A0E(A022, R.id.category_thumbnail_text_bg).setVisibility(8);
                linearLayout.addView(A022);
            }
            C45902Bo.A0E(linearLayout, this.A02);
            AnonymousClass013 r0 = this.A02;
            horizontalScrollView = this.A00;
            C45902Bo.A0D(horizontalScrollView, r0);
            i2 = 0;
        }
        horizontalScrollView.setVisibility(i2);
    }
}
