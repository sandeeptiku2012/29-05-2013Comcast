package SuiteRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import UserManagement.UserRegistration.UserRegistrationTestCasesForAddress.UserRegWithNoAddress.RegisterToXidioApplicationWithoutEnteringAddress;
import UserManagement.UserRegistration.UserRegistrationTestCasesForMobileNumber.UserRegWithInvalidMobileNumber.RegisterToXidioApplicationByEnteringInValidMobileNumber;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	RegisterToXidioApplicationWithoutEnteringAddress.class,
	RegisterToXidioApplicationByEnteringInValidMobileNumber.class
	
})

public class screenShotsCapturing {
	
}
