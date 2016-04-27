package com.Livepro.Proj;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.Livepro.Proj.Testcases.Monster;
import com.Livepro.Proj.Testcases.Naukri;
import com.Livepro.Proj.Testcases.Shine;
import com.Livepro.Proj.Testcases.TimesJob;








@RunWith(Suite.class)

@Suite.SuiteClasses({
	
	
	Monster.class,
	Naukri.class,
	Shine.class,
	TimesJob.class
   
})




public class SuiteTest {  

	
	


}