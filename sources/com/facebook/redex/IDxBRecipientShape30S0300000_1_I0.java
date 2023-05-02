package com.facebook.redex;

import X.AnonymousClass2BF;
import X.AnonymousClass2OW;
import X.AnonymousClass3SU;
import X.AnonymousClass4Y6;
import X.C13680ns;
import X.C18450wi;
import X.C54482hb;
import X.C57752rh;
import X.C816349d;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaMediaThumbnailView;

public class IDxBRecipientShape30S0300000_1_I0 implements AnonymousClass2OW {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxBRecipientShape30S0300000_1_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public void A5K() {
        if (this.A03 != 0) {
            AnonymousClass3SU r0 = (AnonymousClass3SU) this.A02;
            WaMediaThumbnailView waMediaThumbnailView = r0.A03;
            waMediaThumbnailView.setBackgroundColor(r0.A01);
            waMediaThumbnailView.setImageDrawable((Drawable) null);
            return;
        }
        C57752rh r02 = (C57752rh) this.A00;
        C54482hb r1 = r02.A04;
        r1.setBackgroundColor(r02.A00);
        r1.setImageDrawable((Drawable) null);
    }

    public /* synthetic */ void AQs() {
    }

    public void AY3(Bitmap bitmap, boolean z2) {
        int i2;
        int i3;
        if (this.A03 != 0) {
            C18450wi.A0H(bitmap, 0);
            AnonymousClass3SU r5 = (AnonymousClass3SU) this.A02;
            WaMediaThumbnailView waMediaThumbnailView = r5.A03;
            if (waMediaThumbnailView.getTag() != this.A00) {
                return;
            }
            if (bitmap.equals(C816349d.A00)) {
                waMediaThumbnailView.setScaleType(ImageView.ScaleType.CENTER);
                int type = ((AnonymousClass2BF) this.A01).getType();
                if (type == 1 || type == 2) {
                    waMediaThumbnailView.setBackgroundColor(r5.A01);
                    i3 = R.drawable.ic_missing_thumbnail_video;
                } else {
                    waMediaThumbnailView.setBackgroundColor(r5.A01);
                    i3 = R.drawable.ic_missing_thumbnail_picture;
                }
                waMediaThumbnailView.setImageResource(i3);
                return;
            }
            waMediaThumbnailView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            waMediaThumbnailView.setBackgroundResource(0);
            waMediaThumbnailView.setThumbnail(bitmap);
            if (!z2) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(waMediaThumbnailView.getResources(), bitmap);
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = r5.A02;
                C13680ns.A1E(waMediaThumbnailView, bitmapDrawable, drawableArr);
                return;
            }
            return;
        }
        C57752rh r6 = (C57752rh) this.A00;
        C54482hb r3 = r6.A04;
        if (r3.getTag() != this.A01) {
            return;
        }
        if (bitmap == C816349d.A00) {
            r3.setScaleType(ImageView.ScaleType.CENTER);
            AnonymousClass2BF r52 = (AnonymousClass2BF) this.A02;
            int type2 = r52.getType();
            if (type2 == 0) {
                r3.setBackgroundColor(r6.A00);
                i2 = R.drawable.ic_missing_thumbnail_picture;
            } else if (type2 == 1 || type2 == 2) {
                r3.setBackgroundColor(r6.A00);
                i2 = R.drawable.ic_missing_thumbnail_video;
            } else if (type2 != 3) {
                r3.setBackgroundColor(r6.A00);
                if (type2 != 4) {
                    r3.setImageResource(0);
                    return;
                } else {
                    r3.setImageDrawable(AnonymousClass4Y6.A01(r3.getContext(), r52.ADk(), (String) null, false));
                    return;
                }
            } else {
                C13680ns.A0u(r3.getContext(), r3, R.color.color0579);
                i2 = R.drawable.gallery_audio_item;
            }
            r3.setImageResource(i2);
            return;
        }
        r3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r3.setBackgroundResource(0);
        r3.A00 = bitmap;
        if (!z2) {
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(r3.getResources(), bitmap);
            Drawable[] drawableArr2 = new Drawable[2];
            drawableArr2[0] = r6.A01;
            C13680ns.A1E(r3, bitmapDrawable2, drawableArr2);
            return;
        }
        r3.setImageBitmap(bitmap);
    }
}
