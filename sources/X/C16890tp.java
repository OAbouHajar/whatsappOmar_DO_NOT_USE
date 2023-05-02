package X;

import android.database.AbstractCursor;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.0tp  reason: invalid class name and case insensitive filesystem */
public class C16890tp extends AbstractCursor {
    public static final String[] A03 = {"jid", FacebookFacade.RequestParameter.NAME};
    public final C16000sG A00;
    public final C16080sP A01;
    public final C15800rs A02;

    public C16890tp(C16000sG r1, C16080sP r2, C15800rs r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String[] getColumnNames() {
        return A03;
    }

    public int getCount() {
        return this.A02.A01();
    }

    public double getDouble(int i2) {
        return 0.0d;
    }

    public float getFloat(int i2) {
        return 0.0f;
    }

    public int getInt(int i2) {
        return 0;
    }

    public long getLong(int i2) {
        return 0;
    }

    public short getShort(int i2) {
        return 0;
    }

    public String getString(int i2) {
        if (i2 == 0) {
            List A05 = this.A02.A05();
            int position = getPosition();
            if (A05.size() > position) {
                return ((Jid) A05.get(position)).getRawString();
            }
        } else if (i2 != 1) {
            return "";
        }
        List A052 = this.A02.A05();
        int position2 = getPosition();
        return A052.size() > position2 ? this.A01.A08(this.A00.A0A((C15830rv) A052.get(position2))) : "";
    }

    public boolean isNull(int i2) {
        return false;
    }
}
