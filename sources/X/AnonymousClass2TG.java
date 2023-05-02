package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.2TG  reason: invalid class name */
public class AnonymousClass2TG extends LayoutInflater {
    public static final String[] A01 = {"android.widget.", "android.webkit."};
    public final AnonymousClass013 A00;

    public AnonymousClass2TG(Context context, LayoutInflater layoutInflater, AnonymousClass013 r3) {
        super(layoutInflater, context);
        this.A00 = r3;
    }

    public LayoutInflater cloneInContext(Context context) {
        return new AnonymousClass2TG(context, this, this.A00);
    }

    public View inflate(int i2, ViewGroup viewGroup, boolean z2) {
        View inflate = super.inflate(i2, viewGroup, z2);
        AnonymousClass013 r4 = this.A00;
        if (!(inflate instanceof AnonymousClass2TY)) {
            if (!z2 || inflate.getTag(R.id.bidilayout_ignore) == null) {
                C45902Bo.A06(inflate, r4);
            } else if (inflate instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                int childCount = viewGroup2.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    C45902Bo.A06(viewGroup2.getChildAt(i3), r4);
                }
            }
            inflate.setTag(R.id.bidilayout_ignore, C45902Bo.A00);
        }
        return inflate;
    }

    public View onCreateView(String str, AttributeSet attributeSet) {
        String[] strArr = A01;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                View createView = createView(str, strArr[i2], attributeSet);
                if (createView != null) {
                    return createView;
                }
                i2++;
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
