package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.obwhatsapp.R;

/* renamed from: X.2v1  reason: invalid class name and case insensitive filesystem */
public class C59192v1 extends AnonymousClass3TH {
    public final AnonymousClass013 A00;
    public final /* synthetic */ AnonymousClass3BH A01;

    public C59192v1(AnonymousClass3BH r1, AnonymousClass013 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public int A01() {
        return this.A01.A0R.length;
    }

    public /* bridge */ /* synthetic */ Object A0G(ViewGroup viewGroup, int i2) {
        AnonymousClass3BH r4 = this.A01;
        View inflate = r4.A0B.inflate(R.layout.layout0250, (ViewGroup) null);
        AbsListView absListView = (AbsListView) inflate.findViewById(16908298);
        AnonymousClass013 r6 = this.A00;
        if (!C13680ns.A1Z(r6)) {
            i2 = (r4.A0R.length - 1) - i2;
        }
        C56702oM[] r5 = r4.A0R;
        if (r5[i2] == null) {
            r5[i2] = new C56702oM(r4.A09, r4, r6, i2);
        }
        absListView.setAdapter(r5[i2]);
        absListView.setEmptyView(inflate.findViewById(16908292));
        absListView.setTag(Integer.valueOf(i2));
        if (i2 == r4.A00) {
            absListView.setOnScrollListener(r4.A0I);
        }
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public /* bridge */ /* synthetic */ void A0H(ViewGroup viewGroup, Object obj, int i2) {
        View view = (View) obj;
        viewGroup.removeView(view);
        ((AbsListView) view.findViewById(16908298)).setOnScrollListener((AbsListView.OnScrollListener) null);
    }

    public /* bridge */ /* synthetic */ boolean A0J(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }
}
