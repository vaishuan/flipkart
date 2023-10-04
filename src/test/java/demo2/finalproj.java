package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class finalproj {
    
    @Test
    public void testGoogleSearchAndFlipkart() {
        FirefoxDriver dr = new FirefoxDriver();
        dr.get("http://www.google.com");
        dr.manage().window().maximize();
        dr.findElement(By.id("APjFqb")).sendKeys("camera");
        dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        
        dr.navigate().to("https://www.flipkart.com/canon-eos-3000d-dslr-camera-1-body-18-55-mm-lens/p/itm6f665fea97bc2?pid=CAMF3DHJURPEMNRN&lid=LSTCAMF3DHJURPEMNRN8AVERV&marketplace=FLIPKART&fm=neo%2Fmerchandising&iid=M_7358a13d-0ffc-4b41-a344-54669418c044_23_5ZEX38D1TJC6_MC.CAMF3DHJURPEMNRN&ppt=None&ppn=None&ssid=co6v38n66paut0xs1696402369036&otracker=clp_pmu_v2_1_23.productCard.PMU_V2_Canon%2BEOS%2B3000D%2BDSLR%2BCamera%2B1%2BCamera%2BBody%252C%2B18%2B-%2B55%2Bmm%2BLens_camera-clp-store_CAMF3DHJURPEMNRN_neo%2Fmerchandising_0&otracker1=clp_pmu_v2_PINNED_neo%2Fmerchandising_NA_GRID_productCard_cc_1_NA_view-all&cid=CAMF3DHJURPEMNRN");
        dr.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
        
        // Add necessary assertions or verifications here
        
        dr.quit();
    }
}
	
