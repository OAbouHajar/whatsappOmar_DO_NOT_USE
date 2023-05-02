package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.List;

/* renamed from: X.5es  reason: invalid class name and case insensitive filesystem */
public class C110815es extends AnonymousClass01X {
    public final C116165qv A00;
    public final List A01;
    public final /* synthetic */ IndiaUpiBankAccountPickerActivity A02;

    public C110815es(C116165qv r1, IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, List list) {
        this.A02 = indiaUpiBankAccountPickerActivity;
        this.A01 = list;
        this.A00 = r1;
    }

    public int A0C() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r13, int i2) {
        C111075fI r132 = (C111075fI) r13;
        List list = this.A01;
        C117485t4 r5 = (C117485t4) list.get(i2);
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = this.A02;
        if (!TextUtils.isEmpty(indiaUpiBankAccountPickerActivity.A0R)) {
            indiaUpiBankAccountPickerActivity.A0Q.A00(indiaUpiBankAccountPickerActivity.getResources().getDrawable(R.drawable.bank_logo_placeholder_with_circle_bg), (Drawable) null, r132.A00, (C109485Sh) null, indiaUpiBankAccountPickerActivity.A0R);
        } else {
            r132.A00.setImageResource(R.drawable.bank_logo_placeholder_with_circle_bg);
        }
        int size = list.size();
        RadioButton radioButton = r132.A01;
        if (size == 1) {
            radioButton.setVisibility(8);
        } else {
            radioButton.setVisibility(0);
        }
        TextView textView = r132.A03;
        String str = r5.A02;
        String str2 = r5.A03;
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(" ");
        A0q.append("•");
        A0q.append("•");
        textView.setText(AnonymousClass000.A0h(str2, A0q));
        radioButton.setChecked(r5.A00);
        r132.A04.setText(r5.A04);
        boolean z2 = !r5.A05;
        View view = r132.A0H;
        Context context = view.getContext();
        if (z2) {
            C13680ns.A0v(context, textView, R.color.color0507);
            r132.A02.setText(r5.A01);
            radioButton.setEnabled(true);
        } else {
            C13680ns.A0v(context, textView, R.color.color0776);
            r132.A02.setText(R.string.str0fe2);
            radioButton.setEnabled(false);
        }
        view.setBackground((indiaUpiBankAccountPickerActivity.A0W || !z2) ? null : AnonymousClass00T.A04(view.getContext(), R.drawable.selector_orange_gradient));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C111075fI(C13680ns.A0H(this.A02.getLayoutInflater(), viewGroup, R.layout.layout0306), this.A00);
    }
}
