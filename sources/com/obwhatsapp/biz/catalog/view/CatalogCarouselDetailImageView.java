package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass006;
import X.AnonymousClass1KZ;
import X.AnonymousClass4D4;
import X.AnonymousClass4H5;
import X.AnonymousClass4H7;
import X.C16150sX;
import X.C16320sq;
import X.C17170ue;
import X.C35701mM;
import X.C50262Yq;
import X.C52652eD;
import X.C52662eE;
import X.C57432rA;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

public class CatalogCarouselDetailImageView extends FrameLayout implements AnonymousClass006 {
    public RecyclerView A00;
    public AnonymousClass1KZ A01;
    public C35701mM A02;
    public C17170ue A03;
    public C50262Yq A04;
    public CarouselScrollbarView A05;
    public C57432rA A06;
    public UserJid A07;
    public C16320sq A08;
    public C52662eE A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public CatalogCarouselDetailImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0A) {
            this.A0A = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A08 = C16150sX.A1B(A002);
            this.A03 = C16150sX.A0A(A002);
        }
    }

    /* access modifiers changed from: private */
    public AnonymousClass4H5 getImageLoadContext() {
        UserJid userJid = this.A07;
        if (userJid != null) {
            return new AnonymousClass4H5(new AnonymousClass4D4(897460107), userJid);
        }
        return null;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A09;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setImageAndGradient(AnonymousClass4H7 r4, boolean z2, ThumbnailButton thumbnailButton, Bitmap bitmap, View view) {
        view.setBackground(new GradientDrawable(z2 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.TOP_BOTTOM, new int[]{r4.A01, r4.A00}));
        thumbnailButton.setImageBitmap(bitmap);
    }
}
