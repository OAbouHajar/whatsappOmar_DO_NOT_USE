package X;

import android.view.View;
import com.obwhatsapp.biz.BusinessHoursView;

/* renamed from: X.4kD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94024kD implements View.OnClickListener {
    public final /* synthetic */ BusinessHoursView A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C94024kD(BusinessHoursView businessHoursView, Integer num, String str, boolean z2, boolean z3) {
        this.A00 = businessHoursView;
        this.A02 = str;
        this.A01 = num;
        this.A03 = z2;
        this.A04 = z3;
    }

    public final void onClick(View view) {
        BusinessHoursView businessHoursView = this.A00;
        String str = this.A02;
        Integer num = this.A01;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        if (!businessHoursView.A06) {
            businessHoursView.A02.A05((Integer) null, num, str, 4, z2, z3);
        }
        businessHoursView.A06 = !businessHoursView.A06;
        businessHoursView.A02();
    }
}
