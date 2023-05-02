package X;

import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1uU  reason: invalid class name and case insensitive filesystem */
public class C40661uU {
    public static final ThreadLocal A00 = new AnonymousClass5B2();
    public static final ThreadLocal A01 = new AnonymousClass5B1();
    public static final Pattern A02 = Pattern.compile("[\\p{ASCII}&&[^\\p{Alnum}]]");

    public static AnonymousClass01Q A00(AnonymousClass013 r8, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = A02.matcher(str).replaceAll(" ");
            BreakIterator A012 = A01(r8);
            A012.setText(replaceAll);
            int first = A012.first();
            while (true) {
                int next = A012.next();
                int i2 = first;
                first = next;
                if (next == -1) {
                    break;
                }
                String substring = replaceAll.substring(i2, next);
                String A08 = z2 ? AnonymousClass1ZW.A08(substring) : AnonymousClass1ZW.A09(substring);
                if (!TextUtils.isEmpty(A08) && !Character.isSpaceChar(A08.codePointAt(0))) {
                    arrayList2.add(Integer.valueOf(i2));
                    arrayList2.add(Integer.valueOf(next));
                    arrayList.add(A08);
                }
            }
        }
        return new AnonymousClass01Q(arrayList2, arrayList);
    }

    public static BreakIterator A01(AnonymousClass013 r3) {
        Locale A002 = AnonymousClass013.A00(r3.A00);
        ThreadLocal threadLocal = A01;
        if (A002.equals(threadLocal.get())) {
            return (BreakIterator) A00.get();
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(A002);
        threadLocal.set(A002);
        A00.set(wordInstance);
        return wordInstance;
    }

    public static ArrayList A02(AnonymousClass013 r1, String str) {
        Object obj = A00(r1, str, true).A01;
        AnonymousClass00B.A06(obj);
        return (ArrayList) obj;
    }

    public static boolean A03(AnonymousClass013 r9, String str, List list, boolean z2) {
        boolean equals;
        if (str == null) {
            return false;
        }
        String replaceAll = A02.matcher(str).replaceAll(" ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            BreakIterator A012 = A01(r9);
            A012.setText(replaceAll);
            int first = A012.first();
            while (true) {
                int next = A012.next();
                int i2 = first;
                first = next;
                if (next == -1) {
                    return false;
                }
                String A08 = AnonymousClass1ZW.A08(replaceAll.substring(i2, next));
                if (z2) {
                    equals = A08.startsWith(str2);
                    continue;
                } else {
                    equals = A08.equals(str2);
                    continue;
                }
                if (equals) {
                }
            }
        }
        return true;
    }
}
