package X;

import android.graphics.Outline;
import android.graphics.Rect;

/* renamed from: X.3bp  reason: invalid class name and case insensitive filesystem */
public class C67513bp extends C53562fu {
    public void getOutline(Outline outline) {
        Rect rect = this.A0A;
        copyBounds(rect);
        outline.setOval(rect);
    }
}
