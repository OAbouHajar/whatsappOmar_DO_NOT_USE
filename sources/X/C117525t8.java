package X;

import android.content.Context;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.5t8  reason: invalid class name and case insensitive filesystem */
public class C117525t8 {
    public AnonymousClass5wB A00;
    public C118115uA A01;
    public final Context A02;
    public final Properties A03;
    public final C118105u9 A04;
    public final C118295uS A05;

    public C117525t8(Context context, C118295uS r5) {
        String str;
        this.A05 = r5;
        this.A02 = context;
        this.A00 = r5.A03;
        Properties properties = new Properties();
        try {
            properties.load(this.A02.getAssets().open("version.properties"));
            this.A03 = properties;
            this.A04 = new C118105u9(this);
            if (r5.A03 != null && (str = r5.A00) != null) {
                this.A01 = new C118115uA(str, this.A00);
            }
        } catch (IOException e2) {
            throw C110115dX.A0Z(e2);
        }
    }
}
