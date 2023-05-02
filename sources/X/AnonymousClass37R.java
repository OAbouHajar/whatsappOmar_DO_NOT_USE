package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.dialogs.ProgressDialogFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.37R  reason: invalid class name */
public class AnonymousClass37R extends C16690tT {
    public C16010sH A00;
    public ProgressDialogFragment A01;
    public Set A02;
    public final DialogFragment A03;
    public final AnonymousClass119 A04;
    public final WeakReference A05;
    public final boolean A06;

    public AnonymousClass37R(DialogFragment dialogFragment, AnonymousClass02C r3, AnonymousClass119 r4, C16010sH r5, boolean z2) {
        this.A05 = C13690nt.A0h(r3);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A00 = r5;
        this.A06 = z2;
    }

    public AnonymousClass37R(DialogFragment dialogFragment, AnonymousClass02C r3, AnonymousClass119 r4, Set set, boolean z2) {
        this.A05 = C13690nt.A0h(r3);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A02 = set;
        this.A06 = z2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2;
        C16010sH r0 = this.A00;
        if (r0 != null) {
            i2 = this.A04.A00(C16010sH.A02(r0));
        } else {
            AnonymousClass119 r02 = this.A04;
            Set set = this.A02;
            i2 = 0;
            if (set != null) {
                Iterator it = r02.A01().iterator();
                while (it.hasNext()) {
                    if (set.contains(C13680ns.A0V(it).A11.A00)) {
                        i2++;
                    }
                }
            }
        }
        return Integer.valueOf(i2);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        DialogFragment dialogFragment;
        Number number = (Number) obj;
        AnonymousClass02C r4 = (AnonymousClass02C) this.A05.get();
        if (r4 != null && !r4.A0L) {
            this.A01.A1N();
            C16010sH r0 = this.A00;
            if (r0 != null) {
                dialogFragment = this.A03;
                AnonymousClass3A4.A00(dialogFragment, r0);
            } else {
                Set set = this.A02;
                dialogFragment = this.A03;
                Bundle A0D = C13690nt.A0D();
                A0D.putStringArrayList("selection_jids", C16030sJ.A06(set));
                dialogFragment.A0T(A0D);
            }
            Bundle bundle = dialogFragment.A05;
            bundle.putInt("unsent_count", number.intValue());
            bundle.putBoolean("chatContainsStarredMessages", this.A06);
            AnonymousClass00B.A06(r4);
            AnonymousClass050 r1 = new AnonymousClass050(r4);
            r1.A0C(dialogFragment, (String) null);
            r1.A02();
        }
    }
}
