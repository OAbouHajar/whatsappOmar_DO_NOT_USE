package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2rE  reason: invalid class name and case insensitive filesystem */
public class C57472rE extends AnonymousClass01X {
    public int A00;
    public List A01;
    public final /* synthetic */ C48702Op A02;

    public C57472rE(C48702Op r1) {
        this.A02 = r1;
    }

    public int A0C() {
        int A07 = C13680ns.A07(this.A01);
        List list = this.A01;
        int i2 = this.A00;
        if (list != null) {
            i2 -= list.size();
        }
        return (i2 <= 0 || A07 <= 0) ? A07 : A07 + 1;
    }

    public void ANf(C005602k r8, int i2) {
        Context context;
        int i3;
        String A0I;
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 0) {
            AnonymousClass3S5 r82 = (AnonymousClass3S5) r8;
            C16010sH r6 = (C16010sH) this.A01.get(i2);
            C48702Op r4 = this.A02;
            TextView textView = r82.A01;
            if (!TextUtils.isEmpty(r6.A09())) {
                A0I = r6.A09();
            } else if (r6.A0K()) {
                A0I = r4.A0I.A0I(r6, false);
            } else {
                String A09 = r4.A0L.A09(C16010sH.A02(r6));
                if (!TextUtils.isEmpty(A09)) {
                    textView.setSingleLine(false);
                } else if (!TextUtils.isEmpty(r6.A0W)) {
                    A09 = r4.A0I.A0F(r6);
                    textView.setSingleLine(false);
                    context = r4.A00;
                    i3 = R.color.color06c5;
                    C13680ns.A0v(context, textView, i3);
                    textView.setText(A09);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    r4.A0E.A08(r82.A00, r6, false);
                } else {
                    A09 = r4.A0K.A0H(C24561Gk.A01(r6));
                    textView.setSingleLine(true);
                }
                context = r4.A00;
                i3 = R.color.color0660;
                C13680ns.A0v(context, textView, i3);
                textView.setText(A09);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                r4.A0E.A08(r82.A00, r6, false);
            }
            textView.setText(A0I);
            textView.setSingleLine(false);
            C13680ns.A0v(r4.A00, textView, R.color.color0660);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            r4.A0E.A08(r82.A00, r6, false);
        } else if (itemViewType == 1) {
            TextView textView2 = ((C64783Rq) r8).A00;
            Context context2 = this.A02.A00;
            Object[] objArr = new Object[1];
            List list = this.A01;
            int i4 = this.A00;
            if (list != null) {
                i4 -= list.size();
            }
            AnonymousClass000.A1M(objArr, i4, 0);
            textView2.setText(context2.getString(R.string.str00cb, objArr));
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflater = this.A02.A01;
        return i2 != 0 ? new C64783Rq(layoutInflater.inflate(R.layout.layout001f, viewGroup, false)) : new AnonymousClass3S5(layoutInflater.inflate(R.layout.layout001e, viewGroup, false));
    }

    public int getItemViewType(int i2) {
        List list = this.A01;
        int i3 = this.A00;
        if (list != null) {
            i3 -= list.size();
        }
        return (i3 <= 0 || i2 != this.A01.size()) ? 0 : 1;
    }
}
