package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.obwhatsapp.R;

/* renamed from: X.47Z  reason: invalid class name */
public class AnonymousClass47Z {
    public static Drawable A00(Context context, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0799);
        shapeDrawable.setIntrinsicHeight(dimensionPixelSize);
        shapeDrawable.setIntrinsicWidth(dimensionPixelSize);
        shapeDrawable.getPaint().setColor(i2);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, AnonymousClass00T.A04(context, R.drawable.vec_ic_voice_status)});
        int A00 = C87594Xo.A00(context, 14.0f);
        layerDrawable.setLayerInset(1, A00, A00, A00, A00);
        return layerDrawable;
    }
}
