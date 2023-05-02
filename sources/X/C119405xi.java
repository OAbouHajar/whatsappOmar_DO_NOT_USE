package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.5xi  reason: invalid class name and case insensitive filesystem */
public class C119405xi {
    public static int A00(C35391lr r2) {
        int i2 = r2.A01;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? R.drawable.av_card : R.drawable.av_discover : R.drawable.av_amex : R.drawable.av_mc : R.drawable.av_visa;
    }

    public static int A01(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C110115dX.A0G(list, i2).A01 == 2) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r7, X.C35391lr r8) {
        /*
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
            java.lang.String r3 = r7.getString(r0)
            int r0 = r8.A01
            java.lang.String r6 = X.C35391lr.A07(r0)
            java.lang.String r5 = ""
            if (r6 != 0) goto L_0x0012
            r6 = r5
        L_0x0012:
            int r2 = r8.A00
            r4 = 1
            r1 = 2131889993(0x7f120f49, float:1.9414665E38)
            if (r2 == r4) goto L_0x0026
            r0 = 4
            r1 = 2131889992(0x7f120f48, float:1.9414663E38)
            if (r2 == r0) goto L_0x0026
            r0 = 6
            if (r2 != r0) goto L_0x0067
            r1 = 2131889991(0x7f120f47, float:1.9414661E38)
        L_0x0026:
            java.lang.String r0 = r7.getString(r1)
        L_0x002a:
            if (r0 == 0) goto L_0x0041
            r1 = 2131889993(0x7f120f49, float:1.9414665E38)
            if (r2 == r4) goto L_0x003d
            r0 = 4
            r1 = 2131889992(0x7f120f48, float:1.9414663E38)
            if (r2 == r0) goto L_0x003d
            r0 = 6
            if (r2 != r0) goto L_0x0062
            r1 = 2131889991(0x7f120f47, float:1.9414661E38)
        L_0x003d:
            java.lang.String r5 = r7.getString(r1)
        L_0x0041:
            X.1lh r1 = r8.A09
            boolean r0 = X.C39841t9.A04(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = X.C110115dX.A0e(r1)
            java.lang.String r3 = A07(r0)
            r2 = 2131890076(0x7f120f9c, float:1.9414834E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r6
            r1[r4] = r5
            r0 = 2
            java.lang.String r3 = X.C13680ns.A0d(r7, r3, r1, r0, r2)
        L_0x0061:
            return r3
        L_0x0062:
            java.lang.String r5 = X.C30671cl.A02(r2)
            goto L_0x0041
        L_0x0067:
            java.lang.String r0 = X.C30671cl.A02(r2)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119405xi.A02(android.content.Context, X.1lr):java.lang.String");
    }

    public static String A03(Context context, C30671cl r3) {
        if (!TextUtils.isEmpty((CharSequence) null) || r3.A01 != 2) {
            return null;
        }
        return context.getString(R.string.str1018);
    }

    public static String A04(Context context, C30671cl r6, C18090w8 r7) {
        int i2;
        C39901tF r0 = r6.A08;
        AnonymousClass00B.A06(r0);
        if (r0.A09()) {
            if (r7.A0A() || r7.A06()) {
                StringBuilder A0o = AnonymousClass000.A0o();
                if (r6.A01 == 2) {
                    A0o.append(context.getString(R.string.str0ef7));
                }
                if (r6.A03 == 2) {
                    if (A0o.length() > 0) {
                        A0o.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                    A0o.append(context.getString(R.string.str0ef0));
                }
                return A0o.toString();
            }
            C39901tF r02 = r6.A08;
            if (r02 == null || r02.A09()) {
                if (r6.A01 != 2) {
                    return null;
                }
                i2 = R.string.str0664;
                return context.getString(i2);
            }
        }
        i2 = R.string.str0f80;
        return context.getString(i2);
    }

    public static String A05(Context context, C30671cl r5, C18290wS r6, boolean z2) {
        if (r5 instanceof C35391lr) {
            return A02(context, (C35391lr) r5);
        }
        if ((r5 instanceof C35371lp) || (r5 instanceof C35441lw)) {
            String string = context.getString(R.string.str188a);
            String str = (String) C110105dW.A0d(r5.A09);
            String str2 = r5.A0B;
            return !TextUtils.isEmpty(str) ? str : !TextUtils.isEmpty(str2) ? str2 : string;
        } else if (r5 instanceof C111785hP) {
            return (String) C110105dW.A0d(r5.A09);
        } else {
            String string2 = context.getString(R.string.str188a);
            String str3 = r5.A0B;
            if (str3 != null) {
                string2 = str3;
                C35301lh r1 = r5.A09;
                if (!C39841t9.A04(r1)) {
                    String A07 = A07((String) C39841t9.A02(r1));
                    StringBuilder A0q = AnonymousClass000.A0q(str3);
                    A0q.append(" ••");
                    string2 = AnonymousClass000.A0h(A07, A0q);
                }
            }
            if (!z2) {
                return string2;
            }
            return C13680ns.A0d(context, context.getString(r6.A03().AEW()), C110105dW.A1a(string2), 1, R.string.str17ea);
        }
    }

    public static String A06(C30671cl r0) {
        return A07((String) C39841t9.A02(r0.A09));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A07(java.lang.String r4) {
        /*
            int r1 = r4.length()
            r0 = 4
            if (r1 <= r0) goto L_0x000c
            int r1 = r1 - r0
            java.lang.String r4 = r4.substring(r1)
        L_0x000c:
            r3 = 0
            int r2 = r4.length()
            r1 = r2
        L_0x0012:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0023
            char r0 = r4.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0023
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0023:
            if (r3 == r1) goto L_0x002a
            int r1 = r1 - r3
            java.lang.String r4 = r4.substring(r1)
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119405xi.A07(java.lang.String):java.lang.String");
    }

    public static void A08(C30671cl r1, PaymentMethodRow paymentMethodRow) {
        int i2;
        if (r1 instanceof C35391lr) {
            i2 = A00((C35391lr) r1);
        } else {
            Bitmap A05 = r1.A05();
            if (A05 != null) {
                paymentMethodRow.A01.setImageBitmap(A05);
                return;
            }
            i2 = R.drawable.av_bank;
        }
        paymentMethodRow.A01.setImageResource(i2);
    }

    public static boolean A09(C30671cl r2) {
        int A04 = r2.A04();
        return A04 == 4 || A04 == 1 || A04 == 6 || A04 == 8 || A04 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        if (r7 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0A(X.C17130ua r12, java.lang.String r13) {
        /*
            java.lang.String r5 = "fetchIcon/Close InputStream: "
            java.lang.String r6 = " ms"
            java.lang.String r11 = "fetchIcon/costs "
            java.lang.String r4 = "PaymentMethodUtils"
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r3 = 0
            if (r0 != 0) goto L_0x00d3
            long r9 = java.lang.System.currentTimeMillis()
            r0 = 32768(0x8000, float:4.5918E-41)
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            r8.<init>(r0)     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            r0.<init>(r13)     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r0)     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            r2.setConnectTimeout(r0)     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            r0 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            X.1qW r7 = new X.1qW     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            r7.<init>(r12, r0, r3, r1)     // Catch:{ MalformedURLException -> 0x0081, IOException -> 0x0075, all -> 0x00a8 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ MalformedURLException -> 0x0073, IOException -> 0x0071 }
            if (r2 != 0) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ MalformedURLException -> 0x0073, IOException -> 0x0071 }
            java.lang.String r0 = "fetchIcon/failed to decode image data/url="
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x0073, IOException -> 0x0071 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r13, r1)     // Catch:{ MalformedURLException -> 0x0073, IOException -> 0x0071 }
            X.C110105dW.A1O(r4, r0)     // Catch:{ MalformedURLException -> 0x0073, IOException -> 0x0071 }
            goto L_0x005d
        L_0x0052:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ MalformedURLException -> 0x0073, IOException -> 0x0071 }
            r0 = 100
            r2.compress(r1, r0, r8)     // Catch:{ MalformedURLException -> 0x0073, IOException -> 0x0071 }
            byte[] r3 = r8.toByteArray()     // Catch:{ MalformedURLException -> 0x0073, IOException -> 0x0071 }
        L_0x005d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r11)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r2)
            X.AnonymousClass1Vo.A01(r4, r0)
            goto L_0x00a1
        L_0x0071:
            r1 = move-exception
            goto L_0x0077
        L_0x0073:
            r1 = move-exception
            goto L_0x0083
        L_0x0075:
            r1 = move-exception
            r7 = r3
        L_0x0077:
            java.lang.String r0 = "/fetchIcon/IOException: "
            java.lang.String r0 = X.AnonymousClass1Vo.A01(r4, r0)     // Catch:{ all -> 0x00a5 }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x008c
        L_0x0081:
            r1 = move-exception
            r7 = r3
        L_0x0083:
            java.lang.String r0 = "fetchIcon/Malformed URL: "
            java.lang.String r0 = X.AnonymousClass1Vo.A01(r4, r0)     // Catch:{ all -> 0x00a5 }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00a5 }
        L_0x008c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r11)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r2)
            X.AnonymousClass1Vo.A01(r4, r0)
            if (r7 == 0) goto L_0x00d3
        L_0x00a1:
            r7.close()     // Catch:{ IOException -> 0x00cb }
            return r3
        L_0x00a5:
            r8 = move-exception
            r3 = r7
            goto L_0x00a9
        L_0x00a8:
            r8 = move-exception
        L_0x00a9:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r11)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r2)
            X.AnonymousClass1Vo.A01(r4, r0)
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00c2 }
            throw r8
        L_0x00c2:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass1Vo.A01(r4, r5)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00ca:
            throw r8
        L_0x00cb:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass1Vo.A01(r4, r5)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119405xi.A0A(X.0ua, java.lang.String):byte[]");
    }
}
