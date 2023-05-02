package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0Un  reason: invalid class name and case insensitive filesystem */
public class C06160Un {
    public static final int[] A02 = {16843067, 16843068};
    public Bitmap A00;
    public final ProgressBar A01;

    public C06160Un(ProgressBar progressBar) {
        this.A01 = progressBar;
    }

    public final Drawable A00(Drawable drawable, boolean z2) {
        boolean z3;
        if (drawable instanceof C019208y) {
            C019208y r1 = (C019208y) drawable;
            Drawable drawable2 = ((C019108x) r1).A02;
            if (drawable2 != null) {
                r1.Af2(A00(drawable2, z2));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                int id = layerDrawable.getId(i2);
                Drawable drawable3 = layerDrawable.getDrawable(i2);
                if (id != 16908301) {
                    z3 = false;
                    if (id != 16908303) {
                        drawableArr[i2] = A00(drawable3, z3);
                    }
                }
                z3 = true;
                drawableArr[i2] = A00(drawable3, z3);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                layerDrawable2.setId(i3, layerDrawable.getId(i3));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.A00 == null) {
                this.A00 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public void A01(AttributeSet attributeSet, int i2) {
        ProgressBar progressBar = this.A01;
        AnonymousClass07T A002 = AnonymousClass07T.A00(progressBar.getContext(), attributeSet, A02, i2, 0);
        Drawable A03 = A002.A03(0);
        if (A03 != null) {
            if (A03 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) A03;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable A003 = A00(animationDrawable.getFrame(i3), true);
                    A003.setLevel(SearchActionVerificationClientService.NOTIFICATION_ID);
                    animationDrawable2.addFrame(A003, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(SearchActionVerificationClientService.NOTIFICATION_ID);
                A03 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(A03);
        }
        Drawable A032 = A002.A03(1);
        if (A032 != null) {
            progressBar.setProgressDrawable(A00(A032, false));
        }
        A002.A04();
    }
}
