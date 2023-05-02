package X;

import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0uV  reason: invalid class name and case insensitive filesystem */
public class C17080uV {
    public static final int A07;
    public static final String A08;
    public static final byte[] A09 = {0, 10};
    public AnonymousClass2QQ A00;
    public MappedByteBuffer A01;
    public Map A02;
    public final AnonymousClass1WA A03;
    public volatile File A04;
    public volatile String A05 = "unknown";
    public volatile boolean A06;

    static {
        String format = String.format(Locale.US, "%07d", new Object[]{Long.valueOf((System.currentTimeMillis() / 1000) % 10000000)});
        A08 = format;
        A07 = format.getBytes().length + 1;
    }

    public C17080uV(C16320sq r3) {
        this.A03 = new AnonymousClass1WA(r3, true);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0030 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0030=Splitter:B:14:0x0030, B:9:0x0028=Splitter:B:9:0x0028} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.io.File r4) {
        /*
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0031 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0031 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0031 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0031 }
            r2.readLine()     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x002c }
        L_0x0016:
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "\u0000"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x0028
            r3.addFirst(r1)     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x002c }
            goto L_0x0016
        L_0x0028:
            r2.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0031
        L_0x002c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r1 = r3.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            java.lang.String r0 = ":"
            r2.append(r0)
            goto L_0x003a
        L_0x004f:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17080uV.A00(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A01() {
        /*
            r6 = this;
            boolean r0 = r6.A06
            if (r0 != 0) goto L_0x000a
            X.00N r0 = new X.00N
            r0.<init>()
            return r0
        L_0x000a:
            java.util.Map r5 = r6.A02
            if (r5 != 0) goto L_0x004f
            r4 = 5
            X.00N r5 = new X.00N
            r5.<init>((int) r4)
            r3 = 0
        L_0x0015:
            if (r3 >= r4) goto L_0x004d
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r6.A05
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004a
            java.io.File r0 = r6.A04
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x004a
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x004a }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004a }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x004a }
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0045 }
            r5.put(r0, r2)     // Catch:{ all -> 0x0045 }
            r1.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004a
        L_0x0045:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x004d:
            r6.A02 = r5
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17080uV.A01():java.util.Map");
    }

    public void A02(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getSimpleName());
        sb.append(" ");
        sb.append(str);
        this.A03.execute(new RunnableRunnableShape0S1100000_I0(31, sb.toString(), this));
    }
}
