package X;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape241S0100000_2_I1;
import com.facebook.redex.IDxLListenerShape60S0200000_2_I1;
import com.facebook.redex.IDxTListenerShape63S0200000_2_I1;
import com.obwhatsapp.WaEditText;

/* renamed from: X.38A  reason: invalid class name */
public final class AnonymousClass38A {
    public static void A00(Context context, ScrollView scrollView, TextView textView, TextView textView2, WaEditText waEditText, AnonymousClass01V r17, AnonymousClass013 r18, C17250um r19, C17020u3 r20, int i2) {
        int i3 = i2;
        WaEditText waEditText2 = waEditText;
        waEditText2.setFilters(new InputFilter[]{new C93744jh(i3)});
        waEditText2.addTextChangedListener(new AnonymousClass35O(waEditText2, textView, r17, r18, r19, r20, i3, (int) (((float) i3) * 0.1f), false));
        C13680ns.A16(textView2, waEditText2, 21);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape60S0200000_2_I1(waEditText2, 4, scrollView));
        waEditText2.setOnFocusChangeListener(new IDxCListenerShape241S0100000_2_I1(scrollView, 2));
        waEditText2.setOnTouchListener(new IDxTListenerShape63S0200000_2_I1(scrollView, 2, new AnonymousClass09P(context, new C63923Mb(scrollView, waEditText2))));
    }
}
