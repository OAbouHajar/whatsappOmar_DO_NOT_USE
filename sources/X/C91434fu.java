package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.obwhatsapp.R;
import java.util.Set;

/* renamed from: X.4fu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91434fu implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Resources A01;
    public final /* synthetic */ C14870pt A02;
    public final /* synthetic */ C16760tb A03;
    public final /* synthetic */ AnonymousClass5QN A04;
    public final /* synthetic */ Set A05;

    public /* synthetic */ C91434fu(Activity activity, Resources resources, C14870pt r3, C16760tb r4, AnonymousClass5QN r5, Set set) {
        this.A00 = activity;
        this.A03 = r4;
        this.A05 = set;
        this.A02 = r3;
        this.A01 = resources;
        this.A04 = r5;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Activity activity = this.A00;
        C16760tb r2 = this.A03;
        Set set = this.A05;
        C14870pt r7 = this.A02;
        Resources resources = this.A01;
        AnonymousClass5QN r5 = this.A04;
        AnonymousClass29T.A00(activity, 13);
        r2.A0W(set, true);
        if (set.size() == 1) {
            r7.A09(R.string.str1682, 0);
        } else {
            int size = set.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, set.size(), 0);
            r7.A0H(resources.getQuantityString(R.plurals.plurals0147, size, objArr), 0);
        }
        r5.APT();
    }
}
