package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape1S0400000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.RegisterName;
import com.whatsapp.util.Log;

/* renamed from: X.2v0  reason: invalid class name */
public class AnonymousClass2v0 extends AnonymousClass2S7 {
    public int A00 = 0;
    public final /* synthetic */ RegisterName A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2v0(AnonymousClass01V r8, C16440t3 r9, AnonymousClass013 r10, RegisterName registerName) {
        super(registerName, r8, r9, r10, R.layout.layout0351);
        this.A01 = registerName;
    }

    public void A00(int i2) {
        Log.i(C13680ns.A0c(i2, "RegisterName/updatestate/state "));
        this.A00 = i2;
        if (i2 != 1) {
            RegisterName registerName = this.A01;
            if (!registerName.A09.A01()) {
                registerName.A1C.A02();
                findViewById(R.id.initial_sync_progress).setVisibility(0);
                findViewById(R.id.photo_progress).setVisibility(0);
                return;
            }
        }
        findViewById(R.id.initial_sync_progress).setVisibility(4);
        findViewById(R.id.photo_progress).setVisibility(4);
        RegisterName registerName2 = this.A01;
        C13690nt.A0v(registerName2.A09.A0K(), "com.obwhatsapp.registername.initializer_start_time");
        View view = registerName2.A03;
        if (view != null) {
            view.setVisibility(4);
        }
        registerName2.A1Y.removeMessages(0);
        Log.i("RegisterName/sync/finished");
        Intent A04 = C14750ph.A04(registerName2);
        A04.putExtra("show_payment_account_recovery", true);
        registerName2.startActivity(A04);
        registerName2.finish();
        RegisterName.A1c = null;
        AnonymousClass29T.A00(registerName2, 0);
        if (C13680ns.A0B(registerName2.A09).getLong("eula_accepted_time", 0) > 0) {
            C75873sr A002 = registerName2.A12.A00(getContext(), registerName2.A09, registerName2.A0d, registerName2.A1S, registerName2.A1R, registerName2.A1P, registerName2.A1Q, registerName2.A1T, registerName2.A1V);
            C612238b r5 = registerName2.A12;
            AnonymousClass01D r6 = registerName2.A1O;
            C16490t9 r3 = registerName2.A0m;
            C16320sq r2 = registerName2.A05;
            C16040sK r7 = registerName2.A01;
            C226318r r8 = registerName2.A0l;
            r3.A04(A002);
            r3.A01();
            r2.Acl(new RunnableRunnableShape1S0400000_I1(r5, r6, r7, r8, 9));
        }
        C13690nt.A0v(registerName2.A09.A0K().remove("message_store_verified_time").remove("eula_accepted_time").remove("registration_retry_fetching_biz_profile").remove("registration_attempt_skip_with_no_vertical").remove("registration_sibling_app_phone_number").remove("registration_sibling_app_country_code").remove("registration_sibling_app_min_storage_needed").remove("sister_app_content_provider_is_enabled").remove("direct_migration_start_time").remove("direct_db_migration_timeout_in_secs").remove("migrate_from_consumer_app_directly").remove("direct_migration_session_id").remove("google_migrate_import_start_time").remove("reg_backup_status_key").remove("reg_profile_pic_source_key").remove("reg_profile_pic_tapped_key").remove("reg_prefill_name").remove("reg_profile_redesign"), "reg_skip_storage_perm");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C434920f.A02(R.color.color04f1, this);
        getWindow().setFormat(1);
        getWindow().addFlags(4096);
        getWindow().setSoftInputMode(3);
        A00(bundle == null ? 0 : bundle.getInt("state"));
        RegisterName registerName = this.A01;
        View findViewById = findViewById(R.id.pay_ed_contact_support);
        registerName.A03 = findViewById;
        if (findViewById != null) {
            C13680ns.A15(findViewById, this, 31);
        }
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
