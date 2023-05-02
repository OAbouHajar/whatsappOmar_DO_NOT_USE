package com.obwhatsapp.biz;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass1ZW;
import X.C13680ns;
import X.C13690nt;
import X.C34221ju;
import X.C35621mE;
import X.C52662eE;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class BusinessHoursContentView extends FrameLayout implements AnonymousClass006 {
    public static final int[] A04 = {R.id.business_hours_day_layout_0, R.id.business_hours_day_layout_1, R.id.business_hours_day_layout_2, R.id.business_hours_day_layout_3, R.id.business_hours_day_layout_4, R.id.business_hours_day_layout_5, R.id.business_hours_day_layout_6};
    public C52662eE A00;
    public List A01;
    public List A02;
    public boolean A03;

    public BusinessHoursContentView(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        A00();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        A00();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        A00();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        A00();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final void A00() {
        View inflate = C13680ns.A0G(this).inflate(R.layout.layout00b2, this, true);
        this.A02 = C13690nt.A0i(r5);
        this.A01 = C13690nt.A0i(r5);
        for (int findViewById : A04) {
            View findViewById2 = inflate.findViewById(findViewById);
            View findViewById3 = findViewById2.findViewById(R.id.business_hours_day_layout_title);
            View findViewById4 = findViewById2.findViewById(R.id.business_hours_day_layout_description);
            this.A02.add(findViewById2);
            this.A01.add(C13690nt.A0I(findViewById3, findViewById4));
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public int getLayout() {
        return R.layout.layout00b2;
    }

    public void setFullView(boolean z2) {
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            if (i2 != 0) {
                ((View) this.A02.get(i2)).setVisibility(C13680ns.A02(z2 ? 1 : 0));
            }
        }
    }

    public void setup(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((TextView) C13690nt.A0a(this.A01, i2)).setText((CharSequence) C13690nt.A0a(list, i2));
            ((TextView) ((Pair) this.A01.get(i2)).second).setText((CharSequence) ((Pair) list.get(i2)).second);
        }
    }

    public void setupWithOpenNow(List list, long j2, C35621mE r12) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 == 0) {
                String str = r12.A01;
                Calendar instance = Calendar.getInstance(AnonymousClass1ZW.A0E(str) ? TimeZone.getDefault() : TimeZone.getTimeZone(str));
                instance.setTimeInMillis(j2);
                int i3 = instance.get(7);
                int i4 = (instance.get(11) * 60) + instance.get(12);
                Iterator it = r12.A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C34221ju r6 = (C34221ju) it.next();
                    if (r6.A00 == i3) {
                        int i5 = r6.A01;
                        if (i5 != 0) {
                            if (i5 == 1 || i5 == 2) {
                                break;
                            }
                        } else {
                            Integer num = r6.A03;
                            AnonymousClass00B.A06(num);
                            if (i4 >= num.intValue()) {
                                Integer num2 = r6.A02;
                                AnonymousClass00B.A06(num2);
                                if (i4 <= num2.intValue()) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                ForegroundColorSpan A0G = C13690nt.A0G(getContext(), R.color.color00d4);
                String string = getContext().getString(R.string.str02f9);
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(A0G, 0, string.length(), 33);
                ((TextView) C13690nt.A0a(this.A01, i2)).setText(spannableString);
                ((TextView) ((Pair) this.A01.get(i2)).second).setText((CharSequence) ((Pair) list.get(i2)).second);
            }
            ((TextView) C13690nt.A0a(this.A01, i2)).setText((CharSequence) C13690nt.A0a(list, i2));
            ((TextView) ((Pair) this.A01.get(i2)).second).setText((CharSequence) ((Pair) list.get(i2)).second);
        }
    }
}
