package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.3TH  reason: invalid class name */
public abstract class AnonymousClass3TH extends AnonymousClass012 {
    @Deprecated
    public final int A02(Object obj) {
        return A0F(obj);
    }

    @Deprecated
    public final Object A05(ViewGroup viewGroup, int i2) {
        return A0G(viewGroup, i2);
    }

    @Deprecated
    public final void A0C(ViewGroup viewGroup, Object obj, int i2) {
        A0I(viewGroup, obj, i2);
    }

    @Deprecated
    public final void A0D(ViewGroup viewGroup, Object obj, int i2) {
        A0H(viewGroup, obj, i2);
    }

    @Deprecated
    public final boolean A0E(View view, Object obj) {
        return A0J(view, obj);
    }

    public int A0F(Object obj) {
        Object obj2;
        if (!(this instanceof C70453gi)) {
            return -1;
        }
        C70453gi r2 = (C70453gi) this;
        AnonymousClass01Q r4 = (AnonymousClass01Q) obj;
        if (r4.A00 == null || (obj2 = r4.A01) == null) {
            return -2;
        }
        return r2.A00.AF8(obj2);
    }

    public Object A0G(ViewGroup viewGroup, int i2) {
        C70453gi r4 = (C70453gi) this;
        AnonymousClass01Q A7f = r4.A00.A7f(i2);
        Object obj = A7f.A00;
        if (obj != null) {
            View view = (View) obj;
            Object obj2 = A7f.A01;
            if (MediaViewBaseFragment.A0H) {
                r4.A01.A1L(view);
            }
            view.setTag(obj2);
            viewGroup.addView(view, 0);
        }
        return A7f;
    }

    public void A0H(ViewGroup viewGroup, Object obj, int i2) {
        C70453gi r1 = (C70453gi) this;
        Object obj2 = ((AnonymousClass01Q) obj).A00;
        if (obj2 != null) {
            View view = (View) obj2;
            viewGroup.removeView(view);
            PhotoView.A01(view);
        }
        r1.A00.A7w(i2);
    }

    public void A0I(ViewGroup viewGroup, Object obj, int i2) {
    }

    public boolean A0J(View view, Object obj) {
        return AnonymousClass000.A1Y(view, ((AnonymousClass01Q) obj).A00);
    }
}
