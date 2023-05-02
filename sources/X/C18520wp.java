package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* renamed from: X.0wp  reason: invalid class name and case insensitive filesystem */
public class C18520wp {
    public InputMethodSubtype A00;
    public Set A01;
    public final AnonymousClass01V A02;

    public C18520wp(AnonymousClass01V r1) {
        this.A02 = r1;
    }

    public Locale A00() {
        InputMethodManager A0Q = this.A02.A0Q();
        AnonymousClass00B.A06(A0Q);
        AnonymousClass00B.A06(A0Q);
        InputMethodSubtype currentInputMethodSubtype = A0Q.getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null || !currentInputMethodSubtype.getMode().equals("keyboard")) {
            return null;
        }
        InputMethodSubtype inputMethodSubtype = this.A00;
        if (!(inputMethodSubtype == null || inputMethodSubtype == currentInputMethodSubtype || inputMethodSubtype.equals(currentInputMethodSubtype))) {
            A02();
        }
        this.A00 = currentInputMethodSubtype;
        if (this.A01 == null) {
            A02();
        }
        Set set = this.A01;
        if (set == null || !set.contains(currentInputMethodSubtype)) {
            return null;
        }
        String locale = currentInputMethodSubtype.getLocale();
        if (TextUtils.isEmpty(locale)) {
            return null;
        }
        if (Pattern.matches("[a-z]{2}_[A-Z]{2}", locale)) {
            return Build.VERSION.SDK_INT >= 21 ? Locale.forLanguageTag(locale.replace("_", "-")) : new Locale(locale.substring(0, 2), locale.substring(3, 5));
        } else if (Pattern.matches("[a-z]{2}", locale)) {
            return new Locale(locale);
        } else {
            StringBuilder sb = new StringBuilder("keyboardLanguageExtractor/error/cannot parse locale ");
            sb.append(locale);
            Log.e(sb.toString());
            return null;
        }
    }

    public TreeSet A01() {
        int length;
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        InputMethodManager A0Q = this.A02.A0Q();
        AnonymousClass00B.A06(A0Q);
        for (InputMethodInfo enabledInputMethodSubtypeList : A0Q.getEnabledInputMethodList()) {
            for (InputMethodSubtype next : A0Q.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                if (next.getMode().equals("keyboard")) {
                    String languageTag = Build.VERSION.SDK_INT >= 24 ? next.getLanguageTag() : "";
                    if (languageTag.isEmpty()) {
                        languageTag = new Locale(next.getLocale()).getLanguage();
                    }
                    if (languageTag.isEmpty() || (length = languageTag.length()) < 2) {
                        StringBuilder sb = new StringBuilder("KeyboardLanguageExtractor/getTwoLetterLanguageCode/unexpected language result from input method, language: '");
                        sb.append(languageTag);
                        sb.append("'");
                        Log.w(sb.toString());
                    } else if (length <= 2 || (languageTag = languageTag.substring(0, 2)) != null) {
                        treeSet.add(languageTag);
                    }
                }
            }
        }
        return treeSet;
    }

    public final void A02() {
        this.A01 = new HashSet();
        InputMethodManager A0Q = this.A02.A0Q();
        AnonymousClass00B.A06(A0Q);
        AnonymousClass00B.A06(A0Q);
        for (InputMethodInfo next : A0Q.getEnabledInputMethodList()) {
            if (next.getId().startsWith("com.google.android.inputmethod")) {
                this.A01.addAll(A0Q.getEnabledInputMethodSubtypeList(next, true));
            }
        }
    }
}
