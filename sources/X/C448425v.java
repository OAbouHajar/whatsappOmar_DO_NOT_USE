package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.ui.media.MediaCard;
import com.obwhatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.25v  reason: invalid class name and case insensitive filesystem */
public abstract class C448425v extends C448525w {
    public View A00;
    public HorizontalScrollView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public AnonymousClass013 A0B;
    public C54222h0 A0C;

    public C448425v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C448425v(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A06(attributeSet);
    }

    public C60032zq A02(ViewGroup.LayoutParams layoutParams, C54302hB r5, int i2) {
        C60032zq r2 = new C60032zq(getContext());
        r2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r2.setLayoutParams(layoutParams);
        r2.A00 = (float) (i2 / 6);
        r2.A04 = getThumbnailTextGravity();
        r2.A01 = getThumbnailIconGravity();
        C004601z.A0n(r2, r5.A05);
        String str = r5.A04;
        if (str != null) {
            r2.A0A = str;
        }
        String str2 = r5.A03;
        if (str2 != null) {
            r2.setContentDescription(str2);
        }
        Drawable drawable = r5.A00;
        if (drawable != null) {
            r2.A08 = drawable;
        }
        r2.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(r5, 37));
        r5.A02.ARD(r2, i2);
        return r2;
    }

    public void A03() {
        this.A04.setVisibility(0);
        this.A00.setVisibility(8);
        this.A05.setVisibility(8);
        this.A06.setVisibility(8);
    }

    public void A04() {
        this.A04.setVisibility(8);
        this.A00.setVisibility(0);
        this.A05.setVisibility(0);
        this.A06.setVisibility(8);
    }

    public void A05(int i2, int i3) {
        if (i2 < 0) {
            i2 = this.A00.getPaddingLeft();
        }
        if (i3 < 0) {
            i3 = this.A00.getPaddingRight();
        }
        View view = this.A00;
        view.setPadding(i2, view.getPaddingTop(), i3, this.A00.getPaddingBottom());
        TextView textView = this.A06;
        textView.setPadding(i2, textView.getPaddingTop(), i3, this.A06.getPaddingBottom());
    }

    /* JADX INFO: finally extract failed */
    public void A06(AttributeSet attributeSet) {
        LayoutInflater.from(getContext()).inflate(R.layout.layout03c3, this, true);
        this.A0A = (TextView) C004601z.A0E(this, R.id.media_card_title);
        this.A08 = (TextView) C004601z.A0E(this, R.id.media_card_empty_title);
        this.A09 = (TextView) C004601z.A0E(this, R.id.media_card_info);
        this.A07 = (TextView) C004601z.A0E(this, R.id.media_card_empty_info);
        this.A00 = C004601z.A0E(this, R.id.title_container);
        this.A01 = (HorizontalScrollView) C004601z.A0E(this, R.id.media_card_scroller);
        this.A06 = (TextView) C004601z.A0E(this, R.id.media_card_error);
        this.A05 = (RelativeLayout) C004601z.A0E(this, R.id.media_card_thumb_container);
        this.A04 = (LinearLayout) C004601z.A0E(this, R.id.media_card_empty);
        this.A02 = (ImageView) C004601z.A0E(this, R.id.branding_img);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4BW.A07, 0, 0);
            try {
                String A0F = this.A0B.A0F(obtainStyledAttributes, 1);
                String A0F2 = this.A0B.A0F(obtainStyledAttributes, 0);
                obtainStyledAttributes.recycle();
                this.A0A.setText(A0F);
                C004601z.A0o(this.A0A, true);
                this.A08.setText(A0F);
                setMediaInfo(A0F2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public void A07(View.OnClickListener onClickListener, int i2) {
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            ArrayList arrayList = new ArrayList();
            mediaCardGrid.A03 = arrayList;
            for (int i3 = 0; i3 < i2; i3++) {
                int thumbnailPixelSize = mediaCardGrid.getThumbnailPixelSize();
                AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
                ThumbnailButton thumbnailButton = new ThumbnailButton(mediaCardGrid.getContext());
                thumbnailButton.setBackgroundResource(R.drawable.catalog_product_placeholder_background);
                thumbnailButton.setLayoutParams(layoutParams);
                thumbnailButton.A02 = mediaCardGrid.getResources().getDimension(R.dimen.dimen016c);
                arrayList = mediaCardGrid.A03;
                arrayList.add(thumbnailButton);
            }
            C64283Nn r1 = new C64283Nn(arrayList);
            mediaCardGrid.A02 = r1;
            mediaCardGrid.A00.setAdapter(r1);
            return;
        }
        MediaCard mediaCard = (MediaCard) this;
        int thumbnailPixelSize2 = mediaCard.getThumbnailPixelSize();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(thumbnailPixelSize2, thumbnailPixelSize2);
        int dimensionPixelSize = mediaCard.getResources().getDimensionPixelSize(R.dimen.dimen0528);
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        for (int i4 = 0; i4 < i2; i4++) {
            LinearLayout linearLayout = mediaCard.A00;
            ThumbnailButton thumbnailButton2 = new ThumbnailButton(mediaCard.getContext());
            thumbnailButton2.setBackgroundResource(R.drawable.catalog_product_placeholder_background);
            thumbnailButton2.setLayoutParams(layoutParams2);
            if (onClickListener != null) {
                thumbnailButton2.setOnClickListener(onClickListener);
            }
            linearLayout.addView(thumbnailButton2);
        }
        mediaCard.A01.setVisibility(0);
    }

    public void A08(List list, int i2) {
        if (list.size() == 0) {
            A03();
            return;
        }
        A04();
        int thumbnailPixelSize = getThumbnailPixelSize();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0528);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (this.A03 == null) {
            ImageView imageView = new ImageView(getContext());
            this.A03 = imageView;
            imageView.setBackgroundResource(R.drawable.selector_orange_gradient);
            this.A03.setLayoutParams(layoutParams);
            this.A03.setImageDrawable(new C447725m(AnonymousClass00T.A04(getContext(), R.drawable.group_info_chevron_right), this.A0B));
            this.A03.setContentDescription(getContext().getString(R.string.str1d08));
            this.A03.setScaleType(ImageView.ScaleType.CENTER);
            if (this.A0C != null) {
                this.A03.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 43));
            }
        }
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            ArrayList arrayList = mediaCardGrid.A03;
            if (arrayList == null) {
                mediaCardGrid.A03 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int size = list.size();
            if (size > 3) {
                int i3 = size;
                size = 6;
                if (i3 < 6) {
                    size = 3;
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                C60032zq A022 = mediaCardGrid.A02(new AbsListView.LayoutParams(thumbnailPixelSize, thumbnailPixelSize), (C54302hB) list.get(i4), thumbnailPixelSize);
                A022.A02 = mediaCardGrid.getResources().getDimension(R.dimen.dimen016c);
                mediaCardGrid.A03.add(A022);
            }
            if (mediaCardGrid.A02 == null) {
                C64283Nn r1 = new C64283Nn(mediaCardGrid.A03);
                mediaCardGrid.A02 = r1;
                mediaCardGrid.A00.setAdapter(r1);
            }
            mediaCardGrid.A02.notifyDataSetChanged();
            return;
        }
        MediaCard mediaCard = (MediaCard) this;
        mediaCard.A00.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mediaCard.A00.addView(mediaCard.A02(layoutParams, (C54302hB) it.next(), thumbnailPixelSize));
        }
        C45902Bo.A0E(mediaCard.A00, mediaCard.A0B);
        C45902Bo.A0D(mediaCard.A01, mediaCard.A0B);
        if (list.size() >= i2) {
            mediaCard.A00.addView(mediaCard.A03);
        }
        mediaCard.A01.setVisibility(0);
    }

    public String getError() {
        if (this.A06.getVisibility() == 0) {
            return this.A06.getText().toString();
        }
        return null;
    }

    public int getThumbnailIconGravity() {
        return 3;
    }

    public abstract int getThumbnailPixelSize();

    public int getThumbnailTextGravity() {
        return 5;
    }

    public void setCatalogBrandingDrawable(Drawable drawable) {
        ImageView imageView = this.A02;
        int i2 = 8;
        if (drawable != null) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        this.A02.setImageDrawable(drawable);
    }

    public void setError(String str) {
        this.A06.setText(str);
        this.A06.setVisibility(0);
    }

    public void setMediaInfo(String str) {
        this.A09.setText(str);
        this.A07.setText(str);
        if (!TextUtils.isEmpty(str)) {
            C45902Bo.A0F(this.A09, this.A0B);
            C45902Bo.A0F(this.A07, this.A0B);
        }
    }

    public void setSeeMoreClickListener(C54222h0 r4) {
        this.A0C = r4;
        ImageView imageView = this.A03;
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(r4, 42));
        }
        this.A0A.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(r4, 39));
        this.A09.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(r4, 41));
        this.A08.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(r4, 38));
        this.A07.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(r4, 40));
    }

    public void setSeeMoreColor(int i2) {
        TextView textView = this.A09;
    }

    public void setTitle(String str) {
        this.A0A.setText(str);
        this.A08.setText(str);
    }

    public void setTitleTextColor(int i2) {
        TextView textView = this.A0A;
    }

    public void setTopShadowVisibility(int i2) {
        setPadding(getPaddingLeft(), i2 == 0 ? getContext().getResources().getDimensionPixelSize(R.dimen.dimen0454) : 0, getPaddingRight(), getPaddingBottom());
    }
}
