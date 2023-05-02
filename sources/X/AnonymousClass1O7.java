package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1O7  reason: invalid class name */
public class AnonymousClass1O7 implements C23541Cj {
    public final AnonymousClass11E A00;

    public AnonymousClass1O7(AnonymousClass11E r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void APJ() {
    }

    public void APK() {
        Map map;
        AnonymousClass11E r9 = this.A00;
        C16040sK r8 = r9.A01;
        r8.A0B();
        if (r8.A00 != null) {
            C75973t1 r7 = new C75973t1();
            C28031Ub it = r9.A0B.A00().values().iterator();
            while (it.hasNext()) {
                C30111bl r2 = (C30111bl) it.next();
                if (r2 instanceof C46492Em) {
                    r7.A0R = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EY) {
                    r7.A0A = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46422Ef) {
                    r7.A0B = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46502En) {
                    r7.A04 = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46432Eg) {
                    r7.A03 = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EZ) {
                    r7.A01 = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46442Eh) {
                    r7.A00 = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EO) {
                    r7.A0X = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46402Ed) {
                    r7.A0W = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EN) {
                    r7.A0V = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2ET) {
                    r7.A0U = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46392Ec) {
                    r7.A0T = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EV) {
                    r7.A0S = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EM) {
                    r7.A0Q = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2ER) {
                    r7.A0M = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46412Ee) {
                    r7.A0L = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46472Ek) {
                    r7.A0O = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46462Ej) {
                    r7.A0N = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EQ) {
                    r7.A0K = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2ES) {
                    r7.A0P = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EU) {
                    r7.A0H = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46372Ea) {
                    C46372Ea r22 = (C46372Ea) r2;
                    boolean z2 = r22 instanceof C46382Eb;
                    Integer valueOf = Integer.valueOf(r22.A04());
                    if (z2) {
                        r7.A0J = valueOf;
                    } else {
                        r7.A0I = valueOf;
                    }
                } else if (r2 instanceof AnonymousClass2EL) {
                    r7.A0G = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EX) {
                    r7.A0F = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EK) {
                    r7.A0E = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EH) {
                    r7.A0C = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EP) {
                    r7.A09 = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EJ) {
                    r7.A08 = Integer.valueOf(r2.A04());
                } else if (r2 instanceof AnonymousClass2EW) {
                    r7.A07 = Integer.valueOf(r2.A04());
                } else if (r2 instanceof C46452Ei) {
                    r7.A02 = Integer.valueOf(r2.A04());
                }
            }
            r7.A05 = 1;
            r7.A06 = 1;
            r7.A0D = 1;
            long j2 = -1;
            long j3 = ((SharedPreferences) r9.A05.A01.get()).getLong("db_last_all_migrations_attempt_timestamp", -1);
            if (j3 >= 0) {
                j2 = r9.A04.A00() - j3;
            }
            r7.A0Y = Long.valueOf(j2);
            r9.A0D.A04(r7);
        }
        r8.A0B();
        if (r8.A00 != null) {
            C14710pd r23 = r9.A0C;
            C16620tM r1 = C16620tM.A02;
            if (r23.A0E(r1, 2803)) {
                Log.i("DatabaseMigrationManager/analyzeStuckMigrations/expedited app upgrade disabled");
                return;
            }
            String A06 = r23.A06(r1, 2804);
            if (AnonymousClass1ZW.A0E(A06)) {
                map = Collections.emptyMap();
            } else {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(A06);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, Integer.valueOf(jSONObject.getInt(next)));
                    }
                    map = hashMap;
                } catch (JSONException e2) {
                    StringBuilder sb = new StringBuilder("DatabaseMigrationManager/parseKnownVersions/malformed json ");
                    sb.append(A06);
                    Log.e(sb.toString(), e2);
                    r9.A00.AcB("db-migration-parse-known-versions/malformed", e2.getMessage(), false);
                    map = hashMap;
                }
            }
            if (!map.isEmpty()) {
                C28031Ub it2 = r9.A0B.A00().values().iterator();
                while (it2.hasNext()) {
                    C30111bl r24 = (C30111bl) it2.next();
                    if (r24.A0P()) {
                        int i2 = r24.A00;
                        String str = r24.A0C;
                        Number number = (Number) map.get(str);
                        if (number != null && number.intValue() > i2) {
                            StringBuilder sb2 = new StringBuilder("DatabaseMigrationManager/analyzeStuckMigrations/need to upgrade app because of ");
                            sb2.append(str);
                            Log.i(sb2.toString());
                            r9.A02.A01(r9.A04.A00() + 1209600000);
                            return;
                        }
                    }
                }
            }
        }
    }
}
