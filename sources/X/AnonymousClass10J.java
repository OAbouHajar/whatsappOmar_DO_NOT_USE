package X;

import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.10J  reason: invalid class name */
public class AnonymousClass10J extends C14720pe {
    public static SharedPreferences A03;
    public final C14710pd A00;
    public final C17020u3 A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap(0);

    public AnonymousClass10J(C14710pd r9, C222217c r10, C226318r r11, C17020u3 r12, C16320sq r13) {
        super(r10, r11, r12, r13, "ab-prechatd-props");
        this.A00 = r9;
        this.A01 = r12;
    }

    public synchronized SharedPreferences A0F() {
        SharedPreferences sharedPreferences;
        sharedPreferences = A03;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("ab-prechatd-props");
            A03 = sharedPreferences;
        }
        return sharedPreferences;
    }
}
