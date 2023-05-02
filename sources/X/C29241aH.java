package X;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.1aH  reason: invalid class name and case insensitive filesystem */
public class C29241aH extends InputStream {
    public int A00;
    public int A01;
    public String A02;
    public byte[] A03;
    public byte[] A04;
    public final Iterator A05;
    public final Map A06;

    public C29241aH(Map map) {
        this.A06 = map;
        Iterator it = new TreeSet(map.keySet()).iterator();
        this.A05 = it;
        if (it.hasNext()) {
            A00((String) it.next());
            return;
        }
        this.A00 = 0;
        this.A02 = null;
    }

    public final void A00(String str) {
        this.A01 = 0;
        byte[] bytes = str.getBytes();
        this.A03 = bytes;
        this.A00 = bytes.length;
        Object obj = this.A06.get(str);
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2.length() > 0) {
                byte[] bytes2 = obj2.getBytes();
                this.A04 = bytes2;
                this.A00 += bytes2.length;
                this.A02 = str;
            }
        }
        this.A04 = null;
        this.A02 = str;
    }

    public int available() {
        return this.A00;
    }

    public int read() {
        int i2 = this.A00;
        if (!(i2 == 0 || this.A02 == null)) {
            if (this.A01 == i2) {
                Iterator it = this.A05;
                if (it.hasNext()) {
                    A00((String) it.next());
                } else {
                    this.A02 = null;
                    this.A00 = 0;
                }
            }
            byte[] bArr = this.A03;
            if (bArr != null) {
                int i3 = this.A01;
                int length = bArr.length;
                if (i3 < length) {
                    this.A01 = i3 + 1;
                } else {
                    bArr = this.A04;
                    if (bArr != null) {
                        this.A01 = i3 + 1;
                        i3 -= length;
                    }
                }
                return bArr[i3];
            }
        }
        return -1;
    }
}
