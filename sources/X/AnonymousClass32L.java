package X;

import com.mod.bomfab.bomb.BuildConfig;
import java.util.HashMap;

/* renamed from: X.32L  reason: invalid class name */
public abstract class AnonymousClass32L extends C16650tP {
    public String A00 = BuildConfig.VERSION_NAME;
    public final C25531Kd A01;
    public final C17210ui A02;
    public final C17120uZ A03;
    public final AnonymousClass013 A04;

    public AnonymousClass32L(C16300so r9, C16670tR r10, C25531Kd r11, C17210ui r12, C17120uZ r13, AnonymousClass013 r14, C16710tV r15, C25551Kf r16, C16320sq r17) {
        super(r9, r10, r15, r16, r17, "WA_BizDirectorySearch");
        this.A04 = r14;
        this.A01 = r11;
        this.A03 = r13;
        this.A02 = r12;
    }

    public static void A01(AnonymousClass26B r3, HashMap hashMap) {
        String str = r3.A08;
        hashMap.put("location_type", str);
        if (str.equals("country_default")) {
            String str2 = r3.A06;
            AnonymousClass00B.A06(str2);
            hashMap.put("country_code", str2);
            return;
        }
        boolean A012 = r3.A01();
        hashMap.put("wa_biz_directory_lat", A012 ? r3.A03 : r3.A01);
        hashMap.put("wa_biz_directory_long", A012 ? r3.A04 : r3.A02);
        hashMap.put("radius", r3.A05);
    }
}
