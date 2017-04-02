package cn.itcast.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert  implements  Converter<String, Date>{

	@Override
	public Date convert(String arg0) {
		
		try {
			SimpleDateFormat  date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date da  =date.parse(arg0);
			return da;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
