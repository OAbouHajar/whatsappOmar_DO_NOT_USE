package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.0Bo  reason: invalid class name */
public class AnonymousClass0Bo extends ViewGroup.MarginLayoutParams {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public AnonymousClass06y A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Rect A0F;

    public AnonymousClass0Bo() {
        super(-2, -2);
        this.A0F = A00(this);
    }

    public AnonymousClass0Bo(AnonymousClass0Bo r2) {
        super(r2);
        this.A0F = A00(this);
    }

    public AnonymousClass0Bo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass06y r0;
        this.A0B = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A0F = AnonymousClass000.A0J();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NB.A01);
        this.A02 = obtainStyledAttributes.getInteger(0, 0);
        this.A05 = obtainStyledAttributes.getResourceId(1, -1);
        this.A00 = obtainStyledAttributes.getInteger(2, 0);
        this.A04 = obtainStyledAttributes.getInteger(6, -1);
        this.A03 = obtainStyledAttributes.getInt(5, 0);
        this.A01 = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.A0B = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            if (TextUtils.isEmpty(string)) {
                r0 = null;
            } else {
                if (string.startsWith(".")) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append(context.getPackageName());
                    string = AnonymousClass000.A0h(string, A0o);
                } else if (string.indexOf(46) < 0) {
                    String str = CoordinatorLayout.A0J;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder A0q = AnonymousClass000.A0q(str);
                        A0q.append(FilenameUtils.EXTENSION_SEPARATOR);
                        string = AnonymousClass000.A0h(string, A0q);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.A0K;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = AnonymousClass000.A0x();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = context.getClassLoader().loadClass(string).getConstructor(CoordinatorLayout.A0M);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    r0 = (AnonymousClass06y) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e2) {
                    throw new RuntimeException(AnonymousClass000.A0h(string, AnonymousClass000.A0r("Could not inflate Behavior subclass ")), e2);
                }
            }
            this.A0A = r0;
        }
        obtainStyledAttributes.recycle();
        AnonymousClass06y r02 = this.A0A;
        if (r02 != null) {
            r02.A0G(this);
        }
    }

    public AnonymousClass0Bo(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A0F = A00(this);
    }

    public AnonymousClass0Bo(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A0F = A00(this);
    }

    public static Rect A00(AnonymousClass0Bo r2) {
        r2.A0B = false;
        r2.A02 = 0;
        r2.A00 = 0;
        r2.A04 = -1;
        r2.A05 = -1;
        r2.A03 = 0;
        r2.A01 = 0;
        return new Rect();
    }

    public void A01(AnonymousClass06y r2) {
        if (this.A0A != r2) {
            this.A0A = r2;
            this.A0B = true;
            if (r2 != null) {
                r2.A0G(this);
            }
        }
    }

    public AnonymousClass06y getBehavior() {
        return this.A0A;
    }
}
