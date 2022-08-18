package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("AppTester.Droid.MainApplication, AppTester.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc64b9588f3e10d07ffa.MainApplication.class, crc64b9588f3e10d07ffa.MainApplication.__md_methods);
		
	}
}
