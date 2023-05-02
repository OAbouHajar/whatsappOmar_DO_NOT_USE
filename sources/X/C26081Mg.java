package X;

import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.obwhatsapp.Me;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.1Mg  reason: invalid class name and case insensitive filesystem */
public class C26081Mg {
    public final C26071Mf A00;
    public final C16040sK A01;
    public final AnonymousClass013 A02;

    public C26081Mg(C26071Mf r1, C16040sK r2, AnonymousClass013 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public Set A00(C15830rv r3, C16740tZ r4, String str) {
        if (str == null || r4.A11.A02) {
            return null;
        }
        return A01(r3, str);
    }

    public Set A01(C15830rv r14, String str) {
        String str2;
        String host = Uri.parse(str).getHost();
        if (host == null) {
            return null;
        }
        String str3 = "ZZ";
        if (C16030sJ.A0M(r14)) {
            str2 = str3;
        } else {
            try {
                AnonymousClass3HS A0E = this.A00.A0E(C24561Gk.A04(r14), (String) null);
                str2 = C18160wF.A01(Integer.toString(A0E.countryCode_), C26071Mf.A01(A0E));
            } catch (C803443m unused) {
                str2 = str3;
            }
        }
        C16040sK r0 = this.A01;
        r0.A0B();
        Me me = r0.A00;
        if (me != null) {
            str3 = C18160wF.A01(me.cc, me.number);
        }
        HashSet hashSet = new HashSet();
        Locale A002 = AnonymousClass013.A00(this.A02.A00);
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i2 = 0; i2 < localeList.size(); i2++) {
                hashSet.add(localeList.get(i2));
            }
        }
        hashSet.add(A002);
        String[] split = host.split("\\.");
        int length = split.length;
        int i3 = 0;
        String str4 = null;
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i4 < length) {
                String str5 = split[i4];
                boolean matches = true ^ AnonymousClass3AA.A00.matcher(str5).matches();
                if (matches) {
                    if (str4 != null) {
                        return null;
                    }
                    str4 = str5;
                }
                i4++;
                z2 = matches;
            } else if (str4 == null || z2) {
                return null;
            } else {
                int length2 = str4.length();
                ArrayList arrayList = new ArrayList(2);
                int i5 = 0;
                while (i5 < length2) {
                    int codePointAt = str4.codePointAt(i5);
                    if (z3) {
                        z3 = true;
                        if (AnonymousClass3AA.A03.contains(Integer.valueOf(codePointAt))) {
                            continue;
                            i5 += Character.charCount(codePointAt);
                        }
                    }
                    z3 = false;
                    if (AnonymousClass3AA.A01.get(codePointAt) == null) {
                        continue;
                    } else if (arrayList.size() >= 2) {
                        return null;
                    } else {
                        arrayList.add(Integer.valueOf(codePointAt));
                    }
                    i5 += Character.charCount(codePointAt);
                }
                if (z3) {
                    HashSet hashSet2 = AnonymousClass3AA.A04;
                    if (hashSet2.contains(str3) || hashSet2.contains(str2)) {
                        return null;
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        if (AnonymousClass3AA.A05.contains(((Locale) it.next()).getLanguage())) {
                            return null;
                        }
                    }
                    HashSet hashSet3 = new HashSet(length2);
                    while (i3 < length2) {
                        int codePointAt2 = str4.codePointAt(i3);
                        hashSet3.add(Integer.valueOf(codePointAt2));
                        i3 += Character.charCount(codePointAt2);
                    }
                    return hashSet3;
                } else if (arrayList.isEmpty()) {
                    return null;
                } else {
                    C003001i r5 = new C003001i(arrayList.size());
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Number number = (Number) it2.next();
                        C83624Hk r3 = (C83624Hk) AnonymousClass3AA.A01.get(number.intValue());
                        Collection collection = r3.A01;
                        if (!collection.contains(str3) && !collection.contains(str2)) {
                            Iterator it3 = hashSet.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    r5.add(number);
                                    break;
                                }
                                if (r3.A00.contains(((Locale) it3.next()).getLanguage())) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!r5.isEmpty()) {
                        return r5;
                    }
                    return null;
                }
            }
        }
    }
}
