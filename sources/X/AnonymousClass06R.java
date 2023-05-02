package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.06R  reason: invalid class name */
public class AnonymousClass06R implements AnonymousClass06O {
    public Drawable A7O(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute != null) {
            try {
                Drawable drawable = (Drawable) AnonymousClass06R.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                }
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                return drawable;
            } catch (Exception e2) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
            }
        }
        return null;
    }
}
