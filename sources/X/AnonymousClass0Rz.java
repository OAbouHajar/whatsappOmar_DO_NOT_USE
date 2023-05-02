package X;

import java.util.Map;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0Rz  reason: invalid class name */
public class AnonymousClass0Rz {
    public C05400Qu A00 = new C05400Qu();
    public AnonymousClass0I6 A01 = null;
    public Map A02 = AnonymousClass000.A0x();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r7 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture A00(X.C06050Ua r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0025
            X.0UX r5 = r7.A02
            if (r5 == 0) goto L_0x0025
        L_0x0006:
            X.0UX r3 = r7.A03
            if (r3 == 0) goto L_0x002c
            float r1 = r3.A01
            float r0 = r3.A03
            float r1 = r1 + r0
            float r2 = r3.A02
            float r0 = r3.A00
            float r2 = r2 + r0
        L_0x0014:
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            double r0 = (double) r2
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            android.graphics.Picture r0 = r6.A01(r7, r3, r0)
            return r0
        L_0x0025:
            X.0I6 r0 = r6.A01
            X.0UX r5 = r0.A00
            if (r7 == 0) goto L_0x002c
            goto L_0x0006
        L_0x002c:
            X.0I6 r4 = r6.A01
            X.0f1 r3 = r4.A01
            if (r3 == 0) goto L_0x0056
            X.0Ju r0 = r3.A01
            X.0Ju r1 = X.C03770Ju.percent
            if (r0 == r1) goto L_0x0049
            X.0f1 r2 = r4.A00
            if (r2 == 0) goto L_0x0049
            X.0Ju r0 = r2.A01
            if (r0 == r1) goto L_0x0049
            float r1 = r3.A00()
            float r2 = r2.A00()
            goto L_0x0014
        L_0x0049:
            if (r5 == 0) goto L_0x0056
            float r1 = r3.A00()
            float r2 = r5.A00
            float r2 = r2 * r1
            float r0 = r5.A03
            float r2 = r2 / r0
            goto L_0x0014
        L_0x0056:
            X.0f1 r0 = r4.A00
            if (r0 == 0) goto L_0x0067
            if (r5 == 0) goto L_0x0067
            float r2 = r0.A00()
            float r1 = r5.A03
            float r1 = r1 * r2
            float r0 = r5.A00
            float r1 = r1 / r0
            goto L_0x0014
        L_0x0067:
            r0 = 512(0x200, float:7.175E-43)
            android.graphics.Picture r0 = r6.A01(r7, r0, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Rz.A00(X.0Ua):android.graphics.Picture");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture A01(X.C06050Ua r11, int r12, int r13) {
        /*
            r10 = this;
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r5 = r3.beginRecording(r12, r13)
            if (r11 == 0) goto L_0x0124
            X.0UX r0 = r11.A03
            if (r0 != 0) goto L_0x001f
            X.0Ua r0 = new X.0Ua
            r0.<init>(r11)
            r11 = r0
        L_0x0015:
            float r4 = (float) r12
            float r2 = (float) r13
            r1 = 0
            X.0UX r0 = new X.0UX
            r0.<init>(r1, r1, r4, r2)
            r11.A03 = r0
        L_0x001f:
            X.0XJ r7 = new X.0XJ
            r7.<init>(r5)
            r7.A01 = r10
            X.0I6 r6 = r10.A01
            r8 = 0
            if (r6 != 0) goto L_0x003c
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = "Nothing to render. Document is empty."
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "SVGAndroidRenderer"
            android.util.Log.w(r0, r1)
        L_0x0038:
            r3.endRecording()
            return r3
        L_0x003c:
            java.lang.String r9 = r11.A04
            if (r9 == 0) goto L_0x0068
            X.0IL r4 = r10.A03(r9)
            r1 = 1
            java.lang.String r2 = "SVGAndroidRenderer"
            if (r4 == 0) goto L_0x0061
            boolean r0 = r4 instanceof X.AnonymousClass0I8
            if (r0 == 0) goto L_0x0061
            X.0IB r4 = (X.AnonymousClass0IB) r4
            X.0UX r5 = r4.A00
            if (r5 != 0) goto L_0x0075
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r9
            java.lang.String r0 = "View element with id \"%s\" is missing a viewBox attribute."
        L_0x0059:
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r2, r0)
            goto L_0x0038
        L_0x0061:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r9
            java.lang.String r0 = "View element with id \"%s\" not found."
            goto L_0x0059
        L_0x0068:
            X.0UX r5 = r11.A02
            if (r5 != 0) goto L_0x006e
            X.0UX r5 = r6.A00
        L_0x006e:
            X.0Uo r4 = r11.A01
            if (r4 != 0) goto L_0x0077
            X.0Uo r4 = r6.A00
            goto L_0x0077
        L_0x0075:
            X.0Uo r4 = r4.A00
        L_0x0077:
            X.0Qu r0 = r11.A00
            if (r0 == 0) goto L_0x008c
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x008c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x008c
            X.0Qu r1 = r11.A00
            X.0Qu r0 = r10.A00
            r0.A01(r1)
        L_0x008c:
            X.0UF r0 = new X.0UF
            r0.<init>(r7)
            r7.A02 = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A05 = r0
            X.0UF r1 = r7.A02
            X.0f0 r0 = X.AnonymousClass0f0.A00()
            r7.A0k(r0, r1)
            X.0UF r2 = r7.A02
            r0 = 0
            r2.A03 = r0
            r2.A07 = r8
            java.util.Stack r1 = r7.A05
            X.0UF r0 = new X.0UF
            r0.<init>(r2, r7)
            r1.push(r0)
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A03 = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A04 = r0
            java.lang.Boolean r0 = r6.A02
            if (r0 == 0) goto L_0x00ce
            X.0UF r1 = r7.A02
            boolean r0 = r0.booleanValue()
            r1.A07 = r0
        L_0x00ce:
            r7.A0W()
            X.0UX r0 = r11.A03
            X.0UX r2 = new X.0UX
            r2.<init>(r0)
            X.0f1 r1 = r6.A01
            if (r1 == 0) goto L_0x00e4
            float r0 = r2.A03
            float r0 = r1.A04(r7, r0)
            r2.A03 = r0
        L_0x00e4:
            X.0f1 r1 = r6.A00
            if (r1 == 0) goto L_0x00f0
            float r0 = r2.A00
            float r0 = r1.A04(r7, r0)
            r2.A00 = r0
        L_0x00f0:
            r7.A0c(r4, r2, r5, r6)
            r7.A0V()
            X.0Qu r0 = r11.A00
            if (r0 == 0) goto L_0x0038
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0038
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0038
            X.0Qu r0 = r10.A00
            X.0Jc r2 = X.C03590Jc.RenderOptions
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0038
            java.util.Iterator r1 = r0.iterator()
        L_0x0110:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.0Pf r0 = (X.C05090Pf) r0
            X.0Jc r0 = r0.A01
            if (r0 != r2) goto L_0x0110
            r1.remove()
            goto L_0x0110
        L_0x0124:
            X.0Ua r11 = new X.0Ua
            r11.<init>()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Rz.A01(X.0Ua, int, int):android.graphics.Picture");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.0PV] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0IL A02(X.C13170la r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = r5
            X.0IL r3 = (X.AnonymousClass0IL) r3
            java.lang.String r0 = r3.A03
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r5.AAc()
            java.util.Iterator r2 = r0.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r2.next()
            X.0PV r1 = (X.AnonymousClass0PV) r1
            boolean r0 = r1 instanceof X.AnonymousClass0IL
            if (r0 == 0) goto L_0x0013
            r3 = r1
            X.0IL r3 = (X.AnonymousClass0IL) r3
            java.lang.String r0 = r3.A03
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1 instanceof X.C13170la
            if (r0 == 0) goto L_0x0013
            X.0la r1 = (X.C13170la) r1
            X.0IL r3 = r4.A02(r1, r6)
            if (r3 == 0) goto L_0x0013
        L_0x003a:
            return r3
        L_0x003b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Rz.A02(X.0la, java.lang.String):X.0IL");
    }

    public AnonymousClass0IL A03(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        AnonymousClass0I6 r1 = this.A01;
        if (str.equals(r1.A03)) {
            return r1;
        }
        Map map = this.A02;
        if (map.containsKey(str)) {
            return (AnonymousClass0IL) map.get(str);
        }
        AnonymousClass0IL A022 = A02(this.A01, str);
        map.put(str, A022);
        return A022;
    }

    public AnonymousClass0PV A04(String str) {
        String substring;
        String str2;
        String replace;
        if (str != null) {
            String str3 = "\"";
            if (!str.startsWith(str3) || !str.endsWith(str3)) {
                str3 = "'";
                if (str.startsWith(str3) && str.endsWith(str3)) {
                    substring = str.substring(1, str.length() - 1);
                    str2 = "\\'";
                }
                replace = str.replace("\\\n", "").replace("\\A", IOUtils.LINE_SEPARATOR_UNIX);
                if (replace.length() > 1 && replace.startsWith("#")) {
                    return A03(replace.substring(1));
                }
            } else {
                substring = str.substring(1, str.length() - 1);
                str2 = "\\\"";
            }
            str = substring.replace(str2, str3);
            replace = str.replace("\\\n", "").replace("\\A", IOUtils.LINE_SEPARATOR_UNIX);
            return A03(replace.substring(1));
        }
        return null;
    }
}
