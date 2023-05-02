package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass4U8;
import X.AnonymousClass5BJ;
import X.AnonymousClass5JV;
import X.C1054359p;
import X.C1054559r;
import X.C106005Cd;
import X.C106015Ce;
import X.C32991hg;

public class SHA384 {

    public class Mappings extends C32991hg {
        public static final String A00 = SHA384.class.getName();
    }

    public class Digest extends AnonymousClass5BJ implements Cloneable {
        public Digest() {
            super(new AnonymousClass5JV());
        }

        public Object clone() {
            AnonymousClass5BJ r2 = (AnonymousClass5BJ) super.clone();
            r2.A01 = new AnonymousClass5JV((AnonymousClass5JV) this.A01);
            return r2;
        }
    }

    public class HashMac extends C106015Ce {
        public HashMac() {
            super(new C1054559r(new AnonymousClass5JV()));
        }
    }

    public class KeyGenerator extends C106005Cd {
        public KeyGenerator() {
            super("HMACSHA384", new AnonymousClass4U8(), 384);
        }
    }

    public class OldSHA384 extends C106015Ce {
        public OldSHA384() {
            super(new C1054359p(new AnonymousClass5JV()));
        }
    }
}
