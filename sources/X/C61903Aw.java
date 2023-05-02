package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.mod2.fblibs.FacebookFacade;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Aw  reason: invalid class name and case insensitive filesystem */
public class C61903Aw {
    public static SpannableString A00(Context context, C82914Eq r17, String str) {
        String queryParameter;
        Spanned fromHtml = Html.fromHtml(str);
        String obj = fromHtml.toString();
        SpannableString spannableString = new SpannableString(obj);
        for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
            int spanStart = fromHtml.getSpanStart(obj2);
            int spanEnd = fromHtml.getSpanEnd(obj2);
            int spanFlags = fromHtml.getSpanFlags(obj2);
            if (obj2 instanceof URLSpan) {
                URLSpan uRLSpan = (URLSpan) obj2;
                C82914Eq r12 = r17;
                if (r17 != null) {
                    String url = uRLSpan.getURL();
                    if (!url.startsWith("whatsapp:user-notice")) {
                        queryParameter = "open-link";
                    } else {
                        queryParameter = Uri.parse(C13680ns.A0h("h://", url)).getQueryParameter("action");
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                    }
                    obj2 = new C78543yF(context, r12, url, queryParameter, A01(url));
                }
            }
            spannableString.setSpan(obj2, spanStart, spanEnd, spanFlags);
        }
        return spannableString;
    }

    public static Map A01(String str) {
        HashMap A0x = AnonymousClass000.A0x();
        if (!str.startsWith("whatsapp:user-notice")) {
            A0x.put(FacebookFacade.RequestParameter.LINK, str);
        } else {
            Uri parse = Uri.parse(C13680ns.A0h("h://", str));
            Iterator<String> it = parse.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                if (!"action".equals(A0m)) {
                    A0x.put(A0m, parse.getQueryParameter(A0m));
                }
            }
        }
        return A0x;
    }
}
