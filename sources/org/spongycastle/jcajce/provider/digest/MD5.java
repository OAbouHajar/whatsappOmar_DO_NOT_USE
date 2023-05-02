package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass4U8;
import X.AnonymousClass5BJ;
import X.AnonymousClass5JS;
import X.C1054559r;
import X.C106005Cd;
import X.C106015Ce;
import X.C32991hg;

public class MD5 {

    public class Mappings extends C32991hg {
        public static final String A00 = MD5.class.getName();
    }

    public class Digest extends AnonymousClass5BJ implements Cloneable {
        public Digest() {
            super(new AnonymousClass5JS());
        }

        public Object clone() {
            AnonymousClass5BJ r2 = (AnonymousClass5BJ) super.clone();
            r2.A01 = new AnonymousClass5JS((AnonymousClass5JS) this.A01);
            return r2;
        }
    }

    public class HashMac extends C106015Ce {
        public HashMac() {
            super(new C1054559r(new AnonymousClass5JS()));
        }
    }

    public class KeyGenerator extends C106005Cd {
        public KeyGenerator() {
            super("HMACMD5", new AnonymousClass4U8(), 128);
        }
    }
}
