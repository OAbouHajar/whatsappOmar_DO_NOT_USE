package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.5xt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119445xt implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ AnonymousClass4KB A00;

    public /* synthetic */ C119445xt(AnonymousClass4KB r1) {
        this.A00 = r1;
    }

    public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
        AnonymousClass4KB r4 = this.A00;
        Calendar instance = Calendar.getInstance();
        instance.set(1, i2);
        instance.set(2, i3);
        instance.set(5, i4);
        String format = new SimpleDateFormat("dd/MM/yyyy", Locale.US).format(instance.getTime());
        C59052ub r7 = r4.A02;
        C14990q7 r3 = r4.A00;
        C31201dg r2 = r4.A01;
        C62183Bz.A03(r3).A06(new C111245fb(r7, format), (long) r2.A00);
        C14930q1 A0H = r2.A0H(44);
        if (A0H != null) {
            C14940q2 r42 = new C14940q2();
            r42.A03(format, 0);
            r42.A03(Integer.valueOf(i4), 1);
            r42.A03(Integer.valueOf(i3), 2);
            r42.A03(Integer.valueOf(i2), 3);
            C29701b3.A01(r3, r2, r42.A01(), A0H);
        }
    }
}
