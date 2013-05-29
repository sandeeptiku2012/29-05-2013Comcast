package SuiteRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import UserManagement.ProfileManagement.RegisteredUserTestCasesForChangeActivationCode.ChangeActivationCodeWithValidAC.ValidateUserActivationCodeUpdatesSuccessfully;
import UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePassword.ChangePassword.ChangeUserLoginPassword;
import UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePassword.ResetUserPasswordWithInvalidEmail.ResetTheXidioPasswordWithWrongEmail;
import UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePassword.ValidateCurrentUserPassWhileChangingPass.ValidateCurrentPasswordWhenChangingPassword;
import UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateChangePaymentInfoDetailsUpdatedSuccessfully;
import UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePinCode.ChangePinCode;
import UserManagement.ProfileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateFirstNameField.EditXidioFirstNameInProfileManagement;
import UserManagement.UserRegistration.RegisterToXidioApplicationUsingValidCredentials;
import UserManagement.UserRegistration.UserRegistrationTestCasesForActivationCode.UserRegWithoutActivationCode.RegisterUserWithoutActivationCode;
import UserManagement.UserRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoPINCode.RegisterToXidioApplicationWithNoPinCode;
import UserManagement.UserRegistration.UserRegistrationTestCasesForEmail.UserRegWithNoEmailID.RegisterToXidioApplicationWithoutEnteringEmail;
import UserManagement.UserRegistration.UserRegistrationTestCasesForFirstName.UserRegWithNoFirstName.RegisterToXidioApplicationWithoutEnteringFirstName;
import VideoManagement.VideoSubscriptionManagement.PaidSubscriptionForVideo.SeachAndSubscribeVideo;
import VideoManagement.VideoSubscriptionManagement.PaidSubscriptionForVideo.UnsubscribeUserSubscribedVideo;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	RegisterToXidioApplicationWithoutEnteringFirstName.class,
	RegisterToXidioApplicationWithoutEnteringEmail.class,
	RegisterToXidioApplicationUsingValidCredentials.class,
	ResetTheXidioPasswordWithWrongEmail.class,
	ValidateCurrentPasswordWhenChangingPassword.class,
	ChangeUserLoginPassword.class,
	SeachAndSubscribeVideo.class,
	UnsubscribeUserSubscribedVideo.class,
	EditXidioFirstNameInProfileManagement.class,
	ValidateChangePaymentInfoDetailsUpdatedSuccessfully.class,
	//RegisterToXidioApplicationWithNoPinCode.class,
	ChangePinCode.class,
	//RegisterUserWithoutActivationCode.class,
	ValidateUserActivationCodeUpdatesSuccessfully.class

})
public class runDemoTestSuite {

}
