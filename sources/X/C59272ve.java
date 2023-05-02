package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioButton;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupAddPrivacyActivity;
import com.obwhatsapp.invites.NobodyDeprecatedDialogFragment;
import com.obwhatsapp.profile.AboutStatusPrivacyActivity;
import com.obwhatsapp.profile.ProfilePhotoPrivacyActivity;

/* renamed from: X.2ve  reason: invalid class name and case insensitive filesystem */
public abstract class C59272ve extends C14530pL {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioButton A03;

    public void A35() {
        if (this instanceof ProfilePhotoPrivacyActivity) {
            ProfilePhotoPrivacyActivity profilePhotoPrivacyActivity = (ProfilePhotoPrivacyActivity) this;
            Intent A09 = C13680ns.A09();
            A09.putExtra("profile_photo", profilePhotoPrivacyActivity.A00);
            C13680ns.A0r(profilePhotoPrivacyActivity, A09);
        } else if (this instanceof AboutStatusPrivacyActivity) {
            AboutStatusPrivacyActivity aboutStatusPrivacyActivity = (AboutStatusPrivacyActivity) this;
            int i2 = aboutStatusPrivacyActivity.A00;
            Intent A092 = C13680ns.A09();
            A092.putExtra("about", i2);
            C13680ns.A0r(aboutStatusPrivacyActivity, A092);
        } else {
            GroupAddPrivacyActivity groupAddPrivacyActivity = (GroupAddPrivacyActivity) this;
            if (groupAddPrivacyActivity.A00 == 2 || !groupAddPrivacyActivity.A02) {
                Intent A093 = C13680ns.A09();
                A093.putExtra("groupadd", groupAddPrivacyActivity.A00);
                C13680ns.A0r(groupAddPrivacyActivity, A093);
                return;
            }
            groupAddPrivacyActivity.Afc(new NobodyDeprecatedDialogFragment());
        }
    }

    public void onBackPressed() {
        A35();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout02b6);
        C005402i A0N = C13690nt.A0N(this);
        A0N.A0N(true);
        boolean z2 = this instanceof ProfilePhotoPrivacyActivity;
        A0N.A0B(z2 ? R.string.str15b0 : this instanceof AboutStatusPrivacyActivity ? R.string.str15ae : R.string.str15ab);
        this.A01 = (RadioButton) findViewById(R.id.my_contacts_button);
        this.A00 = (RadioButton) findViewById(R.id.everyone_btn);
        this.A02 = (RadioButton) findViewById(R.id.my_contacts_except_button);
        this.A03 = (RadioButton) findViewById(R.id.nobody_btn);
        C13680ns.A0N(this, R.id.header).setText(z2 ? R.string.str15b1 : this instanceof AboutStatusPrivacyActivity ? R.string.str15a2 : R.string.str15ad);
        if (z2 || (this instanceof AboutStatusPrivacyActivity)) {
            C13690nt.A1I(this, R.id.footer);
        } else {
            C13680ns.A0N(this, R.id.footer).setText(R.string.str15ac);
        }
        this.A01.setText(R.string.str12f7);
        this.A00.setText(R.string.str12f8);
        this.A02.setText(R.string.str0a2b);
        this.A03.setText(R.string.str12ff);
        C13680ns.A15(this.A01, this, 6);
        C13680ns.A15(this.A00, this, 7);
        C13680ns.A15(this.A02, this, 8);
        C13680ns.A15(this.A03, this, 5);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A35();
        return false;
    }

    public void onResume() {
        super.onResume();
        int i2 = this instanceof ProfilePhotoPrivacyActivity ? ((ProfilePhotoPrivacyActivity) this).A00 : this instanceof AboutStatusPrivacyActivity ? ((AboutStatusPrivacyActivity) this).A00 : ((GroupAddPrivacyActivity) this).A00;
        boolean z2 = false;
        this.A01.setChecked(C13690nt.A1R(i2));
        this.A00.setChecked(AnonymousClass000.A1P(i2));
        this.A03.setChecked(AnonymousClass000.A1R(i2, 2));
        RadioButton radioButton = this.A02;
        if (i2 == 3) {
            z2 = true;
        }
        radioButton.setChecked(z2);
    }
}
