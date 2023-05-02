package com.obwhatsapp.storage;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass2BE;
import X.AnonymousClass2OM;
import X.AnonymousClass2OV;
import X.AnonymousClass2SR;
import X.AnonymousClass32B;
import X.AnonymousClass3OB;
import X.C102144yT;
import X.C23651Cv;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C54502hd;
import X.C94154kS;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.redex.IDxBRecipientShape14S0400000_2_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.R;
import java.util.List;

public class StorageUsageMediaPreviewView extends LinearLayout implements AnonymousClass006 {
    public static final Bitmap A0B = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public int A00;
    public C23651Cv A01;
    public C52662eE A02;
    public String A03;
    public List A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Drawable A09;
    public final AnonymousClass2OM A0A;

    public StorageUsageMediaPreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A05) {
            this.A05 = true;
            this.A01 = (C23651Cv) ((C52652eD) ((C52642eC) generatedComponent())).A07.A1k.get();
        }
        setOrientation(0);
        this.A08 = getResources().getDimensionPixelSize(R.dimen.dimen07be);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.dimen07bd);
        int A002 = AnonymousClass00T.A00(getContext(), R.color.color0457);
        this.A07 = A002;
        this.A09 = new ColorDrawable(A002);
        this.A0A = new AnonymousClass2OM(context.getContentResolver(), new Handler(Looper.getMainLooper()), this.A01, "storage-usage-media-preview");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.A04 != null && this.A03 != null) {
            post(new RunnableRunnableShape15S0100000_I0_14(this, 25));
        }
    }

    public void setPreviewMediaItems(List list, int i2, String str) {
        this.A04 = list;
        this.A00 = i2;
        this.A03 = str;
        removeAllViews();
        if (list.size() == 0) {
            return;
        }
        if (getMeasuredWidth() == 0) {
            addOnLayoutChangeListener(new C94154kS(this, str, list, i2));
        } else {
            setPreviewMediaItemsInternal(list, i2, str);
        }
    }

    public final void setPreviewMediaItemsInternal(List list, int i2, String str) {
        ViewGroup.LayoutParams layoutParams;
        C54502hd r2;
        int measuredWidth = getMeasuredWidth();
        int i3 = this.A06;
        int i4 = (measuredWidth + (i3 >> 1)) / i3;
        int measuredWidth2 = getMeasuredWidth();
        int i5 = this.A08;
        int i6 = (measuredWidth2 - ((i4 - 1) * i5)) / i4;
        List list2 = list;
        int min = Math.min(list2.size(), i4);
        Drawable A042 = AnonymousClass00T.A04(getContext(), R.drawable.balloon_incoming_frame);
        int A002 = AnonymousClass00T.A00(getContext(), R.color.color065f);
        AnonymousClass00B.A06(A042);
        Drawable A062 = AnonymousClass2SR.A06(A042, A002);
        for (int i7 = 0; i7 < min; i7++) {
            AnonymousClass2BE r3 = (AnonymousClass2BE) list2.get(i7);
            if (i7 != min - 1 || i2 <= min) {
                AnonymousClass32B r22 = new AnonymousClass32B(getContext());
                r22.A00 = 3;
                r22.setFrameDrawable(A062);
                addView(r22);
                layoutParams = r22.getLayoutParams();
                r2 = r22;
            } else {
                C54502hd r23 = new C54502hd(getContext());
                AnonymousClass3OB r14 = new AnonymousClass3OB(getContext());
                int i8 = i2 - min;
                C54502hd r0 = r14.A00;
                if (r0 != null) {
                    r14.removeView(r0);
                }
                r14.addView(r23, 0);
                r14.A00 = r23;
                r14.A03.setText(r14.getContext().getString(R.string.str16ff, new Object[]{Integer.valueOf(i8)}));
                r14.setFrameDrawable(A062);
                addView(r14);
                layoutParams = r14.getLayoutParams();
                r2 = r23;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i7 != 0) {
                marginLayoutParams.leftMargin = i5;
            }
            marginLayoutParams.width = i6;
            marginLayoutParams.height = i6;
            r2.setMediaItem(r3);
            r2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            r2.setSelector((Drawable) null);
            AnonymousClass2OM r1 = this.A0A;
            r1.A01((AnonymousClass2OV) r2.getTag());
            C102144yT r02 = new C102144yT(r3, this, str, i6);
            r2.setTag(r02);
            AnonymousClass2BE r12 = r3;
            r1.A02(r02, new IDxBRecipientShape14S0400000_2_I0(r12, r2, r02, this, 1));
        }
    }
}
