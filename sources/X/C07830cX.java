package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0cX  reason: invalid class name and case insensitive filesystem */
public class C07830cX implements C019509b {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C02780Ex A01;
    public final /* synthetic */ ArrayList A02;

    public C07830cX(View view, C02780Ex r2, ArrayList arrayList) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public void AZB(C015707n r1) {
    }

    public void AZC(C015707n r6) {
        r6.A09(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass000.A0N(arrayList, i2).setVisibility(0);
        }
    }

    public void AZD(C015707n r1) {
    }

    public void AZE(C015707n r1) {
    }

    public void AZF(C015707n r1) {
        r1.A09(this);
        r1.A08(this);
    }
}
