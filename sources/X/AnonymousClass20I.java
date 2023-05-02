package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;

/* renamed from: X.20I  reason: invalid class name */
public class AnonymousClass20I {
    public int A00 = 0;
    public int A01;
    public long A02;
    public Point A03;
    public Rect A04;
    public C42061xA A05;
    public File A06;
    public File A07;
    public Byte A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Uri A0G;

    public AnonymousClass20I(Uri uri) {
        this.A0G = uri;
    }

    public AnonymousClass20I(Uri uri, AnonymousClass20I r3) {
        String str;
        Rect rect;
        C42061xA r0;
        boolean z2;
        boolean z3;
        this.A0G = uri;
        this.A08 = r3.A06();
        this.A07 = r3.A05();
        this.A09 = r3.A07();
        this.A0C = r3.A09();
        this.A0A = r3.A08();
        synchronized (r3) {
            str = r3.A0B;
        }
        this.A0B = str;
        this.A06 = r3.A03();
        synchronized (r3) {
            rect = r3.A04;
        }
        this.A04 = rect;
        this.A03 = r3.A02();
        synchronized (r3) {
            r0 = r3.A05;
        }
        this.A05 = r0;
        this.A01 = r3.A01();
        this.A0F = r3.A0F();
        synchronized (r3) {
            z2 = r3.A0E;
        }
        this.A0E = z2;
        this.A00 = r3.A00();
        synchronized (r3) {
            z3 = r3.A0D;
        }
        this.A0D = z3;
    }

    public synchronized int A00() {
        return this.A00;
    }

    public synchronized int A01() {
        return this.A01;
    }

    public synchronized Point A02() {
        return this.A03;
    }

    public synchronized File A03() {
        return this.A06;
    }

    public synchronized File A04() {
        File file;
        file = this.A06;
        if (file == null) {
            file = this.A07;
        }
        return file;
    }

    public synchronized File A05() {
        return this.A07;
    }

    public synchronized Byte A06() {
        return this.A08;
    }

    public synchronized String A07() {
        return this.A09;
    }

    public synchronized String A08() {
        return this.A0A;
    }

    public synchronized String A09() {
        return this.A0C;
    }

    public synchronized void A0A(int i2) {
        this.A00 = i2;
    }

    public synchronized void A0B(File file) {
        this.A07 = file;
    }

    public synchronized void A0C(Byte b2) {
        this.A08 = b2;
    }

    public synchronized void A0D(String str) {
        this.A09 = str;
    }

    public synchronized void A0E(String str) {
        this.A0C = str;
    }

    public synchronized boolean A0F() {
        return this.A0F;
    }
}
