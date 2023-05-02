package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.obwhatsapp.R;
import com.obwhatsapp.support.ReportSpamDialogFragment;

/* renamed from: X.3CA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CA implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ C16010sH A02;
    public final /* synthetic */ C16010sH A03;
    public final /* synthetic */ ReportSpamDialogFragment A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass3CA(CheckBox checkBox, C16010sH r2, C16010sH r3, ReportSpamDialogFragment reportSpamDialogFragment, String str, int i2, boolean z2, boolean z3) {
        this.A04 = reportSpamDialogFragment;
        this.A05 = str;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = checkBox;
        this.A00 = i2;
        this.A06 = z2;
        this.A07 = z3;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ReportSpamDialogFragment reportSpamDialogFragment = this.A04;
        String str = this.A05;
        C16010sH r5 = this.A02;
        C16010sH r6 = this.A03;
        CheckBox checkBox = this.A01;
        int i3 = this.A00;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        if (i2 == -1) {
            reportSpamDialogFragment.A0F = true;
            if (str.equals("status_post_report")) {
                C74483qc r1 = new C74483qc();
                r1.A00 = 1;
                reportSpamDialogFragment.A0B.A06(r1);
            }
            boolean isChecked = checkBox.isChecked();
            if (reportSpamDialogFragment.A06.A02(reportSpamDialogFragment.A0u())) {
                if (z3) {
                    reportSpamDialogFragment.A0r(C14750ph.A02(reportSpamDialogFragment.A0u()).addFlags(603979776));
                }
                reportSpamDialogFragment.A01.A08(R.string.str1436, R.string.str13db);
                reportSpamDialogFragment.A0E.Acl(new AnonymousClass3I9(r5, r6, new AnonymousClass1Y6(reportSpamDialogFragment.A01, reportSpamDialogFragment.A05, reportSpamDialogFragment.A07), reportSpamDialogFragment, str, i3, isChecked, z2));
            }
        }
    }
}
