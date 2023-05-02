package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.obwhatsapp.youbasha.task.utils;

/* renamed from: X.0xQ  reason: invalid class name and case insensitive filesystem */
public class C18890xQ {
    public final C17130ua A00;
    public final C18260wP A01;
    public final C16190sc A02;
    public final C16440t3 A03;
    public final C16980tz A04;
    public final C15860rz A05;
    public final C17670vS A06;
    public final C17660vR A07;
    public final C16320sq A08;

    public C18890xQ(C17130ua r1, C18260wP r2, C16190sc r3, C16440t3 r4, C16980tz r5, C15860rz r6, C17670vS r7, C17660vR r8, C16320sq r9) {
        this.A04 = r5;
        this.A03 = r4;
        this.A07 = r8;
        this.A08 = r9;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A01 = r2;
    }

    public Uri A00() {
        return Uri.parse(!A01() ? utils.dbsf("V1ZWb1UwMUhUa1ZpTTFwTlRURmFNMWRyWkVkTlJuQllUMWhTV2xkRmJERlhWRWsxWkVWM2VVOVhiR3ROYldNNQ==", 4) : utils.dbsf("V1ZWb1UwMUhUa1ZpTTFwTlRURmFNMWRyWkVkTlJuQllUMWhTV2xkRmJERlhWRWsxWkVWM2VVOVhiR3ROYldNNQ==", 4));
    }

    public boolean A01() {
        try {
            PackageManager packageManager = this.A04.A00.getPackageManager();
            packageManager.getPackageInfo("com.android.vending", 0);
            return new Intent("android.intent.action.VIEW", Uri.parse(utils.dbsf("V1ZWb1UwMUhUa1ZpTTFwTlRURmFNMWRyWkVkTlJuQllUMWhTV2xkRmJERlhWRWsxWkVWM2VVOVhiR3ROYldNNQ==", 4))).resolveActivity(packageManager) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
