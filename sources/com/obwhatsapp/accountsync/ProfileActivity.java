package com.obwhatsapp.accountsync;

import X.AnonymousClass19Y;
import X.AnonymousClass29T;
import X.AnonymousClass2RY;
import X.AnonymousClass2Rx;
import X.C14750ph;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16250si;
import X.C16900tq;
import X.C17240ul;
import X.C19760yx;
import X.C49242Ru;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class ProfileActivity extends C49242Ru {
    public AnonymousClass2Rx A00 = null;
    public AnonymousClass19Y A01;
    public C16000sG A02;
    public C16250si A03;
    public C16900tq A04;
    public C17240ul A05;
    public WhatsAppLibLoader A06;
    public C19760yx A07;

    public final void A39() {
        Cursor query;
        if (AIm()) {
            Log.w("sync profile activity already finishing, ignoring gotoActivity call");
            return;
        } else if (this.A01.A00()) {
            if (!(getIntent().getData() == null || this.A01.A0G() || (query = getContentResolver().query(getIntent().getData(), (String[]) null, (String) null, (String[]) null, (String) null)) == null)) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("mimetype"));
                        UserJid nullable = UserJid.getNullable(query.getString(query.getColumnIndexOrThrow("data1")));
                        if (nullable != null) {
                            if (this instanceof CallContactLandingActivity) {
                                CallContactLandingActivity callContactLandingActivity = (CallContactLandingActivity) this;
                                C16010sH A0A = callContactLandingActivity.A02.A0A(nullable);
                                if ("vnd.android.cursor.item/vnd.com.obwhatsapp.voip.call".equals(string)) {
                                    callContactLandingActivity.A00.A01(callContactLandingActivity, A0A, 14, false);
                                } else if ("vnd.android.cursor.item/vnd.com.obwhatsapp.video.call".equals(string)) {
                                    callContactLandingActivity.A00.A01(callContactLandingActivity, A0A, 14, true);
                                }
                            } else {
                                C16010sH A0A2 = this.A02.A0A(nullable);
                                if ("vnd.android.cursor.item/vnd.com.obwhatsapp.profile".equals(string)) {
                                    this.A00.A07(this, new C14750ph().A0v(this, A0A2));
                                }
                            }
                            finish();
                            query.close();
                            return;
                        }
                    }
                    query.close();
                } catch (Throwable unused) {
                }
            }
            StringBuilder sb = new StringBuilder("failed to go anywhere from sync profile activity; intent=");
            sb.append(getIntent());
            Log.e(sb.toString());
            finish();
            return;
        } else if (!isFinishing()) {
            startActivityForResult(RequestPermissionActivity.A03(this, R.string.str11c1, R.string.str11c2, true), 150);
            return;
        } else {
            return;
        }
        throw th;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 150) {
            if (i3 == -1) {
                A39();
            } else {
                Log.w("profileactivity/contact access denied");
                finish();
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A06.A03()) {
            Log.i("aborting due to native libraries missing");
        } else {
            C16040sK r0 = this.A01;
            r0.A0B();
            if (r0.A00 == null || !this.A09.A01()) {
                this.A05.A09(R.string.str08fd, 1);
            } else {
                C16900tq r02 = this.A04;
                r02.A04();
                if (!r02.A01) {
                    AnonymousClass2RY r03 = this.A00;
                    if (r03.A07.A03(r03.A06)) {
                        int A052 = this.A03.A05();
                        StringBuilder sb = new StringBuilder("profileactivity/create/backupfilesfound ");
                        sb.append(A052);
                        Log.i(sb.toString());
                        if (A052 > 0) {
                            AnonymousClass29T.A01(this, 105);
                            return;
                        } else {
                            A38(false);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    A36();
                    return;
                }
            }
        }
        finish();
    }
}
