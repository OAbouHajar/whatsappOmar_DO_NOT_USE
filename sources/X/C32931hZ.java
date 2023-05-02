package X;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: X.1hZ  reason: invalid class name and case insensitive filesystem */
public class C32931hZ extends BasicPermission {
    public final String actions;
    public final int permissionMask;

    public C32931hZ(String str) {
        super("SC", str);
        this.actions = str;
        StringTokenizer stringTokenizer = new StringTokenizer(C32941ha.A00(str), " ,");
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i2 |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i2 |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i2 |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i2 |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i2 |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i2 |= 32;
            } else if (nextToken.equals("all")) {
                i2 |= 63;
            }
        }
        if (i2 != 0) {
            this.permissionMask = i2;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C32931hZ)) {
                return false;
            }
            C32931hZ r4 = (C32931hZ) obj;
            if (this.permissionMask != r4.permissionMask || !getName().equals(r4.getName())) {
                return false;
            }
        }
        return true;
    }

    public String getActions() {
        return this.actions;
    }

    public int hashCode() {
        return getName().hashCode() + this.permissionMask;
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof C32931hZ) || !getName().equals(permission.getName())) {
            return false;
        }
        int i2 = this.permissionMask;
        int i3 = ((C32931hZ) permission).permissionMask;
        return (i2 & i3) == i3;
    }
}
