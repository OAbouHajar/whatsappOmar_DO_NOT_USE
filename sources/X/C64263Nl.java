package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape0S0101000_I1;
import java.util.List;

/* renamed from: X.3Nl  reason: invalid class name and case insensitive filesystem */
public class C64263Nl extends ArrayAdapter {
    public int A00 = 0;
    public final List A01;

    public C64263Nl(Context context, List list) {
        super(context, R.layout.layout0371, list);
        this.A01 = list;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = C13680ns.A0G(viewGroup).inflate(R.layout.layout0371, viewGroup, false);
        }
        TextView A0L = C13680ns.A0L(view, R.id.title);
        TextView A0L2 = C13680ns.A0L(view, R.id.subtitle);
        CompoundButton compoundButton = (CompoundButton) C004601z.A0E(view, R.id.phone_number_selection_radio_button);
        ViewOnClickCListenerShape0S0101000_I1 viewOnClickCListenerShape0S0101000_I1 = new ViewOnClickCListenerShape0S0101000_I1(this, i2, 3);
        C93514jK r2 = (C93514jK) this.A01.get(i2);
        String str = r2.A01;
        if (TextUtils.isEmpty(str)) {
            A0L.setVisibility(8);
        } else {
            A0L.setVisibility(0);
            A0L.setText(str);
        }
        A0L2.setText(r2.A00);
        if (i2 == this.A00) {
            z2 = true;
        }
        compoundButton.setChecked(z2);
        compoundButton.setOnClickListener(viewOnClickCListenerShape0S0101000_I1);
        view.setOnClickListener(viewOnClickCListenerShape0S0101000_I1);
        return view;
    }
}
