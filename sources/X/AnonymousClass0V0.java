package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0V0  reason: invalid class name */
public class AnonymousClass0V0 {
    public static final HashMap A04 = AnonymousClass000.A0x();
    public static final Class[] A05 = {Context.class, AttributeSet.class};
    public C009104e A00;
    public String[] A01;
    public final Context A02;
    public final Object[] A03 = new Object[2];

    public AnonymousClass0V0(Context context, C009104e r6) {
        this.A02 = context;
        this.A00 = r6;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(Preference.class.getPackage().getName());
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append(SwitchPreference.class.getPackage().getName());
        this.A01 = new String[]{AnonymousClass000.A0h(".", A0o), AnonymousClass000.A0h(".", A0o2)};
    }

    public final Preference A00(AttributeSet attributeSet, String str) {
        try {
            return -1 == str.indexOf(46) ? A01(attributeSet, str, this.A01) : A01(attributeSet, str, (String[]) null);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(attributeSet.getPositionDescription());
            A0o.append(": Error inflating class (not found)");
            InflateException inflateException = new InflateException(AnonymousClass000.A0h(str, A0o));
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            StringBuilder A0o2 = AnonymousClass000.A0o();
            A0o2.append(attributeSet.getPositionDescription());
            A0o2.append(": Error inflating class ");
            InflateException inflateException2 = new InflateException(AnonymousClass000.A0h(str, A0o2));
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1 >= r4) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1 = X.AnonymousClass000.A0o();
        r1.append(r10.getPositionDescription());
        r1.append(": Error inflating class ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        throw new android.view.InflateException(X.AnonymousClass000.A0h(r11, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r1 = X.AnonymousClass000.A0o();
        r1.append(r10.getPositionDescription());
        r1.append(": Error inflating class ");
        r0 = new android.view.InflateException(X.AnonymousClass000.A0h(r11, r1));
        r0.initCause(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[ExcHandler: Exception (r2v0 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.Preference A01(android.util.AttributeSet r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r9 = this;
            java.util.HashMap r7 = A04
            java.lang.Object r1 = r7.get(r11)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r3 = ": Error inflating class "
            r6 = 1
            if (r1 != 0) goto L_0x005d
            android.content.Context r0 = r9.A02     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            r5 = 0
            if (r12 == 0) goto L_0x004d
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            if (r4 == 0) goto L_0x004d
            r2 = 0
            r1 = 0
        L_0x001b:
            r0 = r12[r1]     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r0)     // Catch:{ ClassNotFoundException -> 0x002c, Exception -> 0x0068 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r11, r0)     // Catch:{ ClassNotFoundException -> 0x002c, Exception -> 0x0068 }
            java.lang.Class r1 = java.lang.Class.forName(r0, r5, r8)     // Catch:{ ClassNotFoundException -> 0x002c, Exception -> 0x0068 }
            if (r1 != 0) goto L_0x0051
            goto L_0x0032
        L_0x002c:
            r2 = move-exception
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x004c
            goto L_0x001b
        L_0x0032:
            if (r2 != 0) goto L_0x004c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            java.lang.String r0 = r10.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            r1.append(r3)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r11, r1)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            android.view.InflateException r0 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
        L_0x004c:
            throw r2     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
        L_0x004d:
            java.lang.Class r1 = java.lang.Class.forName(r11, r5, r8)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
        L_0x0051:
            java.lang.Class[] r0 = A05     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            r1.setAccessible(r6)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            r7.put(r11, r1)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
        L_0x005d:
            java.lang.Object[] r0 = r9.A03     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            r0[r6] = r10     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0     // Catch:{ ClassNotFoundException -> 0x0084, Exception -> 0x0068 }
            return r0
        L_0x0068:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r10.getPositionDescription()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.AnonymousClass000.A0h(r11, r1)
            android.view.InflateException r0 = new android.view.InflateException
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
        L_0x0084:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0V0.A01(android.util.AttributeSet, java.lang.String, java.lang.String[]):androidx.preference.Preference");
    }

    public final void A02(AttributeSet attributeSet, Preference preference, XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else if (next == 1) {
                return;
            } else {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.A06 = Intent.parseIntent(this.A02.getResources(), xmlPullParser, attributeSet);
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e2);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        Resources resources = this.A02.getResources();
                        Bundle bundle = preference.A08;
                        if (bundle == null) {
                            bundle = new Bundle();
                            preference.A08 = bundle;
                        }
                        resources.parseBundleExtra("extra", attributeSet, bundle);
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 != 1) {
                                    if (next2 == 3 && xmlPullParser.getDepth() <= depth2) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } catch (IOException e3) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e3);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference A002 = A00(attributeSet, name);
                        ((PreferenceGroup) preference).A0U(A002);
                        A02(attributeSet, A002, xmlPullParser);
                    }
                }
            }
        }
    }
}
