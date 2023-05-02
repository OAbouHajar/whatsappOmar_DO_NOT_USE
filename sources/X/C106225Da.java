package X;

import android.os.Bundle;
import com.obwhatsapp.calling.callrating.CategorizedUserProblemsFragment;

/* renamed from: X.5Da  reason: invalid class name and case insensitive filesystem */
public final class C106225Da extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CategorizedUserProblemsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106225Da(CategorizedUserProblemsFragment categorizedUserProblemsFragment) {
        super(0);
        this.this$0 = categorizedUserProblemsFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Bundle bundle = this.this$0.A05;
        if (bundle != null) {
            return Integer.valueOf(bundle.getInt("index"));
        }
        throw AnonymousClass000.A0T("Required value was null.");
    }
}
