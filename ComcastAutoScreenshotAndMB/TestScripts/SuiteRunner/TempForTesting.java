package SuiteRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import UserManagement.ProfileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateYearField.ValidatePaymentInfoYearFieldByEnteringPastYear;
import VideoManagement.VideoSubscriptionManagement.PaidSubscriptionForVideo.UnsubscribeUserSubscribedVideo;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	//ValidatePaymentInfoYearFieldByEnteringPastYear.class,
	UnsubscribeUserSubscribedVideo.class
})

public class TempForTesting {
	
}
