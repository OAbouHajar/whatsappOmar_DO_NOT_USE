package X;

import java.io.PrintStream;

/* renamed from: X.0oz  reason: invalid class name and case insensitive filesystem */
public final class C14330oz {
    public static final C14340p0 A00;

    static {
        C14340p0 r0;
        try {
            Integer num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
            if (num != null) {
                if (num.intValue() >= 19) {
                    r0 = new C66503Zp();
                    A00 = r0;
                }
            }
        } catch (Exception e2) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e2.printStackTrace(printStream);
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = C66493Zo.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream2.println(sb.toString());
            th.printStackTrace(printStream2);
            r0 = new C66493Zo();
        }
        r0 = Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new C66513Zq() : new C66493Zo();
        A00 = r0;
    }
}
