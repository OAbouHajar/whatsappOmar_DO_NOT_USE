package X;

import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3HQ  reason: invalid class name */
public final class AnonymousClass3HQ implements C109015Qj {
    public final /* synthetic */ AnonymousClass1ML A00;
    public final /* synthetic */ C211613a A01;
    public final /* synthetic */ C214013y A02;
    public final /* synthetic */ WeakReference A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass3HQ(AnonymousClass1ML r1, C211613a r2, C214013y r3, WeakReference weakReference, boolean z2) {
        this.A00 = r1;
        this.A03 = weakReference;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = z2;
    }

    public static final String A00(C812947p r1) {
        if (C18450wi.A0R(r1, C79243zX.A00)) {
            return "activity_no_longer_active";
        }
        if (C18450wi.A0R(r1, C79253zY.A00)) {
            return "success";
        }
        if (r1 instanceof C79233zW) {
            return "bk_layout_data_error";
        }
        if (r1 instanceof C79223zV) {
            return "unknown_error";
        }
        throw new AnonymousClass2Xe();
    }

    public void AOs(C812947p r11) {
        AnonymousClass1ML r5 = this.A00;
        C14550pN A002 = AnonymousClass1ML.A00(this.A03);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            r5.A04.set(false);
            return;
        }
        C214013y r4 = this.A02;
        C78053x1 r0 = C78053x1.A00;
        String A003 = A00(r11);
        C18450wi.A0H(A003, 1);
        r4.A00.AKi(354170068, r0.A00, A003);
        r4.A01("editor_callback");
        boolean z2 = r11 instanceof C79253zY;
        if (z2) {
            r5.A05.set(r5.A01.A00());
            A002.Ac1();
            C211613a r7 = this.A01;
            boolean z3 = this.A04;
            r7.A04((Integer) null, (String) null, 2, z3);
            r7.A03((Integer) null, (String) null, 4, z3);
        } else {
            C211613a r8 = this.A01;
            boolean z4 = this.A04;
            A002.Ac1();
            A002.Afg(R.string.str1bee);
            if (!C18450wi.A0R(r11, C79243zX.A00) && !(r11 instanceof C79233zW)) {
                if (C18450wi.A0R(r11, C79253zY.A00)) {
                    throw AnonymousClass000.A0V("Success type should not be converted to error type.");
                } else if (!(r11 instanceof C79223zV)) {
                    throw new AnonymousClass2Xe();
                }
            }
            r8.A04(1, A00(r11), 3, z4);
        }
        r5.A04.set(false);
        r4.A00(z2 ? AnonymousClass42P.SUCCESS : AnonymousClass42P.FAIL);
    }
}
