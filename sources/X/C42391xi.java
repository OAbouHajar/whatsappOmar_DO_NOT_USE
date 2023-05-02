package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1xi  reason: invalid class name and case insensitive filesystem */
public class C42391xi {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass01Q A03;
    public C15830rv A04;
    public C39961tL A05;
    public C35031lG A06;
    public Boolean A07 = null;
    public Boolean A08 = null;
    public CharSequence A09;
    public List A0A;
    public List A0B = null;
    public List A0C;
    public List A0D;
    public Map A0E;
    public boolean A0F = true;
    public boolean A0G = true;
    public final AnonymousClass013 A0H;
    public final Object A0I = new Object();

    public C42391xi(AnonymousClass013 r2) {
        this.A0H = r2;
    }

    public final AnonymousClass01Q A00() {
        AnonymousClass01Q A002;
        if (TextUtils.isEmpty(this.A09)) {
            A002 = new AnonymousClass01Q(new ArrayList(), new ArrayList());
        } else {
            A002 = C40661uU.A00(this.A0H, A02(), false);
        }
        this.A03 = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A01() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A08
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42391xi.A01():java.lang.Boolean");
    }

    public String A02() {
        if (this.A09 == null) {
            AnonymousClass01Q r0 = this.A03;
            if (r0 == null) {
                return "";
            }
            Object obj = r0.A01;
            AnonymousClass00B.A06(obj);
            if (((List) obj).isEmpty()) {
                return "";
            }
        }
        CharSequence charSequence = this.A09;
        return charSequence == null ? TextUtils.join(" ", A03()) : charSequence.toString();
    }

    public List A03() {
        List list;
        AnonymousClass01Q r0 = this.A03;
        if (r0 != null && (list = (List) r0.A01) != null && !list.isEmpty()) {
            return list;
        }
        Object obj = A00().A01;
        AnonymousClass00B.A06(obj);
        return (List) obj;
    }

    public void A04(CharSequence charSequence) {
        this.A09 = charSequence;
        this.A03 = null;
    }

    public void A05(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (this.A03 == null) {
            this.A03 = new AnonymousClass01Q(new ArrayList(), list);
        }
        this.A09 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0086, code lost:
        if (r0 != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = super.toString()
            r2.append(r0)
            java.lang.String r0 = "\n\tnormal: \""
            r2.append(r0)
            java.lang.String r0 = r3.A02()
            r2.append(r0)
            java.lang.String r0 = "\";\ttokens: "
            r2.append(r0)
            java.util.List r0 = r3.A03()
            r2.append(r0)
            java.lang.String r0 = "\n\tlabel: \""
            r2.append(r0)
            java.util.List r0 = r3.A0D
            if (r0 != 0) goto L_0x0032
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0032:
            r2.append(r0)
            java.lang.String r0 = "\";\tjid: "
            r2.append(r0)
            X.0rv r0 = r3.A04
            r2.append(r0)
            java.lang.String r0 = "\";\tstarred: "
            r2.append(r0)
            java.lang.Boolean r0 = r3.A01()
            r2.append(r0)
            java.lang.String r0 = "\n\tpage: "
            r2.append(r0)
            int r0 = r3.A00
            r2.append(r0)
            java.lang.String r0 = "; pageSize: "
            r2.append(r0)
            int r0 = r3.A01
            r2.append(r0)
            java.lang.String r0 = "\n\tcontact filters:"
            r2.append(r0)
            java.util.List r0 = r3.A0A
            r2.append(r0)
            java.lang.String r0 = "\n\tcontact prefilters:"
            r2.append(r0)
            java.util.List r0 = r3.A0B
            r2.append(r0)
            java.lang.String r0 = "\n\tmapping: "
            r2.append(r0)
            X.01Q r0 = r3.A03
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0088
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0091
        L_0x0088:
            X.01Q r0 = r3.A00()
            java.lang.Object r1 = r0.A00
            X.AnonymousClass00B.A06(r1)
        L_0x0091:
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42391xi.toString():java.lang.String");
    }
}
