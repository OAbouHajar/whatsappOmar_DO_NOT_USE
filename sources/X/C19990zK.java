package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0zK  reason: invalid class name and case insensitive filesystem */
public final class C19990zK {
    public static final Pattern A04 = Pattern.compile("(@\\d+)");
    public static final boolean A05 = Character.isDefined(8296);
    public static final boolean A06 = Character.isDefined(8297);
    public final C16040sK A00;
    public final C16000sG A01;
    public final C18190wI A02;
    public final C16080sP A03;

    public C19990zK(C16040sK r1, C16000sG r2, C18190wI r3, C16080sP r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public CharSequence A00(CharSequence charSequence, List list) {
        if (list == null || list.isEmpty()) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        A03(valueOf, (C450826z) null, list);
        return valueOf;
    }

    public String A01(C16010sH r5) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(A05 ? "⁨" : str);
        sb.append(r5.A0K() ? this.A03.A0I(r5, false) : !TextUtils.isEmpty(r5.A09()) ? r5.A09() : !TextUtils.isEmpty(r5.A0W) ? r5.A0W : C24561Gk.A01(r5));
        if (A06) {
            str = "⁩";
        }
        sb.append(str);
        return sb.toString();
    }

    public void A02(Context context, SpannableStringBuilder spannableStringBuilder, List list) {
        A03(spannableStringBuilder, new AnonymousClass270(context, this, R.color.color04f8, false), list);
    }

    public void A03(SpannableStringBuilder spannableStringBuilder, C450826z r11, List list) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(spannableStringBuilder)) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Jid jid = (Jid) it.next();
                if (jid != null) {
                    StringBuilder sb = new StringBuilder("@");
                    String str = jid.user;
                    AnonymousClass00B.A06(str);
                    sb.append(str);
                    hashMap.put(sb.toString(), new AnonymousClass01Q(jid, (Object) null));
                }
            }
            Matcher matcher = A04.matcher(spannableStringBuilder);
            int i2 = 0;
            while (matcher.find()) {
                String group = matcher.group();
                if (hashMap.containsKey(group)) {
                    AnonymousClass01Q r0 = (AnonymousClass01Q) hashMap.get(group);
                    AnonymousClass01Q r5 = (AnonymousClass01Q) r0.A01;
                    if (r5 == null) {
                        C15830rv r3 = (C15830rv) r0.A00;
                        C16010sH A0A = this.A01.A0A(r3);
                        StringBuilder sb2 = new StringBuilder("@");
                        sb2.append(A01(A0A));
                        r5 = new AnonymousClass01Q(sb2.toString(), A0A);
                        hashMap.put(group, new AnonymousClass01Q(r3, r5));
                    }
                    int start = matcher.start() + i2;
                    String str2 = (String) r5.A00;
                    int length = group.length();
                    spannableStringBuilder.replace(start, length + start, str2);
                    int length2 = str2.length();
                    i2 += length2 - length;
                    if (r11 != null) {
                        r11.AW6(spannableStringBuilder, (C16010sH) r5.A01, start, length2 + start);
                    }
                }
            }
        }
    }
}
