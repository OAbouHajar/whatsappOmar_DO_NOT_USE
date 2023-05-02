package X;

import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1hY  reason: invalid class name and case insensitive filesystem */
public class C32921hY {
    public static Permission A06 = new C32931hZ("additionalEcParameters");
    public static Permission A07 = new C32931hZ("threadLocalDhDefaultParams");
    public static Permission A08 = new C32931hZ("DhDefaultParams");
    public static Permission A09 = new C32931hZ("acceptableEcCurves");
    public static Permission A0A = new C32931hZ("threadLocalEcImplicitlyCa");
    public static Permission A0B = new C32931hZ("ecImplicitlyCa");
    public ThreadLocal A00 = new ThreadLocal();
    public ThreadLocal A01 = new ThreadLocal();
    public volatile Object A02;
    public volatile Map A03 = new HashMap();
    public volatile Set A04 = new HashSet();
    public volatile C1047256q A05;
}
