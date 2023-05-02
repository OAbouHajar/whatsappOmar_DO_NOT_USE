package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxKListenerShape255S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.39k  reason: invalid class name and case insensitive filesystem */
public class C615639k {
    public AnonymousClass5QD A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final AnonymousClass10J A0A;
    public final ArrayList A0B;

    public C615639k(Context context, AnonymousClass013 r5, AnonymousClass10J r6, AnonymousClass47N r7) {
        int i2 = 0;
        this.A09 = context;
        this.A0A = r6;
        this.A08 = r7 != null ? 0 : context.getResources().getDimensionPixelSize(R.dimen.dimen075b);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.dimen0757);
        this.A07 = r7 != null ? 0 : context.getResources().getDimensionPixelSize(R.dimen.dimen075a);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.dimen0756);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0758);
        if (C13680ns.A1Z(r5)) {
            this.A06 = dimensionPixelSize;
        } else {
            this.A05 = dimensionPixelSize;
        }
        this.A01 = r7 != null ? 1.0f : 0.0f;
        this.A04 = r7 != null ? 1 : i2;
        this.A0B = AnonymousClass000.A0u();
    }

    public String A00() {
        StringBuilder A0o = AnonymousClass000.A0o();
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            EditText editText = (EditText) it.next();
            if (!TextUtils.isEmpty(editText.getText())) {
                A0o.append(C13680ns.A0f(editText));
            }
        }
        return A0o.toString();
    }

    public void A01() {
        ArrayList arrayList = this.A0B;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13700nu.A0T((TextView) it.next());
        }
        AnonymousClass000.A0N(arrayList, 0).requestFocus();
    }

    public void A02(LinearLayout linearLayout, AnonymousClass5QD r18, int i2) {
        int i3;
        TextView r1;
        this.A00 = r18;
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        LinearLayout linearLayout2 = linearLayout;
        linearLayout2.removeAllViews();
        int i4 = 0;
        while (true) {
            i3 = i2;
            if (i4 > i3) {
                break;
            }
            boolean A1R = AnonymousClass000.A1R(i4, i2 >> 1);
            boolean A1R2 = AnonymousClass000.A1R(i4, i3);
            if (A1R) {
                r1 = new WaTextView(this.A09);
                r1.setBackgroundResource(R.drawable.sms_code_input_hyphen);
            } else {
                r1 = new C70563hH(new ContextThemeWrapper(this.A09, R.style.style0267));
                r1.setBackgroundResource(R.drawable.sms_code_input_box);
                r1.setWidth(this.A07);
                r1.setHeight(this.A02);
                r1.setGravity(17);
                if (this.A04 == 1) {
                    r1.setInputType(4096);
                }
                arrayList.add(r1);
            }
            r1.setPadding(0, 0, 0, 0);
            linearLayout2.addView(r1);
            boolean z2 = true ^ A1R2;
            boolean z3 = !A1R;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) r1.getLayoutParams();
            if (z2) {
                layoutParams.setMargins(this.A05, 0, this.A06, 0);
            }
            if (z3) {
                layoutParams.weight = this.A01;
            }
            layoutParams.gravity = 17;
            r1.setLayoutParams(layoutParams);
            i4++;
        }
        if (arrayList.isEmpty()) {
            Log.i("CodeInputBoxManager/init/empty codeInputBoxes");
            return;
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            WaEditText waEditText = null;
            WaEditText waEditText2 = i5 == 0 ? null : (WaEditText) arrayList.get(i5 - 1);
            WaEditText waEditText3 = (WaEditText) arrayList.get(i5);
            if (i5 != arrayList.size() - 1) {
                waEditText = (WaEditText) arrayList.get(i5 + 1);
            }
            waEditText3.addTextChangedListener(new AnonymousClass3CT(waEditText2, waEditText3, waEditText, this.A00, this, arrayList, i5, i3, this.A04));
            waEditText3.setOnKeyListener(new IDxKListenerShape255S0100000_2_I1(waEditText3, 1));
            i5++;
        }
        AnonymousClass000.A0N(arrayList, 0).requestFocus();
        View A0N = AnonymousClass000.A0N(arrayList, 0);
        Resources resources = this.A09.getResources();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1M(objArr, i3, 0);
        A0N.setContentDescription(resources.getString(R.string.str198a, objArr));
    }

    public void A03(boolean z2) {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(z2);
        }
    }

    public boolean A04() {
        return AnonymousClass000.A1O(this.A0A.A0E(C16620tM.A02, 1715) ? 1 : 0);
    }
}
