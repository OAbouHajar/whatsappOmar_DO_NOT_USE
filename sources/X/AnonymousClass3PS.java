package X;

import android.os.Bundle;
import com.obwhatsapp.calling.callrating.CategorizedUserProblemsFragment;
import java.util.List;

/* renamed from: X.3PS  reason: invalid class name */
public final class AnonymousClass3PS extends AnonymousClass011 {
    public final List A00;

    public AnonymousClass3PS(AnonymousClass02C r2, List list) {
        super(r2, 0);
        this.A00 = list;
    }

    public int A01() {
        return this.A00.size();
    }

    public CharSequence A04(int i2) {
        return (CharSequence) this.A00.get(i2);
    }

    public AnonymousClass01A A0G(int i2) {
        CategorizedUserProblemsFragment categorizedUserProblemsFragment = new CategorizedUserProblemsFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("index", i2);
        categorizedUserProblemsFragment.A0T(A0D);
        return categorizedUserProblemsFragment;
    }
}
