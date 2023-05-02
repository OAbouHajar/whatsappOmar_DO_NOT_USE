package X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* renamed from: X.04e  reason: invalid class name and case insensitive filesystem */
public class C009104e {
    public long A00 = 0;
    public Context A01;
    public SharedPreferences.Editor A02;
    public SharedPreferences A03;
    public AnonymousClass02v A04;
    public C006502w A05;
    public C006402u A06;
    public PreferenceScreen A07;
    public String A08;
    public boolean A09;

    public C009104e(Context context) {
        this.A01 = context;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        this.A08 = sb.toString();
        this.A03 = null;
    }

    public SharedPreferences.Editor A00() {
        if (!this.A09) {
            return A01().edit();
        }
        SharedPreferences.Editor editor = this.A02;
        if (editor != null) {
            return editor;
        }
        SharedPreferences.Editor edit = A01().edit();
        this.A02 = edit;
        return edit;
    }

    public SharedPreferences A01() {
        SharedPreferences sharedPreferences = this.A03;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.A01.getSharedPreferences(this.A08, 0);
        this.A03 = sharedPreferences2;
        return sharedPreferences2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v5, types: [androidx.preference.PreferenceGroup, androidx.preference.Preference] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.preference.PreferenceScreen A02(android.content.Context r7, androidx.preference.PreferenceScreen r8, int r9) {
        /*
            r6 = this;
            r0 = 1
            r6.A09 = r0
            X.0V0 r3 = new X.0V0
            r3.<init>(r7, r6)
            android.content.Context r1 = r3.A02
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.XmlResourceParser r4 = r0.getXml(r9)
            java.lang.Object[] r5 = r3.A03     // Catch:{ all -> 0x00a4 }
            monitor-enter(r5)     // Catch:{ all -> 0x00a4 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r4)     // Catch:{ all -> 0x00a1 }
            r0 = 0
            r5[r0] = r1     // Catch:{ all -> 0x00a1 }
        L_0x001c:
            int r1 = r4.next()     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            r0 = 2
            if (r1 == r0) goto L_0x0041
            r0 = 1
            if (r1 != r0) goto L_0x001c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            r1.<init>()     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            java.lang.String r0 = r4.getPositionDescription()     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            r1.append(r0)     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            java.lang.String r0 = ": No start tag found!"
            r1.append(r0)     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            java.lang.String r1 = r1.toString()     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            android.view.InflateException r0 = new android.view.InflateException     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            r0.<init>(r1)     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            throw r0     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
        L_0x0041:
            java.lang.String r0 = r4.getName()     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            androidx.preference.Preference r1 = r3.A00(r2, r0)     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            if (r8 != 0) goto L_0x0053
            X.04e r0 = r3.A00     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            r1.A0H(r0)     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            r8 = r1
        L_0x0053:
            r3.A02(r2, r8, r4)     // Catch:{ InflateException -> 0x009f, XmlPullParserException -> 0x006c, IOException -> 0x006a }
            monitor-exit(r5)     // Catch:{ all -> 0x00a1 }
            r4.close()
            androidx.preference.PreferenceScreen r8 = (androidx.preference.PreferenceScreen) r8
            r8.A0H(r6)
            r1 = 0
            android.content.SharedPreferences$Editor r0 = r6.A02
            if (r0 == 0) goto L_0x0067
            r0.apply()
        L_0x0067:
            r6.A09 = r1
            return r8
        L_0x006a:
            r3 = move-exception
            goto L_0x007a
        L_0x006c:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x00a1 }
            android.view.InflateException r2 = new android.view.InflateException     // Catch:{ all -> 0x00a1 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a1 }
            r2.initCause(r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x009e
        L_0x007a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r1.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r4.getPositionDescription()     // Catch:{ all -> 0x00a1 }
            r1.append(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x00a1 }
            r1.append(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a1 }
            android.view.InflateException r2 = new android.view.InflateException     // Catch:{ all -> 0x00a1 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a1 }
            r2.initCause(r3)     // Catch:{ all -> 0x00a1 }
        L_0x009e:
            throw r2     // Catch:{ all -> 0x00a1 }
        L_0x009f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            r4.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009104e.A02(android.content.Context, androidx.preference.PreferenceScreen, int):androidx.preference.PreferenceScreen");
    }
}
