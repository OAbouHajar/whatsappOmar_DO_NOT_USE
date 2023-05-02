package X;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.text.IDxWAdapterShape103S0100000_2_I1;
import java.util.List;

/* renamed from: X.3R3  reason: invalid class name */
public final class AnonymousClass3R3 extends AnonymousClass01X {
    public int A00 = -1;
    public CharSequence A01 = "";
    public final AnonymousClass01V A02;
    public final AnonymousClass013 A03;
    public final C17250um A04;
    public final C17020u3 A05;
    public final List A06;
    public final AnonymousClass22J A07;

    public AnonymousClass3R3(AnonymousClass01V r2, AnonymousClass013 r3, C17250um r4, C17020u3 r5, List list, AnonymousClass22J r7) {
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = list;
        this.A05 = r5;
        this.A07 = r7;
    }

    public void A07(C005602k r3) {
        C18450wi.A0H(r3, 0);
        if (r3 instanceof C64913Sd) {
            C64913Sd r32 = (C64913Sd) r3;
            C41651wK r1 = r32.A01;
            if (r1 != null) {
                r32.A03.removeTextChangedListener(r1);
            }
            AnonymousClass35O r12 = r32.A00;
            if (r12 != null) {
                r32.A03.removeTextChangedListener(r12);
            }
            r32.A01 = null;
            r32.A00 = null;
        }
    }

    public int A0C() {
        return this.A06.size();
    }

    public void ANf(C005602k r14, int i2) {
        C18450wi.A0H(r14, 0);
        int i3 = r14.A02;
        boolean z2 = false;
        if (i3 == 0) {
            C64663Re r142 = (C64663Re) r14;
            String str = ((AnonymousClass4VY) this.A06.get(i2)).A01;
            if (i2 == this.A00) {
                z2 = true;
            }
            C106595El r2 = new C106595El(this, i2);
            AppCompatRadioButton appCompatRadioButton = r142.A00;
            appCompatRadioButton.setText(str);
            appCompatRadioButton.setChecked(z2);
            C13680ns.A1A(appCompatRadioButton, r2, 42);
        } else if (i3 == 1) {
            C64913Sd r143 = (C64913Sd) r14;
            String str2 = ((AnonymousClass4VY) this.A06.get(i2)).A01;
            boolean A1R = AnonymousClass000.A1R(i2, this.A00);
            CharSequence charSequence = this.A01;
            C106605Em r4 = new C106605Em(this, i2);
            AnonymousClass5FB r3 = new AnonymousClass5FB(this);
            C18450wi.A0H(charSequence, 2);
            AppCompatRadioButton appCompatRadioButton2 = r143.A02;
            appCompatRadioButton2.setText(str2);
            appCompatRadioButton2.setChecked(A1R);
            C13680ns.A1A(appCompatRadioButton2, r4, 41);
            WaEditText waEditText = r143.A03;
            C41651wK r0 = r143.A01;
            if (r0 != null) {
                waEditText.removeTextChangedListener(r0);
            }
            r143.A01 = new IDxWAdapterShape103S0100000_2_I1(r3, 0);
            AnonymousClass35O r02 = r143.A00;
            if (r02 != null) {
                waEditText.removeTextChangedListener(r02);
            }
            C17250um r8 = r143.A07;
            r143.A00 = new AnonymousClass35O(waEditText, r143.A04, r143.A05, r143.A06, r8, r143.A08, 30, 30, false);
            waEditText.setText(charSequence);
            waEditText.addTextChangedListener(r143.A00);
            waEditText.addTextChangedListener(r143.A01);
            if (charSequence.length() > 0) {
                waEditText.requestFocus();
                waEditText.setSelection(waEditText.length());
            }
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        if (i2 == 0) {
            return new C64663Re(AnonymousClass3K4.A0K(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout009a));
        }
        if (i2 == 1) {
            return new C64913Sd(AnonymousClass3K4.A0K(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout009c), this.A02, this.A03, this.A04, this.A05);
        }
        throw AnonymousClass000.A0V("Unsupported view type");
    }

    public int getItemViewType(int i2) {
        return (!"other".equalsIgnoreCase(((AnonymousClass4VY) this.A06.get(i2)).A00) || this.A00 != i2) ? 0 : 1;
    }
}
