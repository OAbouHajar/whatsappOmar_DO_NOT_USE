package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass29K;
import X.AnonymousClass2BF;
import X.AnonymousClass2OW;
import X.AnonymousClass2Ra;
import X.AnonymousClass4Y6;
import X.C001000l;
import X.C13680ns;
import X.C13700nu;
import X.C30141bo;
import X.C30151bp;
import X.C57742rg;
import X.C62033Bj;
import X.C816349d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.gallerypicker.GalleryPickerFragment;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;

public class IDxBRecipientShape31S0300000_1_I1 implements AnonymousClass2OW {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxBRecipientShape31S0300000_1_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public void A5K() {
        if (this.A03 == 0) {
            C57742rg r0 = (C57742rg) this.A00;
            ImageView imageView = r0.A02;
            imageView.setBackgroundColor(r0.A05.A01);
            imageView.setImageDrawable((Drawable) null);
        }
    }

    public /* synthetic */ void AQs() {
        C001000l A0C;
        if (this.A03 != 0 && (A0C = ((AnonymousClass01A) this.A00).A0C()) != null) {
            A0C.A0c();
        }
    }

    public void AY3(Bitmap bitmap, boolean z2) {
        int i2;
        Uri uri;
        if (this.A03 != 0) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A00;
            Context A0u = imageComposerFragment.A0u();
            if (A0u != null && imageComposerFragment.A08.getTag() == (uri = imageComposerFragment.A00)) {
                if (this.A02 == null) {
                    AnonymousClass29K r1 = (AnonymousClass29K) this.A01;
                    String A08 = ((MediaComposerActivity) r1).A1S.A00(uri).A08();
                    String ABt = r1.ABt(imageComposerFragment.A00);
                    if (A08 != null) {
                        C62033Bj A032 = C62033Bj.A03(A0u, imageComposerFragment.A07, imageComposerFragment.A08, imageComposerFragment.A0I, A08);
                        if (A032 != null) {
                            AnonymousClass2Ra r12 = imageComposerFragment.A0D;
                            r12.A0H.setDoodle(A032);
                            r12.A0O.A05(ABt);
                        }
                    } else if (!C13700nu.A0i(imageComposerFragment.A0D.A0O.A04)) {
                        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                        AnonymousClass2Ra r13 = imageComposerFragment.A0D;
                        r13.A0I.A06 = rectF;
                        r13.A0H.A00 = 0.0f;
                        r13.A05(rectF);
                    }
                }
                if (!z2) {
                    imageComposerFragment.A08.A06(imageComposerFragment.A07.A03);
                    C001000l A0C = imageComposerFragment.A0C();
                    if (A0C != null) {
                        A0C.A0c();
                    }
                } else {
                    C30141bo r4 = imageComposerFragment.A07;
                    if (bitmap != null) {
                        r4.A04 = bitmap;
                        r4.A0B = false;
                    }
                    r4.A05((Runnable) null, new RunnableRunnableShape10S0100000_I0_9((Object) r4, 49), r4.A01);
                }
                C30141bo r0 = imageComposerFragment.A07;
                r0.A04();
                C30151bp r02 = r0.A0A;
                if (r02 != null) {
                    r02.A01();
                    return;
                }
                return;
            }
            return;
        }
        C57742rg r2 = (C57742rg) this.A00;
        ImageView imageView = r2.A02;
        if (imageView.getTag() == this.A01) {
            GalleryPickerFragment galleryPickerFragment = r2.A05;
            if (galleryPickerFragment.A0C() == null) {
                return;
            }
            if (bitmap == C816349d.A00) {
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setBackgroundColor(galleryPickerFragment.A01);
                AnonymousClass2BF r42 = (AnonymousClass2BF) this.A02;
                int type = r42.getType();
                if (type == 0) {
                    imageView.setBackgroundColor(galleryPickerFragment.A01);
                    i2 = R.drawable.ic_missing_thumbnail_picture;
                } else if (type == 1 || type == 2) {
                    imageView.setBackgroundColor(galleryPickerFragment.A01);
                    i2 = R.drawable.ic_missing_thumbnail_video;
                } else if (type != 3) {
                    int i3 = galleryPickerFragment.A01;
                    if (type != 4) {
                        imageView.setBackgroundColor(i3);
                        imageView.setImageResource(0);
                        return;
                    }
                    imageView.setBackgroundColor(i3);
                    imageView.setImageDrawable(AnonymousClass4Y6.A01(galleryPickerFragment.A0C(), r42.ADk(), (String) null, false));
                    return;
                } else {
                    C13680ns.A0u(galleryPickerFragment.A0u(), imageView, R.color.color0579);
                    i2 = R.drawable.gallery_audio_item;
                }
                imageView.setImageResource(i2);
                return;
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setBackgroundResource(0);
            if (!z2) {
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = galleryPickerFragment.A05;
                C13680ns.A1E(imageView, new BitmapDrawable(galleryPickerFragment.A03(), bitmap), drawableArr);
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }
}
