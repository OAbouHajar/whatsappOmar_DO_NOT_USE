package X;

import android.content.Context;
import java.io.File;
import java.util.List;

/* renamed from: X.3pJ  reason: invalid class name and case insensitive filesystem */
public class C73923pJ extends C608336h {
    public final AnonymousClass1LC A00;
    public final List A01;

    public C73923pJ(Context context, AnonymousClass1LC r3, List list) {
        super(context);
        AnonymousClass00B.A0F(AnonymousClass000.A1Q(list.size()));
        this.A00 = r3;
        this.A01 = list;
    }

    public File A0B() {
        AnonymousClass1LC r0 = this.A00;
        List list = this.A01;
        AnonymousClass1GI r2 = (AnonymousClass1GI) ((AnonymousClass1CC) r0.A00.A00(AnonymousClass1CC.class)).A00.get();
        return r2.A00(new AnonymousClass3GD(r2.A02, list));
    }
}
