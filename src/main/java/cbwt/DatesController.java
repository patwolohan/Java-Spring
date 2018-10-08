package cbwt;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatesController {
    
    @RequestMapping("/api/timestamp")
    public long getTimestamp() {
    	Date date = new Date();
    	
        return date.getTime();
    }
    
    // Add another handler for /api/gmtdate
    @SuppressWarnings("deprecation")
	@RequestMapping("/api/gmtdate")
    public String getGMTDate() {
    	//return new Date().toGMTString();
    	return new Date().toGMTString();
    	
    	
    }
    
}

