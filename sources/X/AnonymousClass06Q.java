package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.06Q  reason: invalid class name */
public class AnonymousClass06Q implements AnonymousClass06O {
    public Drawable A7O(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        try {
            return AnonymousClass0Cp.A00(context, theme, context.getResources(), attributeSet, xmlPullParser);
        } catch (Exception e2) {
            Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
            return null;
        }
    }
}
