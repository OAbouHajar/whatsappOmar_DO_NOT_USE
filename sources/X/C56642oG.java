package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2oG  reason: invalid class name and case insensitive filesystem */
public class C56642oG extends ArrayAdapter {
    public int A00 = 0;
    public final AnonymousClass1G1 A01;
    public final List A02;

    public C56642oG(Context context, AnonymousClass1G1 r3, List list) {
        super(context, R.layout.layout0373, list);
        this.A02 = list;
        this.A01 = r3;
    }

    public int getCount() {
        return this.A02.size();
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass4L3 r0;
        boolean z2 = false;
        if (view == null) {
            view = C13680ns.A0G(viewGroup).inflate(R.layout.layout0373, viewGroup, false);
            r0 = new AnonymousClass4L3();
            view.setTag(r0);
            r0.A02 = C13680ns.A0M(view, R.id.title);
            r0.A01 = C13680ns.A0M(view, R.id.subtitle);
            r0.A00 = (RadioButton) view.findViewById(R.id.radio);
        } else {
            r0 = (AnonymousClass4L3) view.getTag();
        }
        C93524jL r8 = (C93524jL) this.A02.get(i2);
        String str = r8.A00;
        r0.A02.setText(AnonymousClass2JN.A0B(this.A01, str, AnonymousClass000.A0h(r8.A02, AnonymousClass000.A0q(str))));
        TextView textView = r0.A01;
        Context context = viewGroup.getContext();
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1M(A1Z, i2 + 1, 0);
        textView.setText(C13680ns.A0d(context, r8.A01, A1Z, 1, R.string.str14cf));
        RadioButton radioButton = r0.A00;
        if (i2 == this.A00) {
            z2 = true;
        }
        radioButton.setChecked(z2);
        return view;
    }
}
