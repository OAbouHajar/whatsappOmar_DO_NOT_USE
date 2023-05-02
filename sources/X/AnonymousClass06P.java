package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.06P  reason: invalid class name */
public class AnonymousClass06P implements AnonymousClass06O {
    public Drawable A7O(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        try {
            Resources resources = context.getResources();
            C016907z r0 = new C016907z(context);
            r0.inflate(resources, xmlPullParser, attributeSet, theme);
            return r0;
        } catch (Exception e2) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
            return null;
        }
    }
}
