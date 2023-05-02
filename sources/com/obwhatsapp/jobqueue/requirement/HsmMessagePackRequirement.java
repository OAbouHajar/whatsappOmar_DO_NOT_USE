package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass00B;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass1WH;
import X.C16150sX;
import X.C19280yB;
import X.C28791Xq;
import X.C46082Cg;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Locale;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class HsmMessagePackRequirement implements Requirement, C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C19280yB A00;
    public final String elementName;
    public Locale[] locales;
    public final String namespace;

    public HsmMessagePackRequirement(String str, String str2, Locale[] localeArr) {
        AnonymousClass00B.A06(localeArr);
        this.locales = localeArr;
        AnonymousClass00B.A05(str);
        this.namespace = str;
        AnonymousClass00B.A05(str2);
        this.elementName = str2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Locale[] localeArr = this.locales;
        if (localeArr == null || localeArr.length == 0) {
            throw new InvalidObjectException("locales[] must not be empty");
        } else if (TextUtils.isEmpty(this.namespace)) {
            throw new InvalidObjectException("namespace must not be empty");
        } else if (TextUtils.isEmpty(this.elementName)) {
            throw new InvalidObjectException("elementName must not be empty");
        }
    }

    public boolean A00() {
        C46082Cg A02 = this.A00.A02(this.namespace, this.locales);
        return (A02 == null || A02.A02.size() <= 0 || C19280yB.A00(A02, this.elementName) == null) ? false : true;
    }

    public boolean AJT() {
        Long l2;
        C19280yB r1 = this.A00;
        Locale[] localeArr = this.locales;
        String str = this.namespace;
        synchronized (r1.A03) {
            l2 = (Long) r1.A04.get(Pair.create(localeArr, str));
        }
        if (l2 != null) {
            long longValue = l2.longValue();
            if (longValue > 0 && System.currentTimeMillis() - longValue < 3600000) {
                StringBuilder sb = new StringBuilder("satisfying hsm pack requirement due to recent response");
                StringBuilder sb2 = new StringBuilder("; locales=");
                sb2.append(AnonymousClass1WH.A08(this.locales));
                sb2.append("; namespace=");
                sb2.append(this.namespace);
                sb.append(sb2.toString());
                Log.i(sb.toString());
                return true;
            }
        }
        return A00();
    }

    public void Adl(Context context) {
        this.A00 = (C19280yB) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).ADD.get();
    }
}
