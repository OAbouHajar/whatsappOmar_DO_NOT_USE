package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass25V;
import X.AnonymousClass2QF;
import X.AnonymousClass2SR;
import X.C16740tZ;
import X.C17970vw;
import X.C31171dd;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.search.views.MessageThumbView;

public class IDxTRendererShape198S0100000_2_I0 implements AnonymousClass25V {
    public Object A00;
    public final int A01;

    public IDxTRendererShape198S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void A00(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A00;
        Drawable drawable = imageView.getDrawable();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), bitmap);
        if (drawable == null || (drawable instanceof ColorDrawable)) {
            imageView.setImageDrawable(bitmapDrawable);
            return;
        }
        Drawable[] drawableArr = new Drawable[2];
        AnonymousClass000.A1E(drawable, bitmapDrawable, drawableArr);
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        imageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(150);
    }

    public int AG6() {
        int i2 = this.A01;
        View view = (View) this.A00;
        switch (i2) {
            case 0:
                return C31171dd.A01(view.getContext(), 36);
            case 1:
                return view.getResources().getDimensionPixelSize(R.dimen.dimen0276);
            default:
                return view.getWidth();
        }
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r6) {
        switch (this.A01) {
            case 0:
                ImageView imageView = (ImageView) view;
                if (bitmap != null) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setImageBitmap(bitmap);
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                View view2 = (View) this.A00;
                imageView.setBackgroundColor(view2.getResources().getColor(R.color.color04d7));
                imageView.setImageDrawable(AnonymousClass2SR.A02(view2.getContext(), R.drawable.camera, R.color.color04d8));
                return;
            case 1:
                ImageView imageView2 = ((AnonymousClass2QF) this.A00).A0E;
                if (bitmap != null) {
                    imageView2.setImageBitmap(bitmap);
                    return;
                } else {
                    imageView2.setImageResource(R.drawable.media_location);
                    return;
                }
            default:
                MessageThumbView messageThumbView = (MessageThumbView) this.A00;
                if (messageThumbView.A00 > 0) {
                    A00(C17970vw.A06(bitmap, (float) messageThumbView.A00, messageThumbView.getResources().getDimensionPixelSize(R.dimen.dimen06c4)));
                    return;
                }
                A00(bitmap);
                return;
        }
    }

    public void Afm(View view) {
        switch (this.A01) {
            case 0:
                ImageView imageView = (ImageView) view;
                imageView.setImageDrawable((Drawable) null);
                imageView.setBackgroundColor(-7829368);
                return;
            case 1:
                ImageView imageView2 = ((AnonymousClass2QF) this.A00).A0E;
                imageView2.setImageDrawable((Drawable) null);
                imageView2.setBackgroundColor(-7829368);
                return;
            default:
                ((ImageView) this.A00).setImageDrawable(new ColorDrawable(view.getResources().getColor(R.color.color06b7)));
                return;
        }
    }
}
