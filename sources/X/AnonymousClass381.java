package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Arrays;

/* renamed from: X.381  reason: invalid class name */
public class AnonymousClass381 {
    public static Drawable A00(C14990q7 r6, C31201dg r7, C31201dg r8) {
        C31201dg A0G = r7.A0G(35);
        if (A0G == null) {
            C29691b2.A00(AnonymousClass496.A00, "Client received a RippleDrawable with null content");
        }
        Drawable colorDrawable = A0G == null ? new ColorDrawable() : C90154da.A00().A06.A01(r6, A0G, r8);
        ShapeDrawable shapeDrawable = null;
        if (r8 != null) {
            float[] fArr = new float[8];
            try {
                String A0J = r8.A0J(46);
                Arrays.fill(fArr, A0J == null ? 0.0f : C62163Bx.A01(A0J));
            } catch (AnonymousClass40K unused) {
                C29691b2.A00(AnonymousClass496.A00, "Error parsing Corner radius for Box decoration");
                Arrays.fill(fArr, 0.0f);
            }
            shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        }
        return new RippleDrawable(ColorStateList.valueOf(Color.parseColor(r7.A0J(38))), colorDrawable, shapeDrawable);
    }
}
