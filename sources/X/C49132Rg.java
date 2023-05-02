package X;

import android.app.Activity;
import android.os.Build;
import com.obwhatsapp.audioRecording.AudioRecordFactory;
import com.obwhatsapp.audioRecording.OpusRecorderFactory;
import com.obwhatsapp.calling.di.ActivityModule;
import com.obwhatsapp.gallery.di.GalleryModule;
import com.obwhatsapp.gallery.di.GalleryPickerFragmentModule;
import com.whatsapp.Mp4Ops;
import com.whatsapp.stickers.di.StickersDependencyBridgeModule;

/* renamed from: X.2Rg  reason: invalid class name and case insensitive filesystem */
public final class C49132Rg extends AnonymousClass2Rf {
    public AnonymousClass01J A00;
    public AnonymousClass01J A01;
    public AnonymousClass01J A02;
    public AnonymousClass01J A03;
    public AnonymousClass01J A04;
    public AnonymousClass01J A05;
    public AnonymousClass01J A06;
    public AnonymousClass01J A07;
    public AnonymousClass01J A08;
    public AnonymousClass01J A09;
    public AnonymousClass01J A0A;
    public AnonymousClass01J A0B;
    public AnonymousClass01J A0C;
    public AnonymousClass01J A0D;
    public AnonymousClass01J A0E;
    public AnonymousClass01J A0F;
    public AnonymousClass01J A0G;
    public AnonymousClass01J A0H;
    public AnonymousClass01J A0I;
    public AnonymousClass01J A0J;
    public AnonymousClass01J A0K;
    public AnonymousClass01J A0L;
    public AnonymousClass01J A0M;
    public AnonymousClass01J A0N;
    public AnonymousClass01J A0O;
    public AnonymousClass01J A0P;
    public AnonymousClass01J A0Q;
    public AnonymousClass01J A0R;
    public AnonymousClass01J A0S;
    public AnonymousClass01J A0T;
    public AnonymousClass01J A0U;
    public AnonymousClass01J A0V;
    public AnonymousClass01J A0W;
    public AnonymousClass01J A0X;
    public AnonymousClass01J A0Y;
    public AnonymousClass01J A0Z;
    public AnonymousClass01J A0a;
    public AnonymousClass01J A0b;
    public AnonymousClass01J A0c;
    public AnonymousClass01J A0d;
    public AnonymousClass01J A0e;
    public AnonymousClass01J A0f;
    public AnonymousClass01J A0g;
    public AnonymousClass01J A0h;
    public AnonymousClass01J A0i;
    public AnonymousClass01J A0j;
    public AnonymousClass01J A0k;
    public AnonymousClass01J A0l;
    public AnonymousClass01J A0m;
    public AnonymousClass01J A0n;
    public AnonymousClass01J A0o;
    public AnonymousClass01J A0p;
    public AnonymousClass01J A0q;
    public AnonymousClass01J A0r;
    public AnonymousClass01J A0s;
    public AnonymousClass01J A0t;
    public AnonymousClass01J A0u;
    public AnonymousClass01J A0v;
    public AnonymousClass01J A0w;
    public AnonymousClass01J A0x;
    public AnonymousClass01J A0y;
    public AnonymousClass01J A0z;
    public AnonymousClass01J A10;
    public AnonymousClass01J A11;
    public AnonymousClass01J A12;
    public AnonymousClass01J A13;
    public AnonymousClass01J A14;
    public AnonymousClass01J A15;
    public AnonymousClass01J A16;
    public AnonymousClass01J A17;
    public AnonymousClass01J A18;
    public AnonymousClass01J A19;
    public AnonymousClass01J A1A;
    public AnonymousClass01J A1B;
    public AnonymousClass01J A1C;
    public AnonymousClass01J A1D;
    public AnonymousClass01J A1E;
    public AnonymousClass01J A1F;
    public AnonymousClass01J A1G;
    public AnonymousClass01J A1H;
    public AnonymousClass01J A1I;
    public AnonymousClass01J A1J;
    public AnonymousClass01J A1K;
    public AnonymousClass01J A1L;
    public AnonymousClass01J A1M;
    public AnonymousClass01J A1N;
    public AnonymousClass01J A1O;
    public AnonymousClass01J A1P;
    public AnonymousClass01J A1Q;
    public AnonymousClass01J A1R;
    public AnonymousClass01J A1S;
    public AnonymousClass01J A1T;
    public AnonymousClass01J A1U;
    public AnonymousClass01J A1V;
    public AnonymousClass01J A1W;
    public AnonymousClass01J A1X;
    public AnonymousClass01J A1Y;
    public AnonymousClass01J A1Z;
    public AnonymousClass01J A1a;
    public AnonymousClass01J A1b;
    public AnonymousClass01J A1c;
    public AnonymousClass01J A1d;
    public AnonymousClass01J A1e;
    public AnonymousClass01J A1f;
    public AnonymousClass01J A1g;
    public AnonymousClass01J A1h;
    public AnonymousClass01J A1i;
    public AnonymousClass01J A1j;
    public AnonymousClass01J A1k;
    public AnonymousClass01J A1l;
    public AnonymousClass01J A1m;
    public AnonymousClass01J A1n;
    public AnonymousClass01J A1o;
    public final Activity A1p;
    public final C49132Rg A1q = this;
    public final AnonymousClass2YU A1r;
    public final C16150sX A1s;
    public final ActivityModule A1t;
    public final GalleryModule A1u;
    public final GalleryPickerFragmentModule A1v;
    public final StickersDependencyBridgeModule A1w;

    public /* synthetic */ C49132Rg(Activity activity, AnonymousClass2YU r7, C16150sX r8, ActivityModule activityModule, GalleryModule galleryModule, GalleryPickerFragmentModule galleryPickerFragmentModule, StickersDependencyBridgeModule stickersDependencyBridgeModule) {
        this.A1s = r8;
        this.A1r = r7;
        this.A1t = activityModule;
        this.A1v = galleryPickerFragmentModule;
        this.A1u = galleryModule;
        this.A1p = activity;
        this.A1w = stickersDependencyBridgeModule;
        this.A0A = C17280up.A00(new C50212Yk(this, r7, r8, 0));
        this.A0G = C17280up.A00(new C50212Yk(this, r7, r8, 1));
        this.A1l = new C50212Yk(this, r7, r8, 3);
        this.A0E = new C50212Yk(this, r7, r8, 2);
        this.A0R = C17280up.A00(new C50212Yk(this, r7, r8, 5));
        this.A1h = new C50212Yk(this, r7, r8, 4);
        this.A1e = new C50212Yk(this, r7, r8, 6);
        this.A0c = C17280up.A00(new C50212Yk(this, r7, r8, 7));
        this.A1f = C17280up.A00(new C50212Yk(this, r7, r8, 9));
        this.A0n = C17280up.A00(new C50212Yk(this, r7, r8, 10));
        this.A01 = new C50212Yk(this, r7, r8, 8);
        this.A0y = C17280up.A00(new C50212Yk(this, r7, r8, 11));
        this.A19 = C17280up.A00(new C50212Yk(this, r7, r8, 12));
        this.A1K = C17280up.A00(new C50212Yk(this, r7, r8, 13));
        this.A1m = C17280up.A00(new C50212Yk(this, r7, r8, 14));
        this.A1V = C17280up.A00(new C50212Yk(this, r7, r8, 16));
        this.A1W = C17280up.A00(new C50212Yk(this, r7, r8, 17));
        this.A0H = C17280up.A00(new C50212Yk(this, r7, r8, 18));
        this.A0I = C17280up.A00(new C50212Yk(this, r7, r8, 19));
        this.A0J = C17280up.A00(new C50212Yk(this, r7, r8, 20));
        this.A0K = C17280up.A00(new C50212Yk(this, r7, r8, 21));
        this.A0L = C17280up.A00(new C50212Yk(this, r7, r8, 22));
        this.A0M = C17280up.A00(new C50212Yk(this, r7, r8, 23));
        this.A0N = C17280up.A00(new C50212Yk(this, r7, r8, 24));
        this.A0O = C17280up.A00(new C50212Yk(this, r7, r8, 15));
        this.A0P = C17280up.A00(new C50212Yk(this, r7, r8, 25));
        this.A0Q = C17280up.A00(new C50212Yk(this, r7, r8, 26));
        this.A0F = C17280up.A00(new C50212Yk(this, r7, r8, 27));
        this.A00 = C17280up.A00(new C50212Yk(this, r7, r8, 28));
        this.A0S = C17280up.A00(new C50212Yk(this, r7, r8, 29));
        this.A0T = C17280up.A00(new C50212Yk(this, r7, r8, 30));
        this.A0U = C17280up.A00(new C50212Yk(this, r7, r8, 31));
        this.A0V = C17280up.A00(new C50212Yk(this, r7, r8, 32));
        this.A0W = C17280up.A00(new C50212Yk(this, r7, r8, 33));
        this.A0X = C17280up.A00(new C50212Yk(this, r7, r8, 34));
        this.A0Y = C17280up.A00(new C50212Yk(this, r7, r8, 36));
        this.A0Z = C17280up.A00(new C50212Yk(this, r7, r8, 35));
        this.A0a = C17280up.A00(new C50212Yk(this, r7, r8, 38));
        this.A0b = C17280up.A00(new C50212Yk(this, r7, r8, 39));
        this.A0d = C17280up.A00(new C50212Yk(this, r7, r8, 37));
        this.A0e = C17280up.A00(new C50212Yk(this, r7, r8, 40));
        this.A0f = C17280up.A00(new C50212Yk(this, r7, r8, 42));
        this.A0g = C17280up.A00(new C50212Yk(this, r7, r8, 43));
        this.A0h = C17280up.A00(new C50212Yk(this, r7, r8, 41));
        this.A0i = C17280up.A00(new C50212Yk(this, r7, r8, 44));
        this.A0j = C17280up.A00(new C50212Yk(this, r7, r8, 45));
        this.A02 = C17280up.A00(new C50212Yk(this, r7, r8, 46));
        this.A0k = C17280up.A00(new C50212Yk(this, r7, r8, 49));
        this.A0l = C17280up.A00(new C50212Yk(this, r7, r8, 48));
        this.A0m = C17280up.A00(new C50212Yk(this, r7, r8, 47));
        this.A0C = C17280up.A00(new C50212Yk(this, r7, r8, 50));
        this.A0o = C17280up.A00(new C50212Yk(this, r7, r8, 51));
        this.A0p = C17280up.A00(new C50212Yk(this, r7, r8, 52));
        this.A0q = C17280up.A00(new C50212Yk(this, r7, r8, 53));
        this.A0r = C17280up.A00(new C50212Yk(this, r7, r8, 54));
        this.A0s = C17280up.A00(new C50212Yk(this, r7, r8, 55));
        this.A1Y = C17280up.A00(new C50212Yk(this, r7, r8, 56));
        this.A0B = C17280up.A00(new C50212Yk(this, r7, r8, 57));
        this.A0t = C17280up.A00(new C50212Yk(this, r7, r8, 58));
        this.A0u = C17280up.A00(new C50212Yk(this, r7, r8, 59));
        this.A1a = C17280up.A00(new C50212Yk(this, r7, r8, 60));
        this.A0v = C17280up.A00(new C50212Yk(this, r7, r8, 61));
        this.A0w = C17280up.A00(new C50212Yk(this, r7, r8, 62));
        this.A1o = C17280up.A00(new C50212Yk(this, r7, r8, 63));
        this.A0x = C17280up.A00(new C50212Yk(this, r7, r8, 64));
        this.A0z = C17280up.A00(new C50212Yk(this, r7, r8, 65));
        this.A10 = C17280up.A00(new C50212Yk(this, r7, r8, 66));
        this.A11 = C17280up.A00(new C50212Yk(this, r7, r8, 67));
        this.A12 = C17280up.A00(new C50212Yk(this, r7, r8, 68));
        this.A13 = C17280up.A00(new C50212Yk(this, r7, r8, 69));
        this.A14 = C17280up.A00(new C50212Yk(this, r7, r8, 70));
        this.A15 = C17280up.A00(new C50212Yk(this, r7, r8, 71));
        this.A16 = C17280up.A00(new C50212Yk(this, r7, r8, 72));
        this.A17 = C17280up.A00(new C50212Yk(this, r7, r8, 73));
        this.A18 = C17280up.A00(new C50212Yk(this, r7, r8, 74));
        this.A03 = C17270uo.A01(new C50212Yk(this, r7, r8, 75));
        this.A05 = C17270uo.A01(new C50212Yk(this, r7, r8, 76));
        this.A04 = C17270uo.A01(new C50212Yk(this, r7, r8, 77));
        this.A06 = C17270uo.A01(new C50212Yk(this, r7, r8, 78));
        this.A07 = C17270uo.A01(new C50212Yk(this, r7, r8, 79));
        this.A08 = C17270uo.A01(new C50212Yk(this, r7, r8, 80));
        this.A1X = C17270uo.A01(new C50212Yk(this, r7, r8, 81));
        this.A1A = C17280up.A00(new C50212Yk(this, r7, r8, 82));
        this.A1B = C17280up.A00(new C50212Yk(this, r7, r8, 83));
        this.A1C = C17280up.A00(new C50212Yk(this, r7, r8, 84));
        this.A1D = C17280up.A00(new C50212Yk(this, r7, r8, 85));
        this.A1E = C17280up.A00(new C50212Yk(this, r7, r8, 86));
        this.A1g = new C50212Yk(this, r7, r8, 88);
        this.A1n = new C50212Yk(this, r7, r8, 87);
        this.A0D = new C50212Yk(this, r7, r8, 89);
        this.A1F = C17280up.A00(new C50212Yk(this, r7, r8, 90));
        this.A1G = C17280up.A00(new C50212Yk(this, r7, r8, 91));
        this.A1Z = C17270uo.A01(new C50212Yk(this, r7, r8, 92));
        this.A1H = C17280up.A00(new C50212Yk(this, r7, r8, 93));
        this.A1I = C17280up.A00(new C50212Yk(this, r7, r8, 94));
        this.A1J = C17280up.A00(new C50212Yk(this, r7, r8, 95));
        this.A1L = C17280up.A00(new C50212Yk(this, r7, r8, 96));
        this.A1M = C17280up.A00(new C50212Yk(this, r7, r8, 98));
        this.A1N = C17280up.A00(new C50212Yk(this, r7, r8, 99));
        this.A1O = C17280up.A00(new C50212Yk(this, r7, r8, 97));
        C16150sX r4 = this.A1s;
        AnonymousClass2YU r3 = this.A1r;
        C49132Rg r2 = this.A1q;
        this.A1j = new C50212Yk(r2, r3, r4, 100);
        this.A1d = C17280up.A00(new C50212Yk(r2, r3, r4, 102));
        this.A1k = C17270uo.A01(new C50212Yk(r2, r3, r4, 101));
        this.A1b = new C50212Yk(r2, r3, r4, 104);
        this.A1c = new C50212Yk(r2, r3, r4, 105);
        this.A1P = C17280up.A00(new C50212Yk(r2, r3, r4, 103));
        this.A1i = new C50212Yk(r2, r3, r4, 106);
        this.A1Q = C17280up.A00(new C50212Yk(r2, r3, r4, AnonymousClass2EA.A03));
        this.A1R = C17280up.A00(new C50212Yk(r2, r3, r4, 109));
        this.A1S = C17280up.A00(new C50212Yk(r2, r3, r4, 110));
        this.A1T = C17280up.A00(new C50212Yk(r2, r3, r4, 111));
        this.A1U = C17280up.A00(new C50212Yk(r2, r3, r4, 112));
        this.A09 = C17270uo.A01(new C50212Yk(r2, r3, r4, 107));
    }

    public static /* synthetic */ C50272Yr A01(C49132Rg r1) {
        return new C50272Yr((C16490t9) r1.A1s.AQz.get());
    }

    public AnonymousClass2Z6 A04() {
        C16150sX r4 = this.A1s;
        return new AnonymousClass2Z6(C24221Fa.A00(r4.AS2), new AnonymousClass2Z5(this.A1r, r4), C17380uz.of("com.obwhatsapp.conversationslist.ArchiveHeaderViewModel", "com.obwhatsapp.avatar.home.AvatarHomeViewModel", "com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel", "com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel", "com.obwhatsapp.registration.report.BanReportViewModel", "com.obwhatsapp.payments.model.BipProcessActionViewModel", "com.obwhatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel", "com.obwhatsapp.calling.controls.viewmodel.BottomSheetViewModel", "com.obwhatsapp.report.BusinessActivityReportViewModel", "com.obwhatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel", "com.obwhatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel", "com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel", "com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel", "com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel", "com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel", "com.obwhatsapp.calling.avatar.CallAvatarViewModel", "com.obwhatsapp.calling.controls.viewmodel.CallControlButtonsViewModel", "com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel", "com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel", "com.obwhatsapp.calling.calllink.viewmodel.CallLinkViewModel", "com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel", "com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel", "com.obwhatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel", "com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel", "com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel", "com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel", "com.obwhatsapp.community.CommunityTabViewModel", "com.obwhatsapp.biz.product.viewmodel.ComplianceInfoViewModel", "com.obwhatsapp.community.ConversationCommunityViewModel", "com.obwhatsapp.conversation.viewmodel.ConversationTitleViewModel", "com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel", "com.obwhatsapp.qrcode.DevicePairQrScannerViewModel", "com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel", "com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel", "com.obwhatsapp.migration.export.ui.ExportMigrationViewModel", "com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel", "com.obwhatsapp.wabloks.base.GenericBkLayoutViewModel", "com.obwhatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel", "com.obwhatsapp.migration.android.view.GoogleMigrateImporterViewModel", "com.obwhatsapp.group.GroupSettingsViewModel", "com.obwhatsapp.inappbugreporting.InAppBugReportingViewModel", "com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel", "com.obwhatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel", "com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel", "com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel", "com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel", "com.obwhatsapp.companiondevice.LinkedDevicesViewModel", "com.obwhatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel", "com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel", "com.obwhatsapp.conversation.conversationrow.message.MessageDetailsViewModel", "com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel", "com.obwhatsapp.biz.order.viewmodel.OrderInfoViewModel", "com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel", "com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel", "com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel", "com.obwhatsapp.polls.PollCreatorViewModel", "com.obwhatsapp.polls.PollResultsViewModel", "com.obwhatsapp.privacy.disclosure.standalone.PrivacyDisclosureStandaloneContainerViewModel", "com.obwhatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeFragmentViewModel", "com.obwhatsapp.reactions.ReactionsTrayViewModel", "com.obwhatsapp.pnh.RequestPhoneNumberViewModel", "com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel", "com.obwhatsapp.settings.SettingsChatViewModel", "com.obwhatsapp.settings.SettingsDataUsageViewModel", "com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel", "com.obwhatsapp.settings.SettingsUserProxyViewModel", "com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel", "com.obwhatsapp.chatinfo.SharePhoneNumberViewModel", "com.obwhatsapp.shops.ShopsBkLayoutViewModel", "com.obwhatsapp.shops.ShopsProductPreviewFragmentViewModel", "com.obwhatsapp.biz.SmbViewModel", "com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel", "com.obwhatsapp.ctwa.trustsignal.viewmodel.TopBannerViewModel", "com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel", "com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsMetaDataViewModel", "com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsNavBarViewModel"));
    }

    public final AnonymousClass1PQ A05() {
        C16150sX r1 = this.A1s;
        return new AnonymousClass1PQ((C17150uc) r1.A34.get(), (C14710pd) r1.A05.get());
    }

    public final AnonymousClass1MQ A06() {
        C16150sX r1 = this.A1s;
        C118005tu r0 = (C118005tu) r1.A2C.get();
        return new AnonymousClass1MQ(new AnonymousClass5z8((C16440t3) r1.AP2.get(), r0, (C117585tE) r1.A2D.get()), new AnonymousClass1MN((AnonymousClass1MM) this.A1f.get()), (AnonymousClass1JY) r1.AQ7.get(), (AnonymousClass1Bh) r1.AQ8.get(), (C25891Ln) r1.AQJ.get(), (AnonymousClass1JR) r1.AK8.get(), (AnonymousClass1MP) this.A0n.get());
    }

    public final AnonymousClass2Z2 A07() {
        C16150sX r1 = this.A1s;
        C17180uf r2 = (C17180uf) r1.A2n.get();
        C50312Yv r8 = (C50312Yv) this.A1V.get();
        AnonymousClass2Yw r9 = (AnonymousClass2Yw) this.A1W.get();
        C25601Kk r10 = (C25601Kk) r1.A6w.get();
        AnonymousClass2Yx r5 = (AnonymousClass2Yx) this.A0H.get();
        AnonymousClass2Yy r4 = (AnonymousClass2Yy) this.A0J.get();
        AnonymousClass2Yz r6 = (AnonymousClass2Yz) this.A0K.get();
        AnonymousClass2Z0 r7 = (AnonymousClass2Z0) this.A0L.get();
        return new AnonymousClass2Z2(r2, (AnonymousClass2Z1) this.A0M.get(), r4, r5, r6, r7, r8, r9, r10, (C16000sG) r1.A4x.get(), (C18110wA) r1.ABF.get(), (C18120wB) this.A0I.get());
    }

    public final C19860z7 A08() {
        C16150sX r1 = this.A1s;
        C16300so r2 = (C16300so) r1.A5p.get();
        C16000sG r5 = (C16000sG) r1.A4x.get();
        A09();
        r1.A2n.get();
        C19850z6 r4 = (C19850z6) this.A0Q.get();
        return new C19860z7(r2, (C17210ui) r1.A73.get(), r4, r5, (C16440t3) r1.AP2.get(), (C19820z3) r1.A7p.get());
    }

    public final C19840z5 A09() {
        C16150sX r1 = this.A1s;
        return new C19840z5((C19980zJ) r1.A0P.get(), (C16000sG) r1.A4x.get(), (C19230xz) r1.A5B.get(), (C16440t3) r1.AP2.get(), (C19820z3) r1.A7p.get());
    }

    public final C50302Yu A0A() {
        C16150sX r1 = this.A1s;
        return new C50302Yu((C14870pt) r1.AB3.get(), (C17130ua) r1.AN9.get(), (C16980tz) r1.AQB.get(), (C19950zG) r1.AQV.get());
    }

    public final C49592Tx A0B() {
        Object obj;
        C49592Tx r0;
        C16150sX r1 = this.A1s;
        C15860rz r5 = (C15860rz) r1.AQh.get();
        C14720pe r4 = (C14720pe) r1.A05.get();
        AnonymousClass01D A002 = C17270uo.A00(this.A1j);
        AnonymousClass01D A003 = C17270uo.A00(this.A1k);
        if (r5.A1e() || !r4.A0E(C16620tM.A02, 1674)) {
            C16620tM r12 = C16620tM.A02;
            if ((!r4.A0E(r12, 1674) || r5.A1e()) && r4.A0E(r12, 1268)) {
                obj = A003.get();
            } else {
                r0 = new AnonymousClass2ZS();
                C16340ss.A01(r0);
                return r0;
            }
        } else {
            obj = A002.get();
        }
        r0 = (C49592Tx) obj;
        C16340ss.A01(r0);
        return r0;
    }

    public final C49622Uk A0C() {
        C16150sX r1 = this.A1s;
        C15810rt r2 = (C15810rt) r1.A43.get();
        C17240ul r4 = (C17240ul) r1.ABK.get();
        C17780vd A0p2 = C16150sX.A0p(r1);
        AnonymousClass11A r3 = (AnonymousClass11A) r1.A5U.get();
        return new C49622Uk((C17230uk) r1.A4I.get(), r2, r3, r4, A0p2, (C16320sq) r1.ARB.get());
    }

    public final AnonymousClass1LZ A0D() {
        AnonymousClass1LK r30 = new AnonymousClass1LK();
        C16150sX r7 = this.A1s;
        C20300zp A1T2 = r7.A1T();
        C20000zL A1Q2 = r7.A1Q();
        AnonymousClass10D A1R2 = r7.A1R();
        AnonymousClass01J r15 = r7.APV;
        AnonymousClass01J r14 = r7.A0P;
        AnonymousClass1LL r10 = new AnonymousClass1LL((C19980zJ) r14.get(), (C16760tb) r15.get());
        AnonymousClass1LM r9 = new AnonymousClass1LM((AnonymousClass1L9) r7.AFI.get());
        AnonymousClass10I A1S2 = r7.A1S();
        AnonymousClass1LO r8 = new AnonymousClass1LO((C19980zJ) r14.get());
        AnonymousClass01J r4 = r7.A05;
        AnonymousClass01J r2 = r7.AB3;
        AnonymousClass1LP r6 = new AnonymousClass1LP((C14870pt) r2.get(), (C15900s5) r7.ALm.get(), (C14710pd) r4.get());
        AnonymousClass01J r13 = r7.A4x;
        AnonymousClass1LQ r5 = new AnonymousClass1LQ((C16000sG) r13.get(), (C14710pd) r4.get());
        C20260zl A0I2 = A0I();
        AnonymousClass1LR r31 = new AnonymousClass1LR((C14870pt) r2.get(), (C16040sK) r7.ADr.get(), (C16000sG) r13.get(), r7.A1U(), A0I2, (C25681Ks) r7.A0Q.get(), (C25691Kt) r7.A0R.get());
        AnonymousClass1LS r3 = new AnonymousClass1LS((AnonymousClass1HE) r7.ALb.get(), (C209212c) r7.AE1.get());
        AnonymousClass01J r11 = r7.AD5;
        AnonymousClass1LT r42 = new AnonymousClass1LT((C16760tb) r15.get(), (AnonymousClass10B) r11.get());
        return new AnonymousClass1LZ(r31, r3, A1Q2, r9, r8, r6, r42, new AnonymousClass1LW((C19980zJ) r14.get(), (C16000sG) r13.get(), A0I()), r5, r10, A1R2, new AnonymousClass1LX((C16760tb) r15.get(), (AnonymousClass10B) r11.get()), A1S2, A1T2, r30);
    }

    public final C449126f A0E() {
        C16150sX r1 = this.A1s;
        return new C449126f((C14710pd) r1.A05.get(), (AnonymousClass1BL) r1.AJE.get(), (C17110uY) r1.ADT.get());
    }

    public final AnonymousClass11N A0F() {
        AnonymousClass11N r0 = (AnonymousClass11N) ((C19110xm) this.A0E.get()).A00(AnonymousClass11N.class);
        C16340ss.A01(r0);
        return r0;
    }

    public final AnonymousClass2Z3 A0G() {
        C16150sX r1 = this.A1s;
        return new AnonymousClass2Z3((C16070sO) r1.ABY.get(), (C18600wx) r1.A78.get(), (C16490t9) r1.AQz.get(), (C18040w3) r1.AR0.get());
    }

    public final AnonymousClass2Z4 A0H() {
        C16150sX r1 = this.A1s;
        C16760tb r3 = (C16760tb) r1.APV.get();
        C16000sG r6 = (C16000sG) r1.A4x.get();
        AnonymousClass01Y r4 = (AnonymousClass01Y) r1.A1w.get();
        C17780vd A0p2 = C16150sX.A0p(r1);
        AnonymousClass11A r8 = (AnonymousClass11A) r1.A5U.get();
        AnonymousClass2Z3 A0G2 = A0G();
        return new AnonymousClass2Z4((C14870pt) r1.AB3.get(), r3, r4, (C18260wP) r1.A4p.get(), r6, (C15810rt) r1.A43.get(), r8, A0G2, (C17240ul) r1.ABK.get(), A0p2);
    }

    public final C20260zl A0I() {
        C20260zl r0 = (C20260zl) ((C19110xm) this.A0E.get()).A00(C20260zl.class);
        C16340ss.A01(r0);
        return r0;
    }

    public final AnonymousClass2ZD A0J() {
        AnonymousClass1LZ A0D2 = A0D();
        C16150sX r0 = this.A1s;
        AnonymousClass01J r4 = r0.APV;
        AnonymousClass01J r1 = r0.AD5;
        return new AnonymousClass2ZD(A0D2, new AnonymousClass2ZB((C16760tb) r4.get(), (AnonymousClass10B) r1.get()), new AnonymousClass2ZC((C16760tb) r4.get(), (AnonymousClass10B) r1.get()));
    }

    public final C49172Rk A0K() {
        C16150sX r1 = this.A1s;
        return new C49172Rk((C16300so) r1.A5p.get(), (C16980tz) r1.AQB.get(), (C16260sj) r1.AQe.get(), (C20350zu) r1.AIX.get());
    }

    public final C26151Mn A0L() {
        C16150sX r1 = this.A1s;
        C16300so r2 = (C16300so) r1.A5p.get();
        C16040sK r3 = (C16040sK) r1.ADr.get();
        C15900s5 r4 = (C15900s5) r1.ALm.get();
        C211613a r12 = (C211613a) r1.A1E.get();
        AnonymousClass01V r5 = (AnonymousClass01V) r1.AOi.get();
        AnonymousClass013 r7 = (AnonymousClass013) r1.AR8.get();
        C26141Mm r10 = (C26141Mm) r1.A10.get();
        return new C26151Mn(r2, r3, r4, r5, (C15860rz) r1.AQh.get(), r7, (C14710pd) r1.A05.get(), (C17020u3) r1.AMG.get(), r10, (C211913d) r1.A12.get(), r12, (C23061Ai) r1.AC0.get());
    }

    public final AnonymousClass2Z7 A0M() {
        C16150sX r1 = this.A1s;
        C16000sG r3 = (C16000sG) r1.A4x.get();
        C19780yz r6 = (C19780yz) r1.ADI.get();
        return new AnonymousClass2Z7((C16040sK) r1.ADr.get(), r3, (C15810rt) r1.A43.get(), (C16070sO) r1.ABY.get(), r6, (C17580vJ) r1.AQW.get());
    }

    public final C1200860g A0N() {
        C16150sX r2 = this.A1s;
        AnonymousClass01J r1 = r2.AQB;
        AnonymousClass013 r4 = (AnonymousClass013) r2.AR8.get();
        C116045qj r6 = new C116045qj((C16980tz) r1.get());
        AnonymousClass5xE A0z2 = C16150sX.A0z(r2);
        return new C1200860g((C16980tz) r1.get(), r4, (C14710pd) r2.A05.get(), r6, (AnonymousClass17O) r2.AHe.get(), A0z2, (C18090w8) r2.AI6.get());
    }

    public final C118055tz A0O() {
        return new C118055tz((C14710pd) this.A1s.A05.get());
    }

    public final C117225se A0P() {
        C16150sX r1 = this.A1s;
        return new C117225se((C14870pt) r1.AB3.get(), (C16040sK) r1.ADr.get(), (C18340wX) r1.AHd.get(), (C18310wU) r1.AHz.get());
    }

    public final C118805vH A0Q() {
        C16150sX r1 = this.A1s;
        C14870pt r2 = (C14870pt) r1.AB3.get();
        C16040sK r3 = (C16040sK) r1.ADr.get();
        AnonymousClass175 r7 = (AnonymousClass175) r1.AH5.get();
        C18340wX r8 = (C18340wX) r1.AHd.get();
        return new C118805vH(r2, r3, (C14710pd) r1.A05.get(), (C17190ug) r1.AEu.get(), (AnonymousClass60V) r1.ACJ.get(), r7, r8, (C18290wS) r1.AIB.get(), (AnonymousClass61W) r1.ACC.get(), (C112715ix) r1.ACG.get());
    }

    public final C118315uU A0R() {
        C16150sX r1 = this.A1s;
        return new C118315uU((C16300so) r1.A5p.get(), (C14870pt) r1.AB3.get(), (C16980tz) r1.AQB.get(), (C17190ug) r1.AEu.get(), (C18340wX) r1.AHd.get());
    }

    public final AnonymousClass2ZJ A0S() {
        C16150sX r1 = this.A1s;
        return new AnonymousClass2ZJ((C16760tb) r1.APV.get(), (C16460t6) r1.A5k.get(), (C221116r) r1.AHt.get(), A0R());
    }

    public final C119165we A0T() {
        C16150sX r14 = this.A1s;
        r14.AQB.get();
        C1200860g A0N2 = A0N();
        C18320wV r25 = (C18320wV) r14.AIA.get();
        C18290wS r26 = (C18290wS) r14.AIB.get();
        C18310wU r23 = (C18310wU) r14.AHz.get();
        C18090w8 r24 = (C18090w8) r14.AI6.get();
        C18340wX r21 = (C18340wX) r14.AHd.get();
        C18300wT r22 = (C18300wT) r14.AHn.get();
        C1204661t r20 = (C1204661t) r14.AHV.get();
        C14710pd r18 = (C14710pd) r14.A05.get();
        C16460t6 r17 = (C16460t6) r14.A5k.get();
        C18260wP r16 = (C18260wP) r14.A4p.get();
        return new C119165we((C14870pt) r14.AB3.get(), r16, r17, r18, A0N2, r20, r21, r22, r23, r24, r25, r26, C16150sX.A11(r14), (C118915vc) r14.AHj.get(), (AnonymousClass1TR) r14.AEa.get(), (C18280wR) r14.AHR.get(), (C16320sq) r14.ARB.get());
    }

    public final AnonymousClass5xV A0U() {
        C16150sX r1 = this.A1s;
        C14870pt r2 = (C14870pt) r1.AB3.get();
        C16760tb r3 = (C16760tb) r1.APV.get();
        C222617g r7 = (C222617g) r1.A8a.get();
        return new AnonymousClass5xV(r2, r3, (C16460t6) r1.A5k.get(), (C14710pd) r1.A05.get(), (C18310wU) r1.AHz.get(), r7, (C16320sq) r1.ARB.get());
    }

    public final C118405ud A0V() {
        C16150sX r1 = this.A1s;
        return new C118405ud((C14870pt) r1.AB3.get(), (C16760tb) r1.APV.get(), (C18210wK) r1.AE4.get(), (C18310wU) r1.AHz.get(), C16150sX.A12(r1), (AnonymousClass1HQ) r1.AHN.get());
    }

    public final C116305rA A0W() {
        return new C116305rA((AnonymousClass01Y) this.A1s.A1w.get());
    }

    public final C119295wr A0X() {
        C16150sX r1 = this.A1s;
        C16440t3 r6 = (C16440t3) r1.AP2.get();
        C16040sK r3 = (C16040sK) r1.ADr.get();
        C15900s5 r4 = (C15900s5) r1.ALm.get();
        AnonymousClass01V r5 = (AnonymousClass01V) r1.AOi.get();
        AnonymousClass1G1 r2 = (AnonymousClass1G1) r1.AJl.get();
        C119365wy r10 = (C119365wy) r1.ACI.get();
        C18310wU r12 = (C18310wU) r1.AHz.get();
        AnonymousClass61W r13 = (AnonymousClass61W) r1.ACC.get();
        return new C119295wr(r2, r3, r4, r5, r6, (C16980tz) r1.AQB.get(), (C14710pd) r1.A05.get(), (C17190ug) r1.AEu.get(), r10, (AnonymousClass60V) r1.ACJ.get(), r12, r13, (AnonymousClass0y5) r1.ARa.get());
    }

    public final AnonymousClass1VY A0Y() {
        C16150sX r1 = this.A1s;
        C18300wT r3 = (C18300wT) r1.AHn.get();
        C18090w8 r2 = (C18090w8) r1.AI6.get();
        return new AnonymousClass1VY((C221116r) r1.AHt.get(), r3, r2, (C16320sq) r1.ARB.get());
    }

    public final C50282Ys A0Z() {
        C16150sX r1 = this.A1s;
        C17190ug r5 = (C17190ug) r1.AEu.get();
        return new C50282Ys((C16300so) r1.A5p.get(), (C16000sG) r1.A4x.get(), (C15860rz) r1.AQh.get(), r5, new C26111Mj(), (C16320sq) r1.ARB.get());
    }

    public final AnonymousClass2ZA A0a() {
        C16150sX r1 = this.A1s;
        C17190ug r5 = (C17190ug) r1.AEu.get();
        return new AnonymousClass2ZA((C16300so) r1.A5p.get(), (C16000sG) r1.A4x.get(), (C15860rz) r1.AQh.get(), r5, new C26111Mj(), (C16320sq) r1.ARB.get());
    }

    public final AnonymousClass2ZL A0b() {
        C16150sX r1 = this.A1s;
        C17190ug r5 = (C17190ug) r1.AEu.get();
        return new AnonymousClass2ZL((C16300so) r1.A5p.get(), (C16000sG) r1.A4x.get(), (C15860rz) r1.AQh.get(), r5, new C26111Mj(), (C16320sq) r1.ARB.get());
    }

    public final AnonymousClass1ML A0c() {
        C16150sX r1 = this.A1s;
        C16040sK r2 = (C16040sK) r1.ADr.get();
        AnonymousClass01J r6 = r1.A1E;
        return new AnonymousClass1ML(r2, (C16440t3) r1.AP2.get(), C17270uo.A00(this.A01), C17270uo.A00(r1.A1F), r6, r1.A1H, r1.A10);
    }

    public final AnonymousClass2ZM A0d() {
        C16150sX r0 = this.A1s;
        C16440t3 r27 = (C16440t3) r0.AP2.get();
        C14710pd r26 = (C14710pd) r0.A05.get();
        C14870pt r25 = (C14870pt) r0.AB3.get();
        C16040sK r24 = (C16040sK) r0.ADr.get();
        C16320sq r23 = (C16320sq) r0.ARB.get();
        C16490t9 r22 = (C16490t9) r0.AQz.get();
        C23101Am r21 = (C23101Am) r0.A0N.get();
        C15900s5 r20 = (C15900s5) r0.ALm.get();
        C17090uW r19 = (C17090uW) r0.ADM.get();
        C17190ug r18 = (C17190ug) r0.AEu.get();
        C16000sG r17 = (C16000sG) r0.A4x.get();
        AnonymousClass01V r16 = (AnonymousClass01V) r0.AOi.get();
        return new AnonymousClass2ZM(r21, (AnonymousClass1G1) r0.AJl.get(), (C208811y) r0.A6K.get(), r25, r19, r24, r20, (C24961Hy) r0.A2l.get(), (C17180uf) r0.A2n.get(), (C18260wP) r0.A4p.get(), r17, (AnonymousClass156) r0.ADH.get(), (C17030uP) r0.APp.get(), (C16080sP) r0.AQ9.get(), (C23181Au) r0.A53.get(), (C15800rs) r0.A5c.get(), r16, r27, (C17120uZ) r0.AQT.get(), (C19820z3) r0.A7p.get(), (C226818w) r0.A6A.get(), r26, r22, r18, (C18090w8) r0.AI6.get(), (C18290wS) r0.AIB.get(), r23, (C23201Aw) r0.AK6.get());
    }

    public final AnonymousClass2ZI A0e() {
        AnonymousClass1LZ A0D2 = A0D();
        C16150sX r2 = this.A1s;
        return new AnonymousClass2ZI(A0D2, new AnonymousClass2ZG((C16040sK) r2.ADr.get(), (AnonymousClass1L9) r2.AFI.get()), new AnonymousClass2ZH(), new AnonymousClass2ZE((C16980tz) r2.AQB.get(), (C23611Cq) r2.ANM.get(), (AnonymousClass1AF) r2.ARN.get(), (C23631Ct) r2.ART.get(), C17270uo.A00(r2.A5z)));
    }

    public final C50292Yt A0f() {
        C16150sX r1 = this.A1s;
        return new C50292Yt((C16980tz) r1.AQB.get(), (AnonymousClass14W) r1.ANc.get(), (AnonymousClass1CX) r1.ANk.get(), (C27041Qf) r1.AOs.get());
    }

    public final AnonymousClass2ZK A0g() {
        return new AnonymousClass2ZK((C18890xQ) this.A1s.APS.get());
    }

    public final AnonymousClass1ZQ A0h() {
        C16150sX r1 = this.A1s;
        C16980tz r10 = (C16980tz) r1.AQB.get();
        Activity activity = this.A1p;
        Mp4Ops mp4Ops = (Mp4Ops) r1.AFs.get();
        C14710pd r12 = (C14710pd) r1.A05.get();
        C14870pt r6 = (C14870pt) r1.AB3.get();
        C16300so r4 = (C16300so) r1.A5p.get();
        C16320sq r14 = (C16320sq) r1.ARB.get();
        C17130ua r8 = (C17130ua) r1.AN9.get();
        C16490t9 r13 = (C16490t9) r1.AQz.get();
        return Build.VERSION.SDK_INT >= 19 ? new AnonymousClass1ZP(activity, (C19980zJ) r1.A0P.get(), r4, (AnonymousClass2Z8) this.A0s.get(), r6, mp4Ops, r8, (AnonymousClass01V) r1.AOi.get(), r10, (AnonymousClass013) r1.AR8.get(), r12, r13, r14) : new AnonymousClass2Z9();
    }

    public final AnonymousClass2ZR A0i() {
        C16150sX r1 = this.A1s;
        C16440t3 r33 = (C16440t3) r1.AP2.get();
        AnonymousClass01J r0 = r1.A05;
        AnonymousClass01J r15 = r0;
        C14710pd r32 = (C14710pd) r0.get();
        C14870pt r31 = (C14870pt) r1.AB3.get();
        AnonymousClass1MV r30 = (AnonymousClass1MV) r1.AKK.get();
        C16300so r29 = (C16300so) r1.A5p.get();
        C16320sq r28 = (C16320sq) r1.ARB.get();
        C16180sb r27 = (C16180sb) r1.A8b.get();
        C23231Az r26 = (C23231Az) r1.A0r.get();
        C15900s5 r25 = (C15900s5) r1.ALm.get();
        C16760tb r24 = (C16760tb) r1.APV.get();
        C18210wK r23 = (C18210wK) r1.AE4.get();
        AnonymousClass15A r22 = (AnonymousClass15A) r1.A3J.get();
        C25961Lu r21 = (C25961Lu) r1.AH3.get();
        AnonymousClass01V r20 = (AnonymousClass01V) r1.AOi.get();
        AnonymousClass013 r19 = (AnonymousClass013) r1.AR8.get();
        C222617g r18 = (C222617g) r1.A8a.get();
        AnonymousClass1B0 r02 = new AnonymousClass1B0((C16490t9) r1.AQz.get());
        AnonymousClass2ZO r03 = new AnonymousClass2ZO((C14710pd) r15.get());
        AnonymousClass01V r47 = r20;
        C16440t3 r48 = r33;
        C15860rz r49 = (C15860rz) r1.AQh.get();
        AnonymousClass013 r50 = r19;
        AnonymousClass15N r51 = (AnonymousClass15N) r1.APw.get();
        C14710pd r52 = r32;
        C18210wK r53 = r23;
        AnonymousClass1HE r54 = (AnonymousClass1HE) r1.ALb.get();
        C17020u3 r55 = (C17020u3) r1.AMG.get();
        C19210xw r56 = (C19210xw) r1.AG2.get();
        C222617g r57 = r18;
        AnonymousClass1MV r58 = r30;
        C23231Az r59 = r26;
        AnonymousClass1M4 r60 = (AnonymousClass1M4) r1.A3o.get();
        C16320sq r61 = r28;
        C25981Lw r62 = (C25981Lw) r1.A7S.get();
        C25961Lu r63 = r21;
        AnonymousClass1B0 r64 = r02;
        return new AnonymousClass2ZR(r29, (AnonymousClass2ZN) this.A0q.get(), (AnonymousClass2ZP) this.A0r.get(), r27, r31, r25, r24, (AudioRecordFactory) r1.AJe.get(), (OpusRecorderFactory) r1.AJz.get(), (C210812s) r1.A1h.get(), (C19610yi) r1.AEq.get(), r03, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, new AnonymousClass2ZQ(), (AnonymousClass1B2) r1.APv.get(), r22);
    }
}
