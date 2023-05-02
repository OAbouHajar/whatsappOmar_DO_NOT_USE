package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.4Z6  reason: invalid class name */
public class AnonymousClass4Z6 {
    public static final Pattern A00 = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final Pattern A01 = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern A02 = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static Map A00(URI uri) {
        String str;
        Map emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        HashMap hashMap = emptyMap;
        if (rawQuery != null) {
            hashMap = emptyMap;
            if (rawQuery.length() > 0) {
                HashMap A0x = AnonymousClass000.A0x();
                AnonymousClass4C3 r0 = new AnonymousClass4C3(new C66463Zl('='));
                C66473Zm r2 = C66473Zm.A00;
                C84204Jq r5 = new C84204Jq(r2, r0, false);
                C84204Jq r02 = new C84204Jq(r2, new AnonymousClass4C3(new C66463Zl('&')), false);
                Iterator it = new AnonymousClass555(new C84204Jq(r02.A00, r02.A01, true), rawQuery).iterator();
                while (it.hasNext()) {
                    C66453Zk r22 = new C66453Zk(r5.A01, r5, AnonymousClass000.A0m(it));
                    ArrayList A0u = AnonymousClass000.A0u();
                    while (r22.hasNext()) {
                        A0u.add(r22.next());
                    }
                    List unmodifiableList = Collections.unmodifiableList(A0u);
                    if (unmodifiableList.isEmpty() || unmodifiableList.size() > 2) {
                        throw AnonymousClass000.A0T("bad parameter");
                    }
                    try {
                        String decode = URLDecoder.decode(AnonymousClass000.A0n(unmodifiableList, 0), DefaultCrypto.UTF_8);
                        if (unmodifiableList.size() == 2) {
                            try {
                                str = URLDecoder.decode(AnonymousClass000.A0n(unmodifiableList, 1), DefaultCrypto.UTF_8);
                            } catch (UnsupportedEncodingException e2) {
                                throw new IllegalArgumentException(e2);
                            }
                        } else {
                            str = null;
                        }
                        A0x.put(decode, str);
                    } catch (UnsupportedEncodingException e3) {
                        throw new IllegalArgumentException(e3);
                    }
                }
                hashMap = A0x;
            }
        }
        return hashMap;
    }
}
