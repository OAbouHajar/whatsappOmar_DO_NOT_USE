package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.06N  reason: invalid class name */
public class AnonymousClass06N implements AnonymousClass06O {
    public Drawable A7O(Context context, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        try {
            Resources resources = context.getResources();
            AnonymousClass07V r0 = new AnonymousClass07V();
            r0.inflate(resources, xmlPullParser, attributeSet, theme);
            return r0;
        } catch (Exception e2) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
            return null;
        }
    }
}
