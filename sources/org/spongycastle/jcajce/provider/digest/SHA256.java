package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass4U8;
import X.AnonymousClass5BJ;
import X.AnonymousClass5JU;
import X.AnonymousClass5Kp;
import X.C1054559r;
import X.C106005Cd;
import X.C106015Ce;
import X.C32041fY;
import X.C32991hg;

public class SHA256 {

    public class Mappings extends C32991hg {
        public static final String A00 = SHA256.class.getName();
    }

    public class Digest extends AnonymousClass5BJ implements Cloneable {
        public Digest() {
            super(new AnonymousClass5JU());
        }

        public Object clone() {
            AnonymousClass5BJ r2 = (AnonymousClass5BJ) super.clone();
            r2.A01 = new AnonymousClass5JU((AnonymousClass5JU) this.A01);
            return r2;
        }
    }

    public class HashMac extends C106015Ce {
        public HashMac() {
            super(new C1054559r(new AnonymousClass5JU()));
        }
    }

    public class KeyGenerator extends C106005Cd {
        public KeyGenerator() {
            super("HMACSHA256", new AnonymousClass4U8(), 256);
        }
    }

    public class PBEWithMacKeyFactory extends AnonymousClass5Kp {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", (C32041fY) null, 2, 4, 256, 0, false);
        }
    }
}
