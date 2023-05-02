package com.obwhatsapp.ui.media;

import X.AnonymousClass01V;
import X.C004601z;
import X.C448425v;
import X.C64283Nn;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewStub;
import android.widget.GridView;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class MediaCardGrid extends C448425v {
    public GridView A00;
    public AnonymousClass01V A01;
    public C64283Nn A02;
    public ArrayList A03;
    public boolean A04;

    public MediaCardGrid(Context context) {
        this(context, (AttributeSet) null);
    }

    public MediaCardGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaCardGrid(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A03() {
        super.A03();
        this.A00.setVisibility(8);
    }

    public void A04() {
        super.A04();
        this.A00.setVisibility(0);
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        ViewStub viewStub = (ViewStub) C004601z.A0E(this, R.id.media_card_grid_stub);
        viewStub.setLayoutResource(R.layout.layout03c4);
        this.A00 = (GridView) viewStub.inflate();
    }

    public int getThumbnailPixelSize() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        AnonymousClass01V.A02(getContext()).getDefaultDisplay().getMetrics(displayMetrics);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen016d) << 1;
        return ((Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) - dimensionPixelSize) - (getResources().getDimensionPixelSize(R.dimen.dimen016e) << 1)) / 3;
    }

    public void setError(String str) {
        super.setError(str);
        this.A00.setVisibility(8);
    }
}
