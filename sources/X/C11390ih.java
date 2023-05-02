package X;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: X.0ih  reason: invalid class name and case insensitive filesystem */
public final class C11390ih extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C07730cN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11390ih(C07730cN r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        C07730cN r0;
        Context context;
        String str;
        AnonymousClass0NU r4;
        if (Build.VERSION.SDK_INT >= 23) {
            C07730cN r1 = this.this$0;
            if (r1.A03 != null && r1.A07) {
                File file = new File(AnonymousClass0M8.A00(r1.A01), this.this$0.A03);
                context = this.this$0.A01;
                str = file.getAbsolutePath();
                r4 = new AnonymousClass0NU();
                r0 = this.this$0;
                AnonymousClass0AP r12 = new AnonymousClass0AP(context, r0.A02, r4, str, r0.A06);
                AnonymousClass0M6.A00(r12, this.this$0.A00);
                return r12;
            }
        }
        r0 = this.this$0;
        context = r0.A01;
        str = r0.A03;
        r4 = new AnonymousClass0NU();
        AnonymousClass0AP r122 = new AnonymousClass0AP(context, r0.A02, r4, str, r0.A06);
        AnonymousClass0M6.A00(r122, this.this$0.A00);
        return r122;
    }
}
