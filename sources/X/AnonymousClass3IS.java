package X;

import java.security.cert.PolicyNode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3IS  reason: invalid class name */
public class AnonymousClass3IS implements PolicyNode {
    public int A00;
    public String A01;
    public PolicyNode A02;
    public List A03;
    public Set A04;
    public Set A05;
    public boolean A06;

    public AnonymousClass3IS(String str, PolicyNode policyNode, List list, Set set, Set set2, int i2, boolean z2) {
        this.A03 = list;
        this.A00 = i2;
        this.A04 = set;
        this.A02 = policyNode;
        this.A05 = set2;
        this.A01 = str;
        this.A06 = z2;
    }

    public String A00(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(this.A01);
        stringBuffer.append(" {\n");
        int i2 = 0;
        while (true) {
            List list = this.A03;
            if (i2 < list.size()) {
                stringBuffer.append(((AnonymousClass3IS) list.get(i2)).A00(AnonymousClass000.A0h("    ", AnonymousClass000.A0q(str))));
                i2++;
            } else {
                stringBuffer.append(str);
                stringBuffer.append("}\n");
                return stringBuffer.toString();
            }
        }
    }

    public AnonymousClass3IS A01() {
        HashSet A0o = C13680ns.A0o();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            A0o.add(new String(AnonymousClass000.A0m(it)));
        }
        HashSet A0o2 = C13680ns.A0o();
        Iterator it2 = this.A05.iterator();
        while (it2.hasNext()) {
            A0o2.add(new String(AnonymousClass000.A0m(it2)));
        }
        AnonymousClass3IS r3 = new AnonymousClass3IS(new String(this.A01), (PolicyNode) null, AnonymousClass000.A0u(), A0o, A0o2, this.A00, this.A06);
        for (AnonymousClass3IS A012 : this.A03) {
            AnonymousClass3IS A013 = A012.A01();
            A013.A02 = r3;
            r3.A03.add(A013);
            A013.A02 = r3;
        }
        return r3;
    }

    public Object clone() {
        return A01();
    }

    public Iterator getChildren() {
        return this.A03.iterator();
    }

    public int getDepth() {
        return this.A00;
    }

    public Set getExpectedPolicies() {
        return this.A04;
    }

    public PolicyNode getParent() {
        return this.A02;
    }

    public Set getPolicyQualifiers() {
        return this.A05;
    }

    public String getValidPolicy() {
        return this.A01;
    }

    public boolean isCritical() {
        return this.A06;
    }

    public String toString() {
        return A00("");
    }
}
