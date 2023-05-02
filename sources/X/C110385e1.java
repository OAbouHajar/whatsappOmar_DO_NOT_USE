package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import java.util.ArrayList;
import org.npci.commonlibrary.NPCIFragment;

/* renamed from: X.5e1  reason: invalid class name and case insensitive filesystem */
public class C110385e1 extends FrameLayout implements AnonymousClass69X {
    public int A00;
    public int A01;
    public Object A02;
    public ArrayList A03;

    public C110385e1(Context context) {
        super(context);
    }

    public void A00(ArrayList arrayList, AnonymousClass69I r5) {
        this.A03 = arrayList;
        addView(AnonymousClass000.A0N(arrayList, 0));
        C110115dX.A0l(this.A03, 0).A0B = r5;
        this.A00 = 0;
        this.A01 = getResources().getDisplayMetrics().widthPixels;
        int i2 = 1;
        while (true) {
            ArrayList arrayList2 = this.A03;
            if (i2 < arrayList2.size()) {
                C110495eG A0l = C110115dX.A0l(arrayList2, i2);
                A0l.A0B = r5;
                A0l.setX((float) this.A01);
                addView(A0l);
                i2++;
            } else {
                return;
            }
        }
    }

    public boolean A9B() {
        boolean z2;
        String inputValue = C110115dX.A0l(this.A03, this.A00).getInputValue();
        ArrayList arrayList = this.A03;
        int i2 = this.A00;
        if (C110115dX.A0l(arrayList, i2).A00 != inputValue.length()) {
            AnonymousClass000.A0N(arrayList, i2).requestFocus();
            return false;
        } else if (i2 == arrayList.size() - 1) {
            AnonymousClass000.A0N(arrayList, i2).requestFocus();
            int i3 = 0;
            while (true) {
                ArrayList arrayList2 = this.A03;
                if (i3 >= arrayList2.size()) {
                    return true;
                }
                if (!C110115dX.A0l(arrayList2, i3).getInputValue().equals(inputValue)) {
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.A03;
                        if (i4 >= arrayList3.size()) {
                            break;
                        }
                        C110115dX.A0l(arrayList3, i4).setText("");
                        i4++;
                    }
                    int i5 = this.A00;
                    if (i5 != 0) {
                        AnonymousClass000.A0N(this.A03, i5).animate().x((float) this.A01);
                        AnonymousClass000.A0N(this.A03, this.A00 - 1).animate().x(0.0f);
                        int i6 = this.A00 - 1;
                        this.A00 = i6;
                        AnonymousClass000.A0N(this.A03, i6).requestFocus();
                    }
                    ((NPCIFragment) C110115dX.A0l(this.A03, i3).A0B).A1C(this, getContext().getString(R.string.str1d35));
                    return false;
                }
                i3++;
            }
        } else {
            int i7 = this.A00;
            ArrayList arrayList4 = this.A03;
            if (i7 >= arrayList4.size() - 1) {
                z2 = false;
            } else {
                AnonymousClass000.A0N(arrayList4, i7).animate().x((float) (-this.A01));
                AnonymousClass000.A0N(this.A03, this.A00 + 1).animate().x(0.0f);
                int i8 = this.A00 + 1;
                this.A00 = i8;
                AnonymousClass000.A0N(this.A03, i8).requestFocus();
                z2 = true;
            }
            return !z2;
        }
    }

    public void Agw(Drawable drawable, View.OnClickListener onClickListener, String str, int i2, boolean z2, boolean z3) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i3 < arrayList.size()) {
                C110115dX.A0l(arrayList, i3).Agw(drawable, onClickListener, str, 0, true, true);
                i3++;
            } else {
                return;
            }
        }
    }

    public boolean Agx() {
        return C110115dX.A0l(this.A03, this.A00).Agx();
    }

    public Object getFormDataTag() {
        Object obj = this.A02;
        return obj == null ? C110115dX.A0l(this.A03, 0).A07 : obj;
    }

    public String getInputValue() {
        return C110115dX.A0l(this.A03, 0).getInputValue();
    }

    public void setFormDataTag(Object obj) {
        this.A02 = obj;
    }

    public void setText(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A03;
            if (i2 < arrayList.size()) {
                C110115dX.A0l(arrayList, i2).setText(str);
                i2++;
            } else {
                return;
            }
        }
    }
}
