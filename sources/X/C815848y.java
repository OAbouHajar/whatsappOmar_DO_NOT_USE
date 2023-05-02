package X;

import java.io.PrintStream;

/* renamed from: X.48y  reason: invalid class name and case insensitive filesystem */
public final class C815848y {
    public static final AnonymousClass4PM A00;

    static {
        AnonymousClass4PM r0;
        try {
            Integer num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
            if (num != null) {
                if (num.intValue() >= 19) {
                    r0 = new C66853ab();
                    A00 = r0;
                }
            }
        } catch (Exception e2) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e2.printStackTrace(printStream);
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = C66843aa.class.getName();
            StringBuilder A0g = C13690nt.A0g(name.length() + 133);
            A0g.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            A0g.append(name);
            printStream2.println(AnonymousClass000.A0h("will be used. The error is: ", A0g));
            th.printStackTrace(printStream2);
            r0 = new C66843aa();
        }
        r0 = Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new C66863ac() : new C66843aa();
        A00 = r0;
    }
}
