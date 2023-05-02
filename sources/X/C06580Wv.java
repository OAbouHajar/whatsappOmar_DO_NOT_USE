package X;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Wv  reason: invalid class name and case insensitive filesystem */
public final class C06580Wv {
    public static final /* synthetic */ C06580Wv A00 = new C06580Wv();

    static {
        C87744Yj.A00(C13430m1.class).AG5();
    }

    public static final C09190f5 A00(String str) {
        String group;
        if (str != null && !C008703y.A0L(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                        C18450wi.A0E(group4);
                        return new C09190f5(group4, parseInt, parseInt2, parseInt3);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|(3:7|8|(2:10|(3:13|14|(2:16|(1:18)))))|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C07970cn A01(android.content.Context r5) {
        /*
            X.0cn r0 = X.C07970cn.A03
            if (r0 != 0) goto L_0x0043
            java.util.concurrent.locks.ReentrantLock r4 = X.C07970cn.A02
            r4.lock()
            X.0cn r0 = X.C07970cn.A03     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0040
            r3 = 0
            r2 = 0
            java.lang.String r1 = androidx.window.sidecar.SidecarProvider.getApiVersion()     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x001d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x001d }
            if (r0 != 0) goto L_0x0033
            X.0f5 r2 = A00(r1)     // Catch:{ NoClassDefFoundError | UnsupportedOperationException -> 0x001d }
        L_0x001d:
            if (r2 == 0) goto L_0x0033
            X.0f5 r0 = X.C09190f5.A07     // Catch:{ all -> 0x0033 }
            int r0 = r2.compareTo(r0)     // Catch:{ all -> 0x0033 }
            if (r0 < 0) goto L_0x0033
            X.0ck r1 = new X.0ck     // Catch:{ all -> 0x0033 }
            r1.<init>(r5)     // Catch:{ all -> 0x0033 }
            boolean r0 = r1.A03()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0033
            r3 = r1
        L_0x0033:
            X.0cn r0 = new X.0cn     // Catch:{ all -> 0x003b }
            r0.<init>(r3)     // Catch:{ all -> 0x003b }
            X.C07970cn.A03 = r0     // Catch:{ all -> 0x003b }
            goto L_0x0040
        L_0x003b:
            r0 = move-exception
            r4.unlock()
            throw r0
        L_0x0040:
            r4.unlock()
        L_0x0043:
            X.0cn r0 = X.C07970cn.A03
            X.C18450wi.A0F(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06580Wv.A01(android.content.Context):X.0cn");
    }

    public final C13430m1 A02(Context context) {
        C13100lT r1;
        C08000cq r2 = C08000cq.A00;
        try {
            WindowLayoutComponent A002 = AnonymousClass0X4.A00();
            if (A002 != null) {
                r1 = new C07960cm(A002);
                return new C07980co(r1, r2);
            }
        } catch (Throwable unused) {
        }
        r1 = A01(context);
        return new C07980co(r1, r2);
    }
}
