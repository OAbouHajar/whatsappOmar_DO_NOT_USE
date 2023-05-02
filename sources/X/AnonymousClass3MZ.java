package X;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.3MZ  reason: invalid class name */
public class AnonymousClass3MZ extends Property {
    public static final Property A00 = new AnonymousClass3MZ();

    public AnonymousClass3MZ() {
        super(Float.class, "childrenAlpha");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        Object tag = ((View) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return tag == null ? Float.valueOf(1.0f) : tag;
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Number number = (Number) obj2;
        float floatValue = number.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, number);
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup.getChildAt(i2).setAlpha(floatValue);
        }
    }
}
