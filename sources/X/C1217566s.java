package X;

import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.66s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1217566s implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14530pL A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C114185nG A03;
    public final /* synthetic */ C28371Vv A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ C1217566s(C14530pL r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C114185nG r3, C28371Vv r4, String str, String str2, int i2) {
        this.A03 = r3;
        this.A00 = i2;
        this.A01 = r1;
        this.A05 = str;
        this.A02 = pinBottomSheetDialogFragment;
        this.A04 = r4;
        this.A06 = str2;
    }

    public final void run() {
        C114185nG r7 = this.A03;
        int i2 = this.A00;
        C14530pL r5 = this.A01;
        String str = this.A05;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        C28371Vv r3 = this.A04;
        String str2 = this.A06;
        r7.A02.A0C(new AnonymousClass60Q(r5, pinBottomSheetDialogFragment, r7, str, i2), r3, r7.A00.A0A, str2);
    }
}
